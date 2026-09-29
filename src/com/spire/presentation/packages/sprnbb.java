/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.sprjjo;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprvhd;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;

public class sprnbb
implements Cloneable {
    public int cfr_renamed_107;
    public int cfr_renamed_132;
    public int cfr_renamed_102;
    public int cfr_renamed_93;
    public int cfr_renamed_86;
    public int cfr_renamed_152;
    public int cfr_renamed_112;
    public double cfr_renamed_119;
    public double cfr_renamed_91;
    public int cfr_renamed_0;
    public sprlc cfr_renamed_1;
    public int cfr_renamed_2;
    public double cfr_renamed_3;
    public double cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnbb(int n, int n2, int n3, int n4, int n5, int n6, double d, double d2, double d3, sprlc sprlc2) {
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprnbb sprnbb2 = this;
        sprnbb sprnbb3 = this;
        sprnbb sprnbb4 = this;
        sprnbb sprnbb5 = this;
        this.cfr_renamed_102 = 100;
        sprnbb5.cfr_renamed_132 = 6;
        sprnbb5.cfr_renamed_112 = arg0;
        sprnbb4.cfr_renamed_107 = arg1;
        sprnbb4.cfr_renamed_93 = arg2;
        sprnbb3.cfr_renamed_86 = arg3;
        sprnbb3.cfr_renamed_2 = arg4;
        sprnbb2.cfr_renamed_152 = arg5;
        sprnbb2.cfr_renamed_91 = arg6;
        this.cfr_renamed_4 = arg7;
        this.cfr_renamed_1 = sprlc2;
        this.cfr_renamed_1314();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (!(arg0 instanceof sprnbb)) {
            return false;
        }
        sprnbb sprnbb2 = (sprnbb)arg0;
        if (this.cfr_renamed_152 != sprnbb2.cfr_renamed_152) {
            return false;
        }
        if (this.cfr_renamed_112 != sprnbb2.cfr_renamed_112) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_91) != Double.doubleToLongBits(sprnbb2.cfr_renamed_91)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_119) != Double.doubleToLongBits(sprnbb2.cfr_renamed_119)) {
            return false;
        }
        if (this.cfr_renamed_132 != sprnbb2.cfr_renamed_132) {
            return false;
        }
        if (this.cfr_renamed_0 != sprnbb2.cfr_renamed_0) {
            return false;
        }
        if (this.cfr_renamed_93 != sprnbb2.cfr_renamed_93) {
            return false;
        }
        if (this.cfr_renamed_86 != sprnbb2.cfr_renamed_86) {
            return false;
        }
        if (this.cfr_renamed_2 != sprnbb2.cfr_renamed_2) {
            return false;
        }
        if (this.cfr_renamed_1 == null ? sprnbb2.cfr_renamed_1 != null : !this.cfr_renamed_1.cfr_renamed_1315().equals(sprnbb2.cfr_renamed_1.cfr_renamed_1315())) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_4) != Double.doubleToLongBits(sprnbb2.cfr_renamed_4)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_3) != Double.doubleToLongBits(sprnbb2.cfr_renamed_3)) {
            return false;
        }
        if (this.cfr_renamed_107 != sprnbb2.cfr_renamed_107) {
            return false;
        }
        return this.cfr_renamed_102 == sprnbb2.cfr_renamed_102;
    }

    public String toString() {
        StringBuilder stringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat(sprjjo.cfr_renamed_9("\u0016O\u0016Q"));
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(new StringBuilder().insert(0, sprhky.cfr_renamed_9("\u000f\u0014;\u0013=\t)\u000f9-=\u000f=\u00109\t9\u000f/U\u0012@")).append(this.cfr_renamed_112).append(sprjjo.cfr_renamed_9("AW\\")).append(this.cfr_renamed_107).toString());
        stringBuilder2.append(sprhky.cfr_renamed_9("]\u001e@") + this.cfr_renamed_152 + sprjjo.cfr_renamed_9("\u0006\u0003C\u0015G\\") + decimalFormat.format(this.cfr_renamed_91) + sprhky.cfr_renamed_9("]2\u0012.\u0010\u001e\u0012)\u00138@") + decimalFormat.format(this.cfr_renamed_4) + sprjjo.cfr_renamed_9("AN\u0000U\tg\rA\\") + this.cfr_renamed_1 + ")");
        return stringBuilder2.toString();
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = dataOutputStream = new DataOutputStream(arg0);
        sprnbb sprnbb2 = this;
        DataOutputStream dataOutputStream3 = dataOutputStream;
        sprnbb sprnbb3 = this;
        DataOutputStream dataOutputStream4 = dataOutputStream;
        sprnbb sprnbb4 = this;
        DataOutputStream dataOutputStream5 = dataOutputStream;
        sprnbb sprnbb5 = this;
        dataOutputStream.writeInt(sprnbb5.cfr_renamed_112);
        dataOutputStream5.writeInt(sprnbb5.cfr_renamed_107);
        dataOutputStream5.writeInt(this.cfr_renamed_0);
        dataOutputStream.writeInt(sprnbb4.cfr_renamed_93);
        dataOutputStream4.writeInt(sprnbb4.cfr_renamed_86);
        dataOutputStream4.writeInt(this.cfr_renamed_2);
        dataOutputStream.writeInt(sprnbb3.cfr_renamed_152);
        dataOutputStream3.writeDouble(sprnbb3.cfr_renamed_91);
        dataOutputStream3.writeDouble(this.cfr_renamed_4);
        dataOutputStream.writeInt(sprnbb2.cfr_renamed_102);
        dataOutputStream2.writeInt(sprnbb2.cfr_renamed_132);
        dataOutputStream2.writeUTF(this.cfr_renamed_1.cfr_renamed_1315());
    }

    public sprnbb(InputStream arg0) throws IOException {
        sprnbb sprnbb2;
        sprnbb sprnbb3 = this;
        sprnbb sprnbb4 = this;
        sprnbb4.cfr_renamed_102 = 100;
        sprnbb3.cfr_renamed_132 = 6;
        DataInputStream dataInputStream = new DataInputStream(arg0);
        sprnbb4.cfr_renamed_112 = dataInputStream.readInt();
        sprnbb3.cfr_renamed_107 = dataInputStream.readInt();
        sprnbb3.cfr_renamed_0 = dataInputStream.readInt();
        sprnbb3.cfr_renamed_93 = dataInputStream.readInt();
        sprnbb3.cfr_renamed_86 = dataInputStream.readInt();
        sprnbb3.cfr_renamed_2 = dataInputStream.readInt();
        sprnbb3.cfr_renamed_152 = dataInputStream.readInt();
        sprnbb3.cfr_renamed_91 = dataInputStream.readDouble();
        sprnbb3.cfr_renamed_4 = dataInputStream.readDouble();
        sprnbb3.cfr_renamed_102 = dataInputStream.readInt();
        sprnbb3.cfr_renamed_132 = dataInputStream.readInt();
        String string = dataInputStream.readUTF();
        if ("SHA-512".equals(string)) {
            sprnbb2 = this;
            this.cfr_renamed_1 = new sprvhd();
        } else {
            if ("SHA-256".equals(string)) {
                this.cfr_renamed_1 = new sprtfd();
            }
            sprnbb2 = this;
        }
        sprnbb2.cfr_renamed_1314();
    }

    public sprnbb cfr_renamed_1316() {
        sprnbb sprnbb2 = this;
        sprnbb sprnbb3 = this;
        return new sprnbb(sprnbb2.cfr_renamed_112, sprnbb2.cfr_renamed_107, sprnbb3.cfr_renamed_0, sprnbb3.cfr_renamed_152, this.cfr_renamed_91, this.cfr_renamed_4, this.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    public sprnbb(int n, int n2, int n3, int n4, double d, double d2, sprlc sprlc2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprnbb sprnbb2 = this;
        sprnbb sprnbb3 = this;
        sprnbb sprnbb4 = this;
        this.cfr_renamed_102 = 100;
        sprnbb4.cfr_renamed_132 = 6;
        sprnbb4.cfr_renamed_112 = arg0;
        sprnbb3.cfr_renamed_107 = arg1;
        sprnbb3.cfr_renamed_0 = arg2;
        sprnbb2.cfr_renamed_152 = arg3;
        sprnbb2.cfr_renamed_91 = arg4;
        this.cfr_renamed_4 = arg5;
        this.cfr_renamed_1 = sprlc2;
        this.cfr_renamed_1314();
    }

    public int hashCode() {
        long l;
        int n = 1;
        n = 31 * n + this.cfr_renamed_152;
        n = 31 * n + this.cfr_renamed_112;
        sprnbb sprnbb2 = this;
        long l2 = l = Double.doubleToLongBits(sprnbb2.cfr_renamed_91);
        n = 31 * n + (int)(l2 ^ l2 >>> 32);
        long l3 = l = Double.doubleToLongBits(sprnbb2.cfr_renamed_119);
        n = 31 * n + (int)(l3 ^ l3 >>> 32);
        n = 31 * n + this.cfr_renamed_132;
        n = 31 * n + this.cfr_renamed_0;
        n = 31 * n + this.cfr_renamed_93;
        n = 31 * n + this.cfr_renamed_86;
        n = 31 * n + this.cfr_renamed_2;
        n = 31 * n + (this.cfr_renamed_1 == null ? 0 : this.cfr_renamed_1.cfr_renamed_1315().hashCode());
        sprnbb sprnbb3 = this;
        long l4 = l = Double.doubleToLongBits(sprnbb3.cfr_renamed_4);
        n = 31 * n + (int)(l4 ^ l4 >>> 32);
        long l5 = l = Double.doubleToLongBits(sprnbb3.cfr_renamed_3);
        n = 31 * n + (int)(l5 ^ l5 >>> 32);
        n = 31 * n + this.cfr_renamed_107;
        n = 31 * n + this.cfr_renamed_102;
        return n;
    }

    private /* synthetic */ void cfr_renamed_1314() {
        sprnbb sprnbb2 = this;
        this.cfr_renamed_119 = sprnbb2.cfr_renamed_91 * this.cfr_renamed_91;
        sprnbb2.cfr_renamed_3 = sprnbb2.cfr_renamed_4 * this.cfr_renamed_4;
    }
}

