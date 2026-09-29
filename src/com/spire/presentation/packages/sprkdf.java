/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprahm;
import com.spire.presentation.packages.spraql;
import com.spire.presentation.packages.sprbjk;
import com.spire.presentation.packages.sprbxe;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfbf;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprgkz;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhum;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjhm;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprkye;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnbf;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtul;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprwgn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxxl;
import com.spire.presentation.packages.spryqm;
import com.spire.presentation.packages.sprywl;
import com.spire.presentation.packages.sprzfm;
import com.spire.presentation.packages.sprzhm;
import com.spire.presentation.packages.sprzql;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;

public class sprkdf {
    private List cfr_renamed_96;
    public static final int cfr_renamed_105 = 2;
    public static final int cfr_renamed_137 = 3;
    private int cfr_renamed_79;
    private int cfr_renamed_107;
    private int cfr_renamed_132;
    public sprigm cfr_renamed_102;
    private int cfr_renamed_93;
    private Locale cfr_renamed_86;
    private Map cfr_renamed_152;
    private sprlem cfr_renamed_112;
    private List cfr_renamed_119;
    public boolean cfr_renamed_91;
    private sprxxl cfr_renamed_0;
    public static final int cfr_renamed_1 = 2;
    public static final int cfr_renamed_2 = 1;
    public static final int cfr_renamed_3 = 0;
    private List cfr_renamed_4;

    public sprqxe cfr_renamed_5281(sprfbf arg0, BigInteger arg1, Date arg2, sprhgm arg3) throws sprahf {
        Object object;
        Object object2;
        sprxgf sprxgf2;
        sprktm sprktm2;
        sprxgf sprxgf3;
        sprddm sprddm2 = arg0.cfr_renamed_5282();
        sprahm sprahm2 = new sprahm(sprddm2, arg0.cfr_renamed_581());
        sprzfm sprzfm2 = null;
        if (this.cfr_renamed_79 > 0 || this.cfr_renamed_107 > 0 || this.cfr_renamed_93 > 0) {
            sprxgf3 = null;
            if (this.cfr_renamed_79 > 0) {
                sprxgf3 = new sprktm(this.cfr_renamed_79);
            }
            sprktm2 = null;
            if (this.cfr_renamed_107 > 0) {
                sprktm2 = new sprktm(this.cfr_renamed_107);
            }
            sprxgf2 = null;
            if (this.cfr_renamed_93 > 0) {
                sprxgf2 = new sprktm(this.cfr_renamed_93);
            }
            sprzfm2 = new sprzfm((sprktm)sprxgf3, sprktm2, (sprktm)sprxgf2);
        }
        sprxgf3 = null;
        if (this.cfr_renamed_91) {
            sprxgf3 = sprbxm.cfr_renamed_655(this.cfr_renamed_91);
        }
        sprktm2 = null;
        if (arg0.cfr_renamed_596() != null) {
            sprktm2 = new sprktm(arg0.cfr_renamed_596());
        }
        sprxgf2 = this.cfr_renamed_112;
        if (arg0.cfr_renamed_608() != null) {
            sprxgf2 = arg0.cfr_renamed_608();
        }
        sprhgm sprhgm2 = arg0.cfr_renamed_98();
        if (arg3 != null) {
            object2 = new sprgem();
            if (sprhgm2 != null) {
                Object object3 = object = sprhgm2.cfr_renamed_99();
                while (object3.hasMoreElements()) {
                    Enumeration enumeration = object;
                    object3 = enumeration;
                    ((sprgem)object2).cfr_renamed_5283(sprhgm2.cfr_renamed_5024(sprlem.cfr_renamed_23(enumeration.nextElement())));
                }
            }
            Object object4 = object = arg3.cfr_renamed_99();
            while (object4.hasMoreElements()) {
                Enumeration enumeration = object;
                object4 = enumeration;
                ((sprgem)object2).cfr_renamed_5283(arg3.cfr_renamed_5024(sprlem.cfr_renamed_23(enumeration.nextElement())));
            }
            sprhgm2 = ((sprgem)object2).cfr_renamed_31();
        }
        if (this.cfr_renamed_132 == 0) {
            sprjfn sprjfn2;
            sprjfn sprjfn3;
            if (this.cfr_renamed_86 == null) {
                sprjfn2 = sprjfn3;
                sprjfn3 = new sprjfn(arg2);
            } else {
                sprjfn2 = sprjfn3;
                sprjfn3 = new sprjfn(arg2, this.cfr_renamed_86);
            }
            object2 = sprjfn2;
        } else {
            object2 = this.cfr_renamed_5284(arg2);
        }
        object = new sprzhm((sprlem)sprxgf2, sprahm2, new sprktm(arg1), (sprjfn)object2, sprzfm2, (sprbxm)sprxgf3, sprktm2, this.cfr_renamed_102, sprhgm2);
        try {
            sprjn sprjn2;
            Object object5;
            sprzql sprzql2 = new sprzql();
            if (arg0.cfr_renamed_609()) {
                sprzql sprzql3 = sprzql2;
                sprzql3.cfr_renamed_5285(new sprtul(this.cfr_renamed_96));
                sprzql3.cfr_renamed_5202(new sprtul(this.cfr_renamed_119));
            }
            sprzql2.cfr_renamed_5286(new sprtul(this.cfr_renamed_4));
            if (!this.cfr_renamed_152.isEmpty()) {
                Object object6 = object5 = this.cfr_renamed_152.keySet().iterator();
                while (object6.hasNext()) {
                    sprjn2 = (sprlem)object5.next();
                    sprzql2.cfr_renamed_5287((sprlem)sprjn2, new sprtul((Collection)this.cfr_renamed_152.get(sprjn2)));
                    object6 = object5;
                }
            }
            sprzql2.cfr_renamed_5288(this.cfr_renamed_0);
            object5 = ((sprqqe)object).cfr_renamed_104("DER");
            sprjn2 = sprzql2.cfr_renamed_5289(new spraql(sprdl.cfr_renamed_1494, (byte[])object5), true);
            return new sprqxe((sprywl)sprjn2);
        }
        catch (sprlyl sprlyl2) {
            throw new sprahf(sprgkz.cfr_renamed_9("\u0004\u001a3\u00073H&\r/\r3\t5\u0001/\u000fa\u001c(\u0005$E2\u001c \u00051H5\u0007*\r/"), sprlyl2);
        }
        catch (IOException iOException) {
            throw new sprahf(sprbjk.cfr_renamed_9("v$P9C(Z3]|V2P3W5];\u00135]:\\"), iOException);
        }
    }

    public void cfr_renamed_5290(int arg0) {
        this.cfr_renamed_132 = arg0;
    }

    public sprkdf(sprxxl arg0, sprjj arg1, sprlem arg2) throws IllegalArgumentException, sprahf {
        this(arg0, arg1, arg2, false);
    }

    public void cfr_renamed_602(boolean arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_5291(sprigm arg0) {
        this.cfr_renamed_102 = arg0;
    }

    public void cfr_renamed_603(int arg0) {
        this.cfr_renamed_93 = arg0;
    }

    public void cfr_renamed_5286(sprug arg0) {
        this.cfr_renamed_4.addAll(arg0.cfr_renamed_3216(null));
    }

    public void cfr_renamed_612(int arg0) {
        this.cfr_renamed_107 = arg0;
    }

    public void cfr_renamed_5292(Locale arg0) {
        this.cfr_renamed_86 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprjfn cfr_renamed_5284(Date arg0) throws sprahf {
        StringBuilder stringBuilder;
        int n;
        StringBuilder stringBuilder2;
        block8: {
            String string = sprgkz.cfr_renamed_9("\u00118\u00118%\f\f% \t\u0005,\u001b2F\u0012;\u0012");
            SimpleDateFormat simpleDateFormat = this.cfr_renamed_86 == null ? new SimpleDateFormat(string, sprwgn.cfr_renamed_4) : new SimpleDateFormat(string, this.cfr_renamed_86);
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, sprbjk.cfr_renamed_9("i")));
            stringBuilder2 = new StringBuilder(simpleDateFormat.format(arg0));
            n = stringBuilder2.indexOf(".");
            if (n < 0) {
                stringBuilder2.append(sprgkz.cfr_renamed_9("\u001b"));
                return new sprjfn(stringBuilder2.toString());
            }
            switch (this.cfr_renamed_132) {
                case 1: {
                    if (stringBuilder2.length() <= n + 2) break;
                    StringBuilder stringBuilder3 = stringBuilder2;
                    stringBuilder = stringBuilder3;
                    stringBuilder3.delete(n + 2, stringBuilder3.length());
                    break block8;
                }
                case 2: {
                    if (stringBuilder2.length() <= n + 3) break;
                    StringBuilder stringBuilder4 = stringBuilder2;
                    stringBuilder = stringBuilder4;
                    stringBuilder4.delete(n + 3, stringBuilder4.length());
                    break block8;
                }
                case 3: {
                    break;
                }
                default: {
                    throw new sprahf(new StringBuilder().insert(0, sprbjk.cfr_renamed_9("F2X2\\+]|G5^9\u001e/G=^,\u0013.V/\\0F(Z3]f\u0013")).append(this.cfr_renamed_132).toString());
                }
            }
            stringBuilder = stringBuilder2;
        }
        while (stringBuilder.charAt(stringBuilder2.length() - 1) == '0') {
            StringBuilder stringBuilder5 = stringBuilder2;
            stringBuilder = stringBuilder5;
            stringBuilder5.deleteCharAt(stringBuilder5.length() - 1);
        }
        if (stringBuilder2.length() - 1 == n) {
            StringBuilder stringBuilder6 = stringBuilder2;
            stringBuilder6.deleteCharAt(stringBuilder6.length() - 1);
        }
        stringBuilder2.append(sprgkz.cfr_renamed_9("\u001b"));
        return new sprjfn(stringBuilder2.toString());
    }

    public void cfr_renamed_5285(sprug arg0) {
        this.cfr_renamed_96.addAll(arg0.cfr_renamed_3216(null));
    }

    /*
     * WARNING - void declaration
     */
    public sprkdf(sprxxl sprxxl2, sprjj sprjj2, sprlem sprlem2, boolean bl) throws IllegalArgumentException, sprahf {
        void arg2;
        void arg0;
        sprkdf sprkdf2 = this;
        sprkdf sprkdf3 = this;
        sprkdf sprkdf4 = this;
        sprkdf sprkdf5 = this;
        sprkdf sprkdf6 = this;
        this.cfr_renamed_132 = 0;
        sprkdf6.cfr_renamed_86 = null;
        sprkdf6.cfr_renamed_79 = -1;
        sprkdf5.cfr_renamed_107 = -1;
        sprkdf5.cfr_renamed_93 = -1;
        sprkdf4.cfr_renamed_91 = false;
        sprkdf4.cfr_renamed_102 = null;
        sprkdf sprkdf7 = this;
        sprkdf3.cfr_renamed_96 = new ArrayList();
        sprkdf7.cfr_renamed_4 = new ArrayList();
        sprkdf3.cfr_renamed_119 = new ArrayList();
        sprkdf3.cfr_renamed_152 = new HashMap();
        sprkdf2.cfr_renamed_0 = arg0;
        sprkdf2.cfr_renamed_112 = arg2;
        if (!sprxxl2.cfr_renamed_613()) {
            throw new IllegalArgumentException(sprbjk.cfr_renamed_9("`5T2V.z2U3t9]9A=G3A|^)@(\u00134R*V|R2\u0013=@/\\?Z=G9W|P9A(Z:Z?R(V"));
        }
        sprtpl sprtpl2 = arg0.cfr_renamed_614();
        sprkye.cfr_renamed_5275(sprtpl2);
        try {
            void arg3;
            void arg1;
            void v6 = arg1;
            OutputStream outputStream = v6.cfr_renamed_470();
            outputStream.write(sprtpl2.cfr_renamed_91());
            outputStream.close();
            if (v6.cfr_renamed_615().cfr_renamed_593().cfr_renamed_5078(sprgt.cfr_renamed_0)) {
                sprhum sprhum2 = new sprhum(arg1.cfr_renamed_580(), arg3 != false ? new sprjhm(new spraem(new sprigm(sprtpl2.cfr_renamed_102())), sprtpl2.cfr_renamed_114()) : null);
                void v7 = arg0;
                this.cfr_renamed_0 = new sprxxl((sprxxl)v7, new sprbxe(this, (sprxxl)arg0, sprhum2), v7.cfr_renamed_616());
                return;
            }
            sprddm sprddm2 = new sprddm(arg1.cfr_renamed_615().cfr_renamed_593());
            spryqm spryqm2 = new spryqm(sprddm2, arg1.cfr_renamed_580(), arg3 != false ? new sprjhm(new spraem(new sprigm(sprtpl2.cfr_renamed_102())), new sprktm(sprtpl2.cfr_renamed_114())) : null);
            void v8 = arg0;
            this.cfr_renamed_0 = new sprxxl((sprxxl)v8, new sprnbf(this, (sprxxl)arg0, spryqm2), v8.cfr_renamed_616());
            return;
        }
        catch (IOException iOException) {
            throw new sprahf(sprgkz.cfr_renamed_9("\u0004\u0010\"\r1\u001c(\u0007/H1\u001a.\u000b$\u001b2\u0001/\u000fa\u000b$\u001a5\u0001'\u0001\"\t5\ro"), iOException);
        }
    }

    public sprqxe cfr_renamed_5293(sprfbf arg0, BigInteger arg1, Date arg2) throws sprahf {
        return this.cfr_renamed_5281(arg0, arg1, arg2, null);
    }

    public void cfr_renamed_605(int arg0) {
        this.cfr_renamed_79 = arg0;
    }

    public void cfr_renamed_5202(sprug arg0) {
        this.cfr_renamed_119.addAll(arg0.cfr_renamed_3216(null));
    }

    public void cfr_renamed_5287(sprlem arg0, sprug arg1) {
        this.cfr_renamed_152.put(arg0, arg1.cfr_renamed_3216(null));
    }
}

