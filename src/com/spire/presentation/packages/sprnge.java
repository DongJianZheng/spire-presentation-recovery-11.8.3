/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbae;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjas;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtae;
import com.spire.presentation.packages.sprugg;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprnge
extends sprkra {
    private sprtae cfr_renamed_119;
    private boolean cfr_renamed_91;
    private sprbne cfr_renamed_0;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprbae cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_4507(StringBuffer arg0, String arg1, String arg2, String arg3) {
        String string = "    ";
        arg0.append(string);
        arg0.append(arg2);
        arg0.append(":");
        arg0.append(arg1);
        arg0.append(string);
        arg0.append(string);
        arg0.append(arg3);
        arg0.append(arg1);
    }

    public sprnge(sprtae arg0, boolean arg1, boolean arg2) {
        this(arg0, false, false, null, arg1, arg2);
    }

    public sprbae cfr_renamed_2203() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_307() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_2131() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprnge(sprbne sprbne2) {
        int n;
        void arg0;
        this.cfr_renamed_0 = arg0;
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            spryte spryte2 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(n));
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_119 = sprtae.cfr_renamed_341(spryte2, true);
                    break;
                }
                case 1: {
                    this.cfr_renamed_4 = sprnpe.cfr_renamed_341(spryte2, false).cfr_renamed_587();
                    break;
                }
                case 2: {
                    this.cfr_renamed_2 = sprnpe.cfr_renamed_341(spryte2, false).cfr_renamed_587();
                    break;
                }
                case 3: {
                    this.cfr_renamed_3 = new sprbae(sprbae.cfr_renamed_341(spryte2, false));
                    break;
                }
                case 4: {
                    this.cfr_renamed_91 = sprnpe.cfr_renamed_341(spryte2, false).cfr_renamed_587();
                    break;
                }
                case 5: {
                    this.cfr_renamed_1 = sprnpe.cfr_renamed_341(spryte2, false).cfr_renamed_587();
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprugg.cfr_renamed_9("ikwksrr%hd{%uk<LovilrbXloqnl~phlskLjukh"));
                }
            }
            n2 = ++n;
        }
        return;
    }

    public static sprnge cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprnge.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public boolean cfr_renamed_306() {
        return this.cfr_renamed_4;
    }

    public sprtae cfr_renamed_323() {
        return this.cfr_renamed_119;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_308() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ String cfr_renamed_4508(boolean arg0) {
        if (arg0) {
            return "true";
        }
        return "false";
    }

    public String toString() {
        String string = System.getProperty(sprjas.cfr_renamed_9("oLm@-VfUbWbQlW"));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprugg.cfr_renamed_9("Uvopuk{AuvhwugiqujrUslrq&%G"));
        stringBuffer.append(string);
        if (this.cfr_renamed_119 != null) {
            this.cfr_renamed_4507(stringBuffer, string, sprjas.cfr_renamed_9("AjVwWjGvQjJmulLmQ"), this.cfr_renamed_119.toString());
        }
        if (this.cfr_renamed_4) {
            sprnge sprnge2 = this;
            this.cfr_renamed_4507(stringBuffer, string, sprugg.cfr_renamed_9("skp|_jrq}lrvIvyw_`nqo"), sprnge2.cfr_renamed_4508(sprnge2.cfr_renamed_4));
        }
        if (this.cfr_renamed_2) {
            sprnge sprnge3 = this;
            this.cfr_renamed_4507(stringBuffer, string, sprjas.cfr_renamed_9("JmIzflKwDjKpfBffWwV"), sprnge3.cfr_renamed_4508(sprnge3.cfr_renamed_2));
        }
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_4507(stringBuffer, string, sprugg.cfr_renamed_9("skp|Ojq`N`}vsko"), this.cfr_renamed_3.toString());
        }
        if (this.cfr_renamed_1) {
            sprnge sprnge4 = this;
            this.cfr_renamed_4507(stringBuffer, string, sprjas.cfr_renamed_9("lKo\\@JmQbLmVBQwWjGvQfffWwV"), sprnge4.cfr_renamed_4508(sprnge4.cfr_renamed_1));
        }
        if (this.cfr_renamed_91) {
            sprnge sprnge5 = this;
            this.cfr_renamed_4507(stringBuffer, string, sprugg.cfr_renamed_9("ukxln`\u007fq_WP"), sprnge5.cfr_renamed_4508(sprnge5.cfr_renamed_91));
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append("]");
        stringBuffer.append(string);
        return stringBuffer2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprnge(sprtae sprtae2, boolean bl, boolean bl2, sprbae sprbae2, boolean bl3, boolean bl4) {
        void arg3;
        void arg1;
        void arg2;
        void arg5;
        void arg4;
        void arg0;
        sprnge sprnge2 = this;
        sprnge sprnge3 = this;
        sprnge sprnge4 = this;
        sprnge4.cfr_renamed_119 = arg0;
        sprnge4.cfr_renamed_91 = arg4;
        sprnge3.cfr_renamed_1 = arg5;
        sprnge3.cfr_renamed_2 = arg2;
        sprnge2.cfr_renamed_4 = arg1;
        sprnge2.cfr_renamed_3 = sprbae2;
        sprlre sprlre2 = new sprlre();
        if (arg0 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, (spra)arg0));
        }
        if (arg1 != false) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, sprnpe.cfr_renamed_655(1 != 0)));
        }
        if (arg2 != false) {
            sprlre2.cfr_renamed_49(new sprhse(false, 2, sprnpe.cfr_renamed_655(true)));
        }
        if (arg3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 3, (spra)arg3));
        }
        if (arg4 != false) {
            sprlre2.cfr_renamed_49(new sprhse(false, 4, sprnpe.cfr_renamed_655(true)));
        }
        if (arg5 != false) {
            sprlre2.cfr_renamed_49(new sprhse(false, 5, sprnpe.cfr_renamed_655(true)));
        }
        this.cfr_renamed_0 = new sprpse(sprlre2);
    }

    public static sprnge cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnge) {
            return (sprnge)arg0;
        }
        if (arg0 != null) {
            return new sprnge(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }
}

