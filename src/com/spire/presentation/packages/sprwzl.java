/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfjn;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmip;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxfm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprwzl
extends sprqqe {
    private boolean cfr_renamed_119;
    private boolean cfr_renamed_91;
    private sprszm cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprxfm cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprhhm cfr_renamed_4;

    private /* synthetic */ String cfr_renamed_4508(boolean arg0) {
        if (arg0) {
            return "true";
        }
        return "false";
    }

    public sprhhm cfr_renamed_323() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_0;
    }

    public String toString() {
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprfjn.cfr_renamed_9("\u000f\u00025\u0004/\u001f!5/\u00022\u0003/\u00133\u0005/\u001e(!)\u0018(\u0005|Q\u001d"));
        stringBuffer.append(string);
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4507(stringBuffer, string, sprmip.cfr_renamed_9("\u00058\u0012%\u00138\u0003$\u00158\u000e?1>\b?\u0015"), this.cfr_renamed_4.toString());
        }
        if (this.cfr_renamed_91) {
            sprwzl sprwzl2 = this;
            this.cfr_renamed_4507(stringBuffer, string, sprfjn.cfr_renamed_9(")\u001f*\b\u0005\u001e(\u0005'\u0018(\u0002\u0013\u0002#\u0003\u0005\u00144\u00055"), sprwzl2.cfr_renamed_4508(sprwzl2.cfr_renamed_91));
        }
        if (this.cfr_renamed_119) {
            sprwzl sprwzl3 = this;
            this.cfr_renamed_4507(stringBuffer, string, sprmip.cfr_renamed_9("\u000e?\r(\">\u000f%\u00008\u000f\"\"\u0010\"4\u0013%\u0012"), sprwzl3.cfr_renamed_4508(sprwzl3.cfr_renamed_119));
        }
        if (this.cfr_renamed_2 != null) {
            this.cfr_renamed_4507(stringBuffer, string, sprfjn.cfr_renamed_9(")\u001f*\b\u0015\u001e+\u0014\u0014\u0014'\u0002)\u001f5"), this.cfr_renamed_2.toString());
        }
        if (this.cfr_renamed_1) {
            sprwzl sprwzl4 = this;
            this.cfr_renamed_4507(stringBuffer, string, sprmip.cfr_renamed_9(">\u000f=\u0018\u0012\u000e?\u00150\b?\u0012\u0010\u0015%\u00138\u0003$\u00154\"4\u0013%\u0012"), sprwzl4.cfr_renamed_4508(sprwzl4.cfr_renamed_1));
        }
        if (this.cfr_renamed_3) {
            sprwzl sprwzl5 = this;
            this.cfr_renamed_4507(stringBuffer, string, sprfjn.cfr_renamed_9("/\u001f\"\u00184\u0014%\u0005\u0005#\n"), sprwzl5.cfr_renamed_4508(sprwzl5.cfr_renamed_3));
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append("]");
        stringBuffer.append(string);
        return stringBuffer2.toString();
    }

    public static sprwzl cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprwzl.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprxfm cfr_renamed_2203() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_306() {
        return this.cfr_renamed_91;
    }

    public boolean cfr_renamed_307() {
        return this.cfr_renamed_119;
    }

    public boolean cfr_renamed_308() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprwzl(sprszm sprszm2) {
        int n;
        void arg0;
        this.cfr_renamed_0 = arg0;
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_4 = sprhhm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                case 1: {
                    this.cfr_renamed_91 = sprbxm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_587();
                    break;
                }
                case 2: {
                    this.cfr_renamed_119 = sprbxm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_587();
                    break;
                }
                case 3: {
                    this.cfr_renamed_2 = new sprxfm(sprgbf.cfr_renamed_5085(sprnvm2, false));
                    break;
                }
                case 4: {
                    this.cfr_renamed_3 = sprbxm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_587();
                    break;
                }
                case 5: {
                    this.cfr_renamed_1 = sprbxm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_587();
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprmip.cfr_renamed_9("\u0014?\n?\u000e&\u000fq\u00150\u0006q\b?A\u0018\u0012\"\u00148\u000f6%8\u0012%\u00138\u0003$\u00158\u000e?1>\b?\u0015"));
                }
            }
            n2 = ++n;
        }
        return;
    }

    /*
     * WARNING - void declaration
     */
    public sprwzl(sprhhm sprhhm2, boolean bl, boolean bl2, sprxfm sprxfm2, boolean bl3, boolean bl4) {
        void arg3;
        void arg1;
        void arg2;
        void arg5;
        void arg4;
        void arg0;
        sprwzl sprwzl2 = this;
        sprwzl sprwzl3 = this;
        sprwzl sprwzl4 = this;
        sprwzl4.cfr_renamed_4 = arg0;
        sprwzl4.cfr_renamed_3 = arg4;
        sprwzl3.cfr_renamed_1 = arg5;
        sprwzl3.cfr_renamed_119 = arg2;
        sprwzl2.cfr_renamed_91 = arg1;
        sprwzl2.cfr_renamed_2 = sprxfm2;
        sprrvm sprrvm2 = new sprrvm(6);
        if (arg0 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)arg0));
        }
        if (arg1 != false) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)sprbxm.cfr_renamed_655(1 != 0)));
        }
        if (arg2 != false) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)sprbxm.cfr_renamed_655(true)));
        }
        if (arg3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 3, (sprco)arg3));
        }
        if (arg4 != false) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 4, (sprco)sprbxm.cfr_renamed_655(true)));
        }
        if (arg5 != false) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 5, (sprco)sprbxm.cfr_renamed_655(true)));
        }
        this.cfr_renamed_0 = new sprcen(sprrvm2);
    }

    public boolean cfr_renamed_2131() {
        return this.cfr_renamed_3;
    }

    public sprwzl(sprhhm arg0, boolean arg1, boolean arg2) {
        this(arg0, false, false, null, arg1, arg2);
    }

    public static sprwzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwzl) {
            return (sprwzl)arg0;
        }
        if (arg0 != null) {
            return new sprwzl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

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
}

