package ch.desm.middleware.modules.component.interlocking.obermattlangnau;

import ch.desm.middleware.modules.communication.endpoint.virtual.EndpointInterlockingPetriNetBase;


class EndpointInterlockingPetriNet extends EndpointInterlockingPetriNetBase {
	
	public int W1_Endlage_plus;
	public int W1_Endlage_minus;
//	public int W1_gestoert;
	public int W1_gestoert;
	public int W1_keine_Endlage;
	public int Fstr_ef_E_Halt;
	public int Fstr_ef_E_Fahrt1_;
	public int Kontakte_6_BLU_EG;
	public int Kontakte_6_NT_W1;
	public int Kontakte_6_NAL;
	public int Kontakte_6_Gleist_ZB;
	public int Kontakte_6_ISU_Sign;
	public int Kontakte_7_WS1_plus0;
	public int Kontakte_7_WS1_minus0;
	public int Kontakte_7_WS1_minus1;
	public int Kontakte_8_FSS_10EG;
	public int Kontakte_8_FSS_30EG;
	public int Kontakte_8_FSS_45EG;
	public int Kontakte_8_FSS_10F;
	public int Kontakte_8_FSS_30F;
	public int Kontakte_8_FSS_45F;
	public int ext_Vb_abl_vEMM;
	public int ext_Vb_abl_vLN;
	public int ext_Vb_abl_vZB;
	public int ext_Vb_abl_nEMM;
	public int ext_Vb_abl_nLN;
	public int ext_Vb_abl_nZB;
	public int ext_Vb_Ueberw_W1_plus;
	public int ext_Vb_Ueberw_W1_minus;
	public int ext_Vb_F_VS_Lampe_Warn_def;
	public int ext_Vb_F_VS_Lampe_Fahrt_def;
	public int ext_Vb_G_VS_Lampe_Warn_def;
	public int ext_Vb_G_VS_Lampe_Fahrt_def;
	public int ext_Vb_F_Lampe_rot_def;
	public int ext_Vb_E_Lampe_rot_def;
	public int EMM_EMM_Grundstlg;
//	public int EMM_geprueft1;
	public int EMM_EMM_W7_minus;
//	public int EMM_EMM_W10_plus;
//	public int EMM_geprueft2;
	public int EMM_OM_E_Fahrt;
//	public int EMM_geprueft1;
//	public int EMM_EMM_W10_plus;
//	public int EMM_geprueft2;
	public int EMM_EMM_W7_plus;
//	public int EMM_geprueft1;
//	public int EMM_EMM_W10_minus;
//	public int EMM_geprueft2;
	public int EMM_EMM_W9_plus;
//	public int EMM_geprueft1;
//	public int EMM_EMM_W9_minus;
//	public int EMM_geprueft2;
//	public int EMM_EMM_W8_plus;
//	public int EMM_geprueft1;
//	public int LN_geprueft1;
//	public int LN_geprueft1;
//	public int LN_geprueft1;
//	public int LN_geprueft1;
//	public int LN_LN_W1_plus;
	public int LN_geprueft2;
	public int LN_LN_W3_plus;
//	public int LN_LN_W3_plus;
	public int LN_LN_W5_plus;
	public int LN_LN_W5_minus;
	public int LN_LN_W3_minus;
//	public int LN_LN_W2_minus;
	public int LN_LN_W4_plus;
//	public int LN_geprueft2;
	public int LN_LN_W6_minus;
//	public int LN_LN_W6_minus;
//	public int LN_LN_W1_plus;
//	public int LN_LN_W6_minus;
//	public int LN_LN_W5_plus;
//	public int LN_LN_W6_minus;
//	public int LN_LN_W5_minus;
	public int LN_C1_Fahrt2;
	public int LN_C1_Halt;
	public int LN_C26_Fahrt;
//	public int LN_LN_W1_minus;
	public int ZB_C_Fahrt;
	public int ZB_geprueft1;
	public int ZB_EMM_Grundstlg;
	public int ZB_cd_belegt;
//	public int ZB_geprueft1;
	public int ZB_D_Fahrt;
//	public int ZB_ZB_W2_plus;
//	public int ZB_geprueft1;
	public int ZB_ZB_W2_plus;
	public int ZB_D_Halt;
//	public int ZB_geprueft2;
//	public int ZB_geprueft1;
	public int ZB_geprueft2;
	public int ZB_ZB_W1_plus;
//	public int ZB_ZB_W1_minus;
//	public int ZB_ZB_W1_plus;
	public int ZB_ZB_W1_minus;
	public int ZB_D_FB1;
	public int ZB_D_FB2;
	public int ILTIS__EMM_1_833;
	public int ILTIS__EMM_2_833;
	public int ILTIS__EMM_3_833;
	public int ILTIS__EMM_4_833;
	public int ILTIS__EMM_5_833;
	public int ILTIS__EMM_833_1;
	public int ILTIS__EMM_833_2;
	public int ILTIS__EMM_833_3;
	public int ILTIS__EMM_833_4;
	public int ILTIS__EMM_833_5;
	public int ILTIS__ZB_1_138;
	public int ILTIS__ZB_2_138;
	public int ILTIS__ZB_138_1;
	public int ILTIS__ZB_138_2;
	public int ILTIS__LN_834_1;
	public int ILTIS__LN_834_2;
	public int ILTIS__LN_834_3;
	public int ILTIS__LN_834_4;
	public int ILTIS__LN_834_5;
	public int ILTIS__LN_4_834;
	public int ILTIS__LN_3_834;
	public int ILTIS__LN_1_834;
	public int ILTIS__LN_2_834;
	public int ILTIS__LN_5_834;
	public int ILTIS__anfordern_v_LN;
	public int ILTIS__festgehalten_v_LN;
	public int ILTIS__rueckmelden_LN_OM;
	public int ILTIS__anfordern_v_ZB;
	public int ILTIS__freigegeben_v_LN;
	public int ILTIS__freigeben_v_LN;
	public int ILTIS__festhalten_v_LN;
	public int ILTIS__P30;
	public int ILTIS__RM_moeglich;
	public int ILTIS__RM_LN_OM;
	public int ILTIS__RM_ZB_OM;
	public int Iso_ef_belegt;
	public int Iso_ef_Zug_einfahren;
	public int Iso_ef_Zug_ausfahren;
	public int Iso_ef__frei;
	public int BL_OM_LN_1;
	public int BL_OM_LN_Grundstlg_n;
	public int BL_OM_LN_3;
	public int BL_OM_LN_vorgebl_v;
	public int BL_OM_LN_belegt_n;
	public int BL_OM_LN_Grundstlg_v;
	public int BL_OM_LN_2;
	public int BL_OM_LN_vorgebl_n;
	public int BL_OM_LN_belegt_v;
	public int BL_OM_LN_RMM_nLN;
	public int BL_ZB_OM_vorgebl_n;
	public int BL_ZB_OM_belegt_v;
	public int BL_ZB_OM_vorgebl_v;
	public int BL_ZB_OM_Grundstlg_v;
	public int BL_ZB_OM_Grundstlg_n;
	public int BL_ZB_OM_belegt_n;
	public int BL_ZB_OM_1;
	public int BL_ZB_OM_2;
	public int BL_ZB_OM_3;
	public int BL_ZB_OM_RMM_nZB;
	public int Stw_FSS_Sperrm_ein;
	public int Stw_FSS_Sperrm_aus;
	public int Stw_FSS_Kuppelm_aus;
	public int Stw_FSS_Kuppelm_ein;
	public int Stw_WS_Sperrm_aus;
	public int Stw_WS_Sperrm_ein;
	public int Stw_P10;
	public int Stw_P11;
	public int Fstr_fe_P1;
	public int Fstr_fe_aufgeloest;
//	public int Fstr_fe_P2;
	public int Fstr_fe_F_Fahrt1;
	public int Fstr_fe_Zug_eingefahren;
	public int Fstr_fe_F_Halt;
	public int Fstr_fe_verschlossen;
	public int Fstr_fe_geprueft;
	public int Fstr_fe_Stoerung_F;
	public int Fstr_fe_P2;
	public int Fstr_gf_aufgeloest;
	public int Fstr_gf_Zug_eingefahren;
	public int Fstr_gf_G_Fahrt3_;
	public int Fstr_gf_G_Halt;
	public int Fstr_gf_verschlossen;
	public int Fstr_gf_geprueft1;
	public int Fstr_gf_Stoerung_G;
	public int Fstr_gf_geprueft2;
	public int Fstr_gf_P4;
	public int Fstr_fg_P1;
	public int Fstr_fg_aufgeloest;
	public int Fstr_fg_P2;
	public int Fstr_fg_F_Fahrt3_;
	public int Fstr_fg_Zug_eingefahren;
	public int Fstr_fg_F_Halt;
	public int Fstr_fg_verschlossen;
	public int Fstr_fg_geprueft1;
	public int Fstr_fg_Stoerung_F;
	public int Fstr_fg_geprueft2;
	public int Fstr_fg_geprueft0;
	public int Iso_1_Zug_ausfahren;
	public int Iso_1_belegt;
	public int Iso_1_Zug_einfahren;
	public int Iso_1__frei;
	public int Iso_gf_Zug_ausfahren;
	public int Iso_gf_belegt;
	public int Iso_gf_Zug_einfahren;
	public int Iso_gf__frei;
	public int Iso_egf_Zug_ausfahren;
	public int Iso_egf_belegt;
	public int Iso_egf_Zug_einfahren;
	public int Iso_egf_frei;
	public int Iso_cd__frei;
	public int Iso_cd_belegt;
	public int Iso_cd_Zug_einfahren;
	public int Iso_cd_Zug_ausfahren;
	public int Lampen_1_F_VS_Stoer;
	public int Lampen_1_F_notrot;
	public int Lampen_1_F_gruenFB1;
	public int Lampen_1_E_notrot;
	public int Lampen_1_G_VS_Stoer;
	public int EMM_geprueft2;
	public int EMM_EMM_W8_minus;
//	public int EMM_geprueft1;
//	public int EMM_EMM_W10_plus;
//	public int EMM_geprueft1;
	public int EMM_EMM_W10_plus;
//	public int EMM_geprueft1;
//	public int EMM_EMM_W10_minus;
//	public int EMM_geprueft1;
	public int EMM_EMM_W9_minus;
	public int EMM_EMM_W8_plus;
	public int EMM_geprueft1;
//	public int EMM_EMM_W10_minus;
//	public int EMM_EMM_W10_minus;
//	public int EMM_EMM_W10_minus;
	public int EMM_EMM_W10_minus;
	public int EMM_C_Fahrt;
	public int EMM_C_Halt;
//	public int LN_geprueft1;
//	public int LN_LN_W1_plus;
//	public int LN_geprueft1;
	public int LN_EMM_Grundstlg;
	public int LN_ce_belegt;
//	public int LN_geprueft1;
//	public int LN_geprueft1;
	public int LN_LN_W1_minus;
//	public int LN_geprueft1;
	public int LN_LN_W2_minus;
	public int LN_geprueft1;
	public int LN_LN_W1_plus;
	public int Lampen_1_BL_vLN_weiss;
	public int Lampen_1_BL_nLN_weiss;
	public int Lampen_1_BL_nLN_rot;
	public int Lampen_1_Fstr_ef;
	public int Lampen_1_Fstr_gf;
	public int Lampen_1_BL_nZB_rot;
	public int Lampen_1_BL_nZB_weiss;
	public int Lampen_1_Block_vZB_weiss;
	public int Lampen_1_BL_vZB_rot;
	public int Lampen_1_RM_moegl_nLN;
	public int Lampen_1_FBV_vLN;
	public int Lampen_1_Stoer_Wecker;
	public int Lampen_1_WS1_Freig;
	public int Lampen_1_WS1_Ueberw;
	public int Lampen_1_FSS_Sperre;
	public int Lampen_1_FSS_Kuppel;
	public int Lampen_2_Weiche;
	public int Lampen_2_Block;
	public int Lampen_2_Signal;
	public int Lampen_9_Abl_vEMM;
	public int Lampen_9_Abl_vLN;
	public int Lampen_9_Abl_vZB;
	public int Lampen_9_Abl_nEMM;
	public int Lampen_9_Abl_nLN;
	public int Lampen_9_Abl_nZB;
	public int Lampen_1_F_rot;
	public int Lampen_1_F_gruenFB3;
	public int Lampen_P41;
	public int Lampen_P48;
	public int Lampen_P49;
	public int Lampen_1_FBV_vZB;
	public int Lampen_P4;
	public int Lampen_P6;
	public int Lampen_P8;
	public int Lampen_P12;
	public int Kontakte_6_FBF_nZB;
	public int Kontakte_6_RM_nZB;
	public int Kontakte_6_RM_nLN;
	public int Kontakte_6_FBA_nLN;
	public int Fstr_ef__aufgeloest;
	public int Fstr_ef_Stoerung_E;
	public int Fstr_ef_verschlossen;
	public int Fstr_ef_P1;
	public int Fstr_ef_P2;
	public int Fstr_ef_Zug_eingefahren;
	public int Fstr_ef_geprueft1;
	public int Fstr_ef_geprueft2;
	public int Fstr_ef_P6;

	public void main() {
		init();
		for(;;) {
			readSensors();
			while(fireOneTransition()) {
				writeActors();
			}
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex) {
			     Thread.currentThread().interrupt();
			}
		}
	}

	public void fire(String s) {
		
		System.out.println(s);
//		for(EventListener listener : this.listeners) {
//			lstener.onEndpointEvent(s);
//		}
	}

	public void onIncomingBrokerEvent(String event, int value) {
		if(event == "Kontakte_6_BLU_EG") {
			Kontakte_6_BLU_EG = value;
		}
	}
	
	public void readSensors() {
		
		//Kontakte_6_BLU_EG = ?
		//Kontakte_6_NT_W1 = ?
		//Kontakte_6_NAL = ?
		//Kontakte_6_Gleist_ZB = ?
		//Kontakte_6_ISU_Sign = ?
		//Kontakte_7_WS1_plus0 = ?
		//Kontakte_7_WS1_minus0 = ?
		//Kontakte_7_WS1_minus1 = ?
		//Kontakte_8_FSS_10EG = ?
		//Kontakte_8_FSS_30EG = ?
		//Kontakte_8_FSS_45EG = ?
		//Kontakte_8_FSS_10F = ?
		//Kontakte_8_FSS_30F = ?
		//Kontakte_8_FSS_45F = ?
		//ext_Vb_abl_vEMM = ?
		//ext_Vb_abl_vLN = ?
		//ext_Vb_abl_vZB = ?
		//ext_Vb_abl_nEMM = ?
		//ext_Vb_abl_nLN = ?
		//ext_Vb_abl_nZB = ?
		//ext_Vb_Ueberw_W1_plus = ?
		//ext_Vb_Ueberw_W1_minus = ?
		//ext_Vb_F_VS_Lampe_Warn_def = ?
		//ext_Vb_F_VS_Lampe_Fahrt_def = ?
		//ext_Vb_G_VS_Lampe_Warn_def = ?
		//ext_Vb_G_VS_Lampe_Fahrt_def = ?
		//ext_Vb_F_Lampe_rot_def = ?
		//ext_Vb_E_Lampe_rot_def = ?
		//EMM_OM_E_Fahrt = ?
		//EMM_EMM_W10_plus = ?
		//EMM_geprueft2 = ?
		//EMM_geprueft2 = ?
		//EMM_geprueft2 = ?
		//LN_geprueft2 = ?
		//LN_LN_W3_plus = ?
		//LN_LN_W2_minus = ?
		//LN_LN_W6_minus = ?
		//LN_LN_W1_plus = ?
		//LN_LN_W6_minus = ?
		//LN_LN_W5_plus = ?
		//LN_LN_W6_minus = ?
		//LN_LN_W5_minus = ?
		//LN_C26_Fahrt = ?
		//LN_LN_W1_minus = ?
		//ZB_C_Fahrt = ?
		//ZB_cd_belegt = ?
		//ZB_geprueft2 = ?
		//ZB_ZB_W1_minus = ?
		//ZB_ZB_W1_plus = ?
		//ZB_ZB_W1_minus = ?
		//ILTIS__EMM_1_833 = ?
		//ILTIS__EMM_2_833 = ?
		//ILTIS__EMM_3_833 = ?
		//ILTIS__EMM_4_833 = ?
		//ILTIS__EMM_5_833 = ?
		//ILTIS__EMM_833_1 = ?
		//ILTIS__EMM_833_2 = ?
		//ILTIS__EMM_833_3 = ?
		//ILTIS__EMM_833_4 = ?
		//ILTIS__EMM_833_5 = ?
		//ILTIS__ZB_1_138 = ?
		//ILTIS__ZB_2_138 = ?
		//ILTIS__ZB_138_1 = ?
		//ILTIS__ZB_138_2 = ?
		//ILTIS__LN_834_1 = ?
		//ILTIS__LN_834_2 = ?
		//ILTIS__LN_834_3 = ?
		//ILTIS__LN_834_4 = ?
		//ILTIS__LN_834_5 = ?
		//ILTIS__LN_4_834 = ?
		//ILTIS__LN_3_834 = ?
		//ILTIS__LN_1_834 = ?
		//ILTIS__LN_2_834 = ?
		//ILTIS__LN_5_834 = ?
		//ILTIS__anfordern_v_LN = ?
		//ILTIS__rueckmelden_LN_OM = ?
		//ILTIS__freigeben_v_LN = ?
		//ILTIS__festhalten_v_LN = ?
		//ILTIS__RM_ZB_OM = ?
		//Iso_ef_Zug_einfahren = ?
		//Iso_ef_Zug_ausfahren = ?
		//Stw_P10 = ?
		//Fstr_fe_F_Fahrt1 = ?
		//Fstr_fe_Stoerung_F = ?
		//Fstr_gf_G_Fahrt3_ = ?
		//Fstr_gf_Stoerung_G = ?
		//Fstr_fg_F_Fahrt3_ = ?
		//Fstr_fg_Stoerung_F = ?
		//Iso_1_Zug_ausfahren = ?
		//Iso_1_Zug_einfahren = ?
		//Iso_gf_Zug_ausfahren = ?
		//Iso_gf_Zug_einfahren = ?
		//Iso_egf_Zug_ausfahren = ?
		//Iso_egf_Zug_einfahren = ?
		//Iso_cd_Zug_einfahren = ?
		//Iso_cd_Zug_ausfahren = ?
		//EMM_geprueft2 = ?
		//EMM_EMM_W10_plus = ?
		//EMM_EMM_W10_plus = ?
		//EMM_EMM_W10_minus = ?
		//EMM_EMM_W8_plus = ?
		//EMM_EMM_W10_minus = ?
		//EMM_EMM_W10_minus = ?
		//EMM_EMM_W10_minus = ?
		//EMM_EMM_W10_minus = ?
		//LN_LN_W1_plus = ?
		//LN_ce_belegt = ?
		//LN_LN_W1_plus = ?
		//Lampen_1_Fstr_ef = ?
		//Lampen_P41 = ?
		//Lampen_P48 = ?
		//Lampen_P49 = ?
		//Lampen_1_FBV_vZB = ?
		//Kontakte_6_FBF_nZB = ?
		//Kontakte_6_RM_nZB = ?
		//Kontakte_6_RM_nLN = ?
		//Kontakte_6_FBA_nLN = ?
		//Fstr_ef_Stoerung_E = ?
	}
	
	public void writeActors() {
		//myData.EMM_geprueft1 = EMM_geprueft1;
		EMM_geprueft1 = 0;
		//myData.EMM_EMM_W7_plus = EMM_EMM_W7_plus;
		EMM_EMM_W7_plus = 0;
		//myData.EMM_geprueft1 = EMM_geprueft1;
		EMM_geprueft1 = 0;
		//myData.EMM_geprueft1 = EMM_geprueft1;
		EMM_geprueft1 = 0;
		//myData.EMM_EMM_W9_minus = EMM_EMM_W9_minus;
		EMM_EMM_W9_minus = 0;
		//myData.EMM_geprueft1 = EMM_geprueft1;
		EMM_geprueft1 = 0;
		//myData.LN_geprueft1 = LN_geprueft1;
		LN_geprueft1 = 0;
		//myData.LN_geprueft1 = LN_geprueft1;
		LN_geprueft1 = 0;
		//myData.LN_geprueft1 = LN_geprueft1;
		LN_geprueft1 = 0;
		//myData.LN_geprueft1 = LN_geprueft1;
		LN_geprueft1 = 0;
		//myData.LN_geprueft2 = LN_geprueft2;
		LN_geprueft2 = 0;
		//myData.ZB_geprueft1 = ZB_geprueft1;
		ZB_geprueft1 = 0;
		//myData.ZB_ZB_W2_plus = ZB_ZB_W2_plus;
		ZB_ZB_W2_plus = 0;
		//myData.ZB_geprueft1 = ZB_geprueft1;
		ZB_geprueft1 = 0;
		//myData.ZB_geprueft2 = ZB_geprueft2;
		ZB_geprueft2 = 0;
		//myData.ZB_D_FB1 = ZB_D_FB1;
		ZB_D_FB1 = 0;
		//myData.ZB_D_FB2 = ZB_D_FB2;
		ZB_D_FB2 = 0;
		//myData.Lampen_1_F_VS_Stoer = Lampen_1_F_VS_Stoer;
		Lampen_1_F_VS_Stoer = 0;
		//myData.Lampen_1_F_notrot = Lampen_1_F_notrot;
		Lampen_1_F_notrot = 0;
		//myData.Lampen_1_F_gruenFB1 = Lampen_1_F_gruenFB1;
		Lampen_1_F_gruenFB1 = 0;
		//myData.Lampen_1_E_notrot = Lampen_1_E_notrot;
		Lampen_1_E_notrot = 0;
		//myData.Lampen_1_G_VS_Stoer = Lampen_1_G_VS_Stoer;
		Lampen_1_G_VS_Stoer = 0;
		//myData.EMM_EMM_W8_minus = EMM_EMM_W8_minus;
		EMM_EMM_W8_minus = 0;
		//myData.EMM_geprueft1 = EMM_geprueft1;
		EMM_geprueft1 = 0;
		//myData.EMM_geprueft1 = EMM_geprueft1;
		EMM_geprueft1 = 0;
		//myData.EMM_geprueft1 = EMM_geprueft1;
		EMM_geprueft1 = 0;
		//myData.EMM_geprueft1 = EMM_geprueft1;
		EMM_geprueft1 = 0;
		//myData.EMM_EMM_W9_minus = EMM_EMM_W9_minus;
		EMM_EMM_W9_minus = 0;
		//myData.EMM_geprueft1 = EMM_geprueft1;
		EMM_geprueft1 = 0;
		//myData.LN_geprueft1 = LN_geprueft1;
		LN_geprueft1 = 0;
		//myData.LN_geprueft1 = LN_geprueft1;
		LN_geprueft1 = 0;
		//myData.LN_geprueft1 = LN_geprueft1;
		LN_geprueft1 = 0;
		//myData.LN_geprueft1 = LN_geprueft1;
		LN_geprueft1 = 0;
		//myData.LN_geprueft1 = LN_geprueft1;
		LN_geprueft1 = 0;
		//myData.Lampen_1_BL_vLN_weiss = Lampen_1_BL_vLN_weiss;
		Lampen_1_BL_vLN_weiss = 0;
		//myData.Lampen_1_BL_nLN_weiss = Lampen_1_BL_nLN_weiss;
		Lampen_1_BL_nLN_weiss = 0;
		//myData.Lampen_1_BL_nLN_rot = Lampen_1_BL_nLN_rot;
		Lampen_1_BL_nLN_rot = 0;
		//myData.Lampen_1_BL_nZB_rot = Lampen_1_BL_nZB_rot;
		Lampen_1_BL_nZB_rot = 0;
		//myData.Lampen_1_BL_nZB_weiss = Lampen_1_BL_nZB_weiss;
		Lampen_1_BL_nZB_weiss = 0;
		//myData.Lampen_1_Block_vZB_weiss = Lampen_1_Block_vZB_weiss;
		Lampen_1_Block_vZB_weiss = 0;
		//myData.Lampen_1_BL_vZB_rot = Lampen_1_BL_vZB_rot;
		Lampen_1_BL_vZB_rot = 0;
		//myData.Lampen_1_RM_moegl_nLN = Lampen_1_RM_moegl_nLN;
		Lampen_1_RM_moegl_nLN = 0;
		//myData.Lampen_1_FBV_vLN = Lampen_1_FBV_vLN;
		Lampen_1_FBV_vLN = 0;
		//myData.Lampen_1_Stoer_Wecker = Lampen_1_Stoer_Wecker;
		Lampen_1_Stoer_Wecker = 0;
		//myData.Lampen_1_WS1_Freig = Lampen_1_WS1_Freig;
		Lampen_1_WS1_Freig = 0;
		//myData.Lampen_1_FSS_Sperre = Lampen_1_FSS_Sperre;
		Lampen_1_FSS_Sperre = 0;
		//myData.Lampen_1_FSS_Kuppel = Lampen_1_FSS_Kuppel;
		Lampen_1_FSS_Kuppel = 0;
		//myData.Lampen_2_Weiche = Lampen_2_Weiche;
		Lampen_2_Weiche = 0;
		//myData.Lampen_2_Block = Lampen_2_Block;
		Lampen_2_Block = 0;
		//myData.Lampen_2_Signal = Lampen_2_Signal;
		Lampen_2_Signal = 0;
		//myData.Lampen_9_Abl_vEMM = Lampen_9_Abl_vEMM;
		Lampen_9_Abl_vEMM = 0;
		//myData.Lampen_9_Abl_vLN = Lampen_9_Abl_vLN;
		Lampen_9_Abl_vLN = 0;
		//myData.Lampen_9_Abl_vZB = Lampen_9_Abl_vZB;
		Lampen_9_Abl_vZB = 0;
		//myData.Lampen_9_Abl_nEMM = Lampen_9_Abl_nEMM;
		Lampen_9_Abl_nEMM = 0;
		//myData.Lampen_9_Abl_nLN = Lampen_9_Abl_nLN;
		Lampen_9_Abl_nLN = 0;
		//myData.Lampen_9_Abl_nZB = Lampen_9_Abl_nZB;
		Lampen_9_Abl_nZB = 0;
		//myData.Lampen_1_F_rot = Lampen_1_F_rot;
		Lampen_1_F_rot = 0;
		//myData.Lampen_1_F_gruenFB3 = Lampen_1_F_gruenFB3;
		Lampen_1_F_gruenFB3 = 0;
		//myData.Lampen_P4 = Lampen_P4;
		Lampen_P4 = 0;
		//myData.Lampen_P6 = Lampen_P6;
		Lampen_P6 = 0;
	}
	public void init() {
		W1_Endlage_plus = 1;
		W1_Endlage_minus = 0;
		W1_gestoert = 0;
		W1_gestoert = 0;
		W1_keine_Endlage = 0;
		Fstr_ef_E_Halt = 1;
		Fstr_ef_E_Fahrt1_ = 0;
		EMM_EMM_Grundstlg = 1;
		EMM_geprueft1 = 0;
		EMM_EMM_W7_minus = 0;
		EMM_EMM_W10_plus = 0;
		EMM_geprueft2 = 0;
		EMM_EMM_W10_minus = 0;
		EMM_EMM_W9_plus = 0;
		EMM_EMM_W8_plus = 0;
		LN_LN_W1_plus = 0;
		LN_LN_W3_plus = 0;
		LN_LN_W5_plus = 0;
		LN_LN_W5_minus = 0;
		LN_LN_W3_minus = 0;
		LN_LN_W4_plus = 0;
		LN_LN_W6_minus = 0;
		LN_C1_Fahrt2 = 0;
		LN_C1_Halt = 1;
		ZB_EMM_Grundstlg = 0;
		ZB_geprueft1 = 0;
		ZB_D_Fahrt = 0;
		ZB_ZB_W2_plus = 0;
		ZB_geprueft1 = 0;
		ZB_D_Halt = 1;
		ZB_ZB_W1_plus = 0;
		ILTIS__festgehalten_v_LN = 0;
		ILTIS__anfordern_v_ZB = 0;
		ILTIS__freigegeben_v_LN = 1;
		ILTIS__P30 = 0;
		ILTIS__RM_moeglich = 0;
		ILTIS__RM_LN_OM = 0;
		Iso_ef_belegt = 0;
		Iso_ef__frei = 1;
		BL_OM_LN_1 = 0;
		BL_OM_LN_Grundstlg_n = 1;
		BL_OM_LN_3 = 0;
		BL_OM_LN_vorgebl_v = 0;
		BL_OM_LN_belegt_n = 0;
		BL_OM_LN_Grundstlg_v = 0;
		BL_OM_LN_2 = 0;
		BL_OM_LN_vorgebl_n = 0;
		BL_OM_LN_belegt_v = 0;
		BL_OM_LN_RMM_nLN = 0;
		BL_ZB_OM_vorgebl_n = 0;
		BL_ZB_OM_belegt_v = 0;
		BL_ZB_OM_vorgebl_v = 0;
		BL_ZB_OM_Grundstlg_v = 0;
		BL_ZB_OM_Grundstlg_n = 1;
		BL_ZB_OM_belegt_n = 0;
		BL_ZB_OM_1 = 0;
		BL_ZB_OM_2 = 0;
		BL_ZB_OM_3 = 0;
		BL_ZB_OM_RMM_nZB = 0;
		Stw_FSS_Sperrm_ein = 0;
		Stw_FSS_Sperrm_aus = 0;
		Stw_FSS_Kuppelm_aus = 0;
		Stw_FSS_Kuppelm_ein = 0;
		Stw_WS_Sperrm_aus = 0;
		Stw_WS_Sperrm_ein = 0;
		Stw_P11 = 0;
		Fstr_fe_P1 = 0;
		Fstr_fe_aufgeloest = 1;
		Fstr_fe_P2 = 0;
		Fstr_fe_Zug_eingefahren = 0;
		Fstr_fe_F_Halt = 1;
		Fstr_fe_verschlossen = 0;
		Fstr_fe_geprueft = 0;
		Fstr_fe_P2 = 0;
		Fstr_gf_aufgeloest = 1;
		Fstr_gf_Zug_eingefahren = 0;
		Fstr_gf_G_Halt = 1;
		Fstr_gf_verschlossen = 0;
		Fstr_gf_geprueft1 = 0;
		Fstr_gf_geprueft2 = 0;
		Fstr_gf_P4 = 0;
		Fstr_fg_P1 = 0;
		Fstr_fg_aufgeloest = 1;
		Fstr_fg_P2 = 0;
		Fstr_fg_Zug_eingefahren = 0;
		Fstr_fg_F_Halt = 1;
		Fstr_fg_verschlossen = 0;
		Fstr_fg_geprueft1 = 0;
		Fstr_fg_geprueft2 = 0;
		Fstr_fg_geprueft0 = 0;
		Iso_1_belegt = 0;
		Iso_1__frei = 1;
		Iso_gf_belegt = 0;
		Iso_gf__frei = 1;
		Iso_egf_belegt = 0;
		Iso_egf_frei = 1;
		Iso_cd__frei = 1;
		Iso_cd_belegt = 0;
		EMM_C_Fahrt = 0;
		EMM_C_Halt = 1;
		LN_geprueft1 = 0;
		LN_EMM_Grundstlg = 0;
		LN_LN_W1_minus = 0;
		LN_LN_W2_minus = 0;
		Lampen_1_Fstr_gf = 0;
		Lampen_1_WS1_Ueberw = 0;
		Lampen_P8 = 0;
		Lampen_P12 = 0;
		Fstr_ef__aufgeloest = 1;
		Fstr_ef_verschlossen = 0;
		Fstr_ef_P1 = 0;
		Fstr_ef_P2 = 0;
		Fstr_ef_Zug_eingefahren = 0;
		Fstr_ef_geprueft1 = 0;
		Fstr_ef_geprueft2 = 0;
		Fstr_ef_P6 = 0;
	}
	public boolean fireOneTransition() {
		//check if W1_minus_erreichen can fire
		if ( (Kontakte_7_WS1_minus0 >= 1) &&
			(W1_Endlage_minus <= 0) &&
			(W1_keine_Endlage >= 1))
		{
			if (canFire("W1_minus_erreichen"))
			{
				--Kontakte_7_WS1_minus0;
				++W1_Endlage_minus;
				--W1_keine_Endlage;
				fire("W1_minus_erreichen");
				return true;
			}
		}
		//check if W1_plus_erreichen can fire
		if ( (Kontakte_7_WS1_plus0 >= 1) &&
			(W1_Endlage_plus <= 0) &&
			(W1_keine_Endlage >= 1))
		{
			if (canFire("W1_plus_erreichen"))
			{
				--Kontakte_7_WS1_plus0;
				++W1_Endlage_plus;
				--W1_keine_Endlage;
				fire("W1_plus_erreichen");
				return true;
			}
		}
		//check if W1_T3 can fire
		if ( (W1_Endlage_plus >= 1) &&
			(Kontakte_7_WS1_plus0 < 1) &&
			(W1_keine_Endlage <= 0))
		{
			if (canFire("W1_T3"))
			{
				--W1_Endlage_plus;
				++W1_keine_Endlage;
				fire("W1_T3");
				return true;
			}
		}
		//check if W1_T4 can fire
		if ( (W1_Endlage_minus >= 1) &&
			(Kontakte_7_WS1_minus0 < 1) &&
			(W1_keine_Endlage <= 0))
		{
			if (canFire("W1_T4"))
			{
				--W1_Endlage_minus;
				++W1_keine_Endlage;
				fire("W1_T4");
				return true;
			}
		}
		//check if W1_T6 can fire
		if ( (W1_Endlage_plus >= 1) &&
			(ext_Vb_Ueberw_W1_plus < 1) &&
			(W1_gestoert <= 0))
		{
			if (canFire("W1_T6"))
			{
				--W1_Endlage_plus;
				++W1_gestoert;
				fire("W1_T6");
				return true;
			}
		}
		//check if W1_T7 can fire
		if ( (W1_Endlage_plus <= 0) &&
			(ext_Vb_Ueberw_W1_plus >= 1) &&
			(W1_gestoert >= 1))
		{
			if (canFire("W1_T7"))
			{
				++W1_Endlage_plus;
				--ext_Vb_Ueberw_W1_plus;
				--W1_gestoert;
				fire("W1_T7");
				return true;
			}
		}
		//check if W1_T8 can fire
		if ( (W1_Endlage_minus >= 1) &&
			(W1_gestoert <= 0) &&
			(ext_Vb_Ueberw_W1_minus < 1))
		{
			if (canFire("W1_T8"))
			{
				--W1_Endlage_minus;
				++W1_gestoert;
				fire("W1_T8");
				return true;
			}
		}
		//check if W1_T9 can fire
		if ( (W1_gestoert >= 1) &&
			(W1_Endlage_minus <= 0) &&
			(ext_Vb_Ueberw_W1_minus >= 1))
		{
			if (canFire("W1_T9"))
			{
				--W1_gestoert;
				++W1_Endlage_minus;
				--ext_Vb_Ueberw_W1_minus;
				fire("W1_T9");
				return true;
			}
		}
		//check if Fstr_ef_pruefen1 can fire
		if ( (Fstr_ef__aufgeloest >= 1) &&
			(W1_Endlage_plus >= 1) &&
			(Fstr_ef_P6 <= 0) &&
			(Kontakte_8_FSS_30EG >= 1))
		{
			if (canFire("Fstr_ef_pruefen1"))
			{
				--Fstr_ef__aufgeloest;
				--W1_Endlage_plus;
				++Fstr_ef_P6;
				--Kontakte_8_FSS_30EG;
				fire("Fstr_ef_pruefen1");
				return true;
			}
		}
		//check if Fstr_ef_aufloesen can fire
		if ( (Fstr_ef__aufgeloest <= 0) &&
			(Fstr_ef_verschlossen >= 1) &&
			(Kontakte_8_FSS_30EG >= 1) &&
			(Fstr_ef_Zug_eingefahren >= 1))
		{
			if (canFire("Fstr_ef_aufloesen"))
			{
				++Fstr_ef__aufgeloest;
				--Fstr_ef_verschlossen;
				--Kontakte_8_FSS_30EG;
				--Fstr_ef_Zug_eingefahren;
				fire("Fstr_ef_aufloesen");
				return true;
			}
		}
		//check if Fstr_ef_Signal_stellen can fire
		if ( (Fstr_ef_verschlossen >= 1) &&
			(Fstr_ef_E_Fahrt1_ <= 0) &&
			(Fstr_ef_E_Halt >= 1))
		{
			if (canFire("Fstr_ef_Signal_stellen"))
			{
				--Fstr_ef_verschlossen;
				++Fstr_ef_E_Fahrt1_;
				--Fstr_ef_E_Halt;
				fire("Fstr_ef_Signal_stellen");
				return true;
			}
		}
		//check if Fstr_ef_Signalstellen can fire
		if ( (Fstr_ef_P2 >= 1) &&
			(Fstr_ef_E_Fahrt1_ >= 1) &&
			(Fstr_ef_E_Halt <= 1))
		{
			if (canFire("Fstr_ef_Signalstellen"))
			{
				--Fstr_ef_P2;
				--Fstr_ef_E_Fahrt1_;
				++Fstr_ef_E_Halt;
				fire("Fstr_ef_Signalstellen");
				return true;
			}
		}
		//check if Fstr_ef_ef_belegt can fire
		if ( (Fstr_ef_P1 <= 0) &&
			(Iso_ef_belegt >= 1))
		{
			if (canFire("Fstr_ef_ef_belegt"))
			{
				++Fstr_ef_P1;
				--Iso_ef_belegt;
				fire("Fstr_ef_ef_belegt");
				return true;
			}
		}
		//check if Fstr_ef_1_belegt can fire
		if ( (Fstr_ef_P2 <= 0) &&
			(Iso_1_belegt >= 1) &&
			(Fstr_ef_P1 >= 1))
		{
			if (canFire("Fstr_ef_1_belegt"))
			{
				++Fstr_ef_P2;
				--Iso_1_belegt;
				--Fstr_ef_P1;
				fire("Fstr_ef_1_belegt");
				return true;
			}
		}
		//check if Fstr_ef_ef_frei can fire
		if ( (Fstr_ef_P2 >= 1) &&
			(Fstr_ef_Zug_eingefahren <= 0))
		{
			if (canFire("Fstr_ef_ef_frei"))
			{
				--Fstr_ef_P2;
				++Fstr_ef_Zug_eingefahren;
				fire("Fstr_ef_ef_frei");
				return true;
			}
		}
		//check if Fstr_ef_verschliessen can fire
		if ( (Fstr_ef_verschlossen <= 0) &&
			(Fstr_ef_geprueft2 >= 1) &&
			(Kontakte_8_FSS_45EG >= 1))
		{
			if (canFire("Fstr_ef_verschliessen"))
			{
				++Fstr_ef_verschlossen;
				--Fstr_ef_geprueft2;
				--Kontakte_8_FSS_45EG;
				fire("Fstr_ef_verschliessen");
				return true;
			}
		}
		//check if Fstr_ef_Stoerung can fire
		if ( (Fstr_ef_Stoerung_E >= 1) &&
			(Fstr_ef_E_Fahrt1_ >= 1) &&
			(Fstr_ef_E_Halt <= 1))
		{
			if (canFire("Fstr_ef_Stoerung"))
			{
				--Fstr_ef_Stoerung_E;
				--Fstr_ef_E_Fahrt1_;
				++Fstr_ef_E_Halt;
				fire("Fstr_ef_Stoerung");
				return true;
			}
		}
		//check if Fstr_ef_T1 can fire
		if ( (Fstr_ef_geprueft2 <= 0) &&
			(Kontakte_6_BLU_EG >= 1) &&
			(Fstr_ef_geprueft1 >= 1))
		{
			if (canFire("Fstr_ef_T1"))
			{
				++Fstr_ef_geprueft2;
				--Kontakte_6_BLU_EG;
				--Fstr_ef_geprueft1;
				fire("Fstr_ef_T1");
				return true;
			}
		}
		//check if Fstr_ef_T2 can fire
		if ( (Fstr_ef_geprueft2 <= 0) &&
			(Fstr_ef_geprueft1 >= 1) &&
			(BL_OM_LN_Grundstlg_n >= 1))
		{
			if (canFire("Fstr_ef_T2"))
			{
				++Fstr_ef_geprueft2;
				--Fstr_ef_geprueft1;
				--BL_OM_LN_Grundstlg_n;
				fire("Fstr_ef_T2");
				return true;
			}
		}
		//check if Fstr_ef_notaufloesen can fire
		if ( (Fstr_ef_verschlossen >= 1) &&
			(Kontakte_6_NAL >= 1) &&
			(Fstr_ef__aufgeloest <= 0))
		{
			if (canFire("Fstr_ef_notaufloesen"))
			{
				--Fstr_ef_verschlossen;
				--Kontakte_6_NAL;
				++Fstr_ef__aufgeloest;
				fire("Fstr_ef_notaufloesen");
				return true;
			}
		}
		//check if Fstr_ef_T6 can fire
		if ( (Fstr_ef_P6 >= 1) &&
			(Fstr_ef_geprueft1 <= 0) &&
			(Iso_1__frei >= 1) &&
			(Iso_egf_frei >= 1) &&
			(Iso_ef__frei >= 1))
		{
			if (canFire("Fstr_ef_T6"))
			{
				--Fstr_ef_P6;
				++Fstr_ef_geprueft1;
				--Iso_1__frei;
				--Iso_egf_frei;
				--Iso_ef__frei;
				fire("Fstr_ef_T6");
				return true;
			}
		}
		//check if Fstr_ef_T7 can fire
		if ( (Fstr_ef_P6 >= 1) &&
			(Fstr_ef_geprueft1 <= 0) &&
			(Kontakte_6_ISU_Sign >= 1))
		{
			if (canFire("Fstr_ef_T7"))
			{
				--Fstr_ef_P6;
				++Fstr_ef_geprueft1;
				--Kontakte_6_ISU_Sign;
				fire("Fstr_ef_T7");
				return true;
			}
		}
		//check if Iso_ef_Einfahrt_Fz can fire
		if ( (Iso_ef_belegt <= 0) &&
			(Iso_ef__frei >= 1) &&
			(Iso_ef_Zug_einfahren >= 1))
		{
			if (canFire("Iso_ef_Einfahrt_Fz"))
			{
				++Iso_ef_belegt;
				--Iso_ef__frei;
				--Iso_ef_Zug_einfahren;
				fire("Iso_ef_Einfahrt_Fz");
				return true;
			}
		}
		//check if Iso_ef_Ausfahrt_Fz can fire
		if ( (Iso_ef_belegt >= 1) &&
			(Iso_ef_Zug_ausfahren >= 1) &&
			(Iso_ef__frei <= 0))
		{
			if (canFire("Iso_ef_Ausfahrt_Fz"))
			{
				--Iso_ef_belegt;
				--Iso_ef_Zug_ausfahren;
				++Iso_ef__frei;
				fire("Iso_ef_Ausfahrt_Fz");
				return true;
			}
		}
		//check if BL_OM_LN_Signal_Halt can fire
		if ( (BL_OM_LN_2 <= 0) &&
			(BL_OM_LN_1 >= 1) &&
			(Fstr_fg_F_Halt >= 1))
		{
			if (canFire("BL_OM_LN_Signal_Halt"))
			{
				++BL_OM_LN_2;
				--BL_OM_LN_1;
				--Fstr_fg_F_Halt;
				fire("BL_OM_LN_Signal_Halt");
				return true;
			}
		}
		//check if BL_OM_LN_rueckmelden_n can fire
		if ( (BL_OM_LN_Grundstlg_n <= 0) &&
			(BL_OM_LN_belegt_n >= 1) &&
			(ILTIS__RM_LN_OM >= 1))
		{
			if (canFire("BL_OM_LN_rueckmelden_n"))
			{
				++BL_OM_LN_Grundstlg_n;
				--BL_OM_LN_belegt_n;
				--ILTIS__RM_LN_OM;
				fire("BL_OM_LN_rueckmelden_n");
				return true;
			}
		}
		//check if BL_OM_LN_Richtungs__wechsel can fire
		if ( (Kontakte_6_FBA_nLN >= 1) &&
			(BL_OM_LN_Grundstlg_n <= 0) &&
			(BL_OM_LN_Grundstlg_v >= 1) &&
			(ILTIS__festgehalten_v_LN < 1))
		{
			if (canFire("BL_OM_LN_Richtungs__wechsel"))
			{
				--Kontakte_6_FBA_nLN;
				++BL_OM_LN_Grundstlg_n;
				--BL_OM_LN_Grundstlg_v;
				fire("BL_OM_LN_Richtungs__wechsel");
				return true;
			}
		}
		//check if BL_OM_LN_rueckmelden_von can fire
		if ( (BL_OM_LN_belegt_v >= 1) &&
			(BL_OM_LN_Grundstlg_v <= 0) &&
			(Kontakte_6_RM_nLN >= 1) &&
			(BL_OM_LN_RMM_nLN >= 1))
		{
			if (canFire("BL_OM_LN_rueckmelden_von"))
			{
				--BL_OM_LN_belegt_v;
				++BL_OM_LN_Grundstlg_v;
				--Kontakte_6_RM_nLN;
				--BL_OM_LN_RMM_nLN;
				fire("BL_OM_LN_rueckmelden_von");
				return true;
			}
		}
		//check if BL_OM_LN_vormelden_von can fire
		if ( (BL_OM_LN_Grundstlg_v >= 1) &&
			(BL_OM_LN_vorgebl_v <= 0) &&
			(LN_C26_Fahrt >= 1))
		{
			if (canFire("BL_OM_LN_vormelden_von"))
			{
				--BL_OM_LN_Grundstlg_v;
				++BL_OM_LN_vorgebl_v;
				--LN_C26_Fahrt;
				fire("BL_OM_LN_vormelden_von");
				return true;
			}
		}
		//check if BL_OM_LN_blocken_n can fire
		if ( (BL_OM_LN_vorgebl_n >= 1) &&
			(BL_OM_LN_belegt_n <= 0) &&
			(Fstr_ef_E_Halt >= 1) &&
			(Iso_egf_belegt >= 1))
		{
			if (canFire("BL_OM_LN_blocken_n"))
			{
				--BL_OM_LN_vorgebl_n;
				++BL_OM_LN_belegt_n;
				--Fstr_ef_E_Halt;
				--Iso_egf_belegt;
				fire("BL_OM_LN_blocken_n");
				return true;
			}
		}
		//check if BL_OM_LN_blocken_von can fire
		if ( (BL_OM_LN_vorgebl_v >= 1) &&
			(LN_ce_belegt >= 1) &&
			(BL_OM_LN_belegt_v <= 0))
		{
			if (canFire("BL_OM_LN_blocken_von"))
			{
				--BL_OM_LN_vorgebl_v;
				--LN_ce_belegt;
				++BL_OM_LN_belegt_v;
				fire("BL_OM_LN_blocken_von");
				return true;
			}
		}
		//check if BL_OM_LN_Richtungs__wechsel can fire
		if ( (Kontakte_6_FBA_nLN >= 1) &&
			(BL_OM_LN_Grundstlg_n <= 0) &&
			(BL_OM_LN_Grundstlg_v >= 1) &&
			(ILTIS__festgehalten_v_LN < 1))
		{
			if (canFire("BL_OM_LN_Richtungs__wechsel"))
			{
				--Kontakte_6_FBA_nLN;
				++BL_OM_LN_Grundstlg_n;
				--BL_OM_LN_Grundstlg_v;
				fire("BL_OM_LN_Richtungs__wechsel");
				return true;
			}
		}
		//check if BL_OM_LN_F_Fahrt can fire
		if ( (BL_OM_LN_1 <= 0) &&
			(Fstr_fg_F_Fahrt3_ >= 1))
		{
			if (canFire("BL_OM_LN_F_Fahrt"))
			{
				++BL_OM_LN_1;
				--Fstr_fg_F_Fahrt3_;
				fire("BL_OM_LN_F_Fahrt");
				return true;
			}
		}
		//check if BL_OM_LN_vormelden_n can fire
		if ( (BL_OM_LN_Grundstlg_n >= 1) &&
			(BL_OM_LN_vorgebl_n <= 0) &&
			(Fstr_ef_verschlossen >= 1))
		{
			if (canFire("BL_OM_LN_vormelden_n"))
			{
				--BL_OM_LN_Grundstlg_n;
				++BL_OM_LN_vorgebl_n;
				--Fstr_ef_verschlossen;
				fire("BL_OM_LN_vormelden_n");
				return true;
			}
		}
		//check if BL_OM_LN_1_belegt can fire
		if ( (BL_OM_LN_2 >= 1) &&
			(Iso_1_belegt >= 1) &&
			(BL_OM_LN_3 <= 0))
		{
			if (canFire("BL_OM_LN_1_belegt"))
			{
				--BL_OM_LN_2;
				--Iso_1_belegt;
				++BL_OM_LN_3;
				fire("BL_OM_LN_1_belegt");
				return true;
			}
		}
		//check if BL_OM_LN_1_frei can fire
		if ( (BL_OM_LN_3 >= 1) &&
			(BL_OM_LN_RMM_nLN <= 0) &&
			(Iso_1__frei >= 1))
		{
			if (canFire("BL_OM_LN_1_frei"))
			{
				--BL_OM_LN_3;
				++BL_OM_LN_RMM_nLN;
				--Iso_1__frei;
				fire("BL_OM_LN_1_frei");
				return true;
			}
		}
		//check if BL_OM_LN_T1 can fire
		if ( (BL_OM_LN_1 <= 0) &&
			(Fstr_fe_F_Fahrt1 >= 1))
		{
			if (canFire("BL_OM_LN_T1"))
			{
				++BL_OM_LN_1;
				--Fstr_fe_F_Fahrt1;
				fire("BL_OM_LN_T1");
				return true;
			}
		}
		//check if BL_OM_LN_T2 can fire
		if ( (BL_OM_LN_1 >= 1) &&
			(BL_OM_LN_2 <= 0) &&
			(Fstr_fe_F_Halt >= 1))
		{
			if (canFire("BL_OM_LN_T2"))
			{
				--BL_OM_LN_1;
				++BL_OM_LN_2;
				--Fstr_fe_F_Halt;
				fire("BL_OM_LN_T2");
				return true;
			}
		}
		//check if BL_OM_LN_T1 can fire
		if ( (BL_OM_LN_1 <= 0) &&
			(Fstr_fe_F_Fahrt1 >= 1))
		{
			if (canFire("BL_OM_LN_T1"))
			{
				++BL_OM_LN_1;
				--Fstr_fe_F_Fahrt1;
				fire("BL_OM_LN_T1");
				return true;
			}
		}
		//check if BL_OM_LN_T2 can fire
		if ( (BL_OM_LN_1 >= 1) &&
			(BL_OM_LN_2 <= 0) &&
			(Fstr_fe_F_Halt >= 1))
		{
			if (canFire("BL_OM_LN_T2"))
			{
				--BL_OM_LN_1;
				++BL_OM_LN_2;
				--Fstr_fe_F_Halt;
				fire("BL_OM_LN_T2");
				return true;
			}
		}
		//check if BL_OM_LN_T1 can fire
		if ( (BL_OM_LN_1 <= 0) &&
			(Fstr_fe_F_Fahrt1 >= 1))
		{
			if (canFire("BL_OM_LN_T1"))
			{
				++BL_OM_LN_1;
				--Fstr_fe_F_Fahrt1;
				fire("BL_OM_LN_T1");
				return true;
			}
		}
		//check if BL_ZB_OM_Richtungs__wechsel can fire
		if ( (BL_ZB_OM_Grundstlg_v <= 0) &&
			(BL_ZB_OM_Grundstlg_n >= 1) &&
			(Kontakte_6_FBF_nZB < 1) &&
			(ILTIS__anfordern_v_ZB >= 1))
		{
			if (canFire("BL_ZB_OM_Richtungs__wechsel"))
			{
				++BL_ZB_OM_Grundstlg_v;
				--BL_ZB_OM_Grundstlg_n;
				--ILTIS__anfordern_v_ZB;
				fire("BL_ZB_OM_Richtungs__wechsel");
				return true;
			}
		}
		//check if BL_ZB_OM_vormelden_n can fire
		if ( (BL_ZB_OM_vorgebl_n <= 0) &&
			(BL_ZB_OM_Grundstlg_n >= 1) &&
			(Fstr_fg_verschlossen >= 1))
		{
			if (canFire("BL_ZB_OM_vormelden_n"))
			{
				++BL_ZB_OM_vorgebl_n;
				--BL_ZB_OM_Grundstlg_n;
				--Fstr_fg_verschlossen;
				fire("BL_ZB_OM_vormelden_n");
				return true;
			}
		}
		//check if BL_ZB_OM_rueckmelden_n can fire
		if ( (BL_ZB_OM_belegt_n >= 1) &&
			(BL_ZB_OM_Grundstlg_n <= 0) &&
			(ILTIS__RM_ZB_OM >= 1))
		{
			if (canFire("BL_ZB_OM_rueckmelden_n"))
			{
				--BL_ZB_OM_belegt_n;
				++BL_ZB_OM_Grundstlg_n;
				--ILTIS__RM_ZB_OM;
				fire("BL_ZB_OM_rueckmelden_n");
				return true;
			}
		}
		//check if BL_ZB_OM_rueckmelden_von can fire
		if ( (BL_ZB_OM_belegt_v >= 1) &&
			(BL_ZB_OM_RMM_nZB >= 1) &&
			(BL_ZB_OM_Grundstlg_v <= 0) &&
			(Kontakte_6_RM_nZB >= 1))
		{
			if (canFire("BL_ZB_OM_rueckmelden_von"))
			{
				--BL_ZB_OM_belegt_v;
				--BL_ZB_OM_RMM_nZB;
				++BL_ZB_OM_Grundstlg_v;
				--Kontakte_6_RM_nZB;
				fire("BL_ZB_OM_rueckmelden_von");
				return true;
			}
		}
		//check if BL_ZB_OM_vormelden_v can fire
		if ( (BL_ZB_OM_vorgebl_v <= 0) &&
			(BL_ZB_OM_Grundstlg_v >= 1) &&
			(ZB_C_Fahrt >= 1))
		{
			if (canFire("BL_ZB_OM_vormelden_v"))
			{
				++BL_ZB_OM_vorgebl_v;
				--BL_ZB_OM_Grundstlg_v;
				--ZB_C_Fahrt;
				fire("BL_ZB_OM_vormelden_v");
				return true;
			}
		}
		//check if BL_ZB_OM_blocken_N can fire
		if ( (BL_ZB_OM_belegt_n <= 0) &&
			(BL_ZB_OM_vorgebl_n >= 1) &&
			(Iso_1_belegt >= 1))
		{
			if (canFire("BL_ZB_OM_blocken_N"))
			{
				++BL_ZB_OM_belegt_n;
				--BL_ZB_OM_vorgebl_n;
				--Iso_1_belegt;
				fire("BL_ZB_OM_blocken_N");
				return true;
			}
		}
		//check if BL_ZB_OM_blocken_v can fire
		if ( (ZB_cd_belegt >= 1) &&
			(BL_ZB_OM_belegt_v <= 0) &&
			(BL_ZB_OM_vorgebl_v >= 1))
		{
			if (canFire("BL_ZB_OM_blocken_v"))
			{
				--ZB_cd_belegt;
				++BL_ZB_OM_belegt_v;
				--BL_ZB_OM_vorgebl_v;
				fire("BL_ZB_OM_blocken_v");
				return true;
			}
		}
		//check if BL_ZB_OM_Richtungs__wechsel can fire
		if ( (BL_ZB_OM_Grundstlg_v <= 0) &&
			(BL_ZB_OM_Grundstlg_n >= 1) &&
			(Kontakte_6_FBF_nZB < 1) &&
			(ILTIS__anfordern_v_ZB >= 1))
		{
			if (canFire("BL_ZB_OM_Richtungs__wechsel"))
			{
				++BL_ZB_OM_Grundstlg_v;
				--BL_ZB_OM_Grundstlg_n;
				--ILTIS__anfordern_v_ZB;
				fire("BL_ZB_OM_Richtungs__wechsel");
				return true;
			}
		}
		//check if BL_ZB_OM_G_Halt can fire
		if ( (BL_ZB_OM_1 >= 1) &&
			(BL_ZB_OM_2 <= 0) &&
			(Fstr_gf_G_Halt >= 1))
		{
			if (canFire("BL_ZB_OM_G_Halt"))
			{
				--BL_ZB_OM_1;
				++BL_ZB_OM_2;
				--Fstr_gf_G_Halt;
				fire("BL_ZB_OM_G_Halt");
				return true;
			}
		}
		//check if BL_ZB_OM_G_Fahrt can fire
		if ( (Fstr_gf_G_Fahrt3_ >= 1) &&
			(BL_ZB_OM_1 <= 0))
		{
			if (canFire("BL_ZB_OM_G_Fahrt"))
			{
				--Fstr_gf_G_Fahrt3_;
				++BL_ZB_OM_1;
				fire("BL_ZB_OM_G_Fahrt");
				return true;
			}
		}
		//check if BL_ZB_OM_1_belegt can fire
		if ( (Iso_1_belegt >= 1) &&
			(BL_ZB_OM_2 >= 1) &&
			(BL_ZB_OM_3 <= 0))
		{
			if (canFire("BL_ZB_OM_1_belegt"))
			{
				--Iso_1_belegt;
				--BL_ZB_OM_2;
				++BL_ZB_OM_3;
				fire("BL_ZB_OM_1_belegt");
				return true;
			}
		}
		//check if BL_ZB_OM_1_frei can fire
		if ( (BL_ZB_OM_RMM_nZB <= 0) &&
			(Iso_1__frei >= 1) &&
			(BL_ZB_OM_3 >= 1))
		{
			if (canFire("BL_ZB_OM_1_frei"))
			{
				++BL_ZB_OM_RMM_nZB;
				--Iso_1__frei;
				--BL_ZB_OM_3;
				fire("BL_ZB_OM_1_frei");
				return true;
			}
		}
		//check if Stw_abfallen can fire
		if ( (Stw_FSS_Sperrm_ein >= 1) &&
			(Stw_FSS_Sperrm_aus <= 0) &&
			(Kontakte_8_FSS_10F >= 1) &&
			(Stw_P10 >= 1))
		{
			if (canFire("Stw_abfallen"))
			{
				--Stw_FSS_Sperrm_ein;
				++Stw_FSS_Sperrm_aus;
				--Kontakte_8_FSS_10F;
				--Stw_P10;
				fire("Stw_abfallen");
				return true;
			}
		}
		//check if Stw_anziehen can fire
		if ( (Stw_FSS_Kuppelm_aus >= 1) &&
			(Stw_FSS_Kuppelm_ein <= 0) &&
			(Fstr_ef_geprueft2 >= 1))
		{
			if (canFire("Stw_anziehen"))
			{
				--Stw_FSS_Kuppelm_aus;
				++Stw_FSS_Kuppelm_ein;
				--Fstr_ef_geprueft2;
				fire("Stw_anziehen");
				return true;
			}
		}
		//check if Stw_abfallen can fire
		if ( (Stw_FSS_Sperrm_ein >= 1) &&
			(Stw_FSS_Sperrm_aus <= 0) &&
			(Kontakte_8_FSS_10F >= 1) &&
			(Stw_P10 >= 1))
		{
			if (canFire("Stw_abfallen"))
			{
				--Stw_FSS_Sperrm_ein;
				++Stw_FSS_Sperrm_aus;
				--Kontakte_8_FSS_10F;
				--Stw_P10;
				fire("Stw_abfallen");
				return true;
			}
		}
		//check if Stw_abfallen can fire
		if ( (Stw_FSS_Sperrm_ein >= 1) &&
			(Stw_FSS_Sperrm_aus <= 0) &&
			(Kontakte_8_FSS_10F >= 1) &&
			(Stw_P10 >= 1))
		{
			if (canFire("Stw_abfallen"))
			{
				--Stw_FSS_Sperrm_ein;
				++Stw_FSS_Sperrm_aus;
				--Kontakte_8_FSS_10F;
				--Stw_P10;
				fire("Stw_abfallen");
				return true;
			}
		}
		//check if Stw_anziehen can fire
		if ( (Stw_FSS_Kuppelm_aus >= 1) &&
			(Stw_FSS_Kuppelm_ein <= 0) &&
			(Fstr_ef_geprueft2 >= 1))
		{
			if (canFire("Stw_anziehen"))
			{
				--Stw_FSS_Kuppelm_aus;
				++Stw_FSS_Kuppelm_ein;
				--Fstr_ef_geprueft2;
				fire("Stw_anziehen");
				return true;
			}
		}
		//check if Stw_T3 can fire
		if ( (Stw_FSS_Sperrm_ein >= 1) &&
			(Stw_FSS_Sperrm_aus <= 0) &&
			(Kontakte_8_FSS_10EG >= 1) &&
			(Stw_P11 >= 1))
		{
			if (canFire("Stw_T3"))
			{
				--Stw_FSS_Sperrm_ein;
				++Stw_FSS_Sperrm_aus;
				--Kontakte_8_FSS_10EG;
				--Stw_P11;
				fire("Stw_T3");
				return true;
			}
		}
		//check if Stw_T8 can fire
		if ( (Stw_FSS_Kuppelm_ein >= 1) &&
			(Stw_FSS_Kuppelm_aus <= 0) &&
			(Fstr_fe_Zug_eingefahren >= 1))
		{
			if (canFire("Stw_T8"))
			{
				--Stw_FSS_Kuppelm_ein;
				++Stw_FSS_Kuppelm_aus;
				--Fstr_fe_Zug_eingefahren;
				fire("Stw_T8");
				return true;
			}
		}
		//check if Stw_T11 can fire
		if ( (Kontakte_8_FSS_10EG >= 1) &&
			(Stw_FSS_Sperrm_ein <= 0) &&
			(Kontakte_6_Gleist_ZB >= 1) &&
			(Kontakte_7_WS1_minus0 >= 1) &&
			(Stw_FSS_Sperrm_aus >= 1))
		{
			if (canFire("Stw_T11"))
			{
				--Kontakte_8_FSS_10EG;
				++Stw_FSS_Sperrm_ein;
				--Kontakte_6_Gleist_ZB;
				--Kontakte_7_WS1_minus0;
				--Stw_FSS_Sperrm_aus;
				fire("Stw_T11");
				return true;
			}
		}
		//check if Stw_T13 can fire
		if ( (Stw_FSS_Sperrm_aus >= 1) &&
			(Stw_FSS_Sperrm_ein <= 0) &&
			(Kontakte_8_FSS_45EG >= 1))
		{
			if (canFire("Stw_T13"))
			{
				--Stw_FSS_Sperrm_aus;
				++Stw_FSS_Sperrm_ein;
				--Kontakte_8_FSS_45EG;
				fire("Stw_T13");
				return true;
			}
		}
		//check if Stw_T14 can fire
		if ( (Stw_FSS_Sperrm_aus >= 1) &&
			(Stw_FSS_Sperrm_ein <= 0) &&
			(Kontakte_8_FSS_45F >= 1))
		{
			if (canFire("Stw_T14"))
			{
				--Stw_FSS_Sperrm_aus;
				++Stw_FSS_Sperrm_ein;
				--Kontakte_8_FSS_45F;
				fire("Stw_T14");
				return true;
			}
		}
		//check if Stw_T1 can fire
		if ( (Stw_WS_Sperrm_ein <= 0) &&
			(Kontakte_6_NT_W1 >= 1) &&
			(Stw_WS_Sperrm_aus >= 1))
		{
			if (canFire("Stw_T1"))
			{
				++Stw_WS_Sperrm_ein;
				--Kontakte_6_NT_W1;
				--Stw_WS_Sperrm_aus;
				fire("Stw_T1");
				return true;
			}
		}
		//check if Stw_T2 can fire
		if ( (Kontakte_7_WS1_minus1 >= 1) &&
			(Stw_WS_Sperrm_ein <= 0) &&
			(Stw_WS_Sperrm_aus >= 1) &&
			(Iso_1__frei >= 1))
		{
			if (canFire("Stw_T2"))
			{
				--Kontakte_7_WS1_minus1;
				++Stw_WS_Sperrm_ein;
				--Stw_WS_Sperrm_aus;
				--Iso_1__frei;
				fire("Stw_T2");
				return true;
			}
		}
		//check if Stw_anziehen can fire
		if ( (Stw_FSS_Kuppelm_aus >= 1) &&
			(Stw_FSS_Kuppelm_ein <= 0) &&
			(Fstr_ef_geprueft2 >= 1))
		{
			if (canFire("Stw_anziehen"))
			{
				--Stw_FSS_Kuppelm_aus;
				++Stw_FSS_Kuppelm_ein;
				--Fstr_ef_geprueft2;
				fire("Stw_anziehen");
				return true;
			}
		}
		//check if Stw_T5 can fire
		if ( (Stw_FSS_Kuppelm_aus >= 1) &&
			(Fstr_fe_geprueft >= 1) &&
			(Stw_FSS_Kuppelm_ein <= 0))
		{
			if (canFire("Stw_T5"))
			{
				--Stw_FSS_Kuppelm_aus;
				--Fstr_fe_geprueft;
				++Stw_FSS_Kuppelm_ein;
				fire("Stw_T5");
				return true;
			}
		}
		//check if Stw_T6 can fire
		if ( (Stw_FSS_Kuppelm_aus >= 1) &&
			(Stw_FSS_Kuppelm_ein <= 0) &&
			(Fstr_fg_geprueft2 >= 1))
		{
			if (canFire("Stw_T6"))
			{
				--Stw_FSS_Kuppelm_aus;
				++Stw_FSS_Kuppelm_ein;
				--Fstr_fg_geprueft2;
				fire("Stw_T6");
				return true;
			}
		}
		//check if Stw_T7 can fire
		if ( (Fstr_gf_geprueft2 >= 1) &&
			(Stw_FSS_Kuppelm_aus >= 1) &&
			(Stw_FSS_Kuppelm_ein <= 0))
		{
			if (canFire("Stw_T7"))
			{
				--Fstr_gf_geprueft2;
				--Stw_FSS_Kuppelm_aus;
				++Stw_FSS_Kuppelm_ein;
				fire("Stw_T7");
				return true;
			}
		}
		//check if Stw_T8 can fire
		if ( (Stw_FSS_Kuppelm_ein >= 1) &&
			(Stw_FSS_Kuppelm_aus <= 0) &&
			(Fstr_fe_Zug_eingefahren >= 1))
		{
			if (canFire("Stw_T8"))
			{
				--Stw_FSS_Kuppelm_ein;
				++Stw_FSS_Kuppelm_aus;
				--Fstr_fe_Zug_eingefahren;
				fire("Stw_T8");
				return true;
			}
		}
		//check if Stw_T9 can fire
		if ( (Stw_FSS_Kuppelm_ein >= 1) &&
			(Stw_FSS_Kuppelm_aus <= 0) &&
			(Fstr_gf_Zug_eingefahren >= 1))
		{
			if (canFire("Stw_T9"))
			{
				--Stw_FSS_Kuppelm_ein;
				++Stw_FSS_Kuppelm_aus;
				--Fstr_gf_Zug_eingefahren;
				fire("Stw_T9");
				return true;
			}
		}
		//check if Stw_T10 can fire
		if ( (Stw_WS_Sperrm_ein >= 1) &&
			(Stw_WS_Sperrm_aus <= 0) &&
			(Kontakte_7_WS1_minus0 >= 1))
		{
			if (canFire("Stw_T10"))
			{
				--Stw_WS_Sperrm_ein;
				++Stw_WS_Sperrm_aus;
				--Kontakte_7_WS1_minus0;
				fire("Stw_T10");
				return true;
			}
		}
		//check if Stw_T1 can fire
		if ( (Stw_WS_Sperrm_ein <= 0) &&
			(Kontakte_6_NT_W1 >= 1) &&
			(Stw_WS_Sperrm_aus >= 1))
		{
			if (canFire("Stw_T1"))
			{
				++Stw_WS_Sperrm_ein;
				--Kontakte_6_NT_W1;
				--Stw_WS_Sperrm_aus;
				fire("Stw_T1");
				return true;
			}
		}
		//check if Stw_T2 can fire
		if ( (Kontakte_7_WS1_minus1 >= 1) &&
			(Stw_WS_Sperrm_ein <= 0) &&
			(Stw_WS_Sperrm_aus >= 1) &&
			(Iso_1__frei >= 1))
		{
			if (canFire("Stw_T2"))
			{
				--Kontakte_7_WS1_minus1;
				++Stw_WS_Sperrm_ein;
				--Stw_WS_Sperrm_aus;
				--Iso_1__frei;
				fire("Stw_T2");
				return true;
			}
		}
		//check if Stw_T3 can fire
		if ( (Stw_FSS_Sperrm_ein >= 1) &&
			(Stw_FSS_Sperrm_aus <= 0) &&
			(Kontakte_8_FSS_10EG >= 1) &&
			(Stw_P11 >= 1))
		{
			if (canFire("Stw_T3"))
			{
				--Stw_FSS_Sperrm_ein;
				++Stw_FSS_Sperrm_aus;
				--Kontakte_8_FSS_10EG;
				--Stw_P11;
				fire("Stw_T3");
				return true;
			}
		}
		//check if Stw_T4 can fire
		if ( (Kontakte_8_FSS_45EG >= 1) &&
			(Stw_P11 <= 0))
		{
			if (canFire("Stw_T4"))
			{
				--Kontakte_8_FSS_45EG;
				++Stw_P11;
				fire("Stw_T4");
				return true;
			}
		}
		//check if Fstr_fe_aufloesen can fire
		if ( (Fstr_fe_verschlossen >= 1) &&
			(Fstr_fe_aufgeloest <= 1) &&
			(Fstr_fe_Zug_eingefahren >= 1))
		{
			if (canFire("Fstr_fe_aufloesen"))
			{
				--Fstr_fe_verschlossen;
				++Fstr_fe_aufgeloest;
				--Fstr_fe_Zug_eingefahren;
				fire("Fstr_fe_aufloesen");
				return true;
			}
		}
		//check if Fstr_fe_egf_frei can fire
		if ( (Fstr_fe_P2 >= 1) &&
			(Fstr_fe_Zug_eingefahren <= 0))
		{
			if (canFire("Fstr_fe_egf_frei"))
			{
				--Fstr_fe_P2;
				++Fstr_fe_Zug_eingefahren;
				fire("Fstr_fe_egf_frei");
				return true;
			}
		}
		//check if Fstr_fe_1_belegt can fire
		if ( (Fstr_fe_P1 >= 1) &&
			(Fstr_fe_P2 <= 0) &&
			(Iso_1_belegt >= 1))
		{
			if (canFire("Fstr_fe_1_belegt"))
			{
				--Fstr_fe_P1;
				++Fstr_fe_P2;
				--Iso_1_belegt;
				fire("Fstr_fe_1_belegt");
				return true;
			}
		}
		//check if Fstr_fe_egf_belegt can fire
		if ( (Iso_egf_belegt >= 1) &&
			(Fstr_fe_P1 <= 0))
		{
			if (canFire("Fstr_fe_egf_belegt"))
			{
				--Iso_egf_belegt;
				++Fstr_fe_P1;
				fire("Fstr_fe_egf_belegt");
				return true;
			}
		}
		//check if Fstr_fe_Signal_stellen can fire
		if ( (Fstr_fe_F_Fahrt1 >= 1) &&
			(Fstr_fe_F_Halt <= 1) &&
			(Fstr_fe_P2 >= 1))
		{
			if (canFire("Fstr_fe_Signal_stellen"))
			{
				--Fstr_fe_F_Fahrt1;
				++Fstr_fe_F_Halt;
				--Fstr_fe_P2;
				fire("Fstr_fe_Signal_stellen");
				return true;
			}
		}
		//check if Fstr_fe_Signal_stellen can fire
		if ( (Fstr_fe_F_Fahrt1 >= 1) &&
			(Fstr_fe_F_Halt <= 1) &&
			(Fstr_fe_P2 >= 1))
		{
			if (canFire("Fstr_fe_Signal_stellen"))
			{
				--Fstr_fe_F_Fahrt1;
				++Fstr_fe_F_Halt;
				--Fstr_fe_P2;
				fire("Fstr_fe_Signal_stellen");
				return true;
			}
		}
		//check if Fstr_fe_verschliessen can fire
		if ( (Fstr_fe_geprueft >= 1) &&
			(Fstr_fe_verschlossen <= 0) &&
			(Kontakte_8_FSS_45F >= 1))
		{
			if (canFire("Fstr_fe_verschliessen"))
			{
				--Fstr_fe_geprueft;
				++Fstr_fe_verschlossen;
				--Kontakte_8_FSS_45F;
				fire("Fstr_fe_verschliessen");
				return true;
			}
		}
		//check if Fstr_fe_pruefen can fire
		if ( (Fstr_fe_aufgeloest >= 1) &&
			(W1_Endlage_plus >= 1) &&
			(Fstr_fe_P2 <= 0) &&
			(Kontakte_8_FSS_30F >= 1))
		{
			if (canFire("Fstr_fe_pruefen"))
			{
				--Fstr_fe_aufgeloest;
				--W1_Endlage_plus;
				++Fstr_fe_P2;
				--Kontakte_8_FSS_30F;
				fire("Fstr_fe_pruefen");
				return true;
			}
		}
		//check if Fstr_fe_Stoerung can fire
		if ( (Fstr_fe_F_Fahrt1 >= 1) &&
			(Fstr_fe_F_Halt <= 1) &&
			(Fstr_fe_Stoerung_F >= 1))
		{
			if (canFire("Fstr_fe_Stoerung"))
			{
				--Fstr_fe_F_Fahrt1;
				++Fstr_fe_F_Halt;
				--Fstr_fe_Stoerung_F;
				fire("Fstr_fe_Stoerung");
				return true;
			}
		}
		//check if Fstr_fe_notaufloesen can fire
		if ( (Fstr_fe_verschlossen >= 1) &&
			(Fstr_fe_aufgeloest <= 1) &&
			(Kontakte_6_NAL >= 1))
		{
			if (canFire("Fstr_fe_notaufloesen"))
			{
				--Fstr_fe_verschlossen;
				++Fstr_fe_aufgeloest;
				--Kontakte_6_NAL;
				fire("Fstr_fe_notaufloesen");
				return true;
			}
		}
		//check if Fstr_fe_T2 can fire
		if ( (Fstr_fe_P2 >= 1) &&
			(Iso_ef__frei >= 1) &&
			(Iso_egf_frei >= 1) &&
			(Iso_1__frei >= 1) &&
			(Iso_cd__frei >= 1) &&
			(Fstr_fe_geprueft <= 0))
		{
			if (canFire("Fstr_fe_T2"))
			{
				--Fstr_fe_P2;
				--Iso_ef__frei;
				--Iso_egf_frei;
				--Iso_1__frei;
				--Iso_cd__frei;
				++Fstr_fe_geprueft;
				fire("Fstr_fe_T2");
				return true;
			}
		}
		//check if Fstr_fe_T3 can fire
		if ( (Fstr_fe_P2 >= 1) &&
			(Fstr_fe_geprueft <= 0) &&
			(Kontakte_6_ISU_Sign >= 1))
		{
			if (canFire("Fstr_fe_T3"))
			{
				--Fstr_fe_P2;
				++Fstr_fe_geprueft;
				--Kontakte_6_ISU_Sign;
				fire("Fstr_fe_T3");
				return true;
			}
		}
		//check if Fstr_gf_aufloesen can fire
		if ( (Fstr_gf_aufgeloest <= 0) &&
			(Fstr_gf_verschlossen >= 1) &&
			(Fstr_gf_Zug_eingefahren >= 1))
		{
			if (canFire("Fstr_gf_aufloesen"))
			{
				++Fstr_gf_aufgeloest;
				--Fstr_gf_verschlossen;
				--Fstr_gf_Zug_eingefahren;
				fire("Fstr_gf_aufloesen");
				return true;
			}
		}
		//check if Fstr_gf_1_belegt can fire
		if ( (Iso_1_belegt >= 1) &&
			(Fstr_gf_Zug_eingefahren <= 0))
		{
			if (canFire("Fstr_gf_1_belegt"))
			{
				--Iso_1_belegt;
				++Fstr_gf_Zug_eingefahren;
				fire("Fstr_gf_1_belegt");
				return true;
			}
		}
		//check if Fstr_gf_Signal_stellen can fire
		if ( (Fstr_gf_Zug_eingefahren >= 1) &&
			(Fstr_gf_G_Fahrt3_ >= 1) &&
			(Fstr_gf_G_Halt <= 1))
		{
			if (canFire("Fstr_gf_Signal_stellen"))
			{
				--Fstr_gf_Zug_eingefahren;
				--Fstr_gf_G_Fahrt3_;
				++Fstr_gf_G_Halt;
				fire("Fstr_gf_Signal_stellen");
				return true;
			}
		}
		//check if Fstr_gf_Signal_stellen can fire
		if ( (Fstr_gf_Zug_eingefahren >= 1) &&
			(Fstr_gf_G_Fahrt3_ >= 1) &&
			(Fstr_gf_G_Halt <= 1))
		{
			if (canFire("Fstr_gf_Signal_stellen"))
			{
				--Fstr_gf_Zug_eingefahren;
				--Fstr_gf_G_Fahrt3_;
				++Fstr_gf_G_Halt;
				fire("Fstr_gf_Signal_stellen");
				return true;
			}
		}
		//check if Fstr_gf_verschliessen can fire
		if ( (Fstr_gf_geprueft2 >= 1) &&
			(Fstr_gf_verschlossen <= 0) &&
			(Kontakte_8_FSS_45EG >= 1))
		{
			if (canFire("Fstr_gf_verschliessen"))
			{
				--Fstr_gf_geprueft2;
				++Fstr_gf_verschlossen;
				--Kontakte_8_FSS_45EG;
				fire("Fstr_gf_verschliessen");
				return true;
			}
		}
		//check if Fstr_gf_prüfen1 can fire
		if ( (Fstr_gf_aufgeloest >= 1) &&
			(Fstr_gf_P4 <= 0) &&
			(W1_Endlage_minus >= 1) &&
			(Kontakte_8_FSS_30EG >= 1))
		{
			if (canFire("Fstr_gf_prüfen1"))
			{
				--Fstr_gf_aufgeloest;
				++Fstr_gf_P4;
				--W1_Endlage_minus;
				--Kontakte_8_FSS_30EG;
				fire("Fstr_gf_prüfen1");
				return true;
			}
		}
		//check if Fstr_gf_Stoerung can fire
		if ( (Fstr_gf_Stoerung_G >= 1) &&
			(Fstr_gf_G_Fahrt3_ >= 1) &&
			(Fstr_gf_G_Halt <= 1))
		{
			if (canFire("Fstr_gf_Stoerung"))
			{
				--Fstr_gf_Stoerung_G;
				--Fstr_gf_G_Fahrt3_;
				++Fstr_gf_G_Halt;
				fire("Fstr_gf_Stoerung");
				return true;
			}
		}
		//check if Fstr_gf_T1 can fire
		if ( (Fstr_gf_geprueft1 >= 1) &&
			(Fstr_gf_geprueft2 <= 0) &&
			(BL_ZB_OM_Grundstlg_n >= 1))
		{
			if (canFire("Fstr_gf_T1"))
			{
				--Fstr_gf_geprueft1;
				++Fstr_gf_geprueft2;
				--BL_ZB_OM_Grundstlg_n;
				fire("Fstr_gf_T1");
				return true;
			}
		}
		//check if Fstr_gf_T2 can fire
		if ( (Fstr_gf_geprueft1 >= 1) &&
			(Fstr_gf_geprueft2 <= 0) &&
			(Kontakte_6_BLU_EG >= 1))
		{
			if (canFire("Fstr_gf_T2"))
			{
				--Fstr_gf_geprueft1;
				++Fstr_gf_geprueft2;
				--Kontakte_6_BLU_EG;
				fire("Fstr_gf_T2");
				return true;
			}
		}
		//check if Fstr_gf_notaufloesen can fire
		if ( (Fstr_gf_aufgeloest <= 0) &&
			(Fstr_gf_verschlossen >= 1) &&
			(Kontakte_6_NAL >= 1))
		{
			if (canFire("Fstr_gf_notaufloesen"))
			{
				++Fstr_gf_aufgeloest;
				--Fstr_gf_verschlossen;
				--Kontakte_6_NAL;
				fire("Fstr_gf_notaufloesen");
				return true;
			}
		}
		//check if Fstr_gf_T5 can fire
		if ( (Fstr_gf_P4 >= 1) &&
			(Fstr_gf_geprueft1 <= 0) &&
			(Iso_egf_frei >= 1) &&
			(Iso_1__frei >= 1))
		{
			if (canFire("Fstr_gf_T5"))
			{
				--Fstr_gf_P4;
				++Fstr_gf_geprueft1;
				--Iso_egf_frei;
				--Iso_1__frei;
				fire("Fstr_gf_T5");
				return true;
			}
		}
		//check if Fstr_gf_T6 can fire
		if ( (Fstr_gf_P4 >= 1) &&
			(Fstr_gf_geprueft1 <= 0) &&
			(Kontakte_6_ISU_Sign >= 1))
		{
			if (canFire("Fstr_gf_T6"))
			{
				--Fstr_gf_P4;
				++Fstr_gf_geprueft1;
				--Kontakte_6_ISU_Sign;
				fire("Fstr_gf_T6");
				return true;
			}
		}
		//check if Fstr_fg_aufloesen can fire
		if ( (Fstr_fg_aufgeloest <= 0) &&
			(Fstr_fg_verschlossen >= 1) &&
			(Fstr_fg_Zug_eingefahren >= 1))
		{
			if (canFire("Fstr_fg_aufloesen"))
			{
				++Fstr_fg_aufgeloest;
				--Fstr_fg_verschlossen;
				--Fstr_fg_Zug_eingefahren;
				fire("Fstr_fg_aufloesen");
				return true;
			}
		}
		//check if Fstr_fg_egf_frei can fire
		if ( (Fstr_fg_P2 >= 1) &&
			(Fstr_fg_Zug_eingefahren <= 0))
		{
			if (canFire("Fstr_fg_egf_frei"))
			{
				--Fstr_fg_P2;
				++Fstr_fg_Zug_eingefahren;
				fire("Fstr_fg_egf_frei");
				return true;
			}
		}
		//check if Fstr_fg_1_belegt can fire
		if ( (Fstr_fg_P1 >= 1) &&
			(Fstr_fg_P2 <= 0) &&
			(Iso_1_belegt >= 1))
		{
			if (canFire("Fstr_fg_1_belegt"))
			{
				--Fstr_fg_P1;
				++Fstr_fg_P2;
				--Iso_1_belegt;
				fire("Fstr_fg_1_belegt");
				return true;
			}
		}
		//check if Fstr_fg_egf_belegt can fire
		if ( (Iso_egf_belegt >= 1) &&
			(Fstr_fg_P1 <= 0))
		{
			if (canFire("Fstr_fg_egf_belegt"))
			{
				--Iso_egf_belegt;
				++Fstr_fg_P1;
				fire("Fstr_fg_egf_belegt");
				return true;
			}
		}
		//check if Fstr_fg_Signal_stellen can fire
		if ( (Fstr_fg_P2 >= 1) &&
			(Fstr_fg_F_Fahrt3_ >= 1) &&
			(Fstr_fg_F_Halt <= 1))
		{
			if (canFire("Fstr_fg_Signal_stellen"))
			{
				--Fstr_fg_P2;
				--Fstr_fg_F_Fahrt3_;
				++Fstr_fg_F_Halt;
				fire("Fstr_fg_Signal_stellen");
				return true;
			}
		}
		//check if Fstr_fg_Signal_stellen can fire
		if ( (Fstr_fg_P2 >= 1) &&
			(Fstr_fg_F_Fahrt3_ >= 1) &&
			(Fstr_fg_F_Halt <= 1))
		{
			if (canFire("Fstr_fg_Signal_stellen"))
			{
				--Fstr_fg_P2;
				--Fstr_fg_F_Fahrt3_;
				++Fstr_fg_F_Halt;
				fire("Fstr_fg_Signal_stellen");
				return true;
			}
		}
		//check if Fstr_fg_verschliessen can fire
		if ( (Fstr_fg_geprueft2 >= 1) &&
			(Fstr_fg_verschlossen <= 0) &&
			(Kontakte_8_FSS_45F >= 1))
		{
			if (canFire("Fstr_fg_verschliessen"))
			{
				--Fstr_fg_geprueft2;
				++Fstr_fg_verschlossen;
				--Kontakte_8_FSS_45F;
				fire("Fstr_fg_verschliessen");
				return true;
			}
		}
		//check if Fstr_fg_pruefen1 can fire
		if ( (Fstr_fg_aufgeloest >= 1) &&
			(Kontakte_8_FSS_30F >= 1) &&
			(W1_Endlage_minus >= 1) &&
			(Fstr_fg_geprueft0 <= 0))
		{
			if (canFire("Fstr_fg_pruefen1"))
			{
				--Fstr_fg_aufgeloest;
				--Kontakte_8_FSS_30F;
				--W1_Endlage_minus;
				++Fstr_fg_geprueft0;
				fire("Fstr_fg_pruefen1");
				return true;
			}
		}
		//check if Fstr_fg_Stoerung can fire
		if ( (Fstr_fg_F_Fahrt3_ >= 1) &&
			(Fstr_fg_Stoerung_F >= 1) &&
			(Fstr_fg_F_Halt <= 1))
		{
			if (canFire("Fstr_fg_Stoerung"))
			{
				--Fstr_fg_F_Fahrt3_;
				--Fstr_fg_Stoerung_F;
				++Fstr_fg_F_Halt;
				fire("Fstr_fg_Stoerung");
				return true;
			}
		}
		//check if Fstr_fg_T1 can fire
		if ( (Fstr_fg_geprueft1 >= 1) &&
			(Fstr_fg_geprueft2 <= 0) &&
			(BL_ZB_OM_Grundstlg_n >= 1))
		{
			if (canFire("Fstr_fg_T1"))
			{
				--Fstr_fg_geprueft1;
				++Fstr_fg_geprueft2;
				--BL_ZB_OM_Grundstlg_n;
				fire("Fstr_fg_T1");
				return true;
			}
		}
		//check if Fstr_fg_notaufloesen can fire
		if ( (Fstr_fg_verschlossen >= 1) &&
			(Fstr_fg_aufgeloest <= 0) &&
			(Kontakte_6_NAL >= 1))
		{
			if (canFire("Fstr_fg_notaufloesen"))
			{
				--Fstr_fg_verschlossen;
				++Fstr_fg_aufgeloest;
				--Kontakte_6_NAL;
				fire("Fstr_fg_notaufloesen");
				return true;
			}
		}
		//check if Fstr_fg_T4_1 can fire
		if ( (Fstr_fg_geprueft0 >= 1) &&
			(Fstr_fg_geprueft1 <= 0) &&
			(Iso_1__frei >= 1) &&
			(Iso_egf_frei >= 1))
		{
			if (canFire("Fstr_fg_T4_1"))
			{
				--Fstr_fg_geprueft0;
				++Fstr_fg_geprueft1;
				--Iso_1__frei;
				--Iso_egf_frei;
				fire("Fstr_fg_T4_1");
				return true;
			}
		}
		//check if Fstr_fg_T5 can fire
		if ( (Fstr_fg_geprueft0 >= 1) &&
			(Fstr_fg_geprueft1 <= 0) &&
			(Kontakte_6_ISU_Sign >= 1))
		{
			if (canFire("Fstr_fg_T5"))
			{
				--Fstr_fg_geprueft0;
				++Fstr_fg_geprueft1;
				--Kontakte_6_ISU_Sign;
				fire("Fstr_fg_T5");
				return true;
			}
		}
		//check if Iso_1_Einfahrt_Fz can fire
		if ( (Iso_1_belegt <= 0) &&
			(Iso_1_Zug_einfahren >= 1) &&
			(Iso_1__frei >= 1))
		{
			if (canFire("Iso_1_Einfahrt_Fz"))
			{
				++Iso_1_belegt;
				--Iso_1_Zug_einfahren;
				--Iso_1__frei;
				fire("Iso_1_Einfahrt_Fz");
				return true;
			}
		}
		//check if Iso_1_Ausfahrt_Fz can fire
		if ( (Iso_1_belegt >= 1) &&
			(Iso_1__frei <= 0) &&
			(Iso_1_Zug_ausfahren >= 1))
		{
			if (canFire("Iso_1_Ausfahrt_Fz"))
			{
				--Iso_1_belegt;
				++Iso_1__frei;
				--Iso_1_Zug_ausfahren;
				fire("Iso_1_Ausfahrt_Fz");
				return true;
			}
		}
		//check if Iso_gf_Einfahrt_Fz can fire
		if ( (Iso_gf_Zug_einfahren >= 1) &&
			(Iso_gf__frei >= 1) &&
			(Iso_gf_belegt <= 0))
		{
			if (canFire("Iso_gf_Einfahrt_Fz"))
			{
				--Iso_gf_Zug_einfahren;
				--Iso_gf__frei;
				++Iso_gf_belegt;
				fire("Iso_gf_Einfahrt_Fz");
				return true;
			}
		}
		//check if Iso_gf_Ausfahrt_Fz can fire
		if ( (Iso_gf__frei <= 0) &&
			(Iso_gf_Zug_ausfahren >= 1) &&
			(Iso_gf_belegt >= 1))
		{
			if (canFire("Iso_gf_Ausfahrt_Fz"))
			{
				++Iso_gf__frei;
				--Iso_gf_Zug_ausfahren;
				--Iso_gf_belegt;
				fire("Iso_gf_Ausfahrt_Fz");
				return true;
			}
		}
		//check if Iso_egf_Einfahrt_Fz can fire
		if ( (Iso_egf_frei >= 1) &&
			(Iso_egf_Zug_einfahren >= 1) &&
			(Iso_egf_belegt <= 0))
		{
			if (canFire("Iso_egf_Einfahrt_Fz"))
			{
				--Iso_egf_frei;
				--Iso_egf_Zug_einfahren;
				++Iso_egf_belegt;
				fire("Iso_egf_Einfahrt_Fz");
				return true;
			}
		}
		//check if Iso_egf_Ausfahrt_Fz can fire
		if ( (Iso_egf_frei <= 0) &&
			(Iso_egf_belegt >= 1) &&
			(Iso_egf_Zug_ausfahren >= 1))
		{
			if (canFire("Iso_egf_Ausfahrt_Fz"))
			{
				++Iso_egf_frei;
				--Iso_egf_belegt;
				--Iso_egf_Zug_ausfahren;
				fire("Iso_egf_Ausfahrt_Fz");
				return true;
			}
		}
		//check if Iso_cd_Einfahrt_Fz can fire
		if ( (Iso_cd_Zug_einfahren >= 1) &&
			(Iso_cd_belegt <= 0) &&
			(Iso_cd__frei >= 1))
		{
			if (canFire("Iso_cd_Einfahrt_Fz"))
			{
				--Iso_cd_Zug_einfahren;
				++Iso_cd_belegt;
				--Iso_cd__frei;
				fire("Iso_cd_Einfahrt_Fz");
				return true;
			}
		}
		//check if Iso_cd_Ausfahrt_Fz can fire
		if ( (Iso_cd_belegt >= 1) &&
			(Iso_cd_Zug_ausfahren >= 1) &&
			(Iso_cd__frei <= 0))
		{
			if (canFire("Iso_cd_Ausfahrt_Fz"))
			{
				--Iso_cd_belegt;
				--Iso_cd_Zug_ausfahren;
				++Iso_cd__frei;
				fire("Iso_cd_Ausfahrt_Fz");
				return true;
			}
		}
		//check if Lampen_T3 can fire
		if ( (Fstr_fe_F_Halt >= 1) &&
			(Lampen_1_F_rot <= 0))
		{
			if (canFire("Lampen_T3"))
			{
				--Fstr_fe_F_Halt;
				++Lampen_1_F_rot;
				fire("Lampen_T3");
				return true;
			}
		}
		//check if Lampen_T4 can fire
		if ( (Fstr_fg_F_Halt >= 1) &&
			(Lampen_1_F_rot <= 0))
		{
			if (canFire("Lampen_T4"))
			{
				--Fstr_fg_F_Halt;
				++Lampen_1_F_rot;
				fire("Lampen_T4");
				return true;
			}
		}
		//check if Lampen_T5 can fire
		if ( (Fstr_fg_F_Fahrt3_ >= 1) &&
			(Lampen_1_F_gruenFB3 <= 0))
		{
			if (canFire("Lampen_T5"))
			{
				--Fstr_fg_F_Fahrt3_;
				++Lampen_1_F_gruenFB3;
				fire("Lampen_T5");
				return true;
			}
		}
		//check if Lampen_T6 can fire
		if ( (Fstr_fe_F_Fahrt1 >= 1) &&
			(Lampen_1_F_gruenFB1 <= 0))
		{
			if (canFire("Lampen_T6"))
			{
				--Fstr_fe_F_Fahrt1;
				++Lampen_1_F_gruenFB1;
				fire("Lampen_T6");
				return true;
			}
		}
		//check if Lampen_T7 can fire
		if ( (Lampen_1_F_gruenFB1 <= 0) &&
			(Fstr_fg_F_Fahrt3_ >= 1))
		{
			if (canFire("Lampen_T7"))
			{
				++Lampen_1_F_gruenFB1;
				--Fstr_fg_F_Fahrt3_;
				fire("Lampen_T7");
				return true;
			}
		}
		//check if Lampen_T10 can fire
		if ( (ext_Vb_E_Lampe_rot_def >= 1) &&
			(Lampen_1_E_notrot <= 0))
		{
			if (canFire("Lampen_T10"))
			{
				--ext_Vb_E_Lampe_rot_def;
				++Lampen_1_E_notrot;
				fire("Lampen_T10");
				return true;
			}
		}
		//check if Lampen_T14 can fire
		if ( (ext_Vb_F_VS_Lampe_Warn_def >= 1) &&
			(Lampen_1_F_VS_Stoer <= 0))
		{
			if (canFire("Lampen_T14"))
			{
				--ext_Vb_F_VS_Lampe_Warn_def;
				++Lampen_1_F_VS_Stoer;
				fire("Lampen_T14");
				return true;
			}
		}
		//check if Lampen_T15 can fire
		if ( (ext_Vb_F_VS_Lampe_Fahrt_def >= 1) &&
			(Lampen_1_F_VS_Stoer <= 0))
		{
			if (canFire("Lampen_T15"))
			{
				--ext_Vb_F_VS_Lampe_Fahrt_def;
				++Lampen_1_F_VS_Stoer;
				fire("Lampen_T15");
				return true;
			}
		}
		//check if Lampen_T16 can fire
		if ( (Lampen_1_F_notrot <= 0) &&
			(ext_Vb_F_Lampe_rot_def >= 1))
		{
			if (canFire("Lampen_T16"))
			{
				++Lampen_1_F_notrot;
				--ext_Vb_F_Lampe_rot_def;
				fire("Lampen_T16");
				return true;
			}
		}
		//check if Lampen_T17 can fire
		if ( (Lampen_1_G_VS_Stoer <= 0) &&
			(ext_Vb_G_VS_Lampe_Warn_def >= 1))
		{
			if (canFire("Lampen_T17"))
			{
				++Lampen_1_G_VS_Stoer;
				--ext_Vb_G_VS_Lampe_Warn_def;
				fire("Lampen_T17");
				return true;
			}
		}
		//check if Lampen_T18 can fire
		if ( (ext_Vb_G_VS_Lampe_Fahrt_def >= 1) &&
			(Lampen_1_G_VS_Stoer <= 0))
		{
			if (canFire("Lampen_T18"))
			{
				--ext_Vb_G_VS_Lampe_Fahrt_def;
				++Lampen_1_G_VS_Stoer;
				fire("Lampen_T18");
				return true;
			}
		}
		//check if Lampen_T22 can fire
		if ( (BL_OM_LN_vorgebl_v >= 1) &&
			(Lampen_P4 <= 0))
		{
			if (canFire("Lampen_T22"))
			{
				--BL_OM_LN_vorgebl_v;
				++Lampen_P4;
				fire("Lampen_T22");
				return true;
			}
		}
		//check if Lampen_T23 can fire
		if ( (BL_OM_LN_belegt_v >= 1) &&
			(Lampen_P4 <= 0))
		{
			if (canFire("Lampen_T23"))
			{
				--BL_OM_LN_belegt_v;
				++Lampen_P4;
				fire("Lampen_T23");
				return true;
			}
		}
		//check if Lampen_T24 can fire
		if ( (Lampen_1_BL_vLN_weiss <= 0) &&
			(BL_OM_LN_Grundstlg_v >= 1))
		{
			if (canFire("Lampen_T24"))
			{
				++Lampen_1_BL_vLN_weiss;
				--BL_OM_LN_Grundstlg_v;
				fire("Lampen_T24");
				return true;
			}
		}
		//check if Lampen_T25 can fire
		if ( (BL_OM_LN_vorgebl_v >= 1) &&
			(Lampen_1_BL_vLN_weiss <= 0))
		{
			if (canFire("Lampen_T25"))
			{
				--BL_OM_LN_vorgebl_v;
				++Lampen_1_BL_vLN_weiss;
				fire("Lampen_T25");
				return true;
			}
		}
		//check if Lampen_T26 can fire
		if ( (Lampen_1_BL_nLN_weiss <= 0) &&
			(BL_OM_LN_Grundstlg_n >= 1))
		{
			if (canFire("Lampen_T26"))
			{
				++Lampen_1_BL_nLN_weiss;
				--BL_OM_LN_Grundstlg_n;
				fire("Lampen_T26");
				return true;
			}
		}
		//check if Lampen_T27 can fire
		if ( (Lampen_1_BL_nLN_weiss <= 0) &&
			(BL_OM_LN_vorgebl_n >= 1))
		{
			if (canFire("Lampen_T27"))
			{
				++Lampen_1_BL_nLN_weiss;
				--BL_OM_LN_vorgebl_n;
				fire("Lampen_T27");
				return true;
			}
		}
		//check if Lampen_T28 can fire
		if ( (BL_OM_LN_vorgebl_n >= 1) &&
			(Lampen_1_BL_nLN_rot <= 0))
		{
			if (canFire("Lampen_T28"))
			{
				--BL_OM_LN_vorgebl_n;
				++Lampen_1_BL_nLN_rot;
				fire("Lampen_T28");
				return true;
			}
		}
		//check if Lampen_T29 can fire
		if ( (BL_OM_LN_belegt_n >= 1) &&
			(Lampen_1_BL_nLN_rot <= 0))
		{
			if (canFire("Lampen_T29"))
			{
				--BL_OM_LN_belegt_n;
				++Lampen_1_BL_nLN_rot;
				fire("Lampen_T29");
				return true;
			}
		}
		//check if Lampen_T33 can fire
		if ( (Lampen_P6 <= 0) &&
			(Fstr_ef_verschlossen >= 1))
		{
			if (canFire("Lampen_T33"))
			{
				++Lampen_P6;
				--Fstr_ef_verschlossen;
				fire("Lampen_T33");
				return true;
			}
		}
		//check if Lampen_T34 can fire
		if ( (Fstr_fe_verschlossen >= 1) &&
			(Lampen_P6 <= 0))
		{
			if (canFire("Lampen_T34"))
			{
				--Fstr_fe_verschlossen;
				++Lampen_P6;
				fire("Lampen_T34");
				return true;
			}
		}
		//check if Lampen_T35 can fire
		if ( (Fstr_gf_verschlossen >= 1) &&
			(Lampen_P8 <= 0))
		{
			if (canFire("Lampen_T35"))
			{
				--Fstr_gf_verschlossen;
				++Lampen_P8;
				fire("Lampen_T35");
				return true;
			}
		}
		//check if Lampen_T36 can fire
		if ( (Fstr_fg_verschlossen >= 1) &&
			(Lampen_P8 <= 0))
		{
			if (canFire("Lampen_T36"))
			{
				--Fstr_fg_verschlossen;
				++Lampen_P8;
				fire("Lampen_T36");
				return true;
			}
		}
		//check if Lampen_T37 can fire
		if ( (ILTIS__anfordern_v_LN >= 1) &&
			(Lampen_1_FBV_vLN <= 0))
		{
			if (canFire("Lampen_T37"))
			{
				--ILTIS__anfordern_v_LN;
				++Lampen_1_FBV_vLN;
				fire("Lampen_T37");
				return true;
			}
		}
		//check if Lampen_T38 can fire
		if ( (BL_OM_LN_RMM_nLN >= 1) &&
			(Lampen_1_RM_moegl_nLN <= 0))
		{
			if (canFire("Lampen_T38"))
			{
				--BL_OM_LN_RMM_nLN;
				++Lampen_1_RM_moegl_nLN;
				fire("Lampen_T38");
				return true;
			}
		}
		//check if Lampen_T43 can fire
		if ( (BL_ZB_OM_belegt_n >= 1) &&
			(Lampen_1_BL_nZB_rot <= 0))
		{
			if (canFire("Lampen_T43"))
			{
				--BL_ZB_OM_belegt_n;
				++Lampen_1_BL_nZB_rot;
				fire("Lampen_T43");
				return true;
			}
		}
		//check if Lampen_T44 can fire
		if ( (BL_ZB_OM_vorgebl_n >= 1) &&
			(Lampen_1_BL_nZB_rot <= 0))
		{
			if (canFire("Lampen_T44"))
			{
				--BL_ZB_OM_vorgebl_n;
				++Lampen_1_BL_nZB_rot;
				fire("Lampen_T44");
				return true;
			}
		}
		//check if Lampen_T45 can fire
		if ( (BL_ZB_OM_Grundstlg_n >= 1) &&
			(Lampen_1_BL_nZB_weiss <= 0))
		{
			if (canFire("Lampen_T45"))
			{
				--BL_ZB_OM_Grundstlg_n;
				++Lampen_1_BL_nZB_weiss;
				fire("Lampen_T45");
				return true;
			}
		}
		//check if Lampen_T46 can fire
		if ( (Lampen_1_BL_nZB_weiss <= 0) &&
			(BL_ZB_OM_vorgebl_n >= 1))
		{
			if (canFire("Lampen_T46"))
			{
				++Lampen_1_BL_nZB_weiss;
				--BL_ZB_OM_vorgebl_n;
				fire("Lampen_T46");
				return true;
			}
		}
		//check if Lampen_T47 can fire
		if ( (BL_ZB_OM_Grundstlg_v >= 1) &&
			(Lampen_1_Block_vZB_weiss <= 0))
		{
			if (canFire("Lampen_T47"))
			{
				--BL_ZB_OM_Grundstlg_v;
				++Lampen_1_Block_vZB_weiss;
				fire("Lampen_T47");
				return true;
			}
		}
		//check if Lampen_T48 can fire
		if ( (BL_ZB_OM_vorgebl_v >= 1) &&
			(Lampen_1_Block_vZB_weiss <= 0))
		{
			if (canFire("Lampen_T48"))
			{
				--BL_ZB_OM_vorgebl_v;
				++Lampen_1_Block_vZB_weiss;
				fire("Lampen_T48");
				return true;
			}
		}
		//check if Lampen_T49 can fire
		if ( (BL_ZB_OM_vorgebl_v >= 1) &&
			(Lampen_1_BL_vZB_rot <= 0))
		{
			if (canFire("Lampen_T49"))
			{
				--BL_ZB_OM_vorgebl_v;
				++Lampen_1_BL_vZB_rot;
				fire("Lampen_T49");
				return true;
			}
		}
		//check if Lampen_T50 can fire
		if ( (BL_ZB_OM_belegt_v >= 1) &&
			(Lampen_1_BL_vZB_rot <= 0))
		{
			if (canFire("Lampen_T50"))
			{
				--BL_ZB_OM_belegt_v;
				++Lampen_1_BL_vZB_rot;
				fire("Lampen_T50");
				return true;
			}
		}
		//check if Lampen_T51 can fire
		if ( (Lampen_1_Stoer_Wecker <= 0) &&
			(Lampen_P41 >= 1))
		{
			if (canFire("Lampen_T51"))
			{
				++Lampen_1_Stoer_Wecker;
				--Lampen_P41;
				fire("Lampen_T51");
				return true;
			}
		}
		//check if Lampen_T52 can fire
		if ( (Lampen_1_WS1_Freig <= 0) &&
			(Stw_WS_Sperrm_ein >= 1))
		{
			if (canFire("Lampen_T52"))
			{
				++Lampen_1_WS1_Freig;
				--Stw_WS_Sperrm_ein;
				fire("Lampen_T52");
				return true;
			}
		}
		//check if Lampen_T53 can fire
		if ( (W1_Endlage_plus >= 1) &&
			(Lampen_P12 <= 0))
		{
			if (canFire("Lampen_T53"))
			{
				--W1_Endlage_plus;
				++Lampen_P12;
				fire("Lampen_T53");
				return true;
			}
		}
		//check if Lampen_T55 can fire
		if ( (Stw_FSS_Sperrm_ein >= 1) &&
			(Lampen_1_FSS_Sperre <= 0))
		{
			if (canFire("Lampen_T55"))
			{
				--Stw_FSS_Sperrm_ein;
				++Lampen_1_FSS_Sperre;
				fire("Lampen_T55");
				return true;
			}
		}
		//check if Lampen_T56 can fire
		if ( (Stw_FSS_Kuppelm_ein >= 1) &&
			(Lampen_1_FSS_Kuppel <= 0))
		{
			if (canFire("Lampen_T56"))
			{
				--Stw_FSS_Kuppelm_ein;
				++Lampen_1_FSS_Kuppel;
				fire("Lampen_T56");
				return true;
			}
		}
		//check if Lampen_T57 can fire
		if ( (Lampen_2_Weiche <= 0) &&
			(W1_Endlage_minus < 1))
		{
			if (canFire("Lampen_T57"))
			{
				++Lampen_2_Weiche;
				fire("Lampen_T57");
				return true;
			}
		}
		//check if Lampen_T58 can fire
		if ( (Lampen_2_Weiche <= 0) &&
			(W1_Endlage_plus < 1))
		{
			if (canFire("Lampen_T58"))
			{
				++Lampen_2_Weiche;
				fire("Lampen_T58");
				return true;
			}
		}
		//check if Lampen_T59 can fire
		if ( (Lampen_2_Block <= 0) &&
			(Lampen_P48 >= 1))
		{
			if (canFire("Lampen_T59"))
			{
				++Lampen_2_Block;
				--Lampen_P48;
				fire("Lampen_T59");
				return true;
			}
		}
		//check if Lampen_T60 can fire
		if ( (Lampen_2_Signal <= 0) &&
			(Lampen_P49 >= 1))
		{
			if (canFire("Lampen_T60"))
			{
				++Lampen_2_Signal;
				--Lampen_P49;
				fire("Lampen_T60");
				return true;
			}
		}
		//check if Lampen_T61 can fire
		if ( (Lampen_9_Abl_vEMM <= 0) &&
			(ext_Vb_abl_vEMM >= 1))
		{
			if (canFire("Lampen_T61"))
			{
				++Lampen_9_Abl_vEMM;
				--ext_Vb_abl_vEMM;
				fire("Lampen_T61");
				return true;
			}
		}
		//check if Lampen_T62 can fire
		if ( (ext_Vb_abl_vLN >= 1) &&
			(Lampen_9_Abl_vLN <= 0))
		{
			if (canFire("Lampen_T62"))
			{
				--ext_Vb_abl_vLN;
				++Lampen_9_Abl_vLN;
				fire("Lampen_T62");
				return true;
			}
		}
		//check if Lampen_T63 can fire
		if ( (ext_Vb_abl_vZB >= 1) &&
			(Lampen_9_Abl_vZB <= 0))
		{
			if (canFire("Lampen_T63"))
			{
				--ext_Vb_abl_vZB;
				++Lampen_9_Abl_vZB;
				fire("Lampen_T63");
				return true;
			}
		}
		//check if Lampen_T64 can fire
		if ( (Lampen_9_Abl_nEMM <= 0) &&
			(ext_Vb_abl_nEMM >= 1))
		{
			if (canFire("Lampen_T64"))
			{
				++Lampen_9_Abl_nEMM;
				--ext_Vb_abl_nEMM;
				fire("Lampen_T64");
				return true;
			}
		}
		//check if Lampen_T65 can fire
		if ( (Lampen_9_Abl_nLN <= 0) &&
			(ext_Vb_abl_nLN >= 1))
		{
			if (canFire("Lampen_T65"))
			{
				++Lampen_9_Abl_nLN;
				--ext_Vb_abl_nLN;
				fire("Lampen_T65");
				return true;
			}
		}
		//check if Lampen_T66 can fire
		if ( (Lampen_9_Abl_nZB <= 0) &&
			(ext_Vb_abl_nZB >= 1))
		{
			if (canFire("Lampen_T66"))
			{
				++Lampen_9_Abl_nZB;
				--ext_Vb_abl_nZB;
				fire("Lampen_T66");
				return true;
			}
		}
		//check if Lampen_T1 can fire
		if ( (W1_Endlage_minus >= 1) &&
			(Lampen_P12 <= 0))
		{
			if (canFire("Lampen_T1"))
			{
				--W1_Endlage_minus;
				++Lampen_P12;
				fire("Lampen_T1");
				return true;
			}
		}
		//check if Lampen_T1 can fire
		if ( (W1_Endlage_minus >= 1) &&
			(Lampen_P12 <= 0))
		{
			if (canFire("Lampen_T1"))
			{
				--W1_Endlage_minus;
				++Lampen_P12;
				fire("Lampen_T1");
				return true;
			}
		}
		//check if Lampen_T2 can fire
		if ( (Lampen_1_FBV_vZB >= 1) &&
			(ILTIS__anfordern_v_ZB <= 0) &&
			(BL_ZB_OM_Grundstlg_v < 1))
		{
			if (canFire("Lampen_T2"))
			{
				--Lampen_1_FBV_vZB;
				++ILTIS__anfordern_v_ZB;
				fire("Lampen_T2");
				return true;
			}
		}
		//check if Lampen_T3 can fire
		if ( (Fstr_fe_F_Halt >= 1) &&
			(Lampen_1_F_rot <= 0))
		{
			if (canFire("Lampen_T3"))
			{
				--Fstr_fe_F_Halt;
				++Lampen_1_F_rot;
				fire("Lampen_T3");
				return true;
			}
		}
		//check if Lampen_T4 can fire
		if ( (Fstr_fg_F_Halt >= 1) &&
			(Lampen_1_F_rot <= 0))
		{
			if (canFire("Lampen_T4"))
			{
				--Fstr_fg_F_Halt;
				++Lampen_1_F_rot;
				fire("Lampen_T4");
				return true;
			}
		}
		//check if Lampen_T5 can fire
		if ( (Fstr_fg_F_Fahrt3_ >= 1) &&
			(Lampen_1_F_gruenFB3 <= 0))
		{
			if (canFire("Lampen_T5"))
			{
				--Fstr_fg_F_Fahrt3_;
				++Lampen_1_F_gruenFB3;
				fire("Lampen_T5");
				return true;
			}
		}
		//check if Lampen_T6 can fire
		if ( (Fstr_fe_F_Fahrt1 >= 1) &&
			(Lampen_1_F_gruenFB1 <= 0))
		{
			if (canFire("Lampen_T6"))
			{
				--Fstr_fe_F_Fahrt1;
				++Lampen_1_F_gruenFB1;
				fire("Lampen_T6");
				return true;
			}
		}
		//check if Lampen_T7 can fire
		if ( (Lampen_1_F_gruenFB1 <= 0) &&
			(Fstr_fg_F_Fahrt3_ >= 1))
		{
			if (canFire("Lampen_T7"))
			{
				++Lampen_1_F_gruenFB1;
				--Fstr_fg_F_Fahrt3_;
				fire("Lampen_T7");
				return true;
			}
		}
		//check if Lampen_T8 can fire
		if ( (Lampen_1_Fstr_gf <= 0) &&
			(Lampen_P8 >= 1))
		{
			if (canFire("Lampen_T8"))
			{
				++Lampen_1_Fstr_gf;
				--Lampen_P8;
				fire("Lampen_T8");
				return true;
			}
		}
		//check if Lampen_T9 can fire
		if ( (Lampen_1_Fstr_gf >= 1) &&
			(Fstr_gf_aufgeloest >= 1) &&
			(Lampen_P8 <= 0))
		{
			if (canFire("Lampen_T9"))
			{
				--Lampen_1_Fstr_gf;
				--Fstr_gf_aufgeloest;
				++Lampen_P8;
				fire("Lampen_T9");
				return true;
			}
		}
		//check if Lampen_T10 can fire
		if ( (ext_Vb_E_Lampe_rot_def >= 1) &&
			(Lampen_1_E_notrot <= 0))
		{
			if (canFire("Lampen_T10"))
			{
				--ext_Vb_E_Lampe_rot_def;
				++Lampen_1_E_notrot;
				fire("Lampen_T10");
				return true;
			}
		}
		//check if Lampen_T11 can fire
		if ( (Lampen_1_Fstr_ef >= 1) &&
			(Fstr_fe_aufgeloest >= 1) &&
			(Lampen_P6 <= 0))
		{
			if (canFire("Lampen_T11"))
			{
				--Lampen_1_Fstr_ef;
				--Fstr_fe_aufgeloest;
				++Lampen_P6;
				fire("Lampen_T11");
				return true;
			}
		}
		//check if Lampen_T12 can fire
		if ( (Lampen_1_WS1_Ueberw <= 0) &&
			(Lampen_P12 >= 1))
		{
			if (canFire("Lampen_T12"))
			{
				++Lampen_1_WS1_Ueberw;
				--Lampen_P12;
				fire("Lampen_T12");
				return true;
			}
		}
		//check if Lampen_T13 can fire
		if ( (Lampen_1_WS1_Ueberw >= 1) &&
			(Lampen_P12 <= 0) &&
			(W1_Endlage_minus < 1))
		{
			if (canFire("Lampen_T13"))
			{
				--Lampen_1_WS1_Ueberw;
				++Lampen_P12;
				fire("Lampen_T13");
				return true;
			}
		}
		//check if Lampen_T15 can fire
		if ( (ext_Vb_F_VS_Lampe_Fahrt_def >= 1) &&
			(Lampen_1_F_VS_Stoer <= 0))
		{
			if (canFire("Lampen_T15"))
			{
				--ext_Vb_F_VS_Lampe_Fahrt_def;
				++Lampen_1_F_VS_Stoer;
				fire("Lampen_T15");
				return true;
			}
		}
		//check if EMM_T1 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(ILTIS__EMM_1_833 >= 1) &&
			(EMM_geprueft1 <= 0))
		{
			if (canFire("EMM_T1"))
			{
				--EMM_EMM_Grundstlg;
				--ILTIS__EMM_1_833;
				++EMM_geprueft1;
				fire("EMM_T1");
				return true;
			}
		}
		//check if EMM_T2 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(ILTIS__EMM_2_833 >= 1) &&
			(EMM_geprueft1 <= 0))
		{
			if (canFire("EMM_T2"))
			{
				--EMM_EMM_Grundstlg;
				--ILTIS__EMM_2_833;
				++EMM_geprueft1;
				fire("EMM_T2");
				return true;
			}
		}
		//check if EMM_T3 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(ILTIS__EMM_3_833 >= 1) &&
			(EMM_geprueft1 <= 0))
		{
			if (canFire("EMM_T3"))
			{
				--EMM_EMM_Grundstlg;
				--ILTIS__EMM_3_833;
				++EMM_geprueft1;
				fire("EMM_T3");
				return true;
			}
		}
		//check if EMM_T4 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(EMM_geprueft1 <= 0) &&
			(ILTIS__EMM_4_833 >= 1))
		{
			if (canFire("EMM_T4"))
			{
				--EMM_EMM_Grundstlg;
				++EMM_geprueft1;
				--ILTIS__EMM_4_833;
				fire("EMM_T4");
				return true;
			}
		}
		//check if EMM_T5 can fire
		if ( (EMM_geprueft1 <= 0) &&
			(ILTIS__EMM_5_833 >= 1) &&
			(EMM_EMM_Grundstlg >= 1))
		{
			if (canFire("EMM_T5"))
			{
				++EMM_geprueft1;
				--ILTIS__EMM_5_833;
				--EMM_EMM_Grundstlg;
				fire("EMM_T5");
				return true;
			}
		}
		//check if EMM_T6 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(ILTIS__EMM_833_1 >= 1) &&
			(EMM_geprueft1 <= 0))
		{
			if (canFire("EMM_T6"))
			{
				--EMM_EMM_Grundstlg;
				--ILTIS__EMM_833_1;
				++EMM_geprueft1;
				fire("EMM_T6");
				return true;
			}
		}
		//check if EMM_T7 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(EMM_geprueft1 <= 0) &&
			(ILTIS__EMM_833_2 >= 1))
		{
			if (canFire("EMM_T7"))
			{
				--EMM_EMM_Grundstlg;
				++EMM_geprueft1;
				--ILTIS__EMM_833_2;
				fire("EMM_T7");
				return true;
			}
		}
		//check if EMM_T8 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(EMM_geprueft1 <= 0) &&
			(ILTIS__EMM_833_3 >= 1))
		{
			if (canFire("EMM_T8"))
			{
				--EMM_EMM_Grundstlg;
				++EMM_geprueft1;
				--ILTIS__EMM_833_3;
				fire("EMM_T8");
				return true;
			}
		}
		//check if EMM_T9 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(EMM_geprueft1 <= 0) &&
			(ILTIS__EMM_833_4 >= 1))
		{
			if (canFire("EMM_T9"))
			{
				--EMM_EMM_Grundstlg;
				++EMM_geprueft1;
				--ILTIS__EMM_833_4;
				fire("EMM_T9");
				return true;
			}
		}
		//check if EMM_T10 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(ILTIS__EMM_833_5 >= 1) &&
			(EMM_geprueft1 <= 0))
		{
			if (canFire("EMM_T10"))
			{
				--EMM_EMM_Grundstlg;
				--ILTIS__EMM_833_5;
				++EMM_geprueft1;
				fire("EMM_T10");
				return true;
			}
		}
		//check if EMM_W7_minus can fire
		if ( (EMM_EMM_W7_minus <= 0) &&
			(EMM_geprueft2 >= 1))
		{
			if (canFire("EMM_W7_minus"))
			{
				++EMM_EMM_W7_minus;
				--EMM_geprueft2;
				fire("EMM_W7_minus");
				return true;
			}
		}
		//check if EMM_W10_plus can fire
		if ( (EMM_EMM_W7_minus >= 1) &&
			(EMM_EMM_W10_plus <= 0))
		{
			if (canFire("EMM_W10_plus"))
			{
				--EMM_EMM_W7_minus;
				++EMM_EMM_W10_plus;
				fire("EMM_W10_plus");
				return true;
			}
		}
		//check if EMM_pruefen2 can fire
		if ( (EMM_geprueft1 >= 1) &&
			(EMM_geprueft2 <= 0) &&
			(EMM_OM_E_Fahrt >= 1))
		{
			if (canFire("EMM_pruefen2"))
			{
				--EMM_geprueft1;
				++EMM_geprueft2;
				--EMM_OM_E_Fahrt;
				fire("EMM_pruefen2");
				return true;
			}
		}
		//check if EMM_W7_plus can fire
		if ( (EMM_geprueft2 >= 1) &&
			(EMM_EMM_W7_plus <= 0))
		{
			if (canFire("EMM_W7_plus"))
			{
				--EMM_geprueft2;
				++EMM_EMM_W7_plus;
				fire("EMM_W7_plus");
				return true;
			}
		}
		//check if EMM_W10_plus can fire
		if ( (EMM_EMM_W7_minus >= 1) &&
			(EMM_EMM_W10_plus <= 0))
		{
			if (canFire("EMM_W10_plus"))
			{
				--EMM_EMM_W7_minus;
				++EMM_EMM_W10_plus;
				fire("EMM_W10_plus");
				return true;
			}
		}
		//check if EMM_pruefen2 can fire
		if ( (EMM_geprueft1 >= 1) &&
			(EMM_geprueft2 <= 0) &&
			(EMM_OM_E_Fahrt >= 1))
		{
			if (canFire("EMM_pruefen2"))
			{
				--EMM_geprueft1;
				++EMM_geprueft2;
				--EMM_OM_E_Fahrt;
				fire("EMM_pruefen2");
				return true;
			}
		}
		//check if EMM_W9_plus can fire
		if ( (EMM_geprueft2 >= 1) &&
			(EMM_EMM_W9_plus <= 0))
		{
			if (canFire("EMM_W9_plus"))
			{
				--EMM_geprueft2;
				++EMM_EMM_W9_plus;
				fire("EMM_W9_plus");
				return true;
			}
		}
		//check if EMM_W10_minus can fire
		if ( (EMM_EMM_W9_plus >= 1) &&
			(EMM_EMM_W10_minus <= 0))
		{
			if (canFire("EMM_W10_minus"))
			{
				--EMM_EMM_W9_plus;
				++EMM_EMM_W10_minus;
				fire("EMM_W10_minus");
				return true;
			}
		}
		//check if EMM_pruefen2 can fire
		if ( (EMM_geprueft1 >= 1) &&
			(EMM_geprueft2 <= 0) &&
			(EMM_OM_E_Fahrt >= 1))
		{
			if (canFire("EMM_pruefen2"))
			{
				--EMM_geprueft1;
				++EMM_geprueft2;
				--EMM_OM_E_Fahrt;
				fire("EMM_pruefen2");
				return true;
			}
		}
		//check if EMM_W8_plus can fire
		if ( (EMM_geprueft2 >= 1) &&
			(EMM_EMM_W8_plus <= 0))
		{
			if (canFire("EMM_W8_plus"))
			{
				--EMM_geprueft2;
				++EMM_EMM_W8_plus;
				fire("EMM_W8_plus");
				return true;
			}
		}
		//check if EMM_W9_minus can fire
		if ( (EMM_EMM_W8_plus >= 1) &&
			(EMM_EMM_W9_minus <= 0))
		{
			if (canFire("EMM_W9_minus"))
			{
				--EMM_EMM_W8_plus;
				++EMM_EMM_W9_minus;
				fire("EMM_W9_minus");
				return true;
			}
		}
		//check if EMM_pruefen2 can fire
		if ( (EMM_geprueft1 >= 1) &&
			(EMM_geprueft2 <= 0) &&
			(EMM_OM_E_Fahrt >= 1))
		{
			if (canFire("EMM_pruefen2"))
			{
				--EMM_geprueft1;
				++EMM_geprueft2;
				--EMM_OM_E_Fahrt;
				fire("EMM_pruefen2");
				return true;
			}
		}
		//check if EMM_W8_minus can fire
		if ( (EMM_geprueft2 >= 1) &&
			(EMM_EMM_W8_minus <= 0))
		{
			if (canFire("EMM_W8_minus"))
			{
				--EMM_geprueft2;
				++EMM_EMM_W8_minus;
				fire("EMM_W8_minus");
				return true;
			}
		}
		//check if EMM_W9_minus can fire
		if ( (EMM_EMM_W8_plus >= 1) &&
			(EMM_EMM_W9_minus <= 0))
		{
			if (canFire("EMM_W9_minus"))
			{
				--EMM_EMM_W8_plus;
				++EMM_EMM_W9_minus;
				fire("EMM_W9_minus");
				return true;
			}
		}
		//check if EMM_pruefen2 can fire
		if ( (EMM_geprueft1 >= 1) &&
			(EMM_geprueft2 <= 0) &&
			(EMM_OM_E_Fahrt >= 1))
		{
			if (canFire("EMM_pruefen2"))
			{
				--EMM_geprueft1;
				++EMM_geprueft2;
				--EMM_OM_E_Fahrt;
				fire("EMM_pruefen2");
				return true;
			}
		}
		//check if EMM_W7_minus can fire
		if ( (EMM_EMM_W7_minus <= 0) &&
			(EMM_geprueft2 >= 1))
		{
			if (canFire("EMM_W7_minus"))
			{
				++EMM_EMM_W7_minus;
				--EMM_geprueft2;
				fire("EMM_W7_minus");
				return true;
			}
		}
		//check if EMM_W10_plus can fire
		if ( (EMM_EMM_W7_minus >= 1) &&
			(EMM_EMM_W10_plus <= 0))
		{
			if (canFire("EMM_W10_plus"))
			{
				--EMM_EMM_W7_minus;
				++EMM_EMM_W10_plus;
				fire("EMM_W10_plus");
				return true;
			}
		}
		//check if EMM_W7_plus can fire
		if ( (EMM_geprueft2 >= 1) &&
			(EMM_EMM_W7_plus <= 0))
		{
			if (canFire("EMM_W7_plus"))
			{
				--EMM_geprueft2;
				++EMM_EMM_W7_plus;
				fire("EMM_W7_plus");
				return true;
			}
		}
		//check if EMM_W10_plus can fire
		if ( (EMM_EMM_W7_minus >= 1) &&
			(EMM_EMM_W10_plus <= 0))
		{
			if (canFire("EMM_W10_plus"))
			{
				--EMM_EMM_W7_minus;
				++EMM_EMM_W10_plus;
				fire("EMM_W10_plus");
				return true;
			}
		}
		//check if EMM_W9_plus can fire
		if ( (EMM_geprueft2 >= 1) &&
			(EMM_EMM_W9_plus <= 0))
		{
			if (canFire("EMM_W9_plus"))
			{
				--EMM_geprueft2;
				++EMM_EMM_W9_plus;
				fire("EMM_W9_plus");
				return true;
			}
		}
		//check if EMM_W10_minus can fire
		if ( (EMM_EMM_W9_plus >= 1) &&
			(EMM_EMM_W10_minus <= 0))
		{
			if (canFire("EMM_W10_minus"))
			{
				--EMM_EMM_W9_plus;
				++EMM_EMM_W10_minus;
				fire("EMM_W10_minus");
				return true;
			}
		}
		//check if EMM_W8_plus can fire
		if ( (EMM_geprueft2 >= 1) &&
			(EMM_EMM_W8_plus <= 0))
		{
			if (canFire("EMM_W8_plus"))
			{
				--EMM_geprueft2;
				++EMM_EMM_W8_plus;
				fire("EMM_W8_plus");
				return true;
			}
		}
		//check if EMM_w9_minus can fire
		if ( (EMM_EMM_W8_plus >= 1) &&
			(EMM_EMM_W9_minus <= 0))
		{
			if (canFire("EMM_w9_minus"))
			{
				--EMM_EMM_W8_plus;
				++EMM_EMM_W9_minus;
				fire("EMM_w9_minus");
				return true;
			}
		}
		//check if EMM_W8_minus can fire
		if ( (EMM_geprueft2 >= 1) &&
			(EMM_EMM_W8_minus <= 0))
		{
			if (canFire("EMM_W8_minus"))
			{
				--EMM_geprueft2;
				++EMM_EMM_W8_minus;
				fire("EMM_W8_minus");
				return true;
			}
		}
		//check if EMM_W9_minus can fire
		if ( (EMM_EMM_W8_plus >= 1) &&
			(EMM_EMM_W9_minus <= 0))
		{
			if (canFire("EMM_W9_minus"))
			{
				--EMM_EMM_W8_plus;
				++EMM_EMM_W9_minus;
				fire("EMM_W9_minus");
				return true;
			}
		}
		//check if EMM_Fstr_aufloesen can fire
		if ( (EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_plus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_Grundstlg <= 0) &&
			(Iso_cd_belegt >= 1) &&
			(EMM_EMM_W10_plus >= 1) &&
			(EMM_EMM_W10_plus >= 1) &&
			(EMM_EMM_W10_plus >= 1))
		{
			if (canFire("EMM_Fstr_aufloesen"))
			{
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_plus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_minus;
				++EMM_EMM_Grundstlg;
				--Iso_cd_belegt;
				--EMM_EMM_W10_plus;
				--EMM_EMM_W10_plus;
				--EMM_EMM_W10_plus;
				fire("EMM_Fstr_aufloesen");
				return true;
			}
		}
		//check if EMM_W10_minus can fire
		if ( (EMM_EMM_W9_plus >= 1) &&
			(EMM_EMM_W10_minus <= 0))
		{
			if (canFire("EMM_W10_minus"))
			{
				--EMM_EMM_W9_plus;
				++EMM_EMM_W10_minus;
				fire("EMM_W10_minus");
				return true;
			}
		}
		//check if EMM_W10_minus can fire
		if ( (EMM_EMM_W9_plus >= 1) &&
			(EMM_EMM_W10_minus <= 0))
		{
			if (canFire("EMM_W10_minus"))
			{
				--EMM_EMM_W9_plus;
				++EMM_EMM_W10_minus;
				fire("EMM_W10_minus");
				return true;
			}
		}
		//check if EMM_W10_minus can fire
		if ( (EMM_EMM_W9_plus >= 1) &&
			(EMM_EMM_W10_minus <= 0))
		{
			if (canFire("EMM_W10_minus"))
			{
				--EMM_EMM_W9_plus;
				++EMM_EMM_W10_minus;
				fire("EMM_W10_minus");
				return true;
			}
		}
		//check if EMM_W10_minus can fire
		if ( (EMM_EMM_W9_plus >= 1) &&
			(EMM_EMM_W10_minus <= 0))
		{
			if (canFire("EMM_W10_minus"))
			{
				--EMM_EMM_W9_plus;
				++EMM_EMM_W10_minus;
				fire("EMM_W10_minus");
				return true;
			}
		}
		//check if EMM_T25 can fire
		if ( (EMM_C_Halt <= 0) &&
			(EMM_C_Fahrt >= 1) &&
			(Iso_cd_belegt >= 1))
		{
			if (canFire("EMM_T25"))
			{
				++EMM_C_Halt;
				--EMM_C_Fahrt;
				--Iso_cd_belegt;
				fire("EMM_T25");
				return true;
			}
		}
		//check if EMM_T2 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(ILTIS__EMM_2_833 >= 1) &&
			(EMM_geprueft1 <= 0))
		{
			if (canFire("EMM_T2"))
			{
				--EMM_EMM_Grundstlg;
				--ILTIS__EMM_2_833;
				++EMM_geprueft1;
				fire("EMM_T2");
				return true;
			}
		}
		//check if EMM_T1 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(ILTIS__EMM_1_833 >= 1) &&
			(EMM_geprueft1 <= 0))
		{
			if (canFire("EMM_T1"))
			{
				--EMM_EMM_Grundstlg;
				--ILTIS__EMM_1_833;
				++EMM_geprueft1;
				fire("EMM_T1");
				return true;
			}
		}
		//check if EMM_T24 can fire
		if ( (EMM_C_Halt >= 1) &&
			(EMM_C_Fahrt <= 0) &&
			(EMM_EMM_W10_plus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_plus >= 1))
		{
			if (canFire("EMM_T24"))
			{
				--EMM_C_Halt;
				++EMM_C_Fahrt;
				--EMM_EMM_W10_plus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_plus;
				fire("EMM_T24");
				return true;
			}
		}
		//check if EMM_T25 can fire
		if ( (EMM_C_Halt <= 0) &&
			(EMM_C_Fahrt >= 1) &&
			(Iso_cd_belegt >= 1))
		{
			if (canFire("EMM_T25"))
			{
				++EMM_C_Halt;
				--EMM_C_Fahrt;
				--Iso_cd_belegt;
				fire("EMM_T25");
				return true;
			}
		}
		//check if EMM_T2 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(ILTIS__EMM_2_833 >= 1) &&
			(EMM_geprueft1 <= 0))
		{
			if (canFire("EMM_T2"))
			{
				--EMM_EMM_Grundstlg;
				--ILTIS__EMM_2_833;
				++EMM_geprueft1;
				fire("EMM_T2");
				return true;
			}
		}
		//check if EMM_T1 can fire
		if ( (EMM_EMM_Grundstlg >= 1) &&
			(ILTIS__EMM_1_833 >= 1) &&
			(EMM_geprueft1 <= 0))
		{
			if (canFire("EMM_T1"))
			{
				--EMM_EMM_Grundstlg;
				--ILTIS__EMM_1_833;
				++EMM_geprueft1;
				fire("EMM_T1");
				return true;
			}
		}
		//check if EMM_T24 can fire
		if ( (EMM_C_Halt >= 1) &&
			(EMM_C_Fahrt <= 0) &&
			(EMM_EMM_W10_plus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_minus >= 1) &&
			(EMM_EMM_W10_plus >= 1))
		{
			if (canFire("EMM_T24"))
			{
				--EMM_C_Halt;
				++EMM_C_Fahrt;
				--EMM_EMM_W10_plus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_minus;
				--EMM_EMM_W10_plus;
				fire("EMM_T24");
				return true;
			}
		}
		//check if LN_pruefen2 can fire
		if ( (LN_geprueft1 >= 1) &&
			(BL_OM_LN_Grundstlg_v >= 1) &&
			(LN_geprueft2 <= 0))
		{
			if (canFire("LN_pruefen2"))
			{
				--LN_geprueft1;
				--BL_OM_LN_Grundstlg_v;
				++LN_geprueft2;
				fire("LN_pruefen2");
				return true;
			}
		}
		//check if LN_T7 can fire
		if ( (ILTIS__LN_834_2 >= 1) &&
			(LN_EMM_Grundstlg >= 1) &&
			(LN_geprueft1 <= 0))
		{
			if (canFire("LN_T7"))
			{
				--ILTIS__LN_834_2;
				--LN_EMM_Grundstlg;
				++LN_geprueft1;
				fire("LN_T7");
				return true;
			}
		}
		//check if LN_T1 can fire
		if ( (ILTIS__LN_1_834 >= 1) &&
			(LN_geprueft1 <= 0) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T1"))
			{
				--ILTIS__LN_1_834;
				++LN_geprueft1;
				--LN_EMM_Grundstlg;
				fire("LN_T1");
				return true;
			}
		}
		//check if LN_pruefen2 can fire
		if ( (LN_geprueft1 >= 1) &&
			(BL_OM_LN_Grundstlg_v >= 1) &&
			(LN_geprueft2 <= 0))
		{
			if (canFire("LN_pruefen2"))
			{
				--LN_geprueft1;
				--BL_OM_LN_Grundstlg_v;
				++LN_geprueft2;
				fire("LN_pruefen2");
				return true;
			}
		}
		//check if LN_T5 can fire
		if ( (ILTIS__LN_5_834 >= 1) &&
			(LN_geprueft1 <= 0) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T5"))
			{
				--ILTIS__LN_5_834;
				++LN_geprueft1;
				--LN_EMM_Grundstlg;
				fire("LN_T5");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_T4 can fire
		if ( (LN_geprueft1 <= 0) &&
			(ILTIS__LN_4_834 >= 1) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T4"))
			{
				++LN_geprueft1;
				--ILTIS__LN_4_834;
				--LN_EMM_Grundstlg;
				fire("LN_T4");
				return true;
			}
		}
		//check if LN_pruefen2 can fire
		if ( (LN_geprueft1 >= 1) &&
			(BL_OM_LN_Grundstlg_v >= 1) &&
			(LN_geprueft2 <= 0))
		{
			if (canFire("LN_pruefen2"))
			{
				--LN_geprueft1;
				--BL_OM_LN_Grundstlg_v;
				++LN_geprueft2;
				fire("LN_pruefen2");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_pruefen2 can fire
		if ( (LN_geprueft1 >= 1) &&
			(BL_OM_LN_Grundstlg_v >= 1) &&
			(LN_geprueft2 <= 0))
		{
			if (canFire("LN_pruefen2"))
			{
				--LN_geprueft1;
				--BL_OM_LN_Grundstlg_v;
				++LN_geprueft2;
				fire("LN_pruefen2");
				return true;
			}
		}
		//check if LN_W1_minus can fire
		if ( (LN_LN_W1_minus <= 0) &&
			(LN_geprueft2 >= 1))
		{
			if (canFire("LN_W1_minus"))
			{
				++LN_LN_W1_minus;
				--LN_geprueft2;
				fire("LN_W1_minus");
				return true;
			}
		}
		//check if LN_T9 can fire
		if ( (LN_EMM_Grundstlg >= 1) &&
			(LN_geprueft1 <= 0) &&
			(ILTIS__LN_834_4 >= 1))
		{
			if (canFire("LN_T9"))
			{
				--LN_EMM_Grundstlg;
				++LN_geprueft1;
				--ILTIS__LN_834_4;
				fire("LN_T9");
				return true;
			}
		}
		//check if LN_Fstr_aufloesen can fire
		if ( (LN_LN_W6_minus >= 1) &&
			(LN_EMM_Grundstlg <= 0) &&
			(LN_ce_belegt >= 1) &&
			(LN_LN_W1_minus >= 1) &&
			(LN_LN_W1_plus >= 1) &&
			(LN_LN_W5_plus >= 1) &&
			(LN_LN_W5_minus >= 1) &&
			(LN_LN_W6_minus >= 1) &&
			(LN_LN_W6_minus >= 1) &&
			(LN_LN_W6_minus >= 1) &&
			(LN_LN_W5_minus >= 1) &&
			(LN_LN_W5_plus >= 1) &&
			(LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_minus >= 1))
		{
			if (canFire("LN_Fstr_aufloesen"))
			{
				--LN_LN_W6_minus;
				++LN_EMM_Grundstlg;
				--LN_ce_belegt;
				--LN_LN_W1_minus;
				--LN_LN_W1_plus;
				--LN_LN_W5_plus;
				--LN_LN_W5_minus;
				--LN_LN_W6_minus;
				--LN_LN_W6_minus;
				--LN_LN_W6_minus;
				--LN_LN_W5_minus;
				--LN_LN_W5_plus;
				--LN_LN_W1_plus;
				--LN_LN_W1_minus;
				fire("LN_Fstr_aufloesen");
				return true;
			}
		}
		//check if LN_T6 can fire
		if ( (LN_EMM_Grundstlg >= 1) &&
			(ILTIS__LN_834_1 >= 1) &&
			(LN_geprueft1 <= 0))
		{
			if (canFire("LN_T6"))
			{
				--LN_EMM_Grundstlg;
				--ILTIS__LN_834_1;
				++LN_geprueft1;
				fire("LN_T6");
				return true;
			}
		}
		//check if LN_T8 can fire
		if ( (LN_EMM_Grundstlg >= 1) &&
			(LN_geprueft1 <= 0) &&
			(ILTIS__LN_834_3 >= 1))
		{
			if (canFire("LN_T8"))
			{
				--LN_EMM_Grundstlg;
				++LN_geprueft1;
				--ILTIS__LN_834_3;
				fire("LN_T8");
				return true;
			}
		}
		//check if LN_T10 can fire
		if ( (LN_EMM_Grundstlg >= 1) &&
			(ILTIS__LN_834_5 >= 1) &&
			(LN_geprueft1 <= 0))
		{
			if (canFire("LN_T10"))
			{
				--LN_EMM_Grundstlg;
				--ILTIS__LN_834_5;
				++LN_geprueft1;
				fire("LN_T10");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_pruefen2 can fire
		if ( (LN_geprueft1 >= 1) &&
			(BL_OM_LN_Grundstlg_v >= 1) &&
			(LN_geprueft2 <= 0))
		{
			if (canFire("LN_pruefen2"))
			{
				--LN_geprueft1;
				--BL_OM_LN_Grundstlg_v;
				++LN_geprueft2;
				fire("LN_pruefen2");
				return true;
			}
		}
		//check if LN_T2 can fire
		if ( (ILTIS__LN_2_834 >= 1) &&
			(LN_geprueft1 <= 0) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T2"))
			{
				--ILTIS__LN_2_834;
				++LN_geprueft1;
				--LN_EMM_Grundstlg;
				fire("LN_T2");
				return true;
			}
		}
		//check if LN_T3 can fire
		if ( (LN_geprueft1 <= 0) &&
			(ILTIS__LN_3_834 >= 1) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T3"))
			{
				++LN_geprueft1;
				--ILTIS__LN_3_834;
				--LN_EMM_Grundstlg;
				fire("LN_T3");
				return true;
			}
		}
		//check if LN_W2_minus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W2_minus <= 0))
		{
			if (canFire("LN_W2_minus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W2_minus;
				fire("LN_W2_minus");
				return true;
			}
		}
		//check if LN_W3_plus can fire
		if ( (LN_LN_W2_minus >= 1) &&
			(LN_LN_W3_plus <= 0))
		{
			if (canFire("LN_W3_plus"))
			{
				--LN_LN_W2_minus;
				++LN_LN_W3_plus;
				fire("LN_W3_plus");
				return true;
			}
		}
		//check if LN_W3_plus can fire
		if ( (LN_LN_W2_minus >= 1) &&
			(LN_LN_W3_plus <= 0))
		{
			if (canFire("LN_W3_plus"))
			{
				--LN_LN_W2_minus;
				++LN_LN_W3_plus;
				fire("LN_W3_plus");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_W2_minus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W2_minus <= 0))
		{
			if (canFire("LN_W2_minus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W2_minus;
				fire("LN_W2_minus");
				return true;
			}
		}
		//check if LN_W5_plus can fire
		if ( (LN_LN_W5_plus <= 0) &&
			(LN_LN_W3_plus >= 1))
		{
			if (canFire("LN_W5_plus"))
			{
				++LN_LN_W5_plus;
				--LN_LN_W3_plus;
				fire("LN_W5_plus");
				return true;
			}
		}
		//check if LN_W5_minus can fire
		if ( (LN_LN_W5_minus <= 0) &&
			(LN_LN_W3_plus >= 1))
		{
			if (canFire("LN_W5_minus"))
			{
				++LN_LN_W5_minus;
				--LN_LN_W3_plus;
				fire("LN_W5_minus");
				return true;
			}
		}
		//check if LN_W2_minus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W2_minus <= 0))
		{
			if (canFire("LN_W2_minus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W2_minus;
				fire("LN_W2_minus");
				return true;
			}
		}
		//check if LN_W3_minus can fire
		if ( (LN_LN_W2_minus >= 1) &&
			(LN_LN_W3_minus <= 0))
		{
			if (canFire("LN_W3_minus"))
			{
				--LN_LN_W2_minus;
				++LN_LN_W3_minus;
				fire("LN_W3_minus");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_W4_plus can fire
		if ( (LN_LN_W3_minus >= 1) &&
			(LN_LN_W4_plus <= 0))
		{
			if (canFire("LN_W4_plus"))
			{
				--LN_LN_W3_minus;
				++LN_LN_W4_plus;
				fire("LN_W4_plus");
				return true;
			}
		}
		//check if LN_W6_minus can fire
		if ( (LN_LN_W4_plus >= 1) &&
			(LN_LN_W6_minus <= 0))
		{
			if (canFire("LN_W6_minus"))
			{
				--LN_LN_W4_plus;
				++LN_LN_W6_minus;
				fire("LN_W6_minus");
				return true;
			}
		}
		//check if LN_W2_minus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W2_minus <= 0))
		{
			if (canFire("LN_W2_minus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W2_minus;
				fire("LN_W2_minus");
				return true;
			}
		}
		//check if LN_W6_minus can fire
		if ( (LN_LN_W4_plus >= 1) &&
			(LN_LN_W6_minus <= 0))
		{
			if (canFire("LN_W6_minus"))
			{
				--LN_LN_W4_plus;
				++LN_LN_W6_minus;
				fire("LN_W6_minus");
				return true;
			}
		}
		//check if LN_W4_plus can fire
		if ( (LN_LN_W3_minus >= 1) &&
			(LN_LN_W4_plus <= 0))
		{
			if (canFire("LN_W4_plus"))
			{
				--LN_LN_W3_minus;
				++LN_LN_W4_plus;
				fire("LN_W4_plus");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_W3_minus can fire
		if ( (LN_LN_W2_minus >= 1) &&
			(LN_LN_W3_minus <= 0))
		{
			if (canFire("LN_W3_minus"))
			{
				--LN_LN_W2_minus;
				++LN_LN_W3_minus;
				fire("LN_W3_minus");
				return true;
			}
		}
		//check if LN_pruefen2 can fire
		if ( (LN_geprueft1 >= 1) &&
			(BL_OM_LN_Grundstlg_v >= 1) &&
			(LN_geprueft2 <= 0))
		{
			if (canFire("LN_pruefen2"))
			{
				--LN_geprueft1;
				--BL_OM_LN_Grundstlg_v;
				++LN_geprueft2;
				fire("LN_pruefen2");
				return true;
			}
		}
		//check if LN_T5 can fire
		if ( (ILTIS__LN_5_834 >= 1) &&
			(LN_geprueft1 <= 0) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T5"))
			{
				--ILTIS__LN_5_834;
				++LN_geprueft1;
				--LN_EMM_Grundstlg;
				fire("LN_T5");
				return true;
			}
		}
		//check if LN_W2_minus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W2_minus <= 0))
		{
			if (canFire("LN_W2_minus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W2_minus;
				fire("LN_W2_minus");
				return true;
			}
		}
		//check if LN_W3_plus can fire
		if ( (LN_LN_W2_minus >= 1) &&
			(LN_LN_W3_plus <= 0))
		{
			if (canFire("LN_W3_plus"))
			{
				--LN_LN_W2_minus;
				++LN_LN_W3_plus;
				fire("LN_W3_plus");
				return true;
			}
		}
		//check if LN_W1_minus can fire
		if ( (LN_LN_W1_minus <= 0) &&
			(LN_geprueft2 >= 1))
		{
			if (canFire("LN_W1_minus"))
			{
				++LN_LN_W1_minus;
				--LN_geprueft2;
				fire("LN_W1_minus");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_W3_minus can fire
		if ( (LN_LN_W2_minus >= 1) &&
			(LN_LN_W3_minus <= 0))
		{
			if (canFire("LN_W3_minus"))
			{
				--LN_LN_W2_minus;
				++LN_LN_W3_minus;
				fire("LN_W3_minus");
				return true;
			}
		}
		//check if LN_W6_minus can fire
		if ( (LN_LN_W4_plus >= 1) &&
			(LN_LN_W6_minus <= 0))
		{
			if (canFire("LN_W6_minus"))
			{
				--LN_LN_W4_plus;
				++LN_LN_W6_minus;
				fire("LN_W6_minus");
				return true;
			}
		}
		//check if LN_W3_plus can fire
		if ( (LN_LN_W2_minus >= 1) &&
			(LN_LN_W3_plus <= 0))
		{
			if (canFire("LN_W3_plus"))
			{
				--LN_LN_W2_minus;
				++LN_LN_W3_plus;
				fire("LN_W3_plus");
				return true;
			}
		}
		//check if LN_W4_plus can fire
		if ( (LN_LN_W3_minus >= 1) &&
			(LN_LN_W4_plus <= 0))
		{
			if (canFire("LN_W4_plus"))
			{
				--LN_LN_W3_minus;
				++LN_LN_W4_plus;
				fire("LN_W4_plus");
				return true;
			}
		}
		//check if LN_W2_minus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W2_minus <= 0))
		{
			if (canFire("LN_W2_minus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W2_minus;
				fire("LN_W2_minus");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_W3_minus can fire
		if ( (LN_LN_W2_minus >= 1) &&
			(LN_LN_W3_minus <= 0))
		{
			if (canFire("LN_W3_minus"))
			{
				--LN_LN_W2_minus;
				++LN_LN_W3_minus;
				fire("LN_W3_minus");
				return true;
			}
		}
		//check if LN_W2_minus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W2_minus <= 0))
		{
			if (canFire("LN_W2_minus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W2_minus;
				fire("LN_W2_minus");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_W6_minus can fire
		if ( (LN_LN_W4_plus >= 1) &&
			(LN_LN_W6_minus <= 0))
		{
			if (canFire("LN_W6_minus"))
			{
				--LN_LN_W4_plus;
				++LN_LN_W6_minus;
				fire("LN_W6_minus");
				return true;
			}
		}
		//check if LN_W4_plus can fire
		if ( (LN_LN_W3_minus >= 1) &&
			(LN_LN_W4_plus <= 0))
		{
			if (canFire("LN_W4_plus"))
			{
				--LN_LN_W3_minus;
				++LN_LN_W4_plus;
				fire("LN_W4_plus");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_W5_minus can fire
		if ( (LN_LN_W5_minus <= 0) &&
			(LN_LN_W3_plus >= 1))
		{
			if (canFire("LN_W5_minus"))
			{
				++LN_LN_W5_minus;
				--LN_LN_W3_plus;
				fire("LN_W5_minus");
				return true;
			}
		}
		//check if LN_W1_plus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W1_plus <= 0))
		{
			if (canFire("LN_W1_plus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W1_plus;
				fire("LN_W1_plus");
				return true;
			}
		}
		//check if LN_W5_plus can fire
		if ( (LN_LN_W5_plus <= 0) &&
			(LN_LN_W3_plus >= 1))
		{
			if (canFire("LN_W5_plus"))
			{
				++LN_LN_W5_plus;
				--LN_LN_W3_plus;
				fire("LN_W5_plus");
				return true;
			}
		}
		//check if LN_W2_minus can fire
		if ( (LN_LN_W1_plus >= 1) &&
			(LN_LN_W2_minus <= 0))
		{
			if (canFire("LN_W2_minus"))
			{
				--LN_LN_W1_plus;
				++LN_LN_W2_minus;
				fire("LN_W2_minus");
				return true;
			}
		}
		//check if LN_T10 can fire
		if ( (LN_EMM_Grundstlg >= 1) &&
			(ILTIS__LN_834_5 >= 1) &&
			(LN_geprueft1 <= 0))
		{
			if (canFire("LN_T10"))
			{
				--LN_EMM_Grundstlg;
				--ILTIS__LN_834_5;
				++LN_geprueft1;
				fire("LN_T10");
				return true;
			}
		}
		//check if LN_T25 can fire
		if ( (LN_C1_Halt <= 0) &&
			(LN_C1_Fahrt2 >= 1) &&
			(LN_ce_belegt >= 1))
		{
			if (canFire("LN_T25"))
			{
				++LN_C1_Halt;
				--LN_C1_Fahrt2;
				--LN_ce_belegt;
				fire("LN_T25");
				return true;
			}
		}
		//check if LN_T24 can fire
		if ( (LN_C1_Halt >= 1) &&
			(LN_C1_Fahrt2 <= 0) &&
			(LN_LN_W1_minus >= 1))
		{
			if (canFire("LN_T24"))
			{
				--LN_C1_Halt;
				++LN_C1_Fahrt2;
				--LN_LN_W1_minus;
				fire("LN_T24");
				return true;
			}
		}
		//check if LN_T25 can fire
		if ( (LN_C1_Halt <= 0) &&
			(LN_C1_Fahrt2 >= 1) &&
			(LN_ce_belegt >= 1))
		{
			if (canFire("LN_T25"))
			{
				++LN_C1_Halt;
				--LN_C1_Fahrt2;
				--LN_ce_belegt;
				fire("LN_T25");
				return true;
			}
		}
		//check if LN_T2 can fire
		if ( (ILTIS__LN_2_834 >= 1) &&
			(LN_geprueft1 <= 0) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T2"))
			{
				--ILTIS__LN_2_834;
				++LN_geprueft1;
				--LN_EMM_Grundstlg;
				fire("LN_T2");
				return true;
			}
		}
		//check if LN_T1 can fire
		if ( (ILTIS__LN_1_834 >= 1) &&
			(LN_geprueft1 <= 0) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T1"))
			{
				--ILTIS__LN_1_834;
				++LN_geprueft1;
				--LN_EMM_Grundstlg;
				fire("LN_T1");
				return true;
			}
		}
		//check if LN_T24 can fire
		if ( (LN_C1_Halt >= 1) &&
			(LN_C1_Fahrt2 <= 0) &&
			(LN_LN_W1_minus >= 1))
		{
			if (canFire("LN_T24"))
			{
				--LN_C1_Halt;
				++LN_C1_Fahrt2;
				--LN_LN_W1_minus;
				fire("LN_T24");
				return true;
			}
		}
		//check if LN_T25 can fire
		if ( (LN_C1_Halt <= 0) &&
			(LN_C1_Fahrt2 >= 1) &&
			(LN_ce_belegt >= 1))
		{
			if (canFire("LN_T25"))
			{
				++LN_C1_Halt;
				--LN_C1_Fahrt2;
				--LN_ce_belegt;
				fire("LN_T25");
				return true;
			}
		}
		//check if LN_T2 can fire
		if ( (ILTIS__LN_2_834 >= 1) &&
			(LN_geprueft1 <= 0) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T2"))
			{
				--ILTIS__LN_2_834;
				++LN_geprueft1;
				--LN_EMM_Grundstlg;
				fire("LN_T2");
				return true;
			}
		}
		//check if LN_T1 can fire
		if ( (ILTIS__LN_1_834 >= 1) &&
			(LN_geprueft1 <= 0) &&
			(LN_EMM_Grundstlg >= 1))
		{
			if (canFire("LN_T1"))
			{
				--ILTIS__LN_1_834;
				++LN_geprueft1;
				--LN_EMM_Grundstlg;
				fire("LN_T1");
				return true;
			}
		}
		//check if LN_T24 can fire
		if ( (LN_C1_Halt >= 1) &&
			(LN_C1_Fahrt2 <= 0) &&
			(LN_LN_W1_minus >= 1))
		{
			if (canFire("LN_T24"))
			{
				--LN_C1_Halt;
				++LN_C1_Fahrt2;
				--LN_LN_W1_minus;
				fire("LN_T24");
				return true;
			}
		}
		//check if ZB_T7 can fire
		if ( (ILTIS__ZB_138_2 >= 1) &&
			(ZB_geprueft1 <= 0) &&
			(ZB_EMM_Grundstlg >= 1))
		{
			if (canFire("ZB_T7"))
			{
				--ILTIS__ZB_138_2;
				++ZB_geprueft1;
				--ZB_EMM_Grundstlg;
				fire("ZB_T7");
				return true;
			}
		}
		//check if ZB_T25 can fire
		if ( (ZB_D_Halt <= 0) &&
			(ZB_D_Fahrt >= 1) &&
			(ZB_cd_belegt >= 1))
		{
			if (canFire("ZB_T25"))
			{
				++ZB_D_Halt;
				--ZB_D_Fahrt;
				--ZB_cd_belegt;
				fire("ZB_T25");
				return true;
			}
		}
		//check if ZB_T1 can fire
		if ( (ILTIS__ZB_1_138 >= 1) &&
			(ZB_geprueft1 <= 0) &&
			(ZB_EMM_Grundstlg >= 1))
		{
			if (canFire("ZB_T1"))
			{
				--ILTIS__ZB_1_138;
				++ZB_geprueft1;
				--ZB_EMM_Grundstlg;
				fire("ZB_T1");
				return true;
			}
		}
		//check if ZB_W2_minus can fire
		if ( (ZB_ZB_W2_plus <= 0) &&
			(ZB_geprueft1 >= 1))
		{
			if (canFire("ZB_W2_minus"))
			{
				++ZB_ZB_W2_plus;
				--ZB_geprueft1;
				fire("ZB_W2_minus");
				return true;
			}
		}
		//check if ZB_pruefen2 can fire
		if ( (BL_ZB_OM_Grundstlg_v >= 1) &&
			(ZB_geprueft1 >= 1) &&
			(ZB_geprueft2 <= 0))
		{
			if (canFire("ZB_pruefen2"))
			{
				--BL_ZB_OM_Grundstlg_v;
				--ZB_geprueft1;
				++ZB_geprueft2;
				fire("ZB_pruefen2");
				return true;
			}
		}
		//check if ZB_W2_minus can fire
		if ( (ZB_ZB_W2_plus <= 0) &&
			(ZB_geprueft1 >= 1))
		{
			if (canFire("ZB_W2_minus"))
			{
				++ZB_ZB_W2_plus;
				--ZB_geprueft1;
				fire("ZB_W2_minus");
				return true;
			}
		}
		//check if ZB_Fstr_aufloesen can fire
		if ( (ZB_ZB_W1_plus >= 1) &&
			(ZB_ZB_W1_minus >= 1) &&
			(ZB_EMM_Grundstlg <= 0) &&
			(ZB_ZB_W1_plus >= 1) &&
			(ZB_ZB_W1_minus >= 1) &&
			(ZB_cd_belegt >= 1))
		{
			if (canFire("ZB_Fstr_aufloesen"))
			{
				--ZB_ZB_W1_plus;
				--ZB_ZB_W1_minus;
				++ZB_EMM_Grundstlg;
				--ZB_ZB_W1_plus;
				--ZB_ZB_W1_minus;
				--ZB_cd_belegt;
				fire("ZB_Fstr_aufloesen");
				return true;
			}
		}
		//check if ZB_W2_minus can fire
		if ( (ZB_ZB_W2_plus <= 0) &&
			(ZB_geprueft1 >= 1))
		{
			if (canFire("ZB_W2_minus"))
			{
				++ZB_ZB_W2_plus;
				--ZB_geprueft1;
				fire("ZB_W2_minus");
				return true;
			}
		}
		//check if ZB_T25 can fire
		if ( (ZB_D_Halt <= 0) &&
			(ZB_D_Fahrt >= 1) &&
			(ZB_cd_belegt >= 1))
		{
			if (canFire("ZB_T25"))
			{
				++ZB_D_Halt;
				--ZB_D_Fahrt;
				--ZB_cd_belegt;
				fire("ZB_T25");
				return true;
			}
		}
		//check if ZB_T6 can fire
		if ( (ILTIS__ZB_138_1 >= 1) &&
			(ZB_geprueft1 <= 0) &&
			(ZB_EMM_Grundstlg >= 1))
		{
			if (canFire("ZB_T6"))
			{
				--ILTIS__ZB_138_1;
				++ZB_geprueft1;
				--ZB_EMM_Grundstlg;
				fire("ZB_T6");
				return true;
			}
		}
		//check if ZB_W2_plus can fire
		if ( (ZB_ZB_W2_plus <= 0) &&
			(ZB_geprueft2 >= 1))
		{
			if (canFire("ZB_W2_plus"))
			{
				++ZB_ZB_W2_plus;
				--ZB_geprueft2;
				fire("ZB_W2_plus");
				return true;
			}
		}
		//check if ZB_pruefen2 can fire
		if ( (BL_ZB_OM_Grundstlg_v >= 1) &&
			(ZB_geprueft1 >= 1) &&
			(ZB_geprueft2 <= 0))
		{
			if (canFire("ZB_pruefen2"))
			{
				--BL_ZB_OM_Grundstlg_v;
				--ZB_geprueft1;
				++ZB_geprueft2;
				fire("ZB_pruefen2");
				return true;
			}
		}
		//check if ZB_T2 can fire
		if ( (ILTIS__ZB_2_138 >= 1) &&
			(ZB_geprueft1 <= 0) &&
			(ZB_EMM_Grundstlg >= 1))
		{
			if (canFire("ZB_T2"))
			{
				--ILTIS__ZB_2_138;
				++ZB_geprueft1;
				--ZB_EMM_Grundstlg;
				fire("ZB_T2");
				return true;
			}
		}
		//check if ZB_T24 can fire
		if ( (ZB_D_Halt >= 1) &&
			(ZB_ZB_W1_minus >= 1) &&
			(ZB_ZB_W1_plus >= 1) &&
			(ZB_D_Fahrt <= 0))
		{
			if (canFire("ZB_T24"))
			{
				--ZB_D_Halt;
				--ZB_ZB_W1_minus;
				--ZB_ZB_W1_plus;
				++ZB_D_Fahrt;
				fire("ZB_T24");
				return true;
			}
		}
		//check if ZB_T24 can fire
		if ( (ZB_D_Halt >= 1) &&
			(ZB_ZB_W1_minus >= 1) &&
			(ZB_ZB_W1_plus >= 1) &&
			(ZB_D_Fahrt <= 0))
		{
			if (canFire("ZB_T24"))
			{
				--ZB_D_Halt;
				--ZB_ZB_W1_minus;
				--ZB_ZB_W1_plus;
				++ZB_D_Fahrt;
				fire("ZB_T24");
				return true;
			}
		}
		//check if ZB_W1_minus can fire
		if ( (ZB_ZB_W1_plus <= 0) &&
			(ZB_ZB_W2_plus >= 1))
		{
			if (canFire("ZB_W1_minus"))
			{
				++ZB_ZB_W1_plus;
				--ZB_ZB_W2_plus;
				fire("ZB_W1_minus");
				return true;
			}
		}
		//check if ZB_W1_minus can fire
		if ( (ZB_ZB_W1_plus <= 0) &&
			(ZB_ZB_W2_plus >= 1))
		{
			if (canFire("ZB_W1_minus"))
			{
				++ZB_ZB_W1_plus;
				--ZB_ZB_W2_plus;
				fire("ZB_W1_minus");
				return true;
			}
		}
		//check if ZB_W1_minus can fire
		if ( (ZB_ZB_W1_plus <= 0) &&
			(ZB_ZB_W2_plus >= 1))
		{
			if (canFire("ZB_W1_minus"))
			{
				++ZB_ZB_W1_plus;
				--ZB_ZB_W2_plus;
				fire("ZB_W1_minus");
				return true;
			}
		}
		//check if ZB_W1_minus can fire
		if ( (ZB_ZB_W1_plus <= 0) &&
			(ZB_ZB_W2_plus >= 1))
		{
			if (canFire("ZB_W1_minus"))
			{
				++ZB_ZB_W1_plus;
				--ZB_ZB_W2_plus;
				fire("ZB_W1_minus");
				return true;
			}
		}
		//check if ZB_T1 can fire
		if ( (ILTIS__ZB_1_138 >= 1) &&
			(ZB_geprueft1 <= 0) &&
			(ZB_EMM_Grundstlg >= 1))
		{
			if (canFire("ZB_T1"))
			{
				--ILTIS__ZB_1_138;
				++ZB_geprueft1;
				--ZB_EMM_Grundstlg;
				fire("ZB_T1");
				return true;
			}
		}
		//check if ZB_T2 can fire
		if ( (ILTIS__ZB_2_138 >= 1) &&
			(ZB_geprueft1 <= 0) &&
			(ZB_EMM_Grundstlg >= 1))
		{
			if (canFire("ZB_T2"))
			{
				--ILTIS__ZB_2_138;
				++ZB_geprueft1;
				--ZB_EMM_Grundstlg;
				fire("ZB_T2");
				return true;
			}
		}
		//check if ZB_T3 can fire
		if ( (ZB_D_Fahrt >= 1) &&
			(ZB_D_FB1 <= 0) &&
			(ZB_ZB_W1_plus >= 1))
		{
			if (canFire("ZB_T3"))
			{
				--ZB_D_Fahrt;
				++ZB_D_FB1;
				--ZB_ZB_W1_plus;
				fire("ZB_T3");
				return true;
			}
		}
		//check if ZB_T4 can fire
		if ( (ZB_D_Fahrt >= 1) &&
			(ZB_D_FB2 <= 0) &&
			(ZB_ZB_W1_minus >= 1))
		{
			if (canFire("ZB_T4"))
			{
				--ZB_D_Fahrt;
				++ZB_D_FB2;
				--ZB_ZB_W1_minus;
				fire("ZB_T4");
				return true;
			}
		}
		//check if ILTIS__T1 can fire
		if ( (ILTIS__festgehalten_v_LN >= 1) &&
			(ILTIS__freigegeben_v_LN <= 0) &&
			(ILTIS__freigeben_v_LN >= 1))
		{
			if (canFire("ILTIS__T1"))
			{
				--ILTIS__festgehalten_v_LN;
				++ILTIS__freigegeben_v_LN;
				--ILTIS__freigeben_v_LN;
				fire("ILTIS__T1");
				return true;
			}
		}
		//check if ILTIS__T2 can fire
		if ( (ILTIS__festgehalten_v_LN <= 0) &&
			(ILTIS__freigegeben_v_LN >= 1) &&
			(ILTIS__festhalten_v_LN >= 1))
		{
			if (canFire("ILTIS__T2"))
			{
				++ILTIS__festgehalten_v_LN;
				--ILTIS__freigegeben_v_LN;
				--ILTIS__festhalten_v_LN;
				fire("ILTIS__T2");
				return true;
			}
		}
		//check if ILTIS__T1 can fire
		if ( (ILTIS__festgehalten_v_LN >= 1) &&
			(ILTIS__freigegeben_v_LN <= 0) &&
			(ILTIS__freigeben_v_LN >= 1))
		{
			if (canFire("ILTIS__T1"))
			{
				--ILTIS__festgehalten_v_LN;
				++ILTIS__freigegeben_v_LN;
				--ILTIS__freigeben_v_LN;
				fire("ILTIS__T1");
				return true;
			}
		}
		//check if ILTIS__T2 can fire
		if ( (ILTIS__festgehalten_v_LN <= 0) &&
			(ILTIS__freigegeben_v_LN >= 1) &&
			(ILTIS__festhalten_v_LN >= 1))
		{
			if (canFire("ILTIS__T2"))
			{
				++ILTIS__festgehalten_v_LN;
				--ILTIS__freigegeben_v_LN;
				--ILTIS__festhalten_v_LN;
				fire("ILTIS__T2");
				return true;
			}
		}
		//check if ILTIS__T3 can fire
		if ( (ILTIS__RM_moeglich <= 0) &&
			(ILTIS__P30 >= 1))
		{
			if (canFire("ILTIS__T3"))
			{
				++ILTIS__RM_moeglich;
				--ILTIS__P30;
				fire("ILTIS__T3");
				return true;
			}
		}
		//check if ILTIS__T4 can fire
		if ( (ILTIS__RM_moeglich >= 1) &&
			(ILTIS__P30 <= 0))
		{
			if (canFire("ILTIS__T4"))
			{
				--ILTIS__RM_moeglich;
				++ILTIS__P30;
				fire("ILTIS__T4");
				return true;
			}
		}
		//check if ILTIS__T5 can fire
		if ( (ILTIS__RM_moeglich >= 1) &&
			(ILTIS__rueckmelden_LN_OM >= 1) &&
			(ILTIS__RM_LN_OM <= 0))
		{
			if (canFire("ILTIS__T5"))
			{
				--ILTIS__RM_moeglich;
				--ILTIS__rueckmelden_LN_OM;
				++ILTIS__RM_LN_OM;
				fire("ILTIS__T5");
				return true;
			}
		}
		//check if ILTIS__T3 can fire
		if ( (ILTIS__RM_moeglich <= 0) &&
			(ILTIS__P30 >= 1))
		{
			if (canFire("ILTIS__T3"))
			{
				++ILTIS__RM_moeglich;
				--ILTIS__P30;
				fire("ILTIS__T3");
				return true;
			}
		}
		//check if ILTIS__T4 can fire
		if ( (ILTIS__RM_moeglich >= 1) &&
			(ILTIS__P30 <= 0))
		{
			if (canFire("ILTIS__T4"))
			{
				--ILTIS__RM_moeglich;
				++ILTIS__P30;
				fire("ILTIS__T4");
				return true;
			}
		}
		//check if ILTIS__T5 can fire
		if ( (ILTIS__RM_moeglich >= 1) &&
			(ILTIS__rueckmelden_LN_OM >= 1) &&
			(ILTIS__RM_LN_OM <= 0))
		{
			if (canFire("ILTIS__T5"))
			{
				--ILTIS__RM_moeglich;
				--ILTIS__rueckmelden_LN_OM;
				++ILTIS__RM_LN_OM;
				fire("ILTIS__T5");
				return true;
			}
		}
	return false;
}
}