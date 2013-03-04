#pragma once

#include <string>

namespace desm {

	class CommunicationController
	{
	public:
		enum eMode {
			MODE_SERVER,
			MODE_CLIENT,
		};
		CommunicationController(eMode mode, const std::string& host, unsigned short port);
		~CommunicationController();
		// TODO: use std::vector<char> to avoid complications with NUL bytes?
		bool receive(std::string& data);
		bool send(const std::string& data);
	private:
		struct Impl;
		Impl* pimpl;
	};

};