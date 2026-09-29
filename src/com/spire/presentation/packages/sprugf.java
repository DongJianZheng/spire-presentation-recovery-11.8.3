/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprmze;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprseca;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class sprugf
implements Cloneable {
    public int cfr_renamed_185;
    public int spr\ufe34;
    public int cfr_renamed_82;
    public int cfr_renamed_126;
    public int cfr_renamed_88;
    public int cfr_renamed_31;
    public byte[] cfr_renamed_272;
    public int cfr_renamed_145;
    public int cfr_renamed_114;
    public int cfr_renamed_96;
    public int cfr_renamed_105;
    public boolean cfr_renamed_137;
    public int cfr_renamed_79;
    public int cfr_renamed_107;
    public int cfr_renamed_132;
    public int cfr_renamed_102;
    public int cfr_renamed_93;
    public int cfr_renamed_86;
    public int cfr_renamed_152;
    public int cfr_renamed_112;
    public int cfr_renamed_119;
    public int cfr_renamed_91;
    public boolean cfr_renamed_0;
    public int cfr_renamed_1;
    public sprgf cfr_renamed_2;
    public boolean cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprugf(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl, byte[] byArray, boolean bl2, boolean bl3, sprgf sprgf2) {
        void arg11;
        void arg10;
        void arg9;
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg3;
        void arg4;
        void arg2;
        void arg1;
        void arg0;
        sprugf sprugf2 = this;
        sprugf sprugf3 = this;
        sprugf sprugf4 = this;
        sprugf sprugf5 = this;
        sprugf sprugf6 = this;
        sprugf sprugf7 = this;
        sprugf7.cfr_renamed_119 = arg0;
        sprugf7.cfr_renamed_93 = arg1;
        sprugf6.cfr_renamed_31 = arg2;
        sprugf6.cfr_renamed_152 = arg4;
        sprugf5.cfr_renamed_4 = arg3;
        sprugf5.cfr_renamed_1 = arg5;
        sprugf4.cfr_renamed_105 = arg6;
        sprugf4.cfr_renamed_86 = arg7;
        sprugf3.cfr_renamed_137 = arg8;
        sprugf3.cfr_renamed_272 = arg9;
        sprugf2.cfr_renamed_0 = arg10;
        sprugf2.cfr_renamed_3 = arg11;
        this.cfr_renamed_185 = 0;
        this.cfr_renamed_2 = sprgf2;
        this.cfr_renamed_1314();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (this.getClass() != arg0.getClass()) {
            return false;
        }
        sprugf sprugf2 = (sprugf)arg0;
        if (this.cfr_renamed_119 != sprugf2.cfr_renamed_119) {
            return false;
        }
        if (this.cfr_renamed_102 != sprugf2.cfr_renamed_102) {
            return false;
        }
        if (this.cfr_renamed_145 != sprugf2.cfr_renamed_145) {
            return false;
        }
        if (this.cfr_renamed_1 != sprugf2.cfr_renamed_1) {
            return false;
        }
        if (this.cfr_renamed_152 != sprugf2.cfr_renamed_152) {
            return false;
        }
        if (this.cfr_renamed_31 != sprugf2.cfr_renamed_31) {
            return false;
        }
        if (this.cfr_renamed_132 != sprugf2.cfr_renamed_132) {
            return false;
        }
        if (this.cfr_renamed_82 != sprugf2.cfr_renamed_82) {
            return false;
        }
        if (this.cfr_renamed_112 != sprugf2.cfr_renamed_112) {
            return false;
        }
        if (this.cfr_renamed_79 != sprugf2.cfr_renamed_79) {
            return false;
        }
        if (this.cfr_renamed_4 != sprugf2.cfr_renamed_4) {
            return false;
        }
        if (this.spr\ufe34 != sprugf2.spr\ufe34) {
            return false;
        }
        if (this.cfr_renamed_88 != sprugf2.cfr_renamed_88) {
            return false;
        }
        if (this.cfr_renamed_126 != sprugf2.cfr_renamed_126) {
            return false;
        }
        if (this.cfr_renamed_96 != sprugf2.cfr_renamed_96) {
            return false;
        }
        if (this.cfr_renamed_3 != sprugf2.cfr_renamed_3) {
            return false;
        }
        if (this.cfr_renamed_2 == null ? sprugf2.cfr_renamed_2 != null : !this.cfr_renamed_2.cfr_renamed_1315().equals(sprugf2.cfr_renamed_2.cfr_renamed_1315())) {
            return false;
        }
        if (this.cfr_renamed_137 != sprugf2.cfr_renamed_137) {
            return false;
        }
        if (this.cfr_renamed_107 != sprugf2.cfr_renamed_107) {
            return false;
        }
        if (this.cfr_renamed_91 != sprugf2.cfr_renamed_91) {
            return false;
        }
        if (this.cfr_renamed_86 != sprugf2.cfr_renamed_86) {
            return false;
        }
        if (this.cfr_renamed_105 != sprugf2.cfr_renamed_105) {
            return false;
        }
        if (!Arrays.equals(this.cfr_renamed_272, sprugf2.cfr_renamed_272)) {
            return false;
        }
        if (this.cfr_renamed_114 != sprugf2.cfr_renamed_114) {
            return false;
        }
        if (this.cfr_renamed_185 != sprugf2.cfr_renamed_185) {
            return false;
        }
        if (this.cfr_renamed_93 != sprugf2.cfr_renamed_93) {
            return false;
        }
        return this.cfr_renamed_0 == sprugf2.cfr_renamed_0;
    }

    public String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder(new StringBuilder().insert(0, sprmze.cfr_renamed_9("\u00015')=+02+5\u0014:6:)>0>6(l\u0015y")).append(this.cfr_renamed_119).append(sprseca.cfr_renamed_9("VeK")).append(this.cfr_renamed_93).toString());
        if (this.cfr_renamed_185 == 0) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder = stringBuilder3;
            stringBuilder3.append(sprmze.cfr_renamed_9("{44(\"\u0010\"4>y\b\r\u0016\u0014\u0017\u0001{ =y") + this.cfr_renamed_31);
        } else {
            StringBuilder stringBuilder4 = stringBuilder2;
            stringBuilder = stringBuilder4;
            stringBuilder4.append(new StringBuilder().insert(0, sprseca.cfr_renamed_9("4\u0006{\u001am\"m\u0006qKD$[2A5@Vp\u0010%K")).append(this.cfr_renamed_132).append(sprmze.cfr_renamed_9("d?\"iy")).append(this.cfr_renamed_82).append(sprseca.cfr_renamed_9("Vp\u0010'K")).append(this.cfr_renamed_112).toString());
        }
        stringBuilder.append(new StringBuilder().insert(0, sprmze.cfr_renamed_9("d?)ky")).append(this.cfr_renamed_4).append(sprseca.cfr_renamed_9("4\u0012vK")).append(this.cfr_renamed_152).append(sprmze.cfr_renamed_9("d8y")).append(this.cfr_renamed_1).append(sprseca.cfr_renamed_9("Vy\u001fz5u\u001ax\u0005FK")).append(this.cfr_renamed_105).append(sprmze.cfr_renamed_9("{)2*\u0018%7((\t:70y")).append(this.cfr_renamed_86).append(sprseca.cfr_renamed_9("4\u001eu\u0005|%q\u0013pK")).append(this.cfr_renamed_137).append(sprmze.cfr_renamed_9("d3%(,\u001a(<y")).append(this.cfr_renamed_2).append(sprseca.cfr_renamed_9("V{\u001fpK")).append(Arrays.toString(this.cfr_renamed_272)).append(sprmze.cfr_renamed_9("{7+%)7>y")).append(this.cfr_renamed_0).append(")").toString());
        return stringBuilder2.toString();
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.cfr_renamed_119;
        n = 31 * n + this.cfr_renamed_102;
        n = 31 * n + this.cfr_renamed_145;
        n = 31 * n + this.cfr_renamed_1;
        n = 31 * n + this.cfr_renamed_152;
        n = 31 * n + this.cfr_renamed_31;
        n = 31 * n + this.cfr_renamed_132;
        n = 31 * n + this.cfr_renamed_82;
        n = 31 * n + this.cfr_renamed_112;
        n = 31 * n + this.cfr_renamed_79;
        n = 31 * n + this.cfr_renamed_4;
        n = 31 * n + this.spr\ufe34;
        n = 31 * n + this.cfr_renamed_88;
        n = 31 * n + this.cfr_renamed_126;
        n = 31 * n + this.cfr_renamed_96;
        n = 31 * n + (this.cfr_renamed_3 ? 1231 : 1237);
        n = 31 * n + (this.cfr_renamed_2 == null ? 0 : this.cfr_renamed_2.cfr_renamed_1315().hashCode());
        n = 31 * n + (this.cfr_renamed_137 ? 1231 : 1237);
        n = 31 * n + this.cfr_renamed_107;
        n = 31 * n + this.cfr_renamed_91;
        n = 31 * n + this.cfr_renamed_86;
        n = 31 * n + this.cfr_renamed_105;
        n = 31 * n + Arrays.hashCode(this.cfr_renamed_272);
        n = 31 * n + this.cfr_renamed_114;
        n = 31 * n + this.cfr_renamed_185;
        n = 31 * n + this.cfr_renamed_93;
        n = 31 * n + (this.cfr_renamed_0 ? 1231 : 1237);
        return n;
    }

    public int cfr_renamed_1345() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprugf(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, boolean bl, byte[] byArray, boolean bl2, boolean bl3, sprgf sprgf2) {
        void arg13;
        void arg12;
        void arg11;
        void arg10;
        void arg9;
        void arg8;
        void arg7;
        void arg5;
        void arg6;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprugf sprugf2 = this;
        sprugf sprugf3 = this;
        sprugf sprugf4 = this;
        sprugf sprugf5 = this;
        sprugf sprugf6 = this;
        sprugf sprugf7 = this;
        sprugf sprugf8 = this;
        sprugf8.cfr_renamed_119 = arg0;
        sprugf8.cfr_renamed_93 = arg1;
        sprugf7.cfr_renamed_132 = arg2;
        sprugf7.cfr_renamed_82 = arg3;
        sprugf6.cfr_renamed_112 = arg4;
        sprugf6.cfr_renamed_152 = arg6;
        sprugf5.cfr_renamed_4 = arg5;
        sprugf5.cfr_renamed_1 = arg7;
        sprugf4.cfr_renamed_105 = arg8;
        sprugf4.cfr_renamed_86 = arg9;
        sprugf3.cfr_renamed_137 = arg10;
        sprugf3.cfr_renamed_272 = arg11;
        sprugf2.cfr_renamed_0 = arg12;
        sprugf2.cfr_renamed_3 = arg13;
        this.cfr_renamed_185 = 1;
        this.cfr_renamed_2 = sprgf2;
        this.cfr_renamed_1314();
    }

    public sprugf cfr_renamed_1316() {
        if (this.cfr_renamed_185 == 0) {
            sprugf sprugf2 = this;
            sprugf sprugf3 = this;
            sprugf sprugf4 = this;
            sprugf sprugf5 = this;
            sprugf sprugf6 = this;
            sprugf sprugf7 = this;
            return new sprugf(sprugf2.cfr_renamed_119, sprugf2.cfr_renamed_93, sprugf3.cfr_renamed_31, sprugf3.cfr_renamed_4, sprugf4.cfr_renamed_152, sprugf4.cfr_renamed_1, sprugf5.cfr_renamed_105, sprugf5.cfr_renamed_86, sprugf6.cfr_renamed_137, sprugf6.cfr_renamed_272, sprugf7.cfr_renamed_0, sprugf7.cfr_renamed_3, sprkkk.cfr_renamed_5622(this.cfr_renamed_2));
        }
        sprugf sprugf8 = this;
        sprugf sprugf9 = this;
        sprugf sprugf10 = this;
        sprugf sprugf11 = this;
        sprugf sprugf12 = this;
        sprugf sprugf13 = this;
        sprugf sprugf14 = this;
        return new sprugf(sprugf8.cfr_renamed_119, sprugf8.cfr_renamed_93, sprugf9.cfr_renamed_132, sprugf9.cfr_renamed_82, sprugf10.cfr_renamed_112, sprugf10.cfr_renamed_4, sprugf11.cfr_renamed_152, sprugf11.cfr_renamed_1, sprugf12.cfr_renamed_105, sprugf12.cfr_renamed_86, sprugf13.cfr_renamed_137, sprugf13.cfr_renamed_272, sprugf14.cfr_renamed_0, sprugf14.cfr_renamed_3, sprkkk.cfr_renamed_5622(this.cfr_renamed_2));
    }

    public sprugf(InputStream arg0) throws IOException {
        sprugf sprugf2;
        DataInputStream dataInputStream = new DataInputStream(arg0);
        this.cfr_renamed_119 = dataInputStream.readInt();
        this.cfr_renamed_93 = dataInputStream.readInt();
        this.cfr_renamed_31 = dataInputStream.readInt();
        this.cfr_renamed_132 = dataInputStream.readInt();
        this.cfr_renamed_82 = dataInputStream.readInt();
        this.cfr_renamed_112 = dataInputStream.readInt();
        this.cfr_renamed_152 = dataInputStream.readInt();
        this.cfr_renamed_4 = dataInputStream.readInt();
        this.cfr_renamed_1 = dataInputStream.readInt();
        this.cfr_renamed_105 = dataInputStream.readInt();
        this.cfr_renamed_86 = dataInputStream.readInt();
        this.cfr_renamed_137 = dataInputStream.readBoolean();
        this.cfr_renamed_272 = new byte[3];
        dataInputStream.read(this.cfr_renamed_272);
        DataInputStream dataInputStream2 = dataInputStream;
        sprugf sprugf3 = this;
        sprugf3.cfr_renamed_0 = dataInputStream.readBoolean();
        sprugf3.cfr_renamed_3 = dataInputStream.readBoolean();
        this.cfr_renamed_185 = dataInputStream2.read();
        String string = dataInputStream2.readUTF();
        if ("SHA-512".equals(string)) {
            sprugf2 = this;
            this.cfr_renamed_2 = new sprocl();
        } else {
            if ("SHA-256".equals(string)) {
                this.cfr_renamed_2 = new sprohl();
            }
            sprugf2 = this;
        }
        sprugf2.cfr_renamed_1314();
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = dataOutputStream = new DataOutputStream(arg0);
        sprugf sprugf2 = this;
        DataOutputStream dataOutputStream3 = dataOutputStream;
        sprugf sprugf3 = this;
        DataOutputStream dataOutputStream4 = dataOutputStream;
        sprugf sprugf4 = this;
        DataOutputStream dataOutputStream5 = dataOutputStream;
        sprugf sprugf5 = this;
        DataOutputStream dataOutputStream6 = dataOutputStream;
        sprugf sprugf6 = this;
        DataOutputStream dataOutputStream7 = dataOutputStream;
        dataOutputStream7.writeInt(this.cfr_renamed_119);
        dataOutputStream7.writeInt(this.cfr_renamed_93);
        dataOutputStream.writeInt(sprugf6.cfr_renamed_31);
        dataOutputStream6.writeInt(sprugf6.cfr_renamed_132);
        dataOutputStream6.writeInt(this.cfr_renamed_82);
        dataOutputStream.writeInt(sprugf5.cfr_renamed_112);
        dataOutputStream5.writeInt(sprugf5.cfr_renamed_152);
        dataOutputStream5.writeInt(this.cfr_renamed_4);
        dataOutputStream.writeInt(sprugf4.cfr_renamed_1);
        dataOutputStream4.writeInt(sprugf4.cfr_renamed_105);
        dataOutputStream4.writeInt(this.cfr_renamed_86);
        dataOutputStream.writeBoolean(sprugf3.cfr_renamed_137);
        dataOutputStream3.write(sprugf3.cfr_renamed_272);
        dataOutputStream3.writeBoolean(this.cfr_renamed_0);
        dataOutputStream.writeBoolean(sprugf2.cfr_renamed_3);
        dataOutputStream2.write(sprugf2.cfr_renamed_185);
        dataOutputStream2.writeUTF(this.cfr_renamed_2.cfr_renamed_1315());
    }

    private /* synthetic */ void cfr_renamed_1314() {
        sprugf sprugf2 = this;
        sprugf sprugf3 = this;
        sprugf3.spr\ufe34 = sprugf3.cfr_renamed_31;
        sprugf3.cfr_renamed_88 = sprugf3.cfr_renamed_132;
        sprugf3.cfr_renamed_126 = sprugf3.cfr_renamed_82;
        sprugf3.cfr_renamed_96 = sprugf3.cfr_renamed_112;
        this.cfr_renamed_79 = this.cfr_renamed_119 / 3;
        this.cfr_renamed_107 = 1;
        this.cfr_renamed_91 = sprugf2.cfr_renamed_119 * 3 / 2 / 8 - this.cfr_renamed_107 - this.cfr_renamed_152 / 8 - 1;
        sprugf2.cfr_renamed_102 = (sprugf2.cfr_renamed_119 * 3 / 2 + 7) / 8 * 8 + 1;
        sprugf2.cfr_renamed_145 = sprugf2.cfr_renamed_119 - 1;
        sprugf2.cfr_renamed_114 = sprugf2.cfr_renamed_152;
    }
}

