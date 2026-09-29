/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgtja;
import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.sprkgr;
import com.spire.presentation.packages.sprlln;
import com.spire.presentation.packages.sprmija;
import com.spire.presentation.packages.sprntga;
import com.spire.presentation.packages.sprnxga;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprqwq;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprspga;
import com.spire.presentation.packages.sprssja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruln;
import com.spire.presentation.packages.sprupn;
import com.spire.presentation.packages.sprvfja;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprywq;
import java.util.Iterator;

@sprtea
public class sprbin {
    private sprlln cfr_renamed_91;
    private Object cfr_renamed_0;
    private String cfr_renamed_1;
    private Object cfr_renamed_2;
    private String cfr_renamed_3;
    private byte cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_12882() {
        if (this.cfr_renamed_8155().cfr_renamed_4 != null && this.cfr_renamed_8155().cfr_renamed_4.cfr_renamed_12883() != null && this.cfr_renamed_8155().cfr_renamed_4.cfr_renamed_12883().cfr_renamed_12303() != null && sprupn.cfr_renamed_9("\u0010F\u0017\\\u0019L\u001a]9H\u001aH\u0013L\u0019L\u001a]").equals(this.cfr_renamed_8155().cfr_renamed_4.cfr_renamed_12883().cfr_renamed_12303().cfr_renamed_12286())) {
            Iterator iterator = this.cfr_renamed_8155().cfr_renamed_4.cfr_renamed_12883().cfr_renamed_12303().cfr_renamed_12884().iterator();
            block0: while (true) {
                Iterator iterator2 = iterator;
                while (iterator2.hasNext()) {
                    int n;
                    Object object;
                    String[] stringArray;
                    int n2;
                    sprkgr sprkgr2 = (sprkgr)iterator.next();
                    if (!sprraia.cfr_renamed_11730(sprkgr2.cfr_renamed_313(), this.cfr_renamed_1)) {
                        iterator2 = iterator;
                        continue;
                    }
                    if (this.cfr_renamed_91 == sprlln.cfr_renamed_93) {
                        if (this.cfr_renamed_2 != null) {
                            sprkgr2.cfr_renamed_12885(((sprgtja)this.cfr_renamed_2).cfr_renamed_11932().cfr_renamed_12886("s", sprvfja.cfr_renamed_12042()));
                            continue block0;
                        }
                        sprkgr2.cfr_renamed_12885(sprpkja.cfr_renamed_12887(this.cfr_renamed_2));
                        continue block0;
                    }
                    if (this.cfr_renamed_91 == sprlln.cfr_renamed_102) {
                        if (this.cfr_renamed_2 == null) continue block0;
                        n2 = 0;
                        stringArray = (String[])this.cfr_renamed_2;
                        object = stringArray;
                        int n3 = ((String[])object).length;
                        int n4 = n = 0;
                        while (true) {
                            if (n4 >= n3) continue block0;
                            String string = object[n];
                            sprkgr2.cfr_renamed_12884().cfr_renamed_12320(n2++).cfr_renamed_12885(string);
                            n4 = ++n;
                        }
                    }
                    if (this.cfr_renamed_91 == sprlln.cfr_renamed_4) {
                        int n5;
                        if (this.cfr_renamed_2 == null) continue block0;
                        n2 = 0;
                        stringArray = (String[])this.cfr_renamed_2;
                        if (!sprkgr2.cfr_renamed_12888() || sprkgr2.cfr_renamed_12303() == null) continue block0;
                        object = sprkgr2.cfr_renamed_12303().cfr_renamed_12884();
                        String[] stringArray2 = stringArray;
                        n = stringArray.length;
                        int n6 = n5 = 0;
                        while (true) {
                            if (n6 >= n) continue block0;
                            String string = stringArray2[n5];
                            ((sprnxga)object).cfr_renamed_12320(n2++).cfr_renamed_12885(string);
                            n6 = ++n5;
                        }
                    }
                    if (this.cfr_renamed_91 == sprlln.cfr_renamed_152 || this.cfr_renamed_91 == sprlln.cfr_renamed_107 || this.cfr_renamed_91 == sprlln.cfr_renamed_1 || this.cfr_renamed_91 == sprlln.cfr_renamed_2 || this.cfr_renamed_91 == sprlln.cfr_renamed_79 || this.cfr_renamed_91 == sprlln.cfr_renamed_3 || this.cfr_renamed_91 == sprlln.cfr_renamed_86) {
                        sprkgr2.cfr_renamed_12885(sprpkja.cfr_renamed_12889(this.cfr_renamed_2, sprvfja.cfr_renamed_12042()));
                        continue block0;
                    }
                    if (this.cfr_renamed_91 != sprlln.cfr_renamed_132) continue block0;
                    sprkgr2.cfr_renamed_12885(sprpkja.cfr_renamed_12889(this.cfr_renamed_2, sprvfja.cfr_renamed_12042()).toLowerCase());
                    continue block0;
                }
                break;
            }
        }
    }

    private /* synthetic */ boolean cfr_renamed_12890(Object[] arg0) throws Exception {
        if (!this.cfr_renamed_12891()) {
            if (arg0[0] == null || arg0[0].getClass() == Boolean.TYPE || arg0[0].getClass() == sprgtja.class) {
                if (arg0[0] != null) {
                    arg0[0] = sprpkja.cfr_renamed_12892(-1, sprvfja.cfr_renamed_12042());
                }
            } else if (arg0[0] != null && arg0[0].getClass() == Character.TYPE) {
                Object[] objectArray = new Object[1];
                objectArray[0] = (int)((Character)arg0[0]).charValue();
                arg0[0] = sprraia.cfr_renamed_11562(sprvfja.cfr_renamed_12042().toString(), objectArray);
            } else if (arg0[0] == "") {
                arg0[0] = null;
            } else if (arg0[0].getClass() != Double.TYPE) {
                arg0[0] = sprpkja.cfr_renamed_12889(arg0[0], sprvfja.cfr_renamed_12042());
            } else if (arg0[0].getClass() == Double.TYPE) {
                Object[] objectArray = new Object[1];
                objectArray[0] = (int)sprrgga.cfr_renamed_12793((Double)arg0[0]);
                arg0[0] = sprraia.cfr_renamed_11562(sprvfja.cfr_renamed_12042().toString(), objectArray);
            }
            return true;
        }
        throw new Exception(sprhky.cfr_renamed_9("\b\u00159]/\r9\u001e5\u001b5\u00188]:\u00140\u0018|\u0014/].\u0018=\u0019|\u00122\u0011%S"));
    }

    @sprtea
    public void cfr_renamed_12893(spruln arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public boolean cfr_renamed_12894() {
        return (this.cfr_renamed_4 & 0xFF & 8) >> 3 != 0;
    }

    public void cfr_renamed_12895(boolean arg0) {
        this.cfr_renamed_4 = (byte)(this.cfr_renamed_4 & 0xFF & 0xF7 | (arg0 ? 1 : 0) << 3);
    }

    private /* synthetic */ boolean cfr_renamed_12896(Object[] arg0) throws Exception {
        if (!(arg0[0] != null && arg0[0].getClass() != Boolean.TYPE || this.cfr_renamed_12891())) {
            return true;
        }
        if (this.cfr_renamed_12891()) {
            throw new Exception(sprupn.cfr_renamed_9(" A\u0011\t\u0007Y\u0011J\u001dO\u001dL\u0010\t\u0012@\u0018LT@\u0007\t\u0006L\u0015MTF\u001aE\r\u0007"));
        }
        throw new Exception(sprhky.cfr_renamed_9("9=\t=]5\u000e|\u00142\u000b=\u00115\u0019"));
    }

    private /* synthetic */ void cfr_renamed_12897(sprnxga arg0, String arg1, Object arg2, sprbin arg3) {
        int n;
        String string = "";
        String string2 = "";
        String string3 = "";
        String string4 = "";
        boolean bl = false;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            boolean bl2;
            block15: {
                for (sprkgr sprkgr2 : arg0.cfr_renamed_12320(n).cfr_renamed_12884()) {
                    sprntga sprntga2;
                    if ("element".equals(sprkgr2.cfr_renamed_12286()) && (sprntga2 = sprkgr2.cfr_renamed_82()).cfr_renamed_12311("name") != null && sprraia.cfr_renamed_11730(sprntga2.cfr_renamed_12311("name").cfr_renamed_97(), arg1)) {
                        if (sprntga2.cfr_renamed_12311(sprupn.cfr_renamed_9("\u001a@\u0018E\u0015K\u0018L")) != null) {
                            string = sprntga2.cfr_renamed_12311(sprhky.cfr_renamed_9("2\u00140\u0011=\u001f0\u0018")).cfr_renamed_97();
                        }
                        if (sprntga2.cfr_renamed_12311(sprupn.cfr_renamed_9("\u0019HNM\u001dZ\u0004E\u0015P:H\u0019L")) != null) {
                            string2 = sprntga2.cfr_renamed_12311(sprhky.cfr_renamed_9("1\u001cf\u00195\u000e,\u0011=\u0004\u0012\u001c1\u0018")).cfr_renamed_97();
                        }
                        if (sprntga2.cfr_renamed_12311(sprupn.cfr_renamed_9("D\u0015\u0013\u0006L\u0015M;G\u0018P")) != null) {
                            string3 = sprntga2.cfr_renamed_12311(sprhky.cfr_renamed_9("\u0010=G.\u0018=\u0019\u0013\u00130\u0004")).cfr_renamed_97();
                        }
                        for (sprkgr sprkgr3 : sprkgr2.cfr_renamed_12884()) {
                            if (!"simpleType".equals(sprkgr3.cfr_renamed_12286()) && !"complexType".equals(sprkgr3.cfr_renamed_12286())) continue;
                            for (sprkgr sprkgr4 : sprkgr3.cfr_renamed_12884()) {
                                if ("restriction".equals(sprkgr4.cfr_renamed_12286())) {
                                    if (sprkgr4.cfr_renamed_82().cfr_renamed_12311("base") != null) {
                                        string4 = sprkgr4.cfr_renamed_82().cfr_renamed_12311("base").cfr_renamed_97();
                                    }
                                    string4 = string4.substring(4);
                                    continue;
                                }
                                if (!"complexContent".equals(sprkgr4.cfr_renamed_12286())) continue;
                                for (sprkgr sprkgr5 : sprkgr4.cfr_renamed_12884()) {
                                    if (!"extension".equals(sprkgr5.cfr_renamed_12286())) continue;
                                    if (sprkgr5.cfr_renamed_82().cfr_renamed_12311("base") != null) {
                                        string4 = sprkgr5.cfr_renamed_82().cfr_renamed_12311("base").cfr_renamed_97();
                                    }
                                    string4 = string4.substring(4);
                                }
                            }
                        }
                        if (sprraia.cfr_renamed_12280(string)) {
                            string = "false";
                        }
                        if (sprraia.cfr_renamed_12280(string3)) {
                            string3 = "false";
                        }
                        this.cfr_renamed_12898(arg1, string, string3, string2, string4, arg2, arg3);
                        bl = true;
                    }
                    if (!bl) continue;
                    bl2 = bl;
                    break block15;
                }
                bl2 = bl;
            }
            if (bl2) {
                return;
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ Object cfr_renamed_12899(sprlln arg0, Object arg1) {
        if (arg0 == sprlln.cfr_renamed_152 || arg0 == sprlln.cfr_renamed_107 || arg0 == sprlln.cfr_renamed_1 || arg0 == sprlln.cfr_renamed_2 || arg0 == sprlln.cfr_renamed_86 || arg0 == sprlln.cfr_renamed_4 || arg0 == sprlln.cfr_renamed_102) {
            if (arg1 == "") {
                return null;
            }
            return arg1;
        }
        if (arg0 == sprlln.cfr_renamed_132) {
            if (!sprraia.cfr_renamed_12280(arg1.toString())) {
                return sprpkja.cfr_renamed_12900(arg1);
            }
        } else {
            if (arg0 == sprlln.cfr_renamed_79 || arg0 == sprlln.cfr_renamed_3) {
                int n = 0;
                double d = 0.0;
                long l = 0L;
                int[] nArray = new int[1];
                nArray[0] = n;
                int[] nArray2 = nArray;
                boolean bl = sprmija.cfr_renamed_12901(arg1.toString(), nArray2) && !sprraia.cfr_renamed_12280(arg1.toString());
                n = nArray2[0];
                if (bl) {
                    return n;
                }
                long[] lArray = new long[1];
                lArray[0] = l;
                long[] lArray2 = lArray;
                boolean bl2 = sprraja.cfr_renamed_12902(arg1.toString(), lArray2) && !sprraia.cfr_renamed_12280(arg1.toString());
                l = lArray2[0];
                if (bl2) {
                    return l;
                }
                double[] dArray = new double[1];
                dArray[0] = d;
                double[] dArray2 = dArray;
                boolean bl3 = sprssja.cfr_renamed_12903(arg1.toString(), dArray2) && !sprraia.cfr_renamed_12280(arg1.toString());
                d = dArray2[0];
                if (bl3) {
                    return d;
                }
                if (arg1 == "") {
                    return null;
                }
                return arg1;
            }
            if (arg0 == sprlln.cfr_renamed_93 && !sprraia.cfr_renamed_12280(arg1.toString())) {
                return sprpkja.cfr_renamed_12904(arg1);
            }
        }
        return null;
    }

    private /* synthetic */ boolean cfr_renamed_12905(Object[] arg0) throws Exception {
        if (arg0[0] != null && arg0[0].getClass() == String.class && !this.cfr_renamed_12891()) {
            if (!((String)arg0[0]).contains(sprupn.cfr_renamed_9("A\u0000]\u0004\u0013[\u0006")) && !((String)arg0[0]).contains(sprhky.cfr_renamed_9("4\t(\r/GsR"))) {
                arg0[0] = sprspga.cfr_renamed_12906(arg0[0].toString());
            }
            if (arg0[0].toString().contains(sprupn.cfr_renamed_9("A\u0000]\u0004\u0013[\u0006")) || arg0[0].toString().contains(sprhky.cfr_renamed_9("4\t(\r/GsR"))) {
                String[] stringArray = new String[2];
                stringArray[0] = arg0[0].toString();
                stringArray[1] = arg0[0].toString();
                arg0[0] = stringArray;
                return true;
            }
            String[] stringArray = new String[2];
            stringArray[0] = sprupn.cfr_renamed_9("A\u0000]\u0004\u0013[\u0006") + arg0[0];
            stringArray[1] = new StringBuilder().insert(0, sprhky.cfr_renamed_9("\u0015(\t,GsR")).append(arg0[0]).toString();
            arg0[0] = stringArray;
            return true;
        }
        if (arg0[0] != null && arg0[0].getClass() == String[].class && !this.cfr_renamed_12891() && ((String[])arg0[0]).length == 2) {
            String[] stringArray = (String[])arg0[0];
            if (stringArray[0] != null && !stringArray[0].contains(sprupn.cfr_renamed_9("A\u0000]\u0004\u0013[\u0006")) && !stringArray[0].contains(sprhky.cfr_renamed_9("4\t(\r/GsR"))) {
                stringArray[0] = sprspga.cfr_renamed_12906(stringArray[0].toString());
                String[] stringArray2 = new String[2];
                stringArray2[0] = new StringBuilder().insert(0, sprupn.cfr_renamed_9("A\u0000]\u0004\u0013[\u0006")).append(stringArray[0]).toString();
                stringArray2[1] = stringArray[1];
                arg0[0] = stringArray2;
                return true;
            }
            String[] stringArray3 = new String[2];
            stringArray3[0] = stringArray[0];
            stringArray3[1] = stringArray[1];
            arg0[0] = stringArray3;
            return true;
        }
        if (this.cfr_renamed_12891()) {
            throw new Exception(sprhky.cfr_renamed_9("\b\u00159]/\r9\u001e5\u001b5\u00188]:\u00140\u0018|\u0014/].\u0018=\u0019|\u00122\u0011%S"));
        }
        if (arg0[0] != null) {
            throw new Exception(sprupn.cfr_renamed_9("}\rY\u0011\t\u0019@\u0007D\u0015]\u0017A"));
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_12898(String string, String string2, String string3, String string4, String string5, Object object, sprbin sprbin2) {
        void arg5;
        void arg6;
        block3: {
            void v1;
            int n;
            void arg2;
            void arg3;
            void arg0;
            arg6.cfr_renamed_1 = arg0;
            arg6.cfr_renamed_3 = arg3;
            arg6.cfr_renamed_12895(!Boolean.parseBoolean(string2));
            arg6.cfr_renamed_12907(Boolean.parseBoolean((String)arg2));
            arg6.cfr_renamed_3 = arg3;
            sprlln[] sprllnArray = sprlln.cfr_renamed_205();
            int n2 = sprllnArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                String arg4;
                sprlln sprlln2 = sprllnArray[n];
                if (sprhky.cfr_renamed_9("(\u000e1").equals(arg4)) {
                    arg4 = "Url";
                }
                if (sprraia.cfr_renamed_11730(arg4, sprlln.cfr_renamed_12908(sprlln2))) {
                    v1 = arg6;
                    arg6.cfr_renamed_91 = sprlln2;
                    break block3;
                }
                n3 = ++n;
            }
            v1 = arg6;
        }
        v1.cfr_renamed_2 = this.cfr_renamed_12899(arg6.cfr_renamed_91, arg5);
    }

    public String cfr_renamed_12909() {
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_19() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ boolean cfr_renamed_12910(Object[] arg0) throws Exception {
        if (!this.cfr_renamed_12891()) {
            if (arg0[0] != null && arg0[0].getClass() == sprgtja.class) {
                arg0[0] = ((sprgtja)arg0[0]).cfr_renamed_11932().cfr_renamed_12886("s", sprvfja.cfr_renamed_12042());
            } else if (arg0[0] != null && arg0[0].getClass() == Boolean.TYPE) {
                arg0[0] = arg0[0].toString().toLowerCase();
            } else if (arg0[0] != null && arg0[0].getClass() == Character.TYPE) {
                arg0[0] = (int)((Character)arg0[0]).charValue();
            } else if (arg0[0] == "") {
                arg0[0] = null;
            }
            return true;
        }
        if (this.cfr_renamed_12891()) {
            throw new Exception(sprupn.cfr_renamed_9(" A\u0011\t\u0007Y\u0011J\u001dO\u001dL\u0010\t\u0012@\u0018LT@\u0007\t\u0006L\u0015MTF\u001aE\r\u0007"));
        }
        return false;
    }

    @sprtea
    public spruln cfr_renamed_12911(sprqwq arg0, sprywq arg1) {
        Object object = null;
        spruln spruln2 = new spruln();
        new spruln().cfr_renamed_4 = arg1;
        if (new spruln().cfr_renamed_4.cfr_renamed_12883() != null && arg1.cfr_renamed_12883().cfr_renamed_12303() != null && sprhky.cfr_renamed_9("8\u0012?\b1\u00182\t\u0011\u001c2\u001c;\u00181\u00182\t").equals(arg1.cfr_renamed_12883().cfr_renamed_12303().cfr_renamed_12286())) {
            Iterator iterator;
            Iterator iterator2 = iterator = arg1.cfr_renamed_12883().cfr_renamed_12303().cfr_renamed_12884().iterator();
            while (iterator2.hasNext()) {
                sprbin sprbin2;
                sprkgr sprkgr2;
                Iterator iterator3;
                sprvrx<String> sprvrx2;
                sprnxga sprnxga2;
                sprkgr sprkgr3 = (sprkgr)iterator.next();
                sprbin sprbin3 = new sprbin();
                if (sprkgr3.cfr_renamed_12888() && sprkgr3.cfr_renamed_12884().cfr_renamed_11861() > 1) {
                    sprnxga2 = sprkgr3.cfr_renamed_12884();
                    sprvrx2 = new sprvrx<String>();
                    Iterator iterator4 = sprnxga2.iterator();
                    while (iterator4.hasNext()) {
                        sprkgr2 = (sprkgr)iterator3.next();
                        iterator4 = iterator3;
                        sprvrx2.add(sprkgr2.cfr_renamed_12912());
                    }
                    object = sprvrx2.toArray();
                    sprbin2 = this;
                } else {
                    if (sprkgr3.cfr_renamed_12888() && sprkgr3.cfr_renamed_12884().cfr_renamed_11861() == 1 && sprkgr3.cfr_renamed_12303().cfr_renamed_12271() != 3) {
                        sprnxga2 = sprkgr3.cfr_renamed_12303().cfr_renamed_12884();
                        if (sprnxga2.cfr_renamed_11861() == 0 || sprnxga2.cfr_renamed_11861() == 1 && sprnxga2.cfr_renamed_12320(0).cfr_renamed_12271() == 3) {
                            object = sprkgr3.cfr_renamed_12303().cfr_renamed_12912();
                        } else {
                            sprvrx2 = new sprvrx();
                            iterator3 = sprnxga2.iterator();
                            while (iterator3.hasNext()) {
                                sprkgr2 = (sprkgr)iterator3.next();
                                if (!(sprkgr2 instanceof sprqwq) || ((sprqwq)sprkgr2).cfr_renamed_29()) continue;
                                sprvrx2.add(sprkgr2.cfr_renamed_12912());
                            }
                            object = sprvrx2.toArray();
                        }
                    } else {
                        object = sprkgr3.cfr_renamed_12912();
                    }
                    sprbin2 = this;
                }
                sprbin2.cfr_renamed_12897(arg0.cfr_renamed_12884(), sprkgr3.cfr_renamed_313(), object, sprbin3);
                iterator2 = iterator;
                spruln2.cfr_renamed_12913(sprbin3);
            }
        }
        return spruln2;
    }

    public void cfr_renamed_12907(boolean arg0) {
        this.cfr_renamed_4 = (byte)(this.cfr_renamed_4 & 0xFF & 0xFB | (arg0 ? 1 : 0) << 2);
    }

    private /* synthetic */ boolean cfr_renamed_12914(Object[] arg0) throws Exception {
        if (!this.cfr_renamed_12891()) {
            if (arg0[0] != null && arg0[0].getClass() == sprgtja.class) {
                arg0[0] = ((sprgtja)arg0[0]).cfr_renamed_11932().cfr_renamed_12886("s", sprvfja.cfr_renamed_12042());
            } else if (arg0[0] != null && arg0[0].getClass() == Boolean.TYPE) {
                arg0[0] = arg0[0].toString().toLowerCase();
            } else if (arg0[0] != null && arg0[0].getClass() == Character.TYPE) {
                Object[] objectArray = new Object[1];
                objectArray[0] = (int)((Character)arg0[0]).charValue();
                arg0[0] = sprraia.cfr_renamed_11562(sprvfja.cfr_renamed_12042().toString(), objectArray);
            } else if (arg0[0] != null && arg0[0].getClass() != String.class) {
                arg0[0] = sprpkja.cfr_renamed_12889(arg0[0], sprvfja.cfr_renamed_12042());
            } else if (arg0[0] == "") {
                arg0[0] = null;
            }
            return true;
        }
        throw new Exception(sprupn.cfr_renamed_9(" A\u0011\t\u0007Y\u0011J\u001dO\u001dL\u0010\t\u0012@\u0018LT@\u0007\t\u0006L\u0015MTF\u001aE\r\u0007"));
    }

    public sprlln cfr_renamed_324() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ boolean cfr_renamed_12915(Object[] arg0) throws Exception {
        if (!(arg0[0] != null && arg0[0].getClass() != sprgtja.class && arg0[0] != "" || this.cfr_renamed_12891())) {
            if (arg0[0] == "") {
                arg0[0] = null;
            }
            return true;
        }
        if (this.cfr_renamed_12891()) {
            throw new Exception(sprhky.cfr_renamed_9("\b\u00159]/\r9\u001e5\u001b5\u00188]:\u00140\u0018|\u0014/].\u0018=\u0019|\u00122\u0011%S"));
        }
        throw new Exception(sprupn.cfr_renamed_9("m\u0015]\u0015\t\u001dZT@\u001a_\u0015E\u001dM"));
    }

    public boolean cfr_renamed_12891() {
        return (this.cfr_renamed_4 & 0xFF & 4) >> 2 != 0;
    }

    private /* synthetic */ boolean cfr_renamed_12916(Object[] arg0) throws Exception {
        if (arg0[0] != null && arg0[0].getClass() == String[].class && ((String[])arg0[0]).length <= 3 && !this.cfr_renamed_12891()) {
            if (((String[])arg0[0]).length == 0) {
                arg0[0] = null;
            } else if (((String[])arg0[0]).length == 1) {
                String[] stringArray = new String[2];
                stringArray[0] = ((String[])arg0[0])[0];
                stringArray[1] = "";
                arg0[0] = stringArray;
            }
            return true;
        }
        if (this.cfr_renamed_12891()) {
            throw new Exception(sprhky.cfr_renamed_9("\b\u00159]/\r9\u001e5\u001b5\u00188]:\u00140\u0018|\u0014/].\u0018=\u0019|\u00122\u0011%S"));
        }
        if (arg0[0] != null && arg0[0] != "") {
            throw new Exception(sprupn.cfr_renamed_9("}\rY\u0011\t\u0019@\u0007D\u0015]\u0017A"));
        }
        return false;
    }

    public Object cfr_renamed_97() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public spruln cfr_renamed_8155() {
        return (spruln)this.cfr_renamed_0;
    }

    private /* synthetic */ boolean cfr_renamed_12917(Object[] arg0) throws Exception {
        if (this.cfr_renamed_91 == sprlln.cfr_renamed_152 || this.cfr_renamed_91 == sprlln.cfr_renamed_107 || this.cfr_renamed_91 == sprlln.cfr_renamed_1 || this.cfr_renamed_91 == sprlln.cfr_renamed_2) {
            return this.cfr_renamed_12914(arg0);
        }
        if (this.cfr_renamed_91 == sprlln.cfr_renamed_132) {
            return this.cfr_renamed_12896(arg0);
        }
        if (this.cfr_renamed_91 == sprlln.cfr_renamed_93) {
            return this.cfr_renamed_12915(arg0);
        }
        if (this.cfr_renamed_91 == sprlln.cfr_renamed_79 || this.cfr_renamed_91 == sprlln.cfr_renamed_3) {
            return this.cfr_renamed_12910(arg0);
        }
        if (this.cfr_renamed_91 == sprlln.cfr_renamed_4) {
            return this.cfr_renamed_12916(arg0);
        }
        if (this.cfr_renamed_91 == sprlln.cfr_renamed_102) {
            return this.cfr_renamed_12905(arg0);
        }
        if (this.cfr_renamed_91 == sprlln.cfr_renamed_86) {
            return this.cfr_renamed_12890(arg0);
        }
        return false;
    }

    public void cfr_renamed_12918(Object arg0) throws Exception {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg0;
        Object[] objectArray2 = objectArray;
        boolean bl = this.cfr_renamed_12917(objectArray2);
        arg0 = objectArray2[0];
        if (bl) {
            this.cfr_renamed_2 = arg0;
            this.cfr_renamed_12882();
        }
    }
}

