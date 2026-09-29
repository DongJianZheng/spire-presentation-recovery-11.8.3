/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdrk;
import com.spire.presentation.packages.sprebda;
import com.spire.presentation.packages.sprfuk;
import com.spire.presentation.packages.sprgzk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnxk;
import com.spire.presentation.packages.sprork;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprudz;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spryye;

public class sprgsk {
    public static final byte cfr_renamed_82 = 0;
    public static final short cfr_renamed_126 = 18;
    public static final short cfr_renamed_88 = 1;
    private final short cfr_renamed_31;
    public static final byte cfr_renamed_272 = 2;
    private final byte cfr_renamed_145;
    private final sprnxk cfr_renamed_114;
    public static final byte cfr_renamed_96 = 3;
    public short cfr_renamed_105;
    private final byte[] cfr_renamed_137;
    public static final short cfr_renamed_79 = 3;
    public static final short cfr_renamed_107 = 2;
    public static final short cfr_renamed_132 = 16;
    public static final short cfr_renamed_102 = 32;
    public static final short cfr_renamed_93 = 33;
    public static final short cfr_renamed_86 = 17;
    private final sprork cfr_renamed_152;
    private final byte[] cfr_renamed_112;
    public static final byte cfr_renamed_119 = 1;
    public static final short cfr_renamed_91 = 1;
    private final short cfr_renamed_0;
    public static final short cfr_renamed_1 = -1;
    private final short cfr_renamed_2;
    public static final short cfr_renamed_3 = 2;
    public static final short cfr_renamed_4 = 3;

    /*
     * WARNING - void declaration
     */
    public sprgsk(byte by, short s, short s2, short s3) {
        void arg1;
        void arg2;
        sprgsk sprgsk2 = this;
        sprgsk sprgsk3 = this;
        sprgsk3.cfr_renamed_137 = null;
        sprgsk3.cfr_renamed_112 = null;
        sprgsk2.cfr_renamed_145 = by;
        sprgsk2.cfr_renamed_2 = s;
        this.cfr_renamed_0 = s2;
        this.cfr_renamed_31 = s3;
        sprgsk sprgsk4 = this;
        this.cfr_renamed_114 = new sprnxk((short)arg2);
        sprgsk4.cfr_renamed_152 = new sprork((short)arg1);
        if (this.cfr_renamed_31 == 1) {
            this.cfr_renamed_105 = (short)16;
            return;
        }
        this.cfr_renamed_105 = (short)32;
    }

    /*
     * Enabled aggressive block sorting
     */
    public byte[][] cfr_renamed_10129(spryye arg0, byte[] arg1, byte[] arg2, byte[] arg3, byte[] arg4, byte[] arg5, sprsil arg6) throws sprull {
        sprgzk sprgzk2;
        byte[][] byArrayArray = new byte[2][];
        switch (this.cfr_renamed_145) {
            case 0: {
                sprgzk2 = this.cfr_renamed_10130(arg0, arg1);
                byte[][] byArrayArray2 = byArrayArray;
                break;
            }
            case 2: {
                sprgzk2 = this.cfr_renamed_10131(arg0, arg1, arg6);
                byte[][] byArrayArray2 = byArrayArray;
                break;
            }
            case 1: {
                sprgzk2 = this.cfr_renamed_10132(arg0, arg1, arg4, arg5);
                byte[][] byArrayArray2 = byArrayArray;
                break;
            }
            case 3: {
                sprgzk2 = this.cfr_renamed_10133(arg0, arg1, arg4, arg5, arg6);
                byte[][] byArrayArray2 = byArrayArray;
                break;
            }
            default: {
                throw new IllegalStateException(sprudz.cfr_renamed_9("rcLcHzI-JbCh"));
            }
        }
        byArrayArray2[0] = sprgzk2.cfr_renamed_10125(arg2, arg3);
        byArrayArray[1] = sprgzk2.cfr_renamed_5684();
        return byArrayArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public byte[] cfr_renamed_10134(byte[] arg0, sprsil arg1, byte[] arg2, byte[] arg3, byte[] arg4, byte[] arg5, byte[] arg6, spryye arg7) throws sprull {
        switch (this.cfr_renamed_145) {
            case 0: {
                sprfuk sprfuk2;
                sprfuk sprfuk3 = sprfuk2 = this.cfr_renamed_10135(arg0, arg1, arg2);
                return sprfuk3.cfr_renamed_10126(arg3, arg4);
            }
            case 2: {
                sprfuk sprfuk4;
                sprfuk sprfuk3 = sprfuk4 = this.cfr_renamed_10136(arg0, arg1, arg2, arg7);
                return sprfuk3.cfr_renamed_10126(arg3, arg4);
            }
            case 1: {
                sprfuk sprfuk5;
                sprfuk sprfuk3 = sprfuk5 = this.cfr_renamed_10137(arg0, arg1, arg2, arg5, arg6);
                return sprfuk3.cfr_renamed_10126(arg3, arg4);
            }
            case 3: {
                sprfuk sprfuk6;
                sprfuk sprfuk3 = sprfuk6 = this.cfr_renamed_10138(arg0, arg1, arg2, arg5, arg6, arg7);
                return sprfuk3.cfr_renamed_10126(arg3, arg4);
            }
        }
        throw new IllegalStateException(sprebda.cfr_renamed_9("O\u001eq\u001eu\u0007tPw\u001f~\u0015"));
    }

    public sprsil cfr_renamed_6151() {
        return this.cfr_renamed_152.cfr_renamed_10139();
    }

    public byte[] cfr_renamed_10140(spryye arg0) {
        return this.cfr_renamed_152.cfr_renamed_10141(arg0);
    }

    public sprsil cfr_renamed_10142(byte[] arg0) {
        return this.cfr_renamed_152.cfr_renamed_10143(arg0);
    }

    public sprgzk cfr_renamed_10133(spryye arg0, byte[] arg1, byte[] arg2, byte[] arg3, sprsil arg4) {
        sprgsk sprgsk2 = this;
        byte[][] byArray = sprgsk2.cfr_renamed_152.cfr_renamed_10144(arg0, arg4);
        sprfuk sprfuk2 = sprgsk2.cfr_renamed_10145((byte)3, byArray[0], arg1, arg2, arg3);
        return new sprgzk(sprfuk2, byArray[1]);
    }

    public sprfuk cfr_renamed_10138(byte[] arg0, sprsil arg1, byte[] arg2, byte[] arg3, byte[] arg4, spryye arg5) {
        sprgsk sprgsk2 = this;
        byte[] byArray = sprgsk2.cfr_renamed_152.cfr_renamed_10146(arg0, arg1, arg5);
        return sprgsk2.cfr_renamed_10145((byte)3, byArray, arg2, arg3, arg4);
    }

    public sprsil cfr_renamed_10147(byte[] arg0, byte[] arg1) {
        return this.cfr_renamed_152.cfr_renamed_10148(arg0, arg1);
    }

    public sprfuk cfr_renamed_10136(byte[] arg0, sprsil arg1, byte[] arg2, spryye arg3) {
        sprgsk sprgsk2 = this;
        byte[] byArray = sprgsk2.cfr_renamed_152.cfr_renamed_10146(arg0, arg1, arg3);
        sprgsk sprgsk3 = this;
        return sprgsk2.cfr_renamed_10145((byte)2, byArray, arg2, sprgsk3.cfr_renamed_137, sprgsk3.cfr_renamed_112);
    }

    public byte[] cfr_renamed_10149(spryye arg0) {
        return this.cfr_renamed_152.cfr_renamed_10150(arg0);
    }

    private /* synthetic */ sprfuk cfr_renamed_10145(byte arg0, byte[] arg1, byte[] arg2, byte[] arg3, byte[] arg4) {
        sprgsk sprgsk2 = this;
        sprgsk sprgsk3 = this;
        sprgsk3.cfr_renamed_10151(arg0, arg3, arg4);
        byte[] byArray = sproze.cfr_renamed_526(sprkoe.cfr_renamed_433(sprudz.cfr_renamed_9("o]lH")), sprpxe.cfr_renamed_5178(this.cfr_renamed_2), sprpxe.cfr_renamed_5178(this.cfr_renamed_0), sprpxe.cfr_renamed_5178(this.cfr_renamed_31));
        byte[] byArray2 = sprgsk2.cfr_renamed_114.cfr_renamed_10152(null, byArray, sprebda.cfr_renamed_9("\u0000i\u001bE\u0019~/r\u0011i\u0018"), arg4);
        byte[] byArray3 = sprgsk3.cfr_renamed_114.cfr_renamed_10152(null, byArray, sprudz.cfr_renamed_9("dIkHROlTe"), arg2);
        byte[] byArray4 = new byte[]{arg0};
        byte[] byArray5 = sproze.cfr_renamed_527(byArray4, byArray2, byArray3);
        byte[] byArray6 = sprgsk2.cfr_renamed_114.cfr_renamed_10152(arg1, byArray, sprebda.cfr_renamed_9("i\u0015y\u0002\u007f\u0004"), arg3);
        byte[] byArray7 = sprgsk2.cfr_renamed_114.cfr_renamed_10128(byArray6, byArray, "key", byArray5, this.cfr_renamed_105);
        byte[] byArray8 = sprgsk2.cfr_renamed_114.cfr_renamed_10128(byArray6, byArray, sprudz.cfr_renamed_9("ElThxcHcDh"), byArray5, 12);
        byte[] byArray9 = sprgsk2.cfr_renamed_114.cfr_renamed_10128(byArray6, byArray, "exp", byArray5, this.cfr_renamed_114.cfr_renamed_9835());
        return new sprfuk(new sprdrk(this.cfr_renamed_31, byArray7, byArray8), this.cfr_renamed_114, byArray9, byArray);
    }

    public sprfuk cfr_renamed_10137(byte[] arg0, sprsil arg1, byte[] arg2, byte[] arg3, byte[] arg4) {
        sprgsk sprgsk2 = this;
        byte[] byArray = sprgsk2.cfr_renamed_152.cfr_renamed_10153(arg0, arg1);
        return sprgsk2.cfr_renamed_10145((byte)1, byArray, arg2, arg3, arg4);
    }

    private /* synthetic */ void cfr_renamed_10151(byte arg0, byte[] arg1, byte[] arg2) {
        boolean bl;
        boolean bl2 = !sproze.cfr_renamed_92(arg1, this.cfr_renamed_137);
        boolean bl3 = bl = !sproze.cfr_renamed_92(arg2, this.cfr_renamed_112);
        if (bl2 != bl) {
            throw new IllegalArgumentException(sprebda.cfr_renamed_9("9t\u0013u\u001ei\u0019i\u0004\u007f\u001enPJ#QPs\u001ej\u0005n\u0003"));
        }
        if (bl2 && arg0 % 2 == 0) {
            throw new IllegalArgumentException(sprudz.cfr_renamed_9("w^l-NcWxS-W\u007fH{NiBi\u0007zOhI-IbS-IhBiBi"));
        }
        if (!bl2 && arg0 % 2 == 1) {
            throw new IllegalArgumentException(sprebda.cfr_renamed_9("W\u0019i\u0003s\u001e}Ph\u0015k\u0005s\u0002\u007f\u0014: I;:\u0019t\u0000o\u0004"));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public byte[][] cfr_renamed_10154(spryye arg0, byte[] arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5, sprsil arg6) {
        sprgzk sprgzk2;
        byte[][] byArrayArray = new byte[2][];
        switch (this.cfr_renamed_145) {
            case 0: {
                sprgzk2 = this.cfr_renamed_10130(arg0, arg1);
                byte[][] byArrayArray2 = byArrayArray;
                break;
            }
            case 2: {
                sprgzk2 = this.cfr_renamed_10131(arg0, arg1, arg6);
                byte[][] byArrayArray2 = byArrayArray;
                break;
            }
            case 1: {
                sprgzk2 = this.cfr_renamed_10132(arg0, arg1, arg4, arg5);
                byte[][] byArrayArray2 = byArrayArray;
                break;
            }
            case 3: {
                sprgzk2 = this.cfr_renamed_10133(arg0, arg1, arg4, arg5, arg6);
                byte[][] byArrayArray2 = byArrayArray;
                break;
            }
            default: {
                throw new IllegalStateException(sprudz.cfr_renamed_9("rcLcHzI-JbCh"));
            }
        }
        byArrayArray2[0] = sprgzk2.cfr_renamed_4;
        byArrayArray[1] = sprgzk2.cfr_renamed_10127(arg2, arg3);
        return byArrayArray;
    }

    public sprgzk cfr_renamed_10131(spryye arg0, byte[] arg1, sprsil arg2) {
        sprgsk sprgsk2 = this;
        byte[][] byArray = sprgsk2.cfr_renamed_152.cfr_renamed_10144(arg0, arg2);
        sprgsk sprgsk3 = this;
        sprfuk sprfuk2 = sprgsk2.cfr_renamed_10145((byte)2, byArray[0], arg1, sprgsk3.cfr_renamed_137, sprgsk3.cfr_renamed_112);
        return new sprgzk(sprfuk2, byArray[1]);
    }

    public spryye cfr_renamed_10155(byte[] arg0) {
        return this.cfr_renamed_152.cfr_renamed_10156(arg0);
    }

    public sprgzk cfr_renamed_10132(spryye arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        sprgsk sprgsk2 = this;
        byte[][] byArray = sprgsk2.cfr_renamed_152.cfr_renamed_10157(arg0);
        sprfuk sprfuk2 = sprgsk2.cfr_renamed_10145((byte)1, byArray[0], arg1, arg2, arg3);
        return new sprgzk(sprfuk2, byArray[1]);
    }

    public sprgzk cfr_renamed_10130(spryye arg0, byte[] arg1) {
        sprgsk sprgsk2 = this;
        byte[][] byArray = sprgsk2.cfr_renamed_152.cfr_renamed_10157(arg0);
        sprgsk sprgsk3 = this;
        sprfuk sprfuk2 = sprgsk2.cfr_renamed_10145((byte)0, byArray[0], arg1, sprgsk3.cfr_renamed_137, sprgsk3.cfr_renamed_112);
        return new sprgzk(sprfuk2, byArray[1]);
    }

    public sprfuk cfr_renamed_10135(byte[] arg0, sprsil arg1, byte[] arg2) {
        sprgsk sprgsk2 = this;
        byte[] byArray = sprgsk2.cfr_renamed_152.cfr_renamed_10153(arg0, arg1);
        sprgsk sprgsk3 = this;
        return sprgsk2.cfr_renamed_10145((byte)0, byArray, arg2, sprgsk3.cfr_renamed_137, sprgsk3.cfr_renamed_112);
    }

    /*
     * Enabled aggressive block sorting
     */
    public byte[] cfr_renamed_10158(byte[] arg0, sprsil arg1, byte[] arg2, byte[] arg3, int arg4, byte[] arg5, byte[] arg6, spryye arg7) {
        switch (this.cfr_renamed_145) {
            case 0: {
                sprfuk sprfuk2;
                sprfuk sprfuk3 = sprfuk2 = this.cfr_renamed_10135(arg0, arg1, arg2);
                return sprfuk3.cfr_renamed_10127(arg3, arg4);
            }
            case 2: {
                sprfuk sprfuk4;
                sprfuk sprfuk3 = sprfuk4 = this.cfr_renamed_10136(arg0, arg1, arg2, arg7);
                return sprfuk3.cfr_renamed_10127(arg3, arg4);
            }
            case 1: {
                sprfuk sprfuk5;
                sprfuk sprfuk3 = sprfuk5 = this.cfr_renamed_10137(arg0, arg1, arg2, arg5, arg6);
                return sprfuk3.cfr_renamed_10127(arg3, arg4);
            }
            case 3: {
                sprfuk sprfuk6;
                sprfuk sprfuk3 = sprfuk6 = this.cfr_renamed_10138(arg0, arg1, arg2, arg5, arg6, arg7);
                return sprfuk3.cfr_renamed_10127(arg3, arg4);
            }
        }
        throw new IllegalStateException(sprebda.cfr_renamed_9("O\u001eq\u001eu\u0007tPw\u001f~\u0015"));
    }
}

