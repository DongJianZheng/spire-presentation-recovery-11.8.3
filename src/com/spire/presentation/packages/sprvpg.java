/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraog;
import com.spire.presentation.packages.sprbmg;
import com.spire.presentation.packages.sprcjg;
import com.spire.presentation.packages.sprfpg;
import com.spire.presentation.packages.sprizd;
import com.spire.presentation.packages.sprkki;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpfg;
import com.spire.presentation.packages.sprwkg;
import com.spire.presentation.packages.spryfg;
import com.spire.presentation.packages.sprygg;
import java.security.SecureRandom;

public class sprvpg {
    private final int cfr_renamed_724;
    private final int cfr_renamed_953;
    public static final int cfr_renamed_133 = 1753;
    private final int cfr_renamed_185;
    private final int spr\ufe34;
    private final SecureRandom cfr_renamed_82;
    private final sprnil cfr_renamed_126;
    public static final int cfr_renamed_88 = 416;
    private final int cfr_renamed_31;
    private final int cfr_renamed_272;
    private final int cfr_renamed_145;
    private final int cfr_renamed_114;
    private final sprnil cfr_renamed_96;
    private final int cfr_renamed_105;
    public static final int cfr_renamed_137 = 13;
    public static final int cfr_renamed_79 = 32;
    private final int cfr_renamed_107;
    public static final int cfr_renamed_132 = 8380417;
    private final int cfr_renamed_102;
    private final int cfr_renamed_93;
    public static final int cfr_renamed_86 = 320;
    public static final int cfr_renamed_152 = 256;
    private final int cfr_renamed_112;
    private final int cfr_renamed_119;
    private final int cfr_renamed_91;
    private final sprygg cfr_renamed_0;
    private final int cfr_renamed_1;
    public static final int cfr_renamed_2 = 58728449;
    public static final int cfr_renamed_3 = 64;
    private final int cfr_renamed_4;

    public int cfr_renamed_7123() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_7114() {
        return this.cfr_renamed_112;
    }

    public int cfr_renamed_7055() {
        return this.cfr_renamed_31;
    }

    public boolean cfr_renamed_7124(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5) {
        sprnil sprnil2;
        byte[] byArray = new byte[64];
        byte[] byArray2 = new byte[32];
        sprcjg sprcjg2 = new sprcjg(this);
        sprpfg sprpfg2 = new sprpfg(this);
        sprfpg sprfpg2 = new sprfpg(this);
        spraog spraog2 = new spraog(this);
        spraog spraog3 = new spraog(this);
        spraog spraog4 = new spraog(this);
        if (arg1 != this.cfr_renamed_107) {
            return false;
        }
        spraog2 = sprwkg.cfr_renamed_7117(spraog2, arg5, this);
        if (!sprwkg.cfr_renamed_7119(sprfpg2, spraog4, arg0, this)) {
            return false;
        }
        byte[] byArray3 = sproze.cfr_renamed_533(arg0, 0, 32);
        if (sprfpg2.cfr_renamed_7062(this.cfr_renamed_7094() - this.cfr_renamed_7123())) {
            return false;
        }
        this.cfr_renamed_96.cfr_renamed_1197(arg4, 0, arg4.length);
        this.cfr_renamed_96.cfr_renamed_1197(arg5, 0, arg5.length);
        this.cfr_renamed_96.cfr_renamed_1199(byArray, 0, 32);
        sprvpg sprvpg2 = this;
        sprvpg2.cfr_renamed_96.cfr_renamed_1197(byArray, 0, 32);
        sprvpg2.cfr_renamed_96.cfr_renamed_1197(arg2, 0, arg3);
        sprvpg2.cfr_renamed_96.cfr_renamed_1219(byArray, 0);
        spraog spraog5 = spraog3;
        sprcjg sprcjg3 = sprcjg2;
        sprcjg3.cfr_renamed_7104(byArray3);
        sprfpg sprfpg3 = sprfpg2;
        sprpfg2.cfr_renamed_7060(arg4);
        sprfpg3.cfr_renamed_6990();
        sprpfg2.cfr_renamed_7058(spraog5, sprfpg3);
        sprcjg3.cfr_renamed_6991();
        spraog spraog6 = spraog2;
        spraog2.cfr_renamed_1007();
        spraog6.cfr_renamed_6990();
        spraog6.cfr_renamed_7074(sprcjg2, spraog6);
        spraog spraog7 = spraog3;
        spraog spraog8 = spraog3;
        spraog8.cfr_renamed_7083(spraog2);
        spraog8.cfr_renamed_6985();
        spraog8.cfr_renamed_7072();
        spraog8.cfr_renamed_7085();
        spraog5.cfr_renamed_7077(spraog7, spraog4);
        byte[] byArray4 = spraog7.cfr_renamed_7088();
        sprnil sprnil3 = sprnil2 = new sprnil(256);
        sprnil2.cfr_renamed_1197(byArray, 0, 64);
        sprvpg sprvpg3 = this;
        sprnil3.cfr_renamed_1197(byArray4, 0, sprvpg3.cfr_renamed_31 * sprvpg3.cfr_renamed_724);
        sprnil3.cfr_renamed_1199(byArray2, 0, 32);
        int n = 0;
        int n2 = n;
        while (n2 < 32) {
            if (byArray3[n] != byArray2[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public int cfr_renamed_7116() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_7121(byte[] arg0, int arg1, byte[] arg2, byte[] arg3, byte[] arg4, byte[] arg5, byte[] arg6, byte[] arg7) {
        return this.cfr_renamed_7125(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public int cfr_renamed_7103() {
        return this.spr\ufe34;
    }

    public int cfr_renamed_7105() {
        return this.cfr_renamed_953;
    }

    public int cfr_renamed_7040() {
        return this.cfr_renamed_93;
    }

    public byte[][] cfr_renamed_1223() {
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[128];
        byte[] byArray3 = new byte[32];
        byte[] byArray4 = new byte[32];
        byte[] byArray5 = new byte[64];
        byte[] byArray6 = new byte[32];
        sprpfg sprpfg2 = new sprpfg(this);
        sprfpg sprfpg2 = new sprfpg(this);
        spraog spraog2 = new spraog(this);
        spraog spraog3 = new spraog(this);
        spraog spraog4 = new spraog(this);
        sprvpg sprvpg2 = this;
        sprvpg2.cfr_renamed_82.nextBytes(byArray);
        sprvpg2.cfr_renamed_96.cfr_renamed_1197(byArray, 0, 32);
        sprvpg2.cfr_renamed_96.cfr_renamed_1199(byArray2, 0, 128);
        System.arraycopy(byArray2, 0, byArray4, 0, 32);
        System.arraycopy(byArray2, 32, byArray5, 0, 64);
        System.arraycopy(byArray2, 96, byArray6, 0, 32);
        sprpfg sprpfg3 = sprpfg2;
        sprpfg3.cfr_renamed_7060(byArray4);
        sprfpg2.cfr_renamed_7073(byArray5, (short)0);
        spraog2.cfr_renamed_7073(byArray5, (short)this.cfr_renamed_185);
        sprfpg sprfpg3 = new sprfpg(this);
        sprfpg2.cfr_renamed_7068(sprfpg3);
        sprfpg sprfpg4 = sprfpg3;
        sprfpg4.cfr_renamed_6990();
        sprpfg3.cfr_renamed_7058(spraog3, sprfpg4);
        spraog spraog5 = spraog3;
        spraog spraog6 = spraog3;
        spraog3.cfr_renamed_6985();
        spraog6.cfr_renamed_7072();
        spraog6.cfr_renamed_7080(spraog2);
        spraog6.cfr_renamed_7085();
        spraog5.cfr_renamed_7086(spraog4);
        byte[] byArray7 = sprwkg.cfr_renamed_7112(spraog5, this);
        sprvpg2.cfr_renamed_96.cfr_renamed_1197(byArray4, 0, byArray4.length);
        this.cfr_renamed_96.cfr_renamed_1197(byArray7, 0, byArray7.length);
        this.cfr_renamed_96.cfr_renamed_1199(byArray3, 0, 32);
        byte[][] byArray8 = sprwkg.cfr_renamed_7115(byArray4, byArray3, byArray6, spraog4, sprfpg2, spraog2, this);
        byte[][] byArrayArray = new byte[7][];
        byArrayArray[0] = byArray8[0];
        byArrayArray[1] = byArray8[1];
        byArrayArray[2] = byArray8[2];
        byArrayArray[3] = byArray8[3];
        byArrayArray[4] = byArray8[4];
        byArrayArray[5] = byArray8[5];
        byArrayArray[6] = byArray7;
        return byArrayArray;
    }

    public int cfr_renamed_7126() {
        return this.cfr_renamed_272;
    }

    public int cfr_renamed_7048() {
        return this.cfr_renamed_102;
    }

    public int cfr_renamed_7096() {
        return this.cfr_renamed_114;
    }

    public sprnil cfr_renamed_7127() {
        return this.cfr_renamed_96;
    }

    public int cfr_renamed_7089() {
        return this.cfr_renamed_724;
    }

    public int cfr_renamed_7035() {
        return this.cfr_renamed_107;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprvpg(int arg0, SecureRandom arg1, boolean arg2) {
        sprvpg sprvpg2;
        boolean bl;
        sprvpg sprvpg3 = this;
        this.cfr_renamed_126 = new sprnil(128);
        sprvpg3.cfr_renamed_96 = new sprnil(256);
        this.cfr_renamed_91 = arg0;
        switch (this.cfr_renamed_91) {
            case 2: {
                sprvpg sprvpg4 = this;
                sprvpg sprvpg5 = this;
                sprvpg sprvpg6 = this;
                sprvpg sprvpg7 = this;
                sprvpg sprvpg8 = this;
                sprvpg8.cfr_renamed_31 = 4;
                sprvpg8.cfr_renamed_185 = 4;
                sprvpg7.spr\ufe34 = 2;
                sprvpg7.cfr_renamed_953 = 39;
                sprvpg6.cfr_renamed_1 = 78;
                sprvpg6.cfr_renamed_145 = 131072;
                sprvpg5.cfr_renamed_102 = 95232;
                sprvpg5.cfr_renamed_112 = 80;
                sprvpg4.cfr_renamed_105 = 576;
                sprvpg4.cfr_renamed_724 = 192;
                this.cfr_renamed_4 = 96;
                bl = arg2;
                break;
            }
            case 3: {
                sprvpg sprvpg9 = this;
                sprvpg sprvpg10 = this;
                sprvpg sprvpg11 = this;
                sprvpg sprvpg12 = this;
                sprvpg sprvpg13 = this;
                sprvpg13.cfr_renamed_31 = 6;
                sprvpg13.cfr_renamed_185 = 5;
                sprvpg12.spr\ufe34 = 4;
                sprvpg12.cfr_renamed_953 = 49;
                sprvpg11.cfr_renamed_1 = 196;
                sprvpg11.cfr_renamed_145 = 524288;
                sprvpg10.cfr_renamed_102 = 261888;
                sprvpg10.cfr_renamed_112 = 55;
                sprvpg9.cfr_renamed_105 = 640;
                sprvpg9.cfr_renamed_724 = 128;
                this.cfr_renamed_4 = 128;
                bl = arg2;
                break;
            }
            case 5: {
                sprvpg sprvpg14 = this;
                sprvpg sprvpg15 = this;
                sprvpg sprvpg16 = this;
                sprvpg sprvpg17 = this;
                sprvpg sprvpg18 = this;
                sprvpg18.cfr_renamed_31 = 8;
                sprvpg18.cfr_renamed_185 = 7;
                sprvpg17.spr\ufe34 = 2;
                sprvpg17.cfr_renamed_953 = 60;
                sprvpg16.cfr_renamed_1 = 120;
                sprvpg16.cfr_renamed_145 = 524288;
                sprvpg15.cfr_renamed_102 = 261888;
                sprvpg15.cfr_renamed_112 = 75;
                sprvpg14.cfr_renamed_105 = 640;
                sprvpg14.cfr_renamed_724 = 128;
                this.cfr_renamed_4 = 96;
                bl = arg2;
                break;
            }
            default: {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprizd.cfr_renamed_9("\u0003U2\u001d:R3Xw")).append(arg0).append(sprkki.cfr_renamed_9(":\u001cs\u0001<\u001bs\u001c&\u001f#\u0000!\u001b6\u000bs\r*O\u0010\u001d*\u001c'\u000e?\u001cs+:\u0003:\u001b;\u0006&\u0002r")).toString());
            }
        }
        if (bl) {
            sprvpg2 = this;
            this.cfr_renamed_0 = new spryfg();
        } else {
            sprvpg2 = this;
            this.cfr_renamed_0 = new sprbmg();
        }
        sprvpg2.cfr_renamed_82 = arg1;
        this.cfr_renamed_272 = this.cfr_renamed_112 + this.cfr_renamed_31;
        this.cfr_renamed_93 = 32 + this.cfr_renamed_31 * 320;
        sprvpg sprvpg19 = this;
        sprvpg sprvpg20 = this;
        this.cfr_renamed_119 = 96 + sprvpg19.cfr_renamed_185 * sprvpg19.cfr_renamed_4 + sprvpg20.cfr_renamed_31 * sprvpg20.cfr_renamed_4 + this.cfr_renamed_31 * 416;
        sprvpg sprvpg21 = this;
        this.cfr_renamed_107 = 32 + sprvpg21.cfr_renamed_185 * sprvpg21.cfr_renamed_105 + this.cfr_renamed_272;
        if (this.cfr_renamed_145 == 131072) {
            this.cfr_renamed_114 = (576 + this.cfr_renamed_0.cfr_renamed_4 - 1) / this.cfr_renamed_0.cfr_renamed_4;
            return;
        }
        if (this.cfr_renamed_145 == 524288) {
            this.cfr_renamed_114 = (640 + this.cfr_renamed_0.cfr_renamed_4 - 1) / this.cfr_renamed_0.cfr_renamed_4;
            return;
        }
        throw new RuntimeException(sprizd.cfr_renamed_9("\u0000O8S0\u001d\u0013T;T#U>H:\u001d\u0010\\:P6\fv"));
    }

    public int cfr_renamed_7034() {
        return this.cfr_renamed_119;
    }

    public int cfr_renamed_7094() {
        return this.cfr_renamed_145;
    }

    public sprygg cfr_renamed_7098() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_7056() {
        return this.cfr_renamed_185;
    }

    public byte[] cfr_renamed_7125(byte[] arg0, int arg1, byte[] arg2, byte[] arg3, byte[] arg4, byte[] arg5, byte[] arg6, byte[] arg7) {
        int n;
        sprpfg sprpfg2;
        sprvpg sprvpg2 = this;
        byte[] byArray = new byte[sprvpg2.cfr_renamed_107 + arg1];
        byte[] byArray2 = new byte[64];
        byte[] byArray3 = new byte[64];
        short s = 0;
        sprvpg sprvpg3 = this;
        sprfpg sprfpg2 = new sprfpg(sprvpg3);
        sprfpg sprfpg3 = new sprfpg(this);
        sprfpg sprfpg4 = new sprfpg(this);
        spraog spraog2 = new spraog(this);
        spraog spraog3 = new spraog(this);
        spraog spraog4 = new spraog(this);
        spraog spraog5 = new spraog(this);
        spraog spraog6 = new spraog(this);
        sprcjg sprcjg2 = new sprcjg(this);
        sprpfg sprpfg3 = new sprpfg(this);
        sprwkg.cfr_renamed_7118(spraog2, sprfpg2, spraog3, arg5, arg6, arg7, this);
        sprvpg3.cfr_renamed_96.cfr_renamed_1197(arg4, 0, 32);
        sprvpg2.cfr_renamed_96.cfr_renamed_1197(arg0, 0, arg1);
        sprvpg2.cfr_renamed_96.cfr_renamed_1199(byArray2, 0, 64);
        if (sprvpg2.cfr_renamed_82 != null) {
            sprpfg2 = sprpfg3;
            this.cfr_renamed_82.nextBytes(byArray3);
        } else {
            byte[] byArray4 = sproze.cfr_renamed_523(arg3, 96);
            sprpfg2 = sprpfg3;
            sprvpg sprvpg4 = this;
            System.arraycopy(byArray2, 0, byArray4, 32, 64);
            sprvpg4.cfr_renamed_96.cfr_renamed_1197(byArray4, 0, 96);
            sprvpg4.cfr_renamed_96.cfr_renamed_1199(byArray3, 0, 64);
        }
        sprpfg2.cfr_renamed_7060(arg2);
        sprfpg2.cfr_renamed_6990();
        spraog3.cfr_renamed_6990();
        spraog2.cfr_renamed_6990();
        int n2 = n = 0;
        while (n2 < 1000) {
            sprfpg sprfpg5 = sprfpg3;
            ++n;
            short s2 = s;
            s = (short)(s2 + 1);
            sprfpg5.cfr_renamed_7065(byArray3, s2);
            sprfpg5.cfr_renamed_7068(sprfpg4);
            spraog spraog7 = spraog4;
            sprfpg4.cfr_renamed_6990();
            sprpfg3.cfr_renamed_7058(spraog7, sprfpg4);
            spraog spraog8 = spraog4;
            spraog8.cfr_renamed_6985();
            spraog8.cfr_renamed_7072();
            spraog8.cfr_renamed_7085();
            spraog7.cfr_renamed_7075(spraog5);
            sprvpg sprvpg5 = this;
            System.arraycopy(spraog7.cfr_renamed_7088(), 0, byArray, 0, sprvpg5.cfr_renamed_31 * sprvpg5.cfr_renamed_724);
            sprvpg sprvpg6 = this;
            sprvpg6.cfr_renamed_96.cfr_renamed_1197(byArray2, 0, 64);
            sprvpg sprvpg7 = this;
            sprvpg6.cfr_renamed_96.cfr_renamed_1197(byArray, 0, sprvpg7.cfr_renamed_31 * sprvpg7.cfr_renamed_724);
            sprfpg sprfpg6 = sprfpg4;
            this.cfr_renamed_96.cfr_renamed_1199(byArray, 0, 32);
            sprcjg sprcjg3 = sprcjg2;
            sprcjg3.cfr_renamed_7104(sproze.cfr_renamed_533(byArray, 0, 32));
            sprcjg3.cfr_renamed_6991();
            sprfpg sprfpg7 = sprfpg4;
            sprfpg7.cfr_renamed_7066(sprcjg2, sprfpg2);
            sprfpg7.cfr_renamed_7072();
            sprfpg7.cfr_renamed_7063(sprfpg3);
            sprfpg6.cfr_renamed_6985();
            if (sprfpg6.cfr_renamed_7062(sprvpg6.cfr_renamed_145 - this.cfr_renamed_1)) {
                n2 = n;
                continue;
            }
            spraog spraog9 = spraog6;
            spraog9.cfr_renamed_7074(sprcjg2, spraog3);
            spraog9.cfr_renamed_7072();
            spraog spraog10 = spraog5;
            spraog10.cfr_renamed_7083(spraog6);
            spraog10.cfr_renamed_6985();
            if (spraog10.cfr_renamed_7062(this.cfr_renamed_102 - this.cfr_renamed_1)) {
                n2 = n;
                continue;
            }
            spraog spraog11 = spraog6;
            spraog11.cfr_renamed_7074(sprcjg2, spraog2);
            spraog11.cfr_renamed_7072();
            spraog11.cfr_renamed_6985();
            if (spraog6.cfr_renamed_7062(this.cfr_renamed_102)) {
                n2 = n;
                continue;
            }
            spraog spraog12 = spraog5;
            spraog12.cfr_renamed_7080(spraog6);
            spraog12.cfr_renamed_7085();
            if (spraog6.cfr_renamed_7081(spraog5, spraog4) > this.cfr_renamed_112) {
                n2 = n;
                continue;
            }
            return sprwkg.cfr_renamed_7113(byArray, sprfpg4, spraog6, this);
        }
        return null;
    }

    public boolean cfr_renamed_7122(byte[] arg0, byte[] arg1, int arg2, byte[] arg3, byte[] arg4) {
        return this.cfr_renamed_7124(arg1, arg2, arg0, arg0.length, arg3, arg4);
    }

    public int cfr_renamed_7070() {
        return this.cfr_renamed_91;
    }

    public sprnil cfr_renamed_7128() {
        return this.cfr_renamed_126;
    }

    public int cfr_renamed_7108() {
        return this.cfr_renamed_105;
    }
}

