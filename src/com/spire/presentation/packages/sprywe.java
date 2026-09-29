/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraws;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhcea;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;

public class sprywe
implements Cloneable {
    public int cfr_renamed_107;
    public double cfr_renamed_132;
    public sprgf cfr_renamed_102;
    public int cfr_renamed_93;
    public double cfr_renamed_86;
    public int cfr_renamed_152;
    public double cfr_renamed_112;
    public int cfr_renamed_119;
    public int cfr_renamed_91;
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    public int cfr_renamed_2;
    public double cfr_renamed_3;
    public int cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (!(arg0 instanceof sprywe)) {
            return false;
        }
        sprywe sprywe2 = (sprywe)arg0;
        if (this.cfr_renamed_4 != sprywe2.cfr_renamed_4) {
            return false;
        }
        if (this.cfr_renamed_93 != sprywe2.cfr_renamed_93) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_3) != Double.doubleToLongBits(sprywe2.cfr_renamed_3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_132) != Double.doubleToLongBits(sprywe2.cfr_renamed_132)) {
            return false;
        }
        if (this.cfr_renamed_107 != sprywe2.cfr_renamed_107) {
            return false;
        }
        if (this.cfr_renamed_1 != sprywe2.cfr_renamed_1) {
            return false;
        }
        if (this.cfr_renamed_2 != sprywe2.cfr_renamed_2) {
            return false;
        }
        if (this.cfr_renamed_91 != sprywe2.cfr_renamed_91) {
            return false;
        }
        if (this.cfr_renamed_152 != sprywe2.cfr_renamed_152) {
            return false;
        }
        if (this.cfr_renamed_102 == null ? sprywe2.cfr_renamed_102 != null : !this.cfr_renamed_102.cfr_renamed_1315().equals(sprywe2.cfr_renamed_102.cfr_renamed_1315())) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_86) != Double.doubleToLongBits(sprywe2.cfr_renamed_86)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cfr_renamed_112) != Double.doubleToLongBits(sprywe2.cfr_renamed_112)) {
            return false;
        }
        if (this.cfr_renamed_119 != sprywe2.cfr_renamed_119) {
            return false;
        }
        return this.cfr_renamed_0 == sprywe2.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprywe(int n, int n2, int n3, int n4, int n5, int n6, double d, double d2, double d3, sprgf sprgf2) {
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprywe sprywe2 = this;
        sprywe sprywe3 = this;
        sprywe sprywe4 = this;
        sprywe sprywe5 = this;
        this.cfr_renamed_0 = 100;
        sprywe5.cfr_renamed_107 = 6;
        sprywe5.cfr_renamed_93 = arg0;
        sprywe4.cfr_renamed_119 = arg1;
        sprywe4.cfr_renamed_2 = arg2;
        sprywe3.cfr_renamed_91 = arg3;
        sprywe3.cfr_renamed_152 = arg4;
        sprywe2.cfr_renamed_4 = arg5;
        sprywe2.cfr_renamed_3 = arg6;
        this.cfr_renamed_86 = arg7;
        this.cfr_renamed_102 = sprgf2;
        this.cfr_renamed_1314();
    }

    public sprywe(InputStream arg0) throws IOException {
        sprywe sprywe2;
        sprywe sprywe3 = this;
        sprywe sprywe4 = this;
        sprywe4.cfr_renamed_0 = 100;
        sprywe3.cfr_renamed_107 = 6;
        DataInputStream dataInputStream = new DataInputStream(arg0);
        sprywe4.cfr_renamed_93 = dataInputStream.readInt();
        sprywe3.cfr_renamed_119 = dataInputStream.readInt();
        sprywe3.cfr_renamed_1 = dataInputStream.readInt();
        sprywe3.cfr_renamed_2 = dataInputStream.readInt();
        sprywe3.cfr_renamed_91 = dataInputStream.readInt();
        sprywe3.cfr_renamed_152 = dataInputStream.readInt();
        sprywe3.cfr_renamed_4 = dataInputStream.readInt();
        sprywe3.cfr_renamed_3 = dataInputStream.readDouble();
        sprywe3.cfr_renamed_86 = dataInputStream.readDouble();
        sprywe3.cfr_renamed_0 = dataInputStream.readInt();
        sprywe3.cfr_renamed_107 = dataInputStream.readInt();
        String string = dataInputStream.readUTF();
        if ("SHA-512".equals(string)) {
            sprywe2 = this;
            this.cfr_renamed_102 = new sprocl();
        } else {
            if ("SHA-256".equals(string)) {
                this.cfr_renamed_102 = new sprohl();
            }
            sprywe2 = this;
        }
        sprywe2.cfr_renamed_1314();
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = dataOutputStream = new DataOutputStream(arg0);
        sprywe sprywe2 = this;
        DataOutputStream dataOutputStream3 = dataOutputStream;
        sprywe sprywe3 = this;
        DataOutputStream dataOutputStream4 = dataOutputStream;
        sprywe sprywe4 = this;
        DataOutputStream dataOutputStream5 = dataOutputStream;
        sprywe sprywe5 = this;
        dataOutputStream.writeInt(sprywe5.cfr_renamed_93);
        dataOutputStream5.writeInt(sprywe5.cfr_renamed_119);
        dataOutputStream5.writeInt(this.cfr_renamed_1);
        dataOutputStream.writeInt(sprywe4.cfr_renamed_2);
        dataOutputStream4.writeInt(sprywe4.cfr_renamed_91);
        dataOutputStream4.writeInt(this.cfr_renamed_152);
        dataOutputStream.writeInt(sprywe3.cfr_renamed_4);
        dataOutputStream3.writeDouble(sprywe3.cfr_renamed_3);
        dataOutputStream3.writeDouble(this.cfr_renamed_86);
        dataOutputStream.writeInt(sprywe2.cfr_renamed_0);
        dataOutputStream2.writeInt(sprywe2.cfr_renamed_107);
        dataOutputStream2.writeUTF(this.cfr_renamed_102.cfr_renamed_1315());
    }

    public String toString() {
        StringBuilder stringBuilder;
        DecimalFormat decimalFormat = new DecimalFormat(spraws.cfr_renamed_9("y\u000fy\u0011"));
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(new StringBuilder().insert(0, sprhcea.cfr_renamed_9("\u000eh:o<u(s8Q<s<l8u8s.)\u0013<")).append(this.cfr_renamed_93).append(spraws.cfr_renamed_9("\u00018\u001c")).append(this.cfr_renamed_119).toString());
        stringBuilder2.append(sprhcea.cfr_renamed_9("!\u001f<") + this.cfr_renamed_4 + spraws.cfr_renamed_9("iC,U(\u001c") + decimalFormat.format(this.cfr_renamed_3) + sprhcea.cfr_renamed_9("!3n/l\u001fn(o9<") + decimalFormat.format(this.cfr_renamed_86) + spraws.cfr_renamed_9("\u0001!@:I\bM.\u001c") + this.cfr_renamed_102 + ")");
        return stringBuilder2.toString();
    }

    public sprywe cfr_renamed_1316() {
        sprywe sprywe2 = this;
        sprywe sprywe3 = this;
        return new sprywe(sprywe2.cfr_renamed_93, sprywe2.cfr_renamed_119, sprywe3.cfr_renamed_1, sprywe3.cfr_renamed_4, this.cfr_renamed_3, this.cfr_renamed_86, this.cfr_renamed_102);
    }

    private /* synthetic */ void cfr_renamed_1314() {
        sprywe sprywe2 = this;
        this.cfr_renamed_132 = sprywe2.cfr_renamed_3 * this.cfr_renamed_3;
        sprywe2.cfr_renamed_112 = sprywe2.cfr_renamed_86 * this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    public sprywe(int n, int n2, int n3, int n4, double d, double d2, sprgf sprgf2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprywe sprywe2 = this;
        sprywe sprywe3 = this;
        sprywe sprywe4 = this;
        this.cfr_renamed_0 = 100;
        sprywe4.cfr_renamed_107 = 6;
        sprywe4.cfr_renamed_93 = arg0;
        sprywe3.cfr_renamed_119 = arg1;
        sprywe3.cfr_renamed_1 = arg2;
        sprywe2.cfr_renamed_4 = arg3;
        sprywe2.cfr_renamed_3 = arg4;
        this.cfr_renamed_86 = arg5;
        this.cfr_renamed_102 = sprgf2;
        this.cfr_renamed_1314();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 5 << 4 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public int hashCode() {
        long l;
        int n = 1;
        n = 31 * n + this.cfr_renamed_4;
        n = 31 * n + this.cfr_renamed_93;
        sprywe sprywe2 = this;
        long l2 = l = Double.doubleToLongBits(sprywe2.cfr_renamed_3);
        n = 31 * n + (int)(l2 ^ l2 >>> 32);
        long l3 = l = Double.doubleToLongBits(sprywe2.cfr_renamed_132);
        n = 31 * n + (int)(l3 ^ l3 >>> 32);
        n = 31 * n + this.cfr_renamed_107;
        n = 31 * n + this.cfr_renamed_1;
        n = 31 * n + this.cfr_renamed_2;
        n = 31 * n + this.cfr_renamed_91;
        n = 31 * n + this.cfr_renamed_152;
        n = 31 * n + (this.cfr_renamed_102 == null ? 0 : this.cfr_renamed_102.cfr_renamed_1315().hashCode());
        sprywe sprywe3 = this;
        long l4 = l = Double.doubleToLongBits(sprywe3.cfr_renamed_86);
        n = 31 * n + (int)(l4 ^ l4 >>> 32);
        long l5 = l = Double.doubleToLongBits(sprywe3.cfr_renamed_112);
        n = 31 * n + (int)(l5 ^ l5 >>> 32);
        n = 31 * n + this.cfr_renamed_119;
        n = 31 * n + this.cfr_renamed_0;
        return n;
    }
}

