/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfaa;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprtaz;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprywe;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;

public class sproaf
extends sprgye
implements Cloneable {
    public int cfr_renamed_287;
    public double cfr_renamed_724;
    public static final sproaf cfr_renamed_953;
    public static final int cfr_renamed_133 = 1;
    public static final sproaf cfr_renamed_185;
    public static final sproaf spr\ufe34;
    public double cfr_renamed_82;
    public static final sproaf cfr_renamed_126;
    public int cfr_renamed_88;
    public int cfr_renamed_31;
    public int cfr_renamed_272;
    public static final sproaf cfr_renamed_145;
    public double cfr_renamed_114;
    public int cfr_renamed_96;
    public int cfr_renamed_105;
    public int cfr_renamed_137;
    public double cfr_renamed_79;
    public static final sproaf cfr_renamed_107;
    public int cfr_renamed_132;
    public static final int cfr_renamed_102 = 1;
    public double cfr_renamed_93;
    public static final int cfr_renamed_86 = 0;
    public int cfr_renamed_152;
    public double cfr_renamed_112;
    public int cfr_renamed_119;
    public int cfr_renamed_91;
    public boolean cfr_renamed_0;
    public int cfr_renamed_1;
    public sprgf cfr_renamed_2;
    public static final int cfr_renamed_3 = 0;
    public boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sproaf(int n, int n2, int n3, int n4, int n5, int n6, int n7, double d, double d2, double d3, boolean bl, boolean bl2, int n8, sprgf sprgf2) {
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
        sproaf sproaf2 = this;
        sproaf sproaf3 = this;
        sproaf sproaf4 = this;
        sproaf sproaf5 = this;
        sproaf sproaf6 = this;
        sproaf sproaf7 = this;
        sproaf sproaf8 = this;
        super(sprybl.cfr_renamed_2794(), (int)arg0);
        this.cfr_renamed_96 = 100;
        sproaf8.cfr_renamed_91 = 6;
        sproaf8.cfr_renamed_137 = arg0;
        sproaf7.cfr_renamed_287 = arg1;
        sproaf7.cfr_renamed_88 = arg2;
        sproaf6.cfr_renamed_152 = arg3;
        sproaf6.cfr_renamed_132 = arg4;
        sproaf5.cfr_renamed_119 = arg5;
        sproaf5.cfr_renamed_272 = arg6;
        sproaf4.cfr_renamed_82 = arg7;
        sproaf4.cfr_renamed_112 = arg8;
        sproaf3.cfr_renamed_724 = arg9;
        sproaf3.cfr_renamed_4 = arg10;
        sproaf2.cfr_renamed_0 = arg11;
        sproaf2.cfr_renamed_31 = arg12;
        this.cfr_renamed_2 = arg13;
        this.cfr_renamed_1 = 1;
        this.cfr_renamed_1314();
    }

    public int hashCode() {
        long l;
        int n = 1;
        n = 31 * n + this.cfr_renamed_119;
        n = 31 * n + this.cfr_renamed_137;
        n = 31 * n + this.cfr_renamed_272;
        sproaf sproaf2 = this;
        long l2 = l = Double.doubleToLongBits(sproaf2.cfr_renamed_82);
        n = 31 * n + (int)(l2 ^ l2 >>> 32);
        long l3 = l = Double.doubleToLongBits(sproaf2.cfr_renamed_114);
        n = 31 * n + (int)(l3 ^ l3 >>> 32);
        n = 31 * n + this.cfr_renamed_91;
        n = 31 * n + this.cfr_renamed_105;
        n = 31 * n + this.cfr_renamed_88;
        n = 31 * n + this.cfr_renamed_152;
        n = 31 * n + this.cfr_renamed_132;
        n = 31 * n + (this.cfr_renamed_2 == null ? 0 : this.cfr_renamed_2.cfr_renamed_1315().hashCode());
        n = 31 * n + this.cfr_renamed_31;
        sproaf sproaf3 = this;
        long l4 = l = Double.doubleToLongBits(sproaf3.cfr_renamed_724);
        n = 31 * n + (int)(l4 ^ l4 >>> 32);
        long l5 = l = Double.doubleToLongBits(sproaf3.cfr_renamed_79);
        n = 31 * n + (int)(l5 ^ l5 >>> 32);
        long l6 = l = Double.doubleToLongBits(sproaf3.cfr_renamed_112);
        n = 31 * n + (int)(l6 ^ l6 >>> 32);
        long l7 = l = Double.doubleToLongBits(sproaf3.cfr_renamed_93);
        n = 31 * n + (int)(l7 ^ l7 >>> 32);
        n = 31 * n + this.cfr_renamed_1;
        n = 31 * n + (this.cfr_renamed_4 ? 1231 : 1237);
        n = 31 * n + this.cfr_renamed_287;
        n = 31 * n + this.cfr_renamed_96;
        n = 31 * n + (this.cfr_renamed_0 ? 1231 : 1237);
        return n;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (!(arg0 instanceof sproaf)) {
            return false;
        }
        sproaf sproaf2 = (sproaf)arg0;
        if (this.cfr_renamed_119 != sproaf2.cfr_renamed_119) {
            return false;
        }
        if (this.cfr_renamed_137 != sproaf2.cfr_renamed_137) {
            return false;
        }
        if (this.cfr_renamed_272 != sproaf2.cfr_renamed_272) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_82) != Double.doubleToLongBits(sproaf2.cfr_renamed_82)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_114) != Double.doubleToLongBits(sproaf2.cfr_renamed_114)) {
            return false;
        }
        if (this.cfr_renamed_91 != sproaf2.cfr_renamed_91) {
            return false;
        }
        if (this.cfr_renamed_105 != sproaf2.cfr_renamed_105) {
            return false;
        }
        if (this.cfr_renamed_88 != sproaf2.cfr_renamed_88) {
            return false;
        }
        if (this.cfr_renamed_152 != sproaf2.cfr_renamed_152) {
            return false;
        }
        if (this.cfr_renamed_132 != sproaf2.cfr_renamed_132) {
            return false;
        }
        if (this.cfr_renamed_2 == null ? sproaf2.cfr_renamed_2 != null : !this.cfr_renamed_2.cfr_renamed_1315().equals(sproaf2.cfr_renamed_2.cfr_renamed_1315())) {
            return false;
        }
        if (this.cfr_renamed_31 != sproaf2.cfr_renamed_31) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_724) != Double.doubleToLongBits(sproaf2.cfr_renamed_724)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_79) != Double.doubleToLongBits(sproaf2.cfr_renamed_79)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_112) != Double.doubleToLongBits(sproaf2.cfr_renamed_112)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_93) != Double.doubleToLongBits(sproaf2.cfr_renamed_93)) {
            return false;
        }
        if (this.cfr_renamed_1 != sproaf2.cfr_renamed_1) {
            return false;
        }
        if (this.cfr_renamed_4 != sproaf2.cfr_renamed_4) {
            return false;
        }
        if (this.cfr_renamed_287 != sproaf2.cfr_renamed_287) {
            return false;
        }
        if (this.cfr_renamed_96 != sproaf2.cfr_renamed_96) {
            return false;
        }
        return this.cfr_renamed_0 == sproaf2.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_1314() {
        sproaf sproaf2 = this;
        this.cfr_renamed_114 = sproaf2.cfr_renamed_82 * this.cfr_renamed_82;
        sproaf2.cfr_renamed_93 = sproaf2.cfr_renamed_112 * this.cfr_renamed_112;
        sproaf2.cfr_renamed_79 = sproaf2.cfr_renamed_724 * this.cfr_renamed_724;
    }

    static {
        cfr_renamed_107 = new sproaf(439, 2048, 146, 1, 1, 0.165, 490.0, 280.0, 0 != 0, true, 0, new sprohl());
        cfr_renamed_953 = new sproaf(439, 2048, 9, 8, 5, 1, 1, 0.165, 490.0, 280.0, 0 != 0, true, 0, new sprohl());
        cfr_renamed_145 = new sproaf(743, 2048, 248, 1, 1, 0.127, 560.0, 360.0, true, 0 != 0, 0, new sprocl());
        spr\ufe34 = new sproaf(743, 2048, 11, 11, 15, 1, 1, 0.127, 560.0, 360.0, true, 0 != 0, 0, new sprocl());
        cfr_renamed_126 = new sproaf(157, 256, 29, 1, 1, 0.38, 200.0, 80.0, 0 != 0, 0 != 0, 0, new sprohl());
        cfr_renamed_185 = new sproaf(157, 256, 5, 5, 8, 1, 1, 0.38, 200.0, 80.0, 0 != 0, 0 != 0, 0, new sprohl());
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = dataOutputStream = new DataOutputStream(arg0);
        sproaf sproaf2 = this;
        DataOutputStream dataOutputStream3 = dataOutputStream;
        sproaf sproaf3 = this;
        DataOutputStream dataOutputStream4 = dataOutputStream;
        sproaf sproaf4 = this;
        DataOutputStream dataOutputStream5 = dataOutputStream;
        sproaf sproaf5 = this;
        DataOutputStream dataOutputStream6 = dataOutputStream;
        sproaf sproaf6 = this;
        DataOutputStream dataOutputStream7 = dataOutputStream;
        sproaf sproaf7 = this;
        dataOutputStream.writeInt(sproaf7.cfr_renamed_137);
        dataOutputStream7.writeInt(sproaf7.cfr_renamed_287);
        dataOutputStream7.writeInt(this.cfr_renamed_105);
        dataOutputStream.writeInt(sproaf6.cfr_renamed_88);
        dataOutputStream6.writeInt(sproaf6.cfr_renamed_152);
        dataOutputStream6.writeInt(this.cfr_renamed_132);
        dataOutputStream.writeInt(sproaf5.cfr_renamed_119);
        dataOutputStream5.writeInt(sproaf5.cfr_renamed_272);
        dataOutputStream5.writeDouble(this.cfr_renamed_82);
        dataOutputStream.writeDouble(sproaf4.cfr_renamed_112);
        dataOutputStream4.writeDouble(sproaf4.cfr_renamed_724);
        dataOutputStream4.writeInt(this.cfr_renamed_96);
        dataOutputStream.writeBoolean(sproaf3.cfr_renamed_4);
        dataOutputStream3.writeBoolean(sproaf3.cfr_renamed_0);
        dataOutputStream3.writeInt(this.cfr_renamed_91);
        dataOutputStream.write(sproaf2.cfr_renamed_31);
        dataOutputStream2.writeUTF(sproaf2.cfr_renamed_2.cfr_renamed_1315());
        dataOutputStream2.write(this.cfr_renamed_1);
    }

    public sprywe cfr_renamed_1312() {
        sproaf sproaf2 = this;
        sproaf sproaf3 = this;
        return new sprywe(sproaf2.cfr_renamed_137, sproaf2.cfr_renamed_287, sproaf3.cfr_renamed_105, sproaf3.cfr_renamed_119, this.cfr_renamed_82, this.cfr_renamed_112, this.cfr_renamed_2);
    }

    public String toString() {
        StringBuilder stringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat(sprtaz.cfr_renamed_9(":\u0014:\n"));
        StringBuilder stringBuilder2 = new StringBuilder(new StringBuilder().insert(0, sprdfaa.cfr_renamed_9("2]\u0006Z\u0000@\u0014F\u0004d\u0000F\u0000Y\u0004@\u0004F\u0012\u001c/\t")).append(this.cfr_renamed_137).append(sprtaz.cfr_renamed_9("\u001a{\u0007")).append(this.cfr_renamed_287).toString());
        if (this.cfr_renamed_1 == 0) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder = stringBuilder3;
            stringBuilder3.append(sprdfaa.cfr_renamed_9("\u0014\u0011[\rM5M\u0011Q\\g(y1x$\u0014\u0005\t") + this.cfr_renamed_105);
        } else {
            StringBuilder stringBuilder4 = stringBuilder2;
            stringBuilder = stringBuilder4;
            stringBuilder4.append(new StringBuilder().insert(0, sprtaz.cfr_renamed_9("\u001azUfC^Cz_7jXuNoIn*^;\u0007")).append(this.cfr_renamed_88).append(sprdfaa.cfr_renamed_9("APS\t")).append(this.cfr_renamed_152).append(sprtaz.cfr_renamed_9("*^9\u0007")).append(this.cfr_renamed_132).toString());
        }
        stringBuilder.append(new StringBuilder().insert(0, sprdfaa.cfr_renamed_9("\u0014#\t")).append(this.cfr_renamed_119).append(sprtaz.cfr_renamed_9("\u001ah[ySynsJo\u0007")).append(this.cfr_renamed_272).append(sprdfaa.cfr_renamed_9("AV\u0004@\u0000\t")).append(decimalFormat.format(this.cfr_renamed_82)).append(sprtaz.cfr_renamed_9("\u001adUxWHU\u007fTn\u0007")).append(decimalFormat.format(this.cfr_renamed_112)).append(sprdfaa.cfr_renamed_9("A_\u0004M/[\u0013Y#[\u0014Z\u0005\t")).append(decimalFormat.format(this.cfr_renamed_724)).append(sprtaz.cfr_renamed_9("\u001azHcWo\u0007")).append(this.cfr_renamed_4).append(sprdfaa.cfr_renamed_9("AG\u0011U\u0013G\u0004\t")).append(this.cfr_renamed_0).append(sprtaz.cfr_renamed_9("\u001aa_s}oTKVm\u0007")).append(this.cfr_renamed_31).append(sprdfaa.cfr_renamed_9("\u0014\tU\u0012\\ X\u0006\t")).append(this.cfr_renamed_2).append(")").toString());
        return stringBuilder2.toString();
    }

    public sproaf cfr_renamed_1316() {
        if (this.cfr_renamed_1 == 0) {
            sproaf sproaf2 = this;
            sproaf sproaf3 = this;
            sproaf sproaf4 = this;
            sproaf sproaf5 = this;
            sproaf sproaf6 = this;
            return new sproaf(sproaf2.cfr_renamed_137, sproaf2.cfr_renamed_287, sproaf3.cfr_renamed_105, sproaf3.cfr_renamed_119, sproaf4.cfr_renamed_272, sproaf4.cfr_renamed_82, this.cfr_renamed_112, this.cfr_renamed_724, sproaf5.cfr_renamed_4, sproaf5.cfr_renamed_0, sproaf6.cfr_renamed_31, sproaf6.cfr_renamed_2);
        }
        sproaf sproaf7 = this;
        sproaf sproaf8 = this;
        sproaf sproaf9 = this;
        sproaf sproaf10 = this;
        sproaf sproaf11 = this;
        sproaf sproaf12 = this;
        return new sproaf(sproaf7.cfr_renamed_137, sproaf7.cfr_renamed_287, sproaf8.cfr_renamed_88, sproaf8.cfr_renamed_152, sproaf9.cfr_renamed_132, sproaf9.cfr_renamed_119, sproaf10.cfr_renamed_272, sproaf10.cfr_renamed_82, this.cfr_renamed_112, this.cfr_renamed_724, sproaf11.cfr_renamed_4, sproaf11.cfr_renamed_0, sproaf12.cfr_renamed_31, sproaf12.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sproaf(int n, int n2, int n3, int n4, int n5, double d, double d2, double d3, boolean bl, boolean bl2, int n6, sprgf sprgf2) {
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
        sproaf sproaf2 = this;
        sproaf sproaf3 = this;
        sproaf sproaf4 = this;
        sproaf sproaf5 = this;
        sproaf sproaf6 = this;
        sproaf sproaf7 = this;
        super(sprybl.cfr_renamed_2794(), (int)arg0);
        this.cfr_renamed_96 = 100;
        sproaf7.cfr_renamed_91 = 6;
        sproaf7.cfr_renamed_137 = arg0;
        sproaf6.cfr_renamed_287 = arg1;
        sproaf6.cfr_renamed_105 = arg2;
        sproaf5.cfr_renamed_119 = arg3;
        sproaf5.cfr_renamed_272 = arg4;
        sproaf4.cfr_renamed_82 = arg5;
        sproaf4.cfr_renamed_112 = arg6;
        sproaf3.cfr_renamed_724 = arg7;
        sproaf3.cfr_renamed_4 = arg8;
        sproaf2.cfr_renamed_0 = arg9;
        sproaf2.cfr_renamed_31 = arg10;
        this.cfr_renamed_2 = arg11;
        this.cfr_renamed_1 = 0;
        this.cfr_renamed_1314();
    }

    public sproaf(InputStream arg0) throws IOException {
        sproaf sproaf2;
        sproaf sproaf3 = this;
        sproaf sproaf4 = this;
        super(sprybl.cfr_renamed_2794(), 0);
        sproaf4.cfr_renamed_96 = 100;
        sproaf3.cfr_renamed_91 = 6;
        DataInputStream dataInputStream = new DataInputStream(arg0);
        sproaf4.cfr_renamed_137 = dataInputStream.readInt();
        sproaf3.cfr_renamed_287 = dataInputStream.readInt();
        sproaf3.cfr_renamed_105 = dataInputStream.readInt();
        sproaf3.cfr_renamed_88 = dataInputStream.readInt();
        sproaf3.cfr_renamed_152 = dataInputStream.readInt();
        sproaf3.cfr_renamed_132 = dataInputStream.readInt();
        sproaf3.cfr_renamed_119 = dataInputStream.readInt();
        sproaf3.cfr_renamed_272 = dataInputStream.readInt();
        sproaf3.cfr_renamed_82 = dataInputStream.readDouble();
        sproaf3.cfr_renamed_112 = dataInputStream.readDouble();
        sproaf3.cfr_renamed_724 = dataInputStream.readDouble();
        sproaf3.cfr_renamed_96 = dataInputStream.readInt();
        sproaf3.cfr_renamed_4 = dataInputStream.readBoolean();
        sproaf3.cfr_renamed_0 = dataInputStream.readBoolean();
        sproaf3.cfr_renamed_91 = dataInputStream.readInt();
        sproaf3.cfr_renamed_31 = dataInputStream.read();
        String string = dataInputStream.readUTF();
        if ("SHA-512".equals(string)) {
            sproaf2 = this;
            this.cfr_renamed_2 = new sprocl();
        } else {
            if ("SHA-256".equals(string)) {
                this.cfr_renamed_2 = new sprohl();
            }
            sproaf2 = this;
        }
        sproaf2.cfr_renamed_1 = dataInputStream.read();
        this.cfr_renamed_1314();
    }
}

