/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprffb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmbea;
import com.spire.presentation.packages.sprnbb;
import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprvhd;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.text.DecimalFormat;

public class sprcya
extends sprccb
implements Cloneable {
    public static final sprcya cfr_renamed_287;
    public static final int cfr_renamed_724 = 1;
    public int cfr_renamed_953;
    public sprlc cfr_renamed_133;
    public static final int cfr_renamed_185 = 0;
    public boolean spr\ufe34;
    public double cfr_renamed_82;
    public int cfr_renamed_126;
    public int cfr_renamed_88;
    public int cfr_renamed_31;
    public int cfr_renamed_272;
    public static final int cfr_renamed_145 = 1;
    public static final sprcya cfr_renamed_114;
    public static final sprcya cfr_renamed_96;
    public double cfr_renamed_105;
    public int cfr_renamed_137;
    public static final sprcya cfr_renamed_79;
    public boolean cfr_renamed_107;
    public int cfr_renamed_132;
    public int cfr_renamed_102;
    public static final sprcya cfr_renamed_93;
    public double cfr_renamed_86;
    public int cfr_renamed_152;
    public static final sprcya cfr_renamed_112;
    public static final int cfr_renamed_119 = 0;
    public double cfr_renamed_91;
    public int cfr_renamed_0;
    public double cfr_renamed_1;
    public int cfr_renamed_2;
    public double cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcya(int n, int n2, int n3, int n4, int n5, double d, double d2, double d3, boolean bl, boolean bl2, int n6, sprlc sprlc2) {
        void arg11;
        void arg10;
        void arg9;
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprcya sprcya2 = this;
        sprcya sprcya3 = this;
        sprcya sprcya4 = this;
        sprcya sprcya5 = this;
        sprcya sprcya6 = this;
        sprcya sprcya7 = this;
        sprcya sprcya8 = this;
        super(new SecureRandom(), (int)arg0);
        this.cfr_renamed_102 = 100;
        sprcya7.cfr_renamed_272 = 6;
        sprcya7.cfr_renamed_88 = arg0;
        sprcya6.cfr_renamed_953 = arg1;
        sprcya6.cfr_renamed_31 = arg2;
        sprcya5.cfr_renamed_132 = arg3;
        sprcya5.cfr_renamed_4 = arg4;
        sprcya4.cfr_renamed_86 = arg5;
        sprcya4.cfr_renamed_82 = arg6;
        sprcya3.cfr_renamed_91 = arg7;
        sprcya3.spr\ufe34 = arg8;
        sprcya2.cfr_renamed_107 = arg9;
        sprcya2.cfr_renamed_2 = arg10;
        this.cfr_renamed_133 = arg11;
        this.cfr_renamed_137 = 0;
        this.cfr_renamed_1314();
    }

    public int hashCode() {
        long l;
        int n = 1;
        n = 31 * n + this.cfr_renamed_132;
        n = 31 * n + this.cfr_renamed_88;
        n = 31 * n + this.cfr_renamed_4;
        sprcya sprcya2 = this;
        long l2 = l = Double.doubleToLongBits(sprcya2.cfr_renamed_86);
        n = 31 * n + (int)(l2 ^ l2 >>> 32);
        long l3 = l = Double.doubleToLongBits(sprcya2.cfr_renamed_1);
        n = 31 * n + (int)(l3 ^ l3 >>> 32);
        n = 31 * n + this.cfr_renamed_272;
        n = 31 * n + this.cfr_renamed_31;
        n = 31 * n + this.cfr_renamed_152;
        n = 31 * n + this.cfr_renamed_126;
        n = 31 * n + this.cfr_renamed_0;
        n = 31 * n + (this.cfr_renamed_133 == null ? 0 : this.cfr_renamed_133.cfr_renamed_1315().hashCode());
        n = 31 * n + this.cfr_renamed_2;
        sprcya sprcya3 = this;
        long l4 = l = Double.doubleToLongBits(sprcya3.cfr_renamed_91);
        n = 31 * n + (int)(l4 ^ l4 >>> 32);
        long l5 = l = Double.doubleToLongBits(sprcya3.cfr_renamed_3);
        n = 31 * n + (int)(l5 ^ l5 >>> 32);
        long l6 = l = Double.doubleToLongBits(sprcya3.cfr_renamed_82);
        n = 31 * n + (int)(l6 ^ l6 >>> 32);
        long l7 = l = Double.doubleToLongBits(sprcya3.cfr_renamed_105);
        n = 31 * n + (int)(l7 ^ l7 >>> 32);
        n = 31 * n + this.cfr_renamed_137;
        n = 31 * n + (this.spr\ufe34 ? 1231 : 1237);
        n = 31 * n + this.cfr_renamed_953;
        n = 31 * n + this.cfr_renamed_102;
        n = 31 * n + (this.cfr_renamed_107 ? 1231 : 1237);
        return n;
    }

    public String toString() {
        StringBuilder stringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat(sprffb.cfr_renamed_9("\u0000p\u0000n"));
        StringBuilder stringBuilder2 = new StringBuilder(new StringBuilder().insert(0, sprmbea.cfr_renamed_9("pBDEB_VYF{BYBFF_FYP\u0003m\u0016")).append(this.cfr_renamed_88).append(sprffb.cfr_renamed_9("~Ac")).append(this.cfr_renamed_953).toString());
        if (this.cfr_renamed_137 == 0) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder = stringBuilder3;
            stringBuilder3.append(sprmbea.cfr_renamed_9("\u000bSDORwRSN\u001exjfsgf\u000bG\u0016") + this.cfr_renamed_31);
        } else {
            StringBuilder stringBuilder4 = stringBuilder2;
            stringBuilder = stringBuilder4;
            stringBuilder4.append(new StringBuilder().insert(0, sprffb.cfr_renamed_9("~@1\\'d'@;\r\u000eb\u0011t\u000bs\n\u0010:\u0001c")).append(this.cfr_renamed_152).append(sprmbea.cfr_renamed_9("\u0003O\u0011\u0016")).append(this.cfr_renamed_126).append(sprffb.cfr_renamed_9("\u0010:\u0003c")).append(this.cfr_renamed_0).toString());
        }
        stringBuilder.append(new StringBuilder().insert(0, sprmbea.cfr_renamed_9("\u000ba\u0016")).append(this.cfr_renamed_132).append(sprffb.cfr_renamed_9("~R?C7C\nI.Uc")).append(this.cfr_renamed_4).append(sprmbea.cfr_renamed_9("\u0003IF_B\u0016")).append(decimalFormat.format(this.cfr_renamed_86)).append(sprffb.cfr_renamed_9("~^1B3r1E0Tc")).append(decimalFormat.format(this.cfr_renamed_82)).append(sprmbea.cfr_renamed_9("\u0003@FRmDQFaDVEG\u0016")).append(decimalFormat.format(this.cfr_renamed_91)).append(sprffb.cfr_renamed_9("~@,Y3Uc")).append(this.spr\ufe34).append(sprmbea.cfr_renamed_9("\u0003XSJQXF\u0016")).append(this.cfr_renamed_107).append(sprffb.cfr_renamed_9("~[;I\u0019U0q2Wc")).append(this.cfr_renamed_2).append(sprmbea.cfr_renamed_9("\u000bKJPCbGD\u0016")).append(this.cfr_renamed_133).append(")").toString());
        return stringBuilder2.toString();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (!(arg0 instanceof sprcya)) {
            return false;
        }
        sprcya sprcya2 = (sprcya)arg0;
        if (this.cfr_renamed_132 != sprcya2.cfr_renamed_132) {
            return false;
        }
        if (this.cfr_renamed_88 != sprcya2.cfr_renamed_88) {
            return false;
        }
        if (this.cfr_renamed_4 != sprcya2.cfr_renamed_4) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_86) != Double.doubleToLongBits(sprcya2.cfr_renamed_86)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_1) != Double.doubleToLongBits(sprcya2.cfr_renamed_1)) {
            return false;
        }
        if (this.cfr_renamed_272 != sprcya2.cfr_renamed_272) {
            return false;
        }
        if (this.cfr_renamed_31 != sprcya2.cfr_renamed_31) {
            return false;
        }
        if (this.cfr_renamed_152 != sprcya2.cfr_renamed_152) {
            return false;
        }
        if (this.cfr_renamed_126 != sprcya2.cfr_renamed_126) {
            return false;
        }
        if (this.cfr_renamed_0 != sprcya2.cfr_renamed_0) {
            return false;
        }
        if (this.cfr_renamed_133 == null ? sprcya2.cfr_renamed_133 != null : !this.cfr_renamed_133.cfr_renamed_1315().equals(sprcya2.cfr_renamed_133.cfr_renamed_1315())) {
            return false;
        }
        if (this.cfr_renamed_2 != sprcya2.cfr_renamed_2) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_91) != Double.doubleToLongBits(sprcya2.cfr_renamed_91)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_3) != Double.doubleToLongBits(sprcya2.cfr_renamed_3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_82) != Double.doubleToLongBits(sprcya2.cfr_renamed_82)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_105) != Double.doubleToLongBits(sprcya2.cfr_renamed_105)) {
            return false;
        }
        if (this.cfr_renamed_137 != sprcya2.cfr_renamed_137) {
            return false;
        }
        if (this.spr\ufe34 != sprcya2.spr\ufe34) {
            return false;
        }
        if (this.cfr_renamed_953 != sprcya2.cfr_renamed_953) {
            return false;
        }
        if (this.cfr_renamed_102 != sprcya2.cfr_renamed_102) {
            return false;
        }
        return this.cfr_renamed_107 == sprcya2.cfr_renamed_107;
    }

    private /* synthetic */ void cfr_renamed_1314() {
        sprcya sprcya2 = this;
        this.cfr_renamed_1 = sprcya2.cfr_renamed_86 * this.cfr_renamed_86;
        sprcya2.cfr_renamed_105 = sprcya2.cfr_renamed_82 * this.cfr_renamed_82;
        sprcya2.cfr_renamed_3 = sprcya2.cfr_renamed_91 * this.cfr_renamed_91;
    }

    public sprnbb cfr_renamed_1312() {
        sprcya sprcya2 = this;
        sprcya sprcya3 = this;
        return new sprnbb(sprcya2.cfr_renamed_88, sprcya2.cfr_renamed_953, sprcya3.cfr_renamed_31, sprcya3.cfr_renamed_132, this.cfr_renamed_86, this.cfr_renamed_82, this.cfr_renamed_133);
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = dataOutputStream = new DataOutputStream(arg0);
        sprcya sprcya2 = this;
        DataOutputStream dataOutputStream3 = dataOutputStream;
        sprcya sprcya3 = this;
        DataOutputStream dataOutputStream4 = dataOutputStream;
        sprcya sprcya4 = this;
        DataOutputStream dataOutputStream5 = dataOutputStream;
        sprcya sprcya5 = this;
        DataOutputStream dataOutputStream6 = dataOutputStream;
        sprcya sprcya6 = this;
        DataOutputStream dataOutputStream7 = dataOutputStream;
        sprcya sprcya7 = this;
        dataOutputStream.writeInt(sprcya7.cfr_renamed_88);
        dataOutputStream7.writeInt(sprcya7.cfr_renamed_953);
        dataOutputStream7.writeInt(this.cfr_renamed_31);
        dataOutputStream.writeInt(sprcya6.cfr_renamed_152);
        dataOutputStream6.writeInt(sprcya6.cfr_renamed_126);
        dataOutputStream6.writeInt(this.cfr_renamed_0);
        dataOutputStream.writeInt(sprcya5.cfr_renamed_132);
        dataOutputStream5.writeInt(sprcya5.cfr_renamed_4);
        dataOutputStream5.writeDouble(this.cfr_renamed_86);
        dataOutputStream.writeDouble(sprcya4.cfr_renamed_82);
        dataOutputStream4.writeDouble(sprcya4.cfr_renamed_91);
        dataOutputStream4.writeInt(this.cfr_renamed_102);
        dataOutputStream.writeBoolean(sprcya3.spr\ufe34);
        dataOutputStream3.writeBoolean(sprcya3.cfr_renamed_107);
        dataOutputStream3.writeInt(this.cfr_renamed_272);
        dataOutputStream.write(sprcya2.cfr_renamed_2);
        dataOutputStream2.writeUTF(sprcya2.cfr_renamed_133.cfr_renamed_1315());
        dataOutputStream2.write(this.cfr_renamed_137);
    }

    static {
        cfr_renamed_114 = new sprcya(439, 2048, 146, 1, 1, 0.165, 490.0, 280.0, 0 != 0, true, 0, new sprtfd());
        cfr_renamed_287 = new sprcya(439, 2048, 9, 8, 5, 1, 1, 0.165, 490.0, 280.0, 0 != 0, true, 0, new sprtfd());
        cfr_renamed_112 = new sprcya(743, 2048, 248, 1, 1, 0.127, 560.0, 360.0, true, 0 != 0, 0, new sprvhd());
        cfr_renamed_79 = new sprcya(743, 2048, 11, 11, 15, 1, 1, 0.127, 560.0, 360.0, true, 0 != 0, 0, new sprvhd());
        cfr_renamed_96 = new sprcya(157, 256, 29, 1, 1, 0.38, 200.0, 80.0, 0 != 0, 0 != 0, 0, new sprtfd());
        cfr_renamed_93 = new sprcya(157, 256, 5, 5, 8, 1, 1, 0.38, 200.0, 80.0, 0 != 0, 0 != 0, 0, new sprtfd());
    }

    public sprcya(InputStream arg0) throws IOException {
        sprcya sprcya2;
        sprcya sprcya3 = this;
        sprcya sprcya4 = this;
        super(new SecureRandom(), 0);
        sprcya4.cfr_renamed_102 = 100;
        sprcya3.cfr_renamed_272 = 6;
        DataInputStream dataInputStream = new DataInputStream(arg0);
        sprcya4.cfr_renamed_88 = dataInputStream.readInt();
        sprcya3.cfr_renamed_953 = dataInputStream.readInt();
        sprcya3.cfr_renamed_31 = dataInputStream.readInt();
        sprcya3.cfr_renamed_152 = dataInputStream.readInt();
        sprcya3.cfr_renamed_126 = dataInputStream.readInt();
        sprcya3.cfr_renamed_0 = dataInputStream.readInt();
        sprcya3.cfr_renamed_132 = dataInputStream.readInt();
        sprcya3.cfr_renamed_4 = dataInputStream.readInt();
        sprcya3.cfr_renamed_86 = dataInputStream.readDouble();
        sprcya3.cfr_renamed_82 = dataInputStream.readDouble();
        sprcya3.cfr_renamed_91 = dataInputStream.readDouble();
        sprcya3.cfr_renamed_102 = dataInputStream.readInt();
        sprcya3.spr\ufe34 = dataInputStream.readBoolean();
        sprcya3.cfr_renamed_107 = dataInputStream.readBoolean();
        sprcya3.cfr_renamed_272 = dataInputStream.readInt();
        sprcya3.cfr_renamed_2 = dataInputStream.read();
        String string = dataInputStream.readUTF();
        if ("SHA-512".equals(string)) {
            sprcya2 = this;
            this.cfr_renamed_133 = new sprvhd();
        } else {
            if ("SHA-256".equals(string)) {
                this.cfr_renamed_133 = new sprtfd();
            }
            sprcya2 = this;
        }
        sprcya2.cfr_renamed_137 = dataInputStream.read();
        this.cfr_renamed_1314();
    }

    /*
     * WARNING - void declaration
     */
    public sprcya(int n, int n2, int n3, int n4, int n5, int n6, int n7, double d, double d2, double d3, boolean bl, boolean bl2, int n8, sprlc sprlc2) {
        void arg13;
        void arg12;
        void arg11;
        void arg10;
        void arg9;
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprcya sprcya2 = this;
        sprcya sprcya3 = this;
        sprcya sprcya4 = this;
        sprcya sprcya5 = this;
        sprcya sprcya6 = this;
        sprcya sprcya7 = this;
        sprcya sprcya8 = this;
        sprcya sprcya9 = this;
        super(new SecureRandom(), (int)arg0);
        this.cfr_renamed_102 = 100;
        sprcya8.cfr_renamed_272 = 6;
        sprcya8.cfr_renamed_88 = arg0;
        sprcya7.cfr_renamed_953 = arg1;
        sprcya7.cfr_renamed_152 = arg2;
        sprcya6.cfr_renamed_126 = arg3;
        sprcya6.cfr_renamed_0 = arg4;
        sprcya5.cfr_renamed_132 = arg5;
        sprcya5.cfr_renamed_4 = arg6;
        sprcya4.cfr_renamed_86 = arg7;
        sprcya4.cfr_renamed_82 = arg8;
        sprcya3.cfr_renamed_91 = arg9;
        sprcya3.spr\ufe34 = arg10;
        sprcya2.cfr_renamed_107 = arg11;
        sprcya2.cfr_renamed_2 = arg12;
        this.cfr_renamed_133 = arg13;
        this.cfr_renamed_137 = 1;
        this.cfr_renamed_1314();
    }

    public sprcya cfr_renamed_1316() {
        if (this.cfr_renamed_137 == 0) {
            sprcya sprcya2 = this;
            sprcya sprcya3 = this;
            sprcya sprcya4 = this;
            sprcya sprcya5 = this;
            sprcya sprcya6 = this;
            return new sprcya(sprcya2.cfr_renamed_88, sprcya2.cfr_renamed_953, sprcya3.cfr_renamed_31, sprcya3.cfr_renamed_132, sprcya4.cfr_renamed_4, sprcya4.cfr_renamed_86, this.cfr_renamed_82, this.cfr_renamed_91, sprcya5.spr\ufe34, sprcya5.cfr_renamed_107, sprcya6.cfr_renamed_2, sprcya6.cfr_renamed_133);
        }
        sprcya sprcya7 = this;
        sprcya sprcya8 = this;
        sprcya sprcya9 = this;
        sprcya sprcya10 = this;
        sprcya sprcya11 = this;
        sprcya sprcya12 = this;
        return new sprcya(sprcya7.cfr_renamed_88, sprcya7.cfr_renamed_953, sprcya8.cfr_renamed_152, sprcya8.cfr_renamed_126, sprcya9.cfr_renamed_0, sprcya9.cfr_renamed_132, sprcya10.cfr_renamed_4, sprcya10.cfr_renamed_86, this.cfr_renamed_82, this.cfr_renamed_91, sprcya11.spr\ufe34, sprcya11.cfr_renamed_107, sprcya12.cfr_renamed_2, sprcya12.cfr_renamed_133);
    }
}

