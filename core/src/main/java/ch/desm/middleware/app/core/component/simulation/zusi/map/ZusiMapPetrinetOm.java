package ch.desm.middleware.app.core.component.simulation.zusi.map;

import ch.desm.middleware.app.core.component.ComponentMapBase;

import java.util.Map;

/**
 * Created by Sebastian on 28.11.2014.
 */
public class ZusiMapPetrinetOm extends ComponentMapBase {

    @Override
    public Map<String, String> getMap() {
        return map;
    }

    @Override
    protected void init(){
// map.put("0100-0200::0100",""); //Initialisierung acknowledge command from zusi
// map.put("0100-0200::0200",""); //Initialisierung acknowledge command from zusi
// map.put("0100-0200::0300",""); //Initialisierung acknowledge command from zusi
// map.put("0300-0400::0100",""); //Initialisierung acknowledge command needed data from zusi
// map.put("0300-1400-0100::0100",""); //00 01 String Zugnummer
// map.put("0300-1400-0100::0200",""); //00 02 Single x-Position der Zugspitze bezüglich UTM
// map.put("0300-1400-0100::0300",""); //00 03 Single y-Position der Zugspitze bezüglich UTM
// map.put("0300-1400-0100::0400",""); //00 04 Single z-Position der Zugspitze bezüglich UTM
// map.put("0300-1400-0100::0500",""); //00 05 Single Winkellage der Zugspitze bezüglich UTM-Raster in Radiant
// map.put("0300-1400-0100::0600",""); //00 06 Single Aktuelle Geschwindigkeit des Zuges in m/s
// map.put("0300-1400-0100::0700",""); //00 07 Single x-Position der Zugende bezüglich UTM
// map.put("0300-1400-0100::0800",""); //00 08 Single y-Position der Zugende bezüglich UTM
// map.put("0300-1400-0100::0900",""); //00 09 Single z-Position der Zugende bezüglich UTM
// map.put("0300-1400-0100::0a00",""); //00 0A Single Winkellage des Zugendes bezüglich UTM-Raster in Radiant
        map.put("logic_iso_ce_belegen","OML_LN_$ce_belegen"); //OML_LN_$ce_belegen
        map.put("logic_iso_egf_belegen","OML_Iso_egf_$belegen"); //OML_Iso_egf_$belegen
        map.put("logic_iso_1_belegen","OML_Iso_1_$belegen"); //OML_Iso_1_$belegen
        map.put("logic_iso_ef_belegen","OML_Iso_ef_$belegen"); //OML_Iso_ef_$belegen
        map.put("logic_iso_cd_belegen","OML_Iso_cd_$belegen"); //OML_Iso_cd_$belegen
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:91000000,0300:00,0400:0000,0500:0100",""); //OM Einfahrsignal F NotRot
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:91000000,0300:00,0400:0000,0500:0300","OML_Fstr_fg_$F_Fahrt3"); //OM Einfahrsignal F FB3
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:91000000,0300:00,0400:0000,0500:0100","OML_Fstr_fe_$F_Halt"); //OM Einfahrsignal F Rot
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:91000000,0300:00,0400:0000,0500:0000","OML_Fstr_fe_$F_Fahrt1"); //OM Einfahrsignal F FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:1a000000,0300:00,0400:0000,0500:0000","OML_Fstr_ef_$E_Fahrt1"); //OM Einfahrsignal E FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:1a000000,0300:00,0400:0000,0500:0100","OML_Fstr_ef_$E_Halt"); //OM Einfahrsignal E Rot
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:1a000000,0300:00,0400:0000,0500:0100",""); //OM Einfahrsignal E NotRot
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:07000000,0300:00,0400:0000,0500:0000",""); //OM Einfahrsignal G FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:07000000,0300:00,0400:0000,0500:0100","OML_Fstr_gf_$G_Halt"); //OM Einfahrsignal G Rot
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:07000000,0300:00,0400:0000,0500:0300","OML_Fstr_gf_$G_Fahrt3"); //OM Einfahrsignal G FB3
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:1d000000,0300:00,0400:0000,0500:0100","OML_EMM_$D_Halt"); //EMM Einfahrsignal D Rot
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:1d000000,0300:00,0400:0000,0500:0100","OML_EMM_$D_FB2"); //EMM Einfahrsignal D FB2
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:1d000000,0300:00,0400:0000,0500:0000","OML_EMM_$D_FB1"); //EMM Einfahrsignal D FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:04000000,0300:00,0400:0000,0500:0000","OML_EMM_$C_FB1"); //EMM Ausfahrsignal C FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:04000000,0300:00,0400:0000,0500:0000","OML_EMM_$C_FB2"); //EMM Ausfahrsignal C FB2
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:04000000,0300:00,0400:0000,0500:0100","OML_EMM_$C_Halt"); //EMM Ausfahrsignal C Rot
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:0a000000,0300:00,0400:0000,0500:0000",""); //OM Einfahrvorsignal Gstern
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:97000000,0300:00,0400:0000,0500:0000",""); //OM Einfahrvorsignal Fstern
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:9d000000,0300:00,0400:0000,0500:0000","OML_ZB_$C_FB1"); //ZB Ausfahrsignal C FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:9d000000,0300:00,0400:0000,0500:0100","OML_ZB_$C_Halt"); //ZB Ausfahrsignal C rot
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:9d000000,0300:00,0400:0000,0500:0300","OML_ZB_$C_FB2"); //ZB Ausfahrsignal C FB2
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:9c000000,0300:00,0400:0000,0500:0000",""); //ZB Einfahrvorsignal Dstern
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:0b000000,0300:00,0400:0000,0500:0000",""); //ZB Einfahrsignal DBstern
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:42000000,0300:00,0400:0000,0500:0000",""); //ZB Ausfahrsignal B FB1
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:42000000,0300:00,0400:0000,0500:0100",""); //ZB Ausfahrsignal B rot
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:42000000,0300:00,0400:0000,0500:0300",""); //ZB Ausfahrsignal B FB2
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:0b000000,0300:00,0400:0000,0500:0000","OML_ZB_$D_FB1"); //ZB Einfahrsignal D FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:0b000000,0300:00,0400:0000,0500:0100","OML_ZB_$D_Halt"); //ZB Einfahrsignal D Rot
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:0b000000,0300:00,0400:0000,0500:0300","OML_ZB_$D_FB2"); //ZB Einfahrsignal D FB2
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:98000000,0300:00,0400:0000,0500:0000",""); //LN Einfahrvorignal Astern
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:99000000,0300:00,0400:0000,0500:0000",""); //LN Einfahrsignal AEstern
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:49000000,0300:00,0400:0000,0500:0000","OML_LN_$C26_FB1"); //LN Ausfahrsignal C2-6 FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:49000000,0300:00,0400:0000,0500:0100","OML_LN_$C26_Halt"); //LN Ausfahrsignal C2-6 HALT
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:49000000,0300:00,0400:0000,0500:0200","OML_LN_$C26_FB2"); //LN Ausfahrsignal C2-6 FB2
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:a3000000,0300:00,0400:0000,0500:0000","OML_LN_$C1_FB1"); //LN Ausfahrsignal C1 FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:a3000000,0300:00,0400:0000,0500:0100","OML_LN_$C1_Halt"); //LN Ausfahrsignal C1 rot
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:a3000000,0300:00,0400:0000,0500:0200",""); //LN Ausfahrsignal C1 FB2
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:4f000000,0300:00,0400:0000,0500:0000",""); //LN Abschnittsignal EFstern
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:76000000,0300:00,0400:0000,0500:0000","OML_Fstr_fe_$F_Fahrt1"); //LN Ausfahrsignal F FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:76000000,0300:00,0400:0000,0500:0100","OML_Fstr_fe_$F_Halt"); //LN Ausfahrsignal F rot
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:76000000,0300:00,0400:0000,0500:0200",""); //LN Ausfahrsignal F FB2
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:99000000,0300:00,0400:0000,0500:0000","OML_LN_$E_FB1"); //LN Einfahrsignal AEStern FB1
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:99000000,0300:00,0400:0000,0500:0100","OML_LN_$e_Halt"); //LN Einfahrsignal AEStern rot
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:99000000,0300:00,0400:0000,0500:0200","OML_LN_$E_FB2"); //LN Einfahrsignal AEStern FB2
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:11000000,0300:00,0400:0000,0500:0200","OML_Stw_W1_$Endlage_minus"); //OM Weiche1
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:30000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 10
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:33000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 9
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:36000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 8
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:39000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 7
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:8b000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 6
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:8e000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 5
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:2d000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 4
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:2a000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 3b
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:27000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 3a
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:24000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 2b
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:14000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 2a
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:17000000,0300:00,0400:0000,0500:0200",""); //EM Weiche 101
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:3c000000,0300:00,0400:0000,0500:0200",""); //ZB Weiche 5
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:a0000000,0300:00,0400:0000,0500:0200",""); //ZB Weiche 4
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:3f000000,0300:00,0400:0000,0500:0200",""); //ZB Weiche 3
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:46000000,0300:00,0400:0000,0500:0200",""); //ZB Weiche 2
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:43000000,0300:00,0400:0000,0500:0200",""); //ZB Weiche 1
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:4c000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 1
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:52000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 2
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:55000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 3
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:5b000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 4
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:58000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 5
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:61000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 10
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:5e000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 11
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:64000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 12
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:73000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 24
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:6d000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 26
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:7c000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 29
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:82000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 31
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:88000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 34
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:85000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 35
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:7f000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 37
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:6a000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 42
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:70000000,0300:00,0400:0000,0500:0200",""); //LN Weiche 43
        map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:11000000,0300:00,0400:0000,0500:0100","OML_Stw_W1_$Endlage_plus"); //OM Weiche1
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:30000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 10
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:33000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 9
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:36000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 8
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:39000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 7
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:8b000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 6
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:8e000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 5
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:2d000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 4
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:2a000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 3b
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:27000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 3a
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:24000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 2b
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:14000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 2a
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:17000000,0300:00,0400:0000,0500:0100",""); //EM Weiche 101
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:3c000000,0300:00,0400:0000,0500:0100",""); //ZB Weiche 5
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:a0000000,0300:00,0400:0000,0500:0100",""); //ZB Weiche 4
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:3f000000,0300:00,0400:0000,0500:0100",""); //ZB Weiche 3
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:46000000,0300:00,0400:0000,0500:0100",""); //ZB Weiche 2
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:43000000,0300:00,0400:0000,0500:0100",""); //ZB Weiche 1
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:4c000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 1
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:52000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 2
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:55000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 3
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:5b000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 4
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:58000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 5
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:61000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 10
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:5e000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 11
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:64000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 12
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:73000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 24
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:6d000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 26
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:7c000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 29
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:82000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 31
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:88000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 34
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:85000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 35
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:7f000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 37
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:6a000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 42
// map.put("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:70000000,0300:00,0400:0000,0500:0100",""); //LN Weiche 43

    }
}
