#include <iostream>
#include <string>

#include "MwDll.h"
#include "Desm.h"

using namespace desm;

static const int DEFAULT_BUF_LEN = 4096;

struct MwDll::Impl {

	// types

	typedef int (*t_stw_onStartProgramm)(char* configPath);
	typedef int (*t_stw_onStopProgramm)(void);
	typedef int (*t_stw_onLoadStrecke)(void);
	
	typedef const char* (*t_stw_infoVersion)(int* versionLen);
	typedef const char* (*t_stw_infoConnectionStatus)(int* infoConnectionStatusLen);
	typedef const char* (*t_stw_infoName)(int* infoNameLen);
	typedef const char* (*t_stw_infoDescription)(int* descriptionLen);
	
	typedef int (*t_stw_onStartSimulation)(void);
	typedef int (*t_stw_onStopSimulation)(void);

	typedef int (*t_stw_setTrack)(int gleisId, double von, double bis, double abstand, char* name, int nameLen);
	typedef int (*t_stw_getTrack)(int gleisId, double* von, double* bis, double* abstand, char* nameBuf, int nameBufLen, int* nameStrLen);

	typedef int (*t_stw_setTrackConnection)(int trackConnectionId, int gleisId, int gleis1, int gleis2, double von, double bis, char* name, int nameLen, int weiche1Id, int weiche2Id);
	typedef int (*t_stw_getTrackConnection)(int trackConnectionId, int* gleisId, int* gleis1, int* gleis2, double* von, double* bis, char* nameBuf, int nameBufLen, int* nameStrLen, int* weiche1Id, int* weiche2Id);
	
	typedef int (*t_stw_setSignal)(int signalId, int gleisId, double position, int typ, double hoehe, double distanz, char* name, int nameLen, int stellung);
	typedef int (*t_stw_getSignal)(int signalId, int* gleisId, double* position, int* typ, double* hoehe, double* distanz, char* nameBuf, int nameBufLen, int* nameStrLen, int* stellung);
	
	typedef int (*t_stw_setBalise)(int baliseId, int gleisId, double position, int stellung, char* protokoll, int protokollLen);
	typedef int (*t_stw_getBalise)(int baliseId, int* gleisId, double* position, int* stellung, char* protokollBuf, int protokollBufLen, int* protokollStrLen);

	typedef int (*t_stw_setLoop)(int baliseId, int gleisId, double positionVon, double positionBis);
	typedef int (*t_stw_getLoop)(int baliseId, int* gleisId, double* positionVon, double* positionBis);

	typedef int (*t_stw_setIsolierstoss)(int isolierstossId, int gleisId, double position);
	typedef int (*t_stw_getIsolierstoss)(int isolierstossId, int* gleisId, double* position);

	typedef int (*t_stw_setKilometerDirection)(int richtung);
	typedef int (*t_stw_getKilometerDirection)(int* richtung);
	
	typedef int (*t_stw_setWeiche)(int weicheId, int gleisId);
	typedef int (*t_stw_getWeiche)(int weicheId, int* gleisId);

	typedef int (*t_stw_setTrainPosition)(int trainTyp, int direction, double* positionList, int positionListLen, int* gleisList, int gleisListLen);
	typedef int (*t_stw_getTrainPosition)(int trainTyp, int* direction, double** positionList, int* positionListLen, int** gleisList, int* gleisListLen);

	typedef int (*t_stw_getEvents)(int* anzahlEvents, int** typeList, int** idList);

	typedef void (*t_stw_deallocate)(void** p);
	
	// member

	HINSTANCE m_hInstLibrary;

	t_stw_onStartProgramm m_stw_onStartProgramm;
	t_stw_onStopProgramm m_stw_onStopProgramm;
	t_stw_infoVersion m_stw_infoVersion;
	t_stw_infoName m_stw_infoName;
	t_stw_infoDescription m_stw_infoDescription;
	t_stw_onStartSimulation m_stw_onStartSimulation;
	t_stw_onStopSimulation m_stw_onStopSimulation;
	t_stw_setTrack m_stw_setTrack;
	t_stw_getTrack m_stw_getTrack;
	t_stw_setTrackConnection m_stw_setTrackConnection;
	t_stw_getTrackConnection m_stw_getTrackConnection;
	t_stw_setSignal m_stw_setSignal;
	t_stw_setBalise m_stw_setBalise;
	t_stw_setLoop m_stw_setLoop;
	t_stw_setIsolierstoss m_stw_setIsolierstoss;
	t_stw_getIsolierstoss m_stw_getIsolierstoss;
	t_stw_setKilometerDirection m_stw_setKilometerDirection;
	t_stw_getKilometerDirection m_stw_getKilometerDirection;
	t_stw_onLoadStrecke m_stw_onLoadStrecke;
	t_stw_getEvents m_stw_getEvents;
	t_stw_getSignal m_stw_getSignal;
	t_stw_getBalise m_stw_getBalise;
	t_stw_getLoop m_stw_getLoop;
	t_stw_getWeiche m_stw_getWeiche;
	t_stw_setWeiche m_stw_setWeiche;
	t_stw_getTrainPosition m_stw_getTrainPosition;
	t_stw_setTrainPosition m_stw_setTrainPosition;
	t_stw_deallocate m_stw_deallocate;

	// lifetime

	//TODO: what is still needed? 
	Impl(LPCWSTR dllName)
		: m_hInstLibrary(NULL)
		, m_stw_onStartProgramm(NULL)
		, m_stw_onStopProgramm(NULL)
		, m_stw_setKilometerDirection(NULL)
	{
		m_hInstLibrary = LoadLibrary(dllName);
		if(!m_hInstLibrary) {
			throw std::exception("dll not found");
		}
		
#define IMPORT_DLL_FUNCTION(hInst, name) \
		if(NULL == (m_##name = (t_ ## name)GetProcAddress(hInst, #name))) \
			throw std::exception("unable to load function " #name); 

		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_onStartProgramm);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_onStopProgramm);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_infoVersion);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_infoName);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_infoDescription);
		/*IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_onStartSimulation);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_onStopSimulation);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_setTrack);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getTrack);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_setTrackConnection);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getTrackConnection);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_setSignal);*/
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_setBalise);
		/*IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_setLoop);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_setIsolierstoss);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getIsolierstoss);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_setKilometerDirection);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getKilometerDirection);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_onLoadStrecke);*/
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getEvents);
		//IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getSignal);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getBalise);
		/*IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getLoop);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getWeiche);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_setWeiche);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_getTrainPosition);
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_setTrainPosition);*/
		IMPORT_DLL_FUNCTION(m_hInstLibrary, stw_deallocate);

#undef IMPORT_DLL_FUNCTION
	}

	~Impl() {
		FreeLibrary(m_hInstLibrary);
	}

};

bool checkErrorCode(int err) {
	switch(err) {
	case desm::ERROR_OK:
		return true;
	case desm::ERROR_FATAL:
		throw std::exception("fatal error");
	case desm::ERROR_API_MISUSE:
		throw std::exception("api misuse!");
	case desm::ERROR_UNKNOWN_ID:
		return false;
	default:
		throw std::exception("dll returned unknown error code");
	}
}

MwDll::MwDll(LPCWSTR dllName)
	: m_pImpl(new MwDll::Impl(dllName))
{
}

MwDll::~MwDll() {
	delete m_pImpl;
}

void MwDll::onStartProgramm(const std::string& configPath) {
	char* dup = _strdup(configPath.c_str());
	checkErrorCode(m_pImpl->m_stw_onStartProgramm(dup));
	free(dup);
}

void MwDll::onStopProgramm() {
	checkErrorCode(m_pImpl->m_stw_onStopProgramm());
}

void MwDll::onLoadStrecke() {
	checkErrorCode(m_pImpl->m_stw_onLoadStrecke());
}

std::string MwDll::infoVersion() {
	int versionLen;
	return std::string(m_pImpl->m_stw_infoVersion(&versionLen));
}

std::string MwDll::infoConnectionStatus() {
	return "";
}

std::string MwDll::infoName() {
	int infoNameLen;
	return std::string(m_pImpl->m_stw_infoName(&infoNameLen));
}

std::string MwDll::infoDescription() {
	int infoDescriptionLen;
	return std::string(m_pImpl->m_stw_infoDescription(&infoDescriptionLen));
}

bool MwDll::setTrack(int gleisId, double von, double bis, double abstand, const std::string& name) {
	char* _name = _strdup(name.c_str());
	bool success = checkErrorCode(m_pImpl->m_stw_setTrack(gleisId, von, bis, abstand, _name, name.size()));
	free(_name);
	return success;
}

bool MwDll::getTrack(int gleisId, double& von, double& bis, double& abstand, std::string& name) {
	char _name[DEFAULT_BUF_LEN];
	int nameStrLen;
	bool success = checkErrorCode(m_pImpl->m_stw_getTrack(gleisId, &von, &bis, &abstand, _name, DEFAULT_BUF_LEN, &nameStrLen));
	
	if(success) {
		name = std::string(_name);
		// dont care about nameStrLen. we only could assert name.size() == nameStrLen
	}

	return success;
}

bool MwDll::setTrackConnection(int trackConnectionId, int gleisId, int gleis1, int gleis2, double von, double bis, const std::string& name, int weiche1Id, int weiche2Id) {
	char* _name = _strdup(name.c_str());
	bool success = checkErrorCode(m_pImpl->m_stw_setTrackConnection(trackConnectionId, gleisId, gleis1, gleis2, von, bis, _name, name.size(), weiche1Id, weiche2Id));
	free(_name);

	return success;
}

bool MwDll::getTrackConnection(int trackConnectionId, int& gleisId, int& gleis1, int& gleis2, double& von, double& bis, std::string& name, int& weiche1Id, int& weiche2Id) {
	char _name[DEFAULT_BUF_LEN];
	int nameStrLen;
	bool success = checkErrorCode(m_pImpl->m_stw_getTrackConnection(trackConnectionId, &gleisId, &gleis1, &gleis2, &von, &bis, _name, DEFAULT_BUF_LEN, &nameStrLen, &weiche1Id, &weiche2Id));

	if(success) {
		name = std::string(_name);
		// dont care about nameStrLen. we only could assert name.size() == nameStrLen
	}

	return success;
}

bool MwDll::setSignal(int signalId, int gleisId, double position, int typ, double hoehe, double distanz, const std::string& name, int stellung) {
	char* _name = _strdup(name.c_str());
	bool success = checkErrorCode(m_pImpl->m_stw_setSignal(signalId, gleisId, position, typ, hoehe, distanz, _name, name.size(), stellung));
	free(_name);

	return success;
}

bool MwDll::getSignal(int signalId, int& gleisId, double& position, int& typ, double& hoehe, double& distanz, std::string& name, int& stellung) {
	char _name[DEFAULT_BUF_LEN];
	int nameStrLen;
	bool success = checkErrorCode(m_pImpl->m_stw_getSignal(signalId, &gleisId, &position, &typ, &hoehe, &distanz, _name, DEFAULT_BUF_LEN, &nameStrLen, &stellung));
	
	if(success) {
		name = std::string(_name);
		// dont care about nameStrLen. we only could assert name.size() == nameStrLen
	}

	return success;

}

bool MwDll::setBalise(int baliseId, int gleisId, double position, int stellung, std::string& protokoll) {
	char* _protokoll = _strdup(protokoll.c_str());
	bool success = checkErrorCode(m_pImpl->m_stw_setBalise(baliseId, gleisId, position, stellung, _protokoll, protokoll.size()));
	free(_protokoll);

	return success;
}

bool MwDll::getBalise(int baliseId, int& gleisId, double& position, int& stellung, std::string& protokoll) {
	char _protokoll[DEFAULT_BUF_LEN];
	int strLen;
	bool success = checkErrorCode(m_pImpl->m_stw_getBalise(baliseId, &gleisId, &position, &stellung, _protokoll, DEFAULT_BUF_LEN, &strLen));
	if(success) {
		protokoll = std::string(_protokoll);
		// ignore strLen since we depend on null-termination
		// we only could do an assert: assert(strLen == protokoll.size());
	}

	return success;
}

bool MwDll::setLoop(int baliseId, int gleisId, double positionVon, double positionBis) {
	return checkErrorCode(m_pImpl->m_stw_setLoop(baliseId, gleisId, positionVon, positionBis));
}

bool MwDll::getLoop(int baliseId, int& gleisId, double& positionVon, double& positionBis) {
	bool success = checkErrorCode(m_pImpl->m_stw_getLoop(baliseId, &gleisId, &positionVon, &positionBis));

	return success;
}

bool MwDll::setIsolierstoss(int isolierstossId, int gleisId, double position) {
	return checkErrorCode(m_pImpl->m_stw_setIsolierstoss(isolierstossId, gleisId, position));
}

bool MwDll::getIsolierstoss(int isolierstossId, int& gleisId, double& position){
	bool success = checkErrorCode(m_pImpl->m_stw_getIsolierstoss(isolierstossId, &gleisId, &position));

	return success;
}

bool MwDll::setKilometerDirection(int richtung) {
	return checkErrorCode(m_pImpl->m_stw_setKilometerDirection(richtung));
}

bool MwDll::getKilometerDirection(int& richtung) {
	return checkErrorCode(m_pImpl->m_stw_getKilometerDirection(&richtung));
}

bool MwDll::getWeiche(int weicheId, int& gleisId) {
	bool success = checkErrorCode(m_pImpl->m_stw_getWeiche(weicheId, &gleisId));

	return success;
}

bool MwDll::setWeiche(int weicheId, int gleisId) {
	return checkErrorCode(m_pImpl->m_stw_setWeiche(weicheId, gleisId));
}

bool MwDll::setTrainPosition(int trainTyp, int direction, const std::vector<double>& positionList, const std::vector<int>& gleisList) {
	size_t positionListLen = positionList.size();
	size_t gleisListLen = gleisList.size();
	double* cPositionList = (double*)malloc(sizeof(double) * (positionListLen));
	int* cGleisList = (int*)malloc(sizeof(int) * (gleisListLen));
	for(size_t i = 0; i < positionListLen; ++i) {
		cPositionList[i] = positionList[i];
	}
	for(size_t i = 0; i < gleisListLen; ++i) {
		cGleisList[i] = gleisList[i];
	}
	bool success = checkErrorCode(m_pImpl->m_stw_setTrainPosition(trainTyp, direction, cPositionList, positionListLen, cGleisList, gleisListLen));
	free(cPositionList);
	free(cGleisList);
	return success;
}

bool MwDll::getTrainPosition(int trainTyp, int& direction, std::vector<double>& positionList, std::vector<int>& gleisList) {
	int positionListLen = 0;
	int gleisListLen = 0;
	double* cPositionList;
	int* cGleisList;
	bool success = checkErrorCode(m_pImpl->m_stw_getTrainPosition(trainTyp, &direction, &cPositionList, &positionListLen, &cGleisList, &gleisListLen));
	
	positionList.clear();
	for(int i = 0; i < positionListLen; ++i) {
		positionList.push_back(cPositionList[i]);
	}

	gleisList.clear();
	for(int i = 0; i < gleisListLen; ++i) {
		gleisList.push_back(cGleisList[i]);
	}

	m_pImpl->m_stw_deallocate((void**)&cPositionList);
	m_pImpl->m_stw_deallocate((void**)&cGleisList);
	
	return success;
}

bool MwDll::getEvents(std::vector<int>& typeList, std::vector<int>& idList) {
	int num, *cTypeList, *cIdList;
	bool success = checkErrorCode(m_pImpl->m_stw_getEvents(&num, &cTypeList, &cIdList));
	if(!success) {
		return false;
	}
	for(int i = 0; i < num; ++i) {
		typeList.push_back(cTypeList[i]);
		idList.push_back(cIdList[i]);
	}
	if(num > 0) {
		m_pImpl->m_stw_deallocate((void**)&cTypeList);
		m_pImpl->m_stw_deallocate((void**)&cIdList);
	}
	return success;
}