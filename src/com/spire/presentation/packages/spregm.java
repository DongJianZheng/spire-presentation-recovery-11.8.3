/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfn;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprfcn;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgen;
import com.spire.presentation.packages.sprgzm;
import com.spire.presentation.packages.sprhan;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjzm;
import com.spire.presentation.packages.sprkdn;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlzz;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpan;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtwm;
import com.spire.presentation.packages.sprufn;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.spruwm;
import com.spire.presentation.packages.sprvan;
import com.spire.presentation.packages.sprwfn;
import com.spire.presentation.packages.sprxcn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprysb;

public class spregm {
    private static final String cfr_renamed_3 = "    ";
    private static final int cfr_renamed_4 = 32;

    public static String cfr_renamed_4574(Object arg0, boolean arg1) {
        sprxgf sprxgf2;
        if (arg0 instanceof sprxgf) {
            sprxgf2 = (sprxgf)arg0;
        } else if (arg0 instanceof sprco) {
            sprxgf2 = ((sprco)arg0).cfr_renamed_119();
        } else {
            return new StringBuilder().insert(0, sprysb.cfr_renamed_9("\u0000,\u001e,\u001a5\u001bb\u001a \u001f'\u00166U6\f2\u0010b")).append(arg0.toString()).toString();
        }
        StringBuffer stringBuffer = new StringBuffer();
        spregm.cfr_renamed_11183("", arg1, sprxgf2, stringBuffer);
        return stringBuffer.toString();
    }

    private static /* synthetic */ String cfr_renamed_4566(byte[] arg0, int arg1, int arg2) {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = n = arg1;
        while (n2 != arg1 + arg2) {
            if (arg0[n] >= 32 && arg0[n] <= 126) {
                stringBuffer.append((char)arg0[n]);
            }
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 1 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private static /* synthetic */ String cfr_renamed_4565(String arg0, byte[] arg1) {
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer = new StringBuffer();
        arg0 = new StringBuilder().insert(0, arg0).append(cfr_renamed_3).toString();
        stringBuffer.append(string);
        int n = 0;
        int n2 = n;
        while (n2 < arg1.length) {
            if (arg1.length - n > 32) {
                stringBuffer.append(arg0);
                stringBuffer.append(sprkoe.cfr_renamed_184(sprfqe.cfr_renamed_502(arg1, n, 32)));
                stringBuffer.append(cfr_renamed_3);
                stringBuffer.append(spregm.cfr_renamed_4566(arg1, n, 32));
                stringBuffer.append(string);
            } else {
                stringBuffer.append(arg0);
                stringBuffer.append(sprkoe.cfr_renamed_184(sprfqe.cfr_renamed_502(arg1, n, arg1.length - n)));
                int n3 = arg1.length - n;
                while (n3 != 32) {
                    int n4;
                    stringBuffer.append("  ");
                    n3 = ++n4;
                }
                stringBuffer.append(cfr_renamed_3);
                stringBuffer.append(spregm.cfr_renamed_4566(arg1, n, arg1.length - n));
                stringBuffer.append(string);
            }
            n2 = n += 32;
        }
        return stringBuffer.toString();
    }

    public static String cfr_renamed_2138(Object arg0) {
        return spregm.cfr_renamed_4574(arg0, false);
    }

    public static void cfr_renamed_11183(String arg0, boolean arg1, sprxgf arg2, StringBuffer arg3) {
        String string = sprkoe.cfr_renamed_5114();
        if (arg2 instanceof sprfan) {
            arg3.append(arg0);
            arg3.append(sprlzz.cfr_renamed_9("nQlH"));
            arg3.append(string);
            return;
        }
        if (arg2 instanceof sprszm) {
            StringBuffer stringBuffer;
            arg3.append(arg0);
            if (arg2 instanceof sprqcn) {
                StringBuffer stringBuffer2 = arg3;
                stringBuffer = stringBuffer2;
                stringBuffer2.append(sprysb.cfr_renamed_9("7\u0007'b&'\u00047\u0010,\u0016'"));
            } else {
                StringBuffer stringBuffer3 = arg3;
                if (arg2 instanceof sprcen) {
                    stringBuffer3.append(sprlzz.cfr_renamed_9("dAr$saQqEjCa"));
                    stringBuffer = arg3;
                } else {
                    stringBuffer3.append(sprysb.cfr_renamed_9("&'\u00047\u0010,\u0016'"));
                    stringBuffer = arg3;
                }
            }
            stringBuffer.append(string);
            sprszm sprszm2 = (sprszm)arg2;
            String string2 = new StringBuilder().insert(0, arg0).append(cfr_renamed_3).toString();
            int n = 0;
            int n2 = sprszm2.cfr_renamed_84();
            int n3 = n;
            while (n3 < n2) {
                sprco sprco2 = sprszm2.cfr_renamed_85(n);
                spregm.cfr_renamed_11183(string2, arg1, sprco2.cfr_renamed_119(), arg3);
                n3 = ++n;
            }
        } else if (arg2 instanceof spridn) {
            StringBuffer stringBuffer;
            arg3.append(arg0);
            if (arg2 instanceof sprufn) {
                StringBuffer stringBuffer4 = arg3;
                stringBuffer = stringBuffer4;
                stringBuffer4.append(sprlzz.cfr_renamed_9("FeV\u0000WEp"));
            } else {
                StringBuffer stringBuffer5 = arg3;
                if (arg2 instanceof sprocn) {
                    stringBuffer5.append(sprysb.cfr_renamed_9("\u00060\u0010U\u0011\u00106"));
                    stringBuffer = arg3;
                } else {
                    stringBuffer5.append(sprlzz.cfr_renamed_9("WEp"));
                    stringBuffer = arg3;
                }
            }
            stringBuffer.append(string);
            spridn spridn2 = (spridn)arg2;
            String string3 = new StringBuilder().insert(0, arg0).append(cfr_renamed_3).toString();
            int n = 0;
            int n4 = spridn2.cfr_renamed_84();
            int n5 = n;
            while (n5 < n4) {
                sprco sprco3 = spridn2.cfr_renamed_85(n);
                spregm.cfr_renamed_11183(string3, arg1, sprco3.cfr_renamed_119(), arg3);
                n5 = ++n;
            }
        } else {
            if (arg2 instanceof sprnvm) {
                sprnvm sprnvm2;
                sprxgf sprxgf2;
                arg3.append(arg0);
                if (arg2 instanceof sprkdn) {
                    sprxgf2 = arg2;
                    arg3.append(sprysb.cfr_renamed_9("\u00000\u0010U\u0016\u0014%\u0012'\u0011b"));
                } else {
                    StringBuffer stringBuffer = arg3;
                    if (arg2 instanceof sprycn) {
                        stringBuffer.append(sprlzz.cfr_renamed_9("@eV\u0000PAcGaD$"));
                        sprxgf2 = arg2;
                    } else {
                        stringBuffer.append(sprysb.cfr_renamed_9("\u0016\u0014%\u0012'\u0011b"));
                        sprxgf2 = arg2;
                    }
                }
                sprnvm sprnvm3 = sprnvm2 = (sprnvm)sprxgf2;
                arg3.append(sprvan.cfr_renamed_11184(sprnvm3));
                if (!sprnvm3.cfr_renamed_4567()) {
                    arg3.append(sprlzz.cfr_renamed_9("\u0000MmTlMcMt$"));
                }
                arg3.append(string);
                String string4 = new StringBuilder().insert(0, arg0).append(cfr_renamed_3).toString();
                spregm.cfr_renamed_11183(string4, arg1, sprnvm2.cfr_renamed_8122().cfr_renamed_119(), arg3);
                return;
            }
            if (arg2 instanceof sproug) {
                boolean bl;
                sproug sproug2 = (sproug)arg2;
                StringBuffer stringBuffer = arg3;
                if (arg2 instanceof sprfwm) {
                    StringBuffer stringBuffer6 = arg3;
                    stringBuffer.append(arg0 + sprysb.cfr_renamed_9("7\u0007'b6-\u001b1\u00010\u0000!\u0001'\u0011b:!\u0001'\u0001b&6\u0007+\u001b%") + "[" + sproug2.cfr_renamed_186().length + sprlzz.cfr_renamed_9("}$"));
                    bl = arg1;
                } else {
                    stringBuffer.append(new StringBuilder().insert(0, arg0).append(sprysb.cfr_renamed_9("1\u0007'b:!\u0001'\u0001b&6\u0007+\u001b%")).append("[").append(sproug2.cfr_renamed_186().length).append(sprlzz.cfr_renamed_9("}$")).toString());
                    bl = arg1;
                }
                if (bl) {
                    arg3.append(spregm.cfr_renamed_4565(arg0, sproug2.cfr_renamed_186()));
                    return;
                }
                arg3.append(string);
                return;
            }
            if (arg2 instanceof sprlem) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprysb.cfr_renamed_9("\r\u0017(\u0010!\u0001\u000b\u0011'\u001b6\u001c$\u001c'\u0007j")).append(((sprlem)arg2).cfr_renamed_19()).append(")").append(string).toString());
                return;
            }
            if (arg2 instanceof sprjzm) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("raLeTmVaoMd,")).append(((sprjzm)arg2).cfr_renamed_19()).append(")").append(string).toString());
                return;
            }
            if (arg2 instanceof sprbxm) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprysb.cfr_renamed_9("7-\u001a.\u0010#\u001bj")).append(((sprbxm)arg2).cfr_renamed_587()).append(")").append(string).toString());
                return;
            }
            if (arg2 instanceof sprktm) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("ijTaGaR,")).append(((sprktm)arg2).cfr_renamed_97()).append(")").append(string).toString());
                return;
            }
            if (arg2 instanceof sprgbf) {
                boolean bl;
                sprgbf sprgbf2 = (sprgbf)arg2;
                byte[] byArray = sprgbf2.cfr_renamed_81();
                int n = sprgbf2.cfr_renamed_106();
                if (sprgbf2 instanceof sprdye) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprysb.cfr_renamed_9("1\u0007'b7+\u0001b&6\u0007+\u001b%")).append("[").append(byArray.length).append(sprlzz.cfr_renamed_9("\f$")).append(n).append(sprysb.cfr_renamed_9("(b")).toString());
                    bl = arg1;
                } else {
                    StringBuffer stringBuffer = arg3;
                    if (sprgbf2 instanceof sprbfn) {
                        stringBuffer.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("@l$bmT$spRmNc")).append("[").append(byArray.length).append(sprysb.cfr_renamed_9("Yb")).append(n).append(sprlzz.cfr_renamed_9("}$")).toString());
                        bl = arg1;
                    } else {
                        stringBuffer.append(new StringBuilder().insert(0, arg0).append(sprysb.cfr_renamed_9("7\u0007'b7+\u0001b&6\u0007+\u001b%")).append("[").append(byArray.length).append(sprlzz.cfr_renamed_9("\f$")).append(n).append(sprysb.cfr_renamed_9("(b")).toString());
                        bl = arg1;
                    }
                }
                if (bl) {
                    arg3.append(spregm.cfr_renamed_4565(arg0, byArray));
                    return;
                }
                arg3.append(string);
                return;
            }
            if (arg2 instanceof sprupm) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("iE\u0015WTvIjG,")).append(((sprupm)arg2).cfr_renamed_314()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof sprkgn) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("QtB\u0018WTvIjG,")).append(((sprkgn)arg2).cfr_renamed_314()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof sprhan) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("nqMaRmCWTvIjG,")).append(((sprhan)arg2).cfr_renamed_314()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof sprpfn) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("pvIjTeBhEWTvIjG,")).append(((sprpfn)arg2).cfr_renamed_314()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof sprpan) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("vmSmBhEWTvIjG,")).append(((sprpan)arg2).cfr_renamed_314()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof sprfcn) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("bIpWTvIjG,")).append(((sprfcn)arg2).cfr_renamed_314()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof sprwfn) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("t2\u0011WTvIjG,")).append(((sprwfn)arg2).cfr_renamed_314()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof spruwm) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("gvAtHmCWTvIjG,")).append(((spruwm)arg2).cfr_renamed_314()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof sprxcn) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("RI`EkTaXWTvIjG,")).append(((sprxcn)arg2).cfr_renamed_314()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof sprgen) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("uPcPIiE,")).append(((sprgen)arg2).cfr_renamed_2147()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            if (arg2 instanceof sprjfn) {
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("gaNaReLmZaDPIiE,")).append(((sprjfn)arg2).cfr_renamed_2147()).append(sprysb.cfr_renamed_9("\\b")).append(string).toString());
                return;
            }
            sprxgf sprxgf3 = arg2;
            if (arg2 instanceof sprqvg) {
                sprqvg sprqvg2 = (sprqvg)sprxgf3;
                arg3.append(new StringBuilder().insert(0, arg0).append(sprlzz.cfr_renamed_9("@eV\u0000ANqMaReTaD,")).append(sprqvg2.cfr_renamed_97()).append(")").append(string).toString());
                return;
            }
            sprxgf sprxgf4 = arg2;
            if (sprxgf3 instanceof sprtwm) {
                sprtwm sprtwm2 = (sprtwm)sprxgf4;
                arg3.append(new StringBuilder().insert(0, arg0).append(sprysb.cfr_renamed_9("\r\u0017(\u0010!\u0001\u0006\u00101\u00160\u001c2\u0001-\u0007j")).append(sprtwm2.cfr_renamed_11185().cfr_renamed_314()).append(sprlzz.cfr_renamed_9("\t$")).append(string).toString());
                return;
            }
            if (sprxgf4 instanceof sprgzm) {
                sprgzm sprgzm2 = (sprgzm)arg2;
                arg3.append(new StringBuilder().insert(0, arg0).append(sprysb.cfr_renamed_9("\u0007\r6\u00100\u001b#\u0019b")).append(string).toString());
                String string5 = new StringBuilder().insert(0, arg0).append(cfr_renamed_3).toString();
                if (sprgzm2.cfr_renamed_4569() != null) {
                    arg3.append(new StringBuilder().insert(0, string5).append(sprlzz.cfr_renamed_9("dmRaCp\u0000VEbEvEjCa\u001a$")).append(sprgzm2.cfr_renamed_4569().cfr_renamed_19()).append(string).toString());
                }
                if (sprgzm2.cfr_renamed_4570() != null) {
                    arg3.append(new StringBuilder().insert(0, string5).append(sprysb.cfr_renamed_9("<,\u0011+\u0007'\u00166U\u0010\u0010$\u00100\u0010,\u0016'Ob")).append(sprgzm2.cfr_renamed_4570().toString()).append(string).toString());
                }
                if (sprgzm2.cfr_renamed_4571() != null) {
                    spregm.cfr_renamed_11183(string5, arg1, sprgzm2.cfr_renamed_4571(), arg3);
                }
                arg3.append(new StringBuilder().insert(0, string5).append(sprlzz.cfr_renamed_9("ejCkDmNc\u001a$")).append(sprgzm2.cfr_renamed_4572()).append(string).toString());
                spregm.cfr_renamed_11183(string5, arg1, sprgzm2.cfr_renamed_4573(), arg3);
                return;
            }
            arg3.append(new StringBuilder().insert(0, arg0).append(arg2.toString()).append(string).toString());
        }
    }
}

