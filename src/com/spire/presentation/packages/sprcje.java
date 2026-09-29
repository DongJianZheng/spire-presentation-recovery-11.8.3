/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprgme;
import com.spire.presentation.packages.sprgpe;
import com.spire.presentation.packages.sprgve;
import com.spire.presentation.packages.sprgwe;
import com.spire.presentation.packages.sprhwe;
import com.spire.presentation.packages.sprieba;
import com.spire.presentation.packages.spriqe;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprmne;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprosc;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprrue;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxte;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.io.IOException;
import java.util.Enumeration;

public class sprcje {
    private static final int cfr_renamed_3 = 32;
    private static final String cfr_renamed_4 = "    ";

    private static /* synthetic */ String cfr_renamed_4565(String arg0, byte[] arg1) {
        String string = System.getProperty(sprosc.cfr_renamed_9("\u000fC\rOMY\u0006Z\u0002X\u0002^\fX"));
        StringBuffer stringBuffer = new StringBuffer();
        arg0 = new StringBuilder().insert(0, arg0).append(cfr_renamed_4).toString();
        stringBuffer.append(string);
        int n = 0;
        int n2 = n;
        while (n2 < arg1.length) {
            if (arg1.length - n > 32) {
                stringBuffer.append(arg0);
                stringBuffer.append(new String(sprmma.cfr_renamed_502(arg1, n, 32)));
                stringBuffer.append(cfr_renamed_4);
                stringBuffer.append(sprcje.cfr_renamed_4566(arg1, n, 32));
                stringBuffer.append(string);
            } else {
                StringBuffer stringBuffer2 = stringBuffer;
                stringBuffer2.append(arg0);
                stringBuffer2.append(new String(sprmma.cfr_renamed_502(arg1, n, arg1.length - n)));
                int n3 = arg1.length - n;
                while (n3 != 32) {
                    int n4;
                    stringBuffer.append("  ");
                    n3 = ++n4;
                }
                stringBuffer.append(cfr_renamed_4);
                stringBuffer.append(sprcje.cfr_renamed_4566(arg1, n, arg1.length - n));
                stringBuffer.append(string);
            }
            n2 = n += 32;
        }
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

    public static void cfr_renamed_4563(String arg0, boolean arg1, sprvva arg2, StringBuffer arg3) {
        String string = System.getProperty(sprieba.cfr_renamed_9("^\u007f\\s\u001ceWfSdSb]d"));
        if (arg2 instanceof sprbne) {
            StringBuffer stringBuffer;
            Enumeration enumeration = ((sprbne)arg2).cfr_renamed_329();
            String string2 = new StringBuilder().insert(0, arg0).append(cfr_renamed_4).toString();
            arg3.append(arg0);
            if (arg2 instanceof sprjve) {
                StringBuffer stringBuffer2 = arg3;
                stringBuffer = stringBuffer2;
                stringBuffer2.append(sprosc.cfr_renamed_9("!o1\n0O\u0012_\u0006D\u0000O"));
            } else if (arg2 instanceof sprpse) {
                StringBuffer stringBuffer3 = arg3;
                stringBuffer = stringBuffer3;
                stringBuffer3.append(sprieba.cfr_renamed_9("vS`6asCcWxQs"));
            } else {
                StringBuffer stringBuffer4 = arg3;
                stringBuffer = stringBuffer4;
                stringBuffer4.append(sprosc.cfr_renamed_9("0O\u0012_\u0006D\u0000O"));
            }
            stringBuffer.append(string);
            while (enumeration.hasMoreElements()) {
                Object e = enumeration.nextElement();
                if (e == null || e.equals(sprume.cfr_renamed_3)) {
                    arg3.append(string2);
                    arg3.append(sprieba.cfr_renamed_9("|C~Z"));
                    arg3.append(string);
                    continue;
                }
                String string3 = string2;
                if (e instanceof sprvva) {
                    sprcje.cfr_renamed_4563(string3, arg1, (sprvva)e, arg3);
                    continue;
                }
                sprcje.cfr_renamed_4563(string3, arg1, ((spra)e).cfr_renamed_119(), arg3);
            }
        } else {
            if (arg2 instanceof spryte) {
                spryte spryte2;
                sprvva sprvva2;
                String string4 = new StringBuilder().insert(0, arg0).append(cfr_renamed_4).toString();
                arg3.append(arg0);
                StringBuffer stringBuffer = arg3;
                if (arg2 instanceof sprdpe) {
                    stringBuffer.append(sprosc.cfr_renamed_9("!o1\n7K\u0004M\u0006NCq"));
                    sprvva2 = arg2;
                } else {
                    stringBuffer.append(sprieba.cfr_renamed_9("fwUqWr\u0012M"));
                    sprvva2 = arg2;
                }
                spryte spryte3 = spryte2 = (spryte)sprvva2;
                arg3.append(Integer.toString(spryte3.cfr_renamed_312()));
                arg3.append(']');
                if (!spryte3.cfr_renamed_4567()) {
                    arg3.append(sprosc.cfr_renamed_9("Cc.z/c c7\n"));
                }
                arg3.append(string);
                if (spryte2.cfr_renamed_29()) {
                    arg3.append(string4);
                    arg3.append(sprieba.cfr_renamed_9("S\u007fFfO"));
                    arg3.append(string);
                    return;
                }
                sprcje.cfr_renamed_4563(string4, arg1, spryte2.cfr_renamed_2456(), arg3);
                return;
            }
            if (arg2 instanceof sprere) {
                StringBuffer stringBuffer;
                Enumeration enumeration = ((sprere)arg2).cfr_renamed_329();
                String string5 = new StringBuilder().insert(0, arg0).append(cfr_renamed_4).toString();
                arg3.append(arg0);
                StringBuffer stringBuffer5 = arg3;
                if (arg2 instanceof sprgve) {
                    stringBuffer5.append(sprosc.cfr_renamed_9("h&xCy\u0006^"));
                    stringBuffer = arg3;
                } else {
                    stringBuffer5.append(sprieba.cfr_renamed_9("RwD\u0012EWb"));
                    stringBuffer = arg3;
                }
                stringBuffer.append(string);
                while (enumeration.hasMoreElements()) {
                    Object e = enumeration.nextElement();
                    if (e == null) {
                        arg3.append(string5);
                        arg3.append(sprosc.cfr_renamed_9("-\u007f/f"));
                        arg3.append(string);
                        continue;
                    }
                    String string6 = string5;
                    if (e instanceof sprvva) {
                        sprcje.cfr_renamed_4563(string6, arg1, (sprvva)e, arg3);
                        continue;
                    }
                    sprcje.cfr_renamed_4563(string6, arg1, ((spra)e).cfr_renamed_119(), arg3);
                }
            } else {
                if (arg2 instanceof sprxue) {
                    boolean bl;
                    sprxue sprxue2 = (sprxue)arg2;
                    StringBuffer stringBuffer = arg3;
                    if (arg2 instanceof sprnle) {
                        StringBuffer stringBuffer6 = arg3;
                        stringBuffer.append(arg0 + sprieba.cfr_renamed_9("pS`6qy\\eFdGuFsV6}uFsF6ab@\u007f\\q") + "[" + sprxue2.cfr_renamed_186().length + sprosc.cfr_renamed_9(">\n"));
                        bl = arg1;
                    } else {
                        stringBuffer.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("vS`6}uFsF6ab@\u007f\\q")).append("[").append(sprxue2.cfr_renamed_186().length).append(sprosc.cfr_renamed_9(">\n")).toString());
                        bl = arg1;
                    }
                    if (bl) {
                        arg3.append(sprcje.cfr_renamed_4565(arg0, sprxue2.cfr_renamed_186()));
                        return;
                    }
                    arg3.append(string);
                    return;
                }
                if (arg2 instanceof sprtzd) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("YP|WuF_Vs\\b[p[s@>")).append(((sprtzd)arg2).cfr_renamed_19()).append(")").append(string).toString());
                    return;
                }
                if (arg2 instanceof sprnpe) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprosc.cfr_renamed_9("!E\fF\u0006K\r\u0002")).append(((sprnpe)arg2).cfr_renamed_587()).append(")").append(string).toString());
                    return;
                }
                if (arg2 instanceof sprooe) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("{xFsUs@>")).append(((sprooe)arg2).cfr_renamed_97()).append(")").append(string).toString());
                    return;
                }
                if (arg2 instanceof sprmra) {
                    sprmra sprmra2 = (sprmra)arg2;
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprosc.cfr_renamed_9("'o1\n!C\u0017\n0^\u0011C\rM")).append("[").append(sprmra2.cfr_renamed_81().length).append(sprieba.cfr_renamed_9("\u001e6")).append(sprmra2.cfr_renamed_106()).append(sprosc.cfr_renamed_9(">\n")).toString());
                    StringBuffer stringBuffer = arg3;
                    if (arg1) {
                        stringBuffer.append(sprcje.cfr_renamed_4565(arg0, sprmra2.cfr_renamed_81()));
                        return;
                    }
                    stringBuffer.append(string);
                    return;
                }
                if (arg2 instanceof sprcae) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("{W\u0007EFd[xU>")).append(((sprcae)arg2).cfr_renamed_314()).append(sprosc.cfr_renamed_9("J\n")).append(string).toString());
                    return;
                }
                if (arg2 instanceof sprxte) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("CfP\nEFd[xU>")).append(((sprxte)arg2).cfr_renamed_314()).append(sprosc.cfr_renamed_9("J\n")).append(string).toString());
                    return;
                }
                if (arg2 instanceof spraoe) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("bd[xFwPzWEFd[xU>")).append(((spraoe)arg2).cfr_renamed_314()).append(sprosc.cfr_renamed_9("J\n")).append(string).toString());
                    return;
                }
                if (arg2 instanceof sprrue) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("d\u007fA\u007fPzWEFd[xU>")).append(((sprrue)arg2).cfr_renamed_314()).append(sprosc.cfr_renamed_9("J\n")).append(string).toString());
                    return;
                }
                if (arg2 instanceof sprmne) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("p[bEFd[xU>")).append(((sprmne)arg2).cfr_renamed_314()).append(sprosc.cfr_renamed_9("J\n")).append(string).toString());
                    return;
                }
                if (arg2 instanceof sprgme) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("f \u0003EFd[xU>")).append(((sprgme)arg2).cfr_renamed_314()).append(sprosc.cfr_renamed_9("J\n")).append(string).toString());
                    return;
                }
                if (arg2 instanceof sprgpe) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("gBqB[{W>")).append(((sprgpe)arg2).cfr_renamed_2147()).append(sprosc.cfr_renamed_9("J\n")).append(string).toString());
                    return;
                }
                if (arg2 instanceof sprrpe) {
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("us\\s@w^\u007fHsVB[{W>")).append(((sprrpe)arg2).cfr_renamed_2147()).append(sprosc.cfr_renamed_9("J\n")).append(string).toString());
                    return;
                }
                if (arg2 instanceof spriqe) {
                    arg3.append(sprcje.cfr_renamed_4568("BER", arg0, arg1, arg2, string));
                    return;
                }
                if (arg2 instanceof sprgwe) {
                    arg3.append(sprcje.cfr_renamed_4568("DER", arg0, arg1, arg2, string));
                    return;
                }
                sprvva sprvva3 = arg2;
                if (arg2 instanceof sprune) {
                    sprune sprune2 = (sprune)sprvva3;
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprieba.cfr_renamed_9("RwD\u0012S\\c_s@wFsV>")).append(sprune2.cfr_renamed_97()).append(")").append(string).toString());
                    return;
                }
                if (sprvva3 instanceof sprhwe) {
                    sprhwe sprhwe2 = (sprhwe)arg2;
                    arg3.append(new StringBuilder().insert(0, arg0).append(sprosc.cfr_renamed_9("o\u001b^\u0006X\rK\u000f\n")).append(string).toString());
                    String string7 = new StringBuilder().insert(0, arg0).append(cfr_renamed_4).toString();
                    if (sprhwe2.cfr_renamed_4569() != null) {
                        arg3.append(new StringBuilder().insert(0, string7).append(sprieba.cfr_renamed_9("v\u007f@sQb\u0012DWpWdWxQs\b6")).append(sprhwe2.cfr_renamed_4569().cfr_renamed_19()).append(string).toString());
                    }
                    if (sprhwe2.cfr_renamed_4570() != null) {
                        arg3.append(new StringBuilder().insert(0, string7).append(sprosc.cfr_renamed_9("*D\u0007C\u0011O\u0000^Cx\u0006L\u0006X\u0006D\u0000OY\n")).append(sprhwe2.cfr_renamed_4570().toString()).append(string).toString());
                    }
                    if (sprhwe2.cfr_renamed_4571() != null) {
                        sprcje.cfr_renamed_4563(string7, arg1, sprhwe2.cfr_renamed_4571(), arg3);
                    }
                    arg3.append(new StringBuilder().insert(0, string7).append(sprieba.cfr_renamed_9("wxQyV\u007f\\q\b6")).append(sprhwe2.cfr_renamed_4572()).append(string).toString());
                    sprcje.cfr_renamed_4563(string7, arg1, sprhwe2.cfr_renamed_4573(), arg3);
                    return;
                }
                arg3.append(new StringBuilder().insert(0, arg0).append(arg2.toString()).append(string).toString());
            }
        }
    }

    public static String cfr_renamed_2138(Object arg0) {
        return sprcje.cfr_renamed_4574(arg0, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String cfr_renamed_4568(String arg0, String arg1, boolean arg2, sprvva arg3, String arg4) {
        sprgwe sprgwe2 = (sprgwe)arg3;
        StringBuffer stringBuffer = new StringBuffer();
        if (!sprgwe2.cfr_renamed_4575()) {
            return new StringBuilder().insert(0, arg1).append(arg0).append(sprieba.cfr_renamed_9("6sfBz[uSb[y\\EBsQ\u007fT\u007fQM")).append(sprgwe2.cfr_renamed_4576()).append(sprosc.cfr_renamed_9("wC\u0002")).append(new String(sprmma.cfr_renamed_485(sprgwe2.cfr_renamed_4577()))).append(")").append(arg4).toString();
        }
        try {
            sprbne sprbne2 = sprbne.cfr_renamed_23(sprgwe2.cfr_renamed_4578(16));
            stringBuffer.append(arg1 + arg0 + sprosc.cfr_renamed_9("\n\"Z\u0013F\nI\u0002^\nE\ry\u0013O\u0000C\u0005C\u0000q") + sprgwe2.cfr_renamed_4576() + "]" + arg4);
            Enumeration enumeration = sprbne2.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprcje.cfr_renamed_4563(new StringBuilder().insert(0, arg1).append(cfr_renamed_4).toString(), arg2, (sprvva)enumeration.nextElement(), stringBuffer);
            }
            return stringBuffer.toString();
        }
        catch (IOException iOException) {
            stringBuffer.append(iOException);
        }
        return stringBuffer.toString();
    }

    public static String cfr_renamed_4574(Object arg0, boolean arg1) {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer();
        if (arg0 instanceof sprvva) {
            sprcje.cfr_renamed_4563("", arg1, (sprvva)arg0, stringBuffer2);
            stringBuffer = stringBuffer2;
        } else if (arg0 instanceof spra) {
            sprcje.cfr_renamed_4563("", arg1, ((spra)arg0).cfr_renamed_119(), stringBuffer2);
            stringBuffer = stringBuffer2;
        } else {
            return new StringBuilder().insert(0, sprieba.cfr_renamed_9("GxYx]a\\6]tXsQb\u0012bKfW6")).append(arg0.toString()).toString();
        }
        return stringBuffer.toString();
    }
}

