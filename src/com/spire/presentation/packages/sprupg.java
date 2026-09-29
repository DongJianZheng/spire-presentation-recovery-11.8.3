/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawg;
import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprdgb;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprfam;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnyl;
import com.spire.presentation.packages.sprpdm;
import com.spire.presentation.packages.sprqhg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprssy;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtu;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class sprupg {
    private static Map<Integer, String> cfr_renamed_0;
    private static Map<sprlem, String> cfr_renamed_1;
    private static Map<sprpdm, String> cfr_renamed_2;
    private static Map<sprlem, String> cfr_renamed_3;
    private static final String cfr_renamed_4 = "                                                              ";

    private static /* synthetic */ String cfr_renamed_7247(int arg0) {
        return cfr_renamed_4.substring(0, arg0);
    }

    private static /* synthetic */ String cfr_renamed_7248(String arg0, String arg1, String arg2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        String string = arg1;
        arg1 = string.substring(0, string.length() - arg2.length());
        block0: while (true) {
            int n2;
            String string2 = arg1;
            while ((n2 = string2.indexOf(arg2)) > 0) {
                int n3 = n;
                stringBuilder.append(arg1.substring(n3, n2));
                stringBuilder.append(arg2);
                stringBuilder.append(arg0);
                if (n3 >= arg1.length()) continue block0;
                string2 = arg1.substring(n2 + arg2.length());
            }
            break;
        }
        if (stringBuilder.length() == 0) {
            return arg1;
        }
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder2.append(arg1);
        return stringBuilder2.toString();
    }

    public static String cfr_renamed_7249(sprtpl arg0) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = sprkoe.cfr_renamed_5114();
        String string2 = new sprqhg().cfr_renamed_7250(arg0.cfr_renamed_89());
        string2 = string2.replace(sprssy.cfr_renamed_9("a*b+"), sprdgb.cfr_renamed_9("KeHd"));
        String string3 = sprupg.cfr_renamed_7251(arg0.cfr_renamed_1489().cfr_renamed_593().cfr_renamed_593());
        stringBuilder.append(sprssy.cfr_renamed_9("C\u00168\u0006>\u0016C\u0016C\u0016C\u0016C\u00165S\u0011E\nY\r\fC")).append(arg0.cfr_renamed_569()).append(string);
        stringBuilder.append(sprdgb.cfr_renamed_9(",\u001c,\u001c,\u001c,\u001c,oiNe]`ryQnY~\u0006,")).append(arg0.cfr_renamed_114()).append(string);
        stringBuilder.append(sprssy.cfr_renamed_9("C\u0016C\u0016C\u0016C\u0016C\u0016C\u0016C\u007f\u0010E\u0016S\u0011r-\fC")).append(arg0.cfr_renamed_102()).append(string);
        stringBuilder.append(sprdgb.cfr_renamed_9(",\u001c,\u001c,\u001c,\u001c,\u001c,ox]~H,xmHi\u0006,")).append(arg0.cfr_renamed_0()).append(string);
        stringBuilder.append(sprssy.cfr_renamed_9("C\u0016C\u0016C\u0016C\u0016C\u0016Cp\nX\u0002ZCr\u0002B\u0006\fC")).append(arg0.cfr_renamed_86()).append(string);
        stringBuilder.append(sprdgb.cfr_renamed_9(",\u001c,\u001c,\u001c,\u001c,\u001c,\u001c_InVi_xxB\u0006,")).append(arg0.cfr_renamed_1485()).append(string);
        stringBuilder.append(sprssy.cfr_renamed_9("C\u0016C\u0016C\u0016C\u0016C\u0016Cf\u0016T\u000f_\u0000\u0016(S\u001a\fC")).append(string3).append(string);
        stringBuilder.append(sprdgb.cfr_renamed_9(",\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,"));
        sprtpl sprtpl2 = arg0;
        sprupg.cfr_renamed_7252(sprtpl2.cfr_renamed_1489().cfr_renamed_2314().cfr_renamed_186(), stringBuilder, string);
        sprhgm sprhgm2 = sprtpl2.cfr_renamed_98();
        if (sprhgm2 != null) {
            Enumeration enumeration = sprhgm2.cfr_renamed_99();
            if (enumeration.hasMoreElements()) {
                stringBuilder.append(sprssy.cfr_renamed_9("C\u0016C\u0016C\u0016C\u0016C\u0016Cs\u001bB\u0006X\u0010_\fX\u0010\fC")).append(string);
            }
            while (enumeration.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(sprlem2);
                if (sprrdm2.cfr_renamed_103() != null) {
                    byte[] byArray = sprrdm2.cfr_renamed_103().cfr_renamed_186();
                    sprrzm sprrzm2 = new sprrzm(byArray);
                    String string4 = sprdgb.cfr_renamed_9(",\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,");
                    try {
                        Iterator<Object> iterator;
                        boolean bl;
                        sprqqe sprqqe2;
                        sprlem sprlem3 = sprlem2;
                        String string5 = sprupg.cfr_renamed_7253(sprlem3);
                        stringBuilder.append(string4).append(string5);
                        stringBuilder.append(sprssy.cfr_renamed_9("Y\u0016\u0000D\nB\nU\u0002ZK")).append(sprrdm2.cfr_renamed_101()).append(sprdgb.cfr_renamed_9("\u0015,")).append(string);
                        string4 = new StringBuilder().insert(0, string4).append(sprupg.cfr_renamed_7247(2 + string5.length())).toString();
                        if (sprlem3.cfr_renamed_5078(sprrdm.cfr_renamed_133)) {
                            sprqqe sprqqe3 = sprqqe2 = sprbcm.cfr_renamed_23(sprrzm2.cfr_renamed_24());
                            stringBuilder.append(string4).append(new StringBuilder().insert(0, sprssy.cfr_renamed_9("\nE wC\fC")).append(((sprbcm)sprqqe3).cfr_renamed_296()).toString()).append(string);
                            if (!((sprbcm)sprqqe3).cfr_renamed_296()) continue;
                            stringBuilder.append(sprupg.cfr_renamed_7247(2 + string5.length()));
                            stringBuilder.append(sprdgb.cfr_renamed_9("LmHdpiROSbOxNmUbH,\u0006,") + ((sprbcm)sprqqe2).cfr_renamed_299()).append(string);
                            continue;
                        }
                        if (sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_272)) {
                            sprqqe2 = sprfam.cfr_renamed_23(sprrzm2.cfr_renamed_24());
                            stringBuilder.append(string4);
                            bl = true;
                            iterator = cfr_renamed_0.keySet().iterator();
                            while (iterator.hasNext()) {
                                StringBuilder stringBuilder2;
                                int n = (Integer)iterator.next();
                                if (!((sprfam)sprqqe2).cfr_renamed_4249(n)) continue;
                                if (!bl) {
                                    StringBuilder stringBuilder3 = stringBuilder;
                                    stringBuilder2 = stringBuilder3;
                                    stringBuilder3.append(sprssy.cfr_renamed_9("\u001aC"));
                                } else {
                                    bl = false;
                                    stringBuilder2 = stringBuilder;
                                }
                                stringBuilder2.append(cfr_renamed_0.get(n));
                            }
                            stringBuilder.append(string);
                            continue;
                        }
                        if (sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_114)) {
                            sprqqe2 = sprnyl.cfr_renamed_23(sprrzm2.cfr_renamed_24());
                            stringBuilder.append(string4);
                            bl = true;
                            iterator = cfr_renamed_2.keySet().iterator();
                            while (iterator.hasNext()) {
                                StringBuilder stringBuilder4;
                                sprpdm sprpdm2 = (sprpdm)iterator.next();
                                if (!((sprnyl)sprqqe2).cfr_renamed_5276(sprpdm2)) continue;
                                if (!bl) {
                                    StringBuilder stringBuilder5 = stringBuilder;
                                    stringBuilder4 = stringBuilder5;
                                    stringBuilder5.append(sprdgb.cfr_renamed_9("\u0010,"));
                                } else {
                                    bl = false;
                                    stringBuilder4 = stringBuilder;
                                }
                                stringBuilder4.append(cfr_renamed_2.get(sprpdm2));
                            }
                            stringBuilder.append(string);
                            continue;
                        }
                        stringBuilder.append(string4).append(sprssy.cfr_renamed_9("@\u0002Z\u0016SC\u000bC")).append(sprupg.cfr_renamed_7248(new StringBuilder().insert(0, string4).append(sprupg.cfr_renamed_7247(8)).toString(), spregm.cfr_renamed_2138(sprrzm2.cfr_renamed_24()), string)).append(string);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        stringBuilder.append(sprlem2.cfr_renamed_19());
                        stringBuilder.append(sprdgb.cfr_renamed_9(",JmPyY,\u0001,")).append(sprssy.cfr_renamed_9("I\u001cI\u001cI")).append(string);
                    }
                    continue;
                }
                stringBuilder.append(string);
            }
        }
        StringBuilder stringBuilder6 = stringBuilder;
        stringBuilder6.append(sprdgb.cfr_renamed_9(",\u001c_UkRmHyNi\u001cMPkS~UxTa\u0006,")).append(string2).append(string);
        stringBuilder.append(sprssy.cfr_renamed_9("C\u0016C\u0016C\u0016C\u0016C\u0016C\u00160_\u0004X\u0002B\u0016D\u0006\fC"));
        sprupg.cfr_renamed_7252(arg0.cfr_renamed_79(), stringBuilder, string);
        return stringBuilder6.toString();
    }

    public static void cfr_renamed_7252(byte[] arg0, StringBuilder arg1, String arg2) {
        if (arg0.length > 20) {
            arg1.append(sprfqe.cfr_renamed_501(arg0, 0, 20)).append(arg2);
            sprupg.cfr_renamed_7254(arg1, arg0, arg2);
            return;
        }
        arg1.append(sprfqe.cfr_renamed_503(arg0)).append(arg2);
    }

    private static /* synthetic */ String cfr_renamed_7251(sprlem arg0) {
        String string = cfr_renamed_3.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0.cfr_renamed_19();
    }

    static {
        cfr_renamed_1 = new HashMap<sprlem, String>();
        cfr_renamed_3 = new HashMap<sprlem, String>();
        cfr_renamed_2 = new HashMap<sprpdm, String>();
        cfr_renamed_0 = new HashMap<Integer, String>();
        cfr_renamed_1.put(sprrdm.cfr_renamed_88, sprdgb.cfr_renamed_9("Oy^fYoHHU~YoHcNu}xH~UnIxY\u007f"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_126, sprssy.cfr_renamed_9("E\u0016T\tS\u0000B(S\u001a\u007f\u0007S\rB\nP\nS\u0011"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_272, sprdgb.cfr_renamed_9("WiEYOm[i"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_314, sprssy.cfr_renamed_9("\u0013D\n@\u0002B\u0006}\u0006O6E\u0002Q\u0006f\u0006D\nY\u0007"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_137, sprdgb.cfr_renamed_9("Oy^fYoHMPxY~RmHeJirmQi"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_3, sprssy.cfr_renamed_9("\nE\u0010C\u0006D\"Z\u0017S\u0011X\u0002B\n@\u0006x\u0002[\u0006"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_133, sprdgb.cfr_renamed_9("^mOe_OSbOxNmUbH\u007f"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_128, sprssy.cfr_renamed_9("\u0000d/x\u0016[\u0001S\u0011"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_953, sprdgb.cfr_renamed_9("Ni]\u007fSb\u007fcXi"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_1, sprssy.cfr_renamed_9("\nX\u0010B\u0011C\u0000B\nY\ru\fR\u0006"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_951, sprdgb.cfr_renamed_9("UbJmPeXeHuxmHi"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_4, sprssy.cfr_renamed_9("\u0007S\u000fB\u0002u1z*X\u0007_\u0000W\u0017Y\u0011"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_96, sprdgb.cfr_renamed_9("U\u007fOyUb[HU\u007fH~UnIxUcR\\SeRx"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_119, sprssy.cfr_renamed_9("\u0000S\u0011B\nP\nU\u0002B\u0006\u007f\u0010E\u0016S\u0011"));
        cfr_renamed_1.put(sprrdm.spr\ufe34, sprdgb.cfr_renamed_9("b]aYOSbOxNmUbH\u007f"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_79, sprssy.cfr_renamed_9("\u0000d/r\nE\u0017D\nT\u0016B\nY\rf\f_\rB\u0010"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_723, sprdgb.cfr_renamed_9("oY~HeZe_mHilcPe_eY\u007f"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_31, sprssy.cfr_renamed_9("F\fZ\nU\u001a{\u0002F\u0013_\rQ\u0010"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_105, sprdgb.cfr_renamed_9("]yHdS~UxEGYuuhYbHeZeY~"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_82, sprssy.cfr_renamed_9("\u0013Y\u000f_\u0000O Y\rE\u0017D\u0002_\rB\u0010"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_114, sprdgb.cfr_renamed_9("YtHiRhYhwiEYOm[i"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_957, sprssy.cfr_renamed_9("\u0005D\u0006E\u000bS\u0010B d/"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_145, sprdgb.cfr_renamed_9("UbTe^eHMRulcPe_u"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_102, sprssy.cfr_renamed_9("\u0002C\u0017^\fD\nB\u001a\u007f\rP\fw\u0000U\u0006E\u0010"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_84, sprdgb.cfr_renamed_9("\u007fInVi_xubZc}o_iO\u007f"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_93, sprssy.cfr_renamed_9("Z\fQ\fb\u001aF\u0006"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_152, sprdgb.cfr_renamed_9("nUcQiH~UoubZc"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_185, sprssy.cfr_renamed_9("G e\u0017W\u0017S\u000eS\rB\u0010"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_1226, sprdgb.cfr_renamed_9("mIhUxuhYbHeHu"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_2, sprssy.cfr_renamed_9("X\fd\u0006@\"@\u0002_\u000f"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_91, sprdgb.cfr_renamed_9("x]~[iHERjS~QmHeSb"));
        cfr_renamed_1.put(sprrdm.cfr_renamed_86, sprssy.cfr_renamed_9("\u0006N\u0013_\u0011S\u0007u\u0006D\u0017E,X d/"));
        cfr_renamed_0.put(128, sprdgb.cfr_renamed_9("Xe[eHmP_UkRmHyNi"));
        cfr_renamed_0.put(64, sprssy.cfr_renamed_9("X\fX1S\u0013C\u0007_\u0002B\nY\r"));
        cfr_renamed_0.put(32, sprdgb.cfr_renamed_9("gYuyb_eLdY~QiRx"));
        cfr_renamed_0.put(16, sprssy.cfr_renamed_9("R\u0002B\u0002s\rU\nF\u000bS\u0011[\u0006X\u0017"));
        cfr_renamed_0.put(8, sprdgb.cfr_renamed_9("WiEM[~YiQiRx"));
        cfr_renamed_0.put(4, sprssy.cfr_renamed_9("\bS\u001au\u0006D\u0017e\nQ\r"));
        cfr_renamed_0.put(2, sprdgb.cfr_renamed_9("on@oe[b"));
        cfr_renamed_0.put(1, sprssy.cfr_renamed_9("S\rU\nF\u000bS\u0011y\rZ\u001a"));
        cfr_renamed_0.put(32768, sprdgb.cfr_renamed_9("Xi_eLdY~sbPu"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_86, sprssy.cfr_renamed_9("\u0002X\u001as\u001bB\u0006X\u0007S\u0007}\u0006O6E\u0002Q\u0006"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_1, sprdgb.cfr_renamed_9("UhcgLSOiNzY~}yHd"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_112, sprssy.cfr_renamed_9("_\u0007i\bF<U\u000f_\u0006X\u0017w\u0016B\u000b"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_82, sprdgb.cfr_renamed_9("eXSW|coShY_UkReRk"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_91, sprssy.cfr_renamed_9("\nR<]\u0013i\u0006[\u0002_\u000ff\u0011Y\u0017S\u0000B\nY\r"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_272, sprdgb.cfr_renamed_9("UhcgLSU|Oi_IRhouOxYa"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_152, sprssy.cfr_renamed_9("\nR<]\u0013i\nF\u0010S\u0000b\u0016X\rS\u000f"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_107, sprdgb.cfr_renamed_9("eXSW|ceL\u007fYoi\u007fY~"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_3, sprssy.cfr_renamed_9("_\u0007i\bF<B\n[\u0006e\u0017W\u000eF\nX\u0004"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_953, sprdgb.cfr_renamed_9("eXSW|cC\u007f_l_UkReRk"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_133, sprssy.cfr_renamed_9("_\u0007i\bF<R\u0015U\u0010"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_119, sprdgb.cfr_renamed_9("UhcgLSOn[|\u007fiNx}MoiNzY~}yHd"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_4, sprssy.cfr_renamed_9("_\u0007i\bF<E\u0000@\u0013i\u0011S\u0010F\fX\u0007S\u0011"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_185, sprdgb.cfr_renamed_9("UhcgLSYmLCJiN\\l\\"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_79, sprssy.cfr_renamed_9("_\u0007i\bF<S\u0002F,@\u0006D/w-"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_126, sprdgb.cfr_renamed_9("UhcgLSOoJ|oiNzY~"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_0, sprssy.cfr_renamed_9("_\u0007i\bF<E\u0000@\u0013u\u000f_\u0006X\u0017"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_132, sprdgb.cfr_renamed_9("UhcgLSU|Oi_EwI"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_102, sprssy.cfr_renamed_9("_\u0007i\bF<U\u0002F\u0014W\u0013w "));
        cfr_renamed_2.put(sprpdm.cfr_renamed_2, sprdgb.cfr_renamed_9("eXSW|co]|KmL[h\\"));
        cfr_renamed_2.put(sprpdm.spr\ufe34, sprssy.cfr_renamed_9("\nR<]\u0013i\u0000[\u0000u\""));
        cfr_renamed_2.put(sprpdm.cfr_renamed_96, sprdgb.cfr_renamed_9("eXSW|coQonM"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_93, sprssy.cfr_renamed_9("\nR<]\u0013i\u0000[(q\""));
        cfr_renamed_2.put(sprpdm.cfr_renamed_31, sprdgb.cfr_renamed_9("UhcgLSOa]~Ho]~X`SkSb"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_88, sprssy.cfr_renamed_9("_\u0007i\bF<[\u0002U\"R\u0007D\u0006E\u0010"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_114, sprdgb.cfr_renamed_9("eXSW|caO_{O"));
        cfr_renamed_2.put(sprpdm.cfr_renamed_105, sprssy.cfr_renamed_9("\nR<]\u0013i\rE0q "));
        cfr_renamed_3.put(sprdl.cfr_renamed_1205, sprdgb.cfr_renamed_9("~Omyb_~E|HeSb"));
        cfr_renamed_3.put(sprbr.cfr_renamed_135, sprssy.cfr_renamed_9("_\u0007i\u0006U3C\u0001Z\nU(S\u001a"));
        cfr_renamed_3.put(sprtu.cfr_renamed_0, sprdgb.cfr_renamed_9("UhcIX>\t9\r5"));
        cfr_renamed_3.put(sprtu.cfr_renamed_2, sprssy.cfr_renamed_9("_\u0007i&RW\u0002["));
    }

    public static void cfr_renamed_7254(StringBuilder arg0, byte[] arg1, String arg2) {
        int n;
        int n2 = n = 20;
        while (n2 < arg1.length) {
            if (n < arg1.length - 20) {
                arg0.append(sprdgb.cfr_renamed_9(",\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,\u001c,")).append(sprfqe.cfr_renamed_501(arg1, n, 20)).append(arg2);
            } else {
                arg0.append(sprssy.cfr_renamed_9("C\u0016C\u0016C\u0016C\u0016C\u0016C\u0016C\u0016C\u0016C\u0016C\u0016C\u0016C")).append(sprfqe.cfr_renamed_501(arg1, n, arg1.length - n)).append(arg2);
            }
            n2 = n += 20;
        }
    }

    private static /* synthetic */ String cfr_renamed_7253(sprlem arg0) {
        String string = cfr_renamed_1.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0.cfr_renamed_19();
    }

    public static void main(String[] arg0) throws Exception {
        sprawg sprawg2 = new sprawg(new FileReader(arg0[0]));
        System.out.println(sprupg.cfr_renamed_7249((sprtpl)sprawg2.cfr_renamed_24()));
    }
}

