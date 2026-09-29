/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprheb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprquo;
import com.spire.presentation.packages.sprsph;
import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprvhd;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;

public class sprpya
extends sprccb
implements Cloneable {
    public int cfr_renamed_84;
    public int cfr_renamed_723;
    public int cfr_renamed_1226;
    public boolean cfr_renamed_287;
    public int cfr_renamed_724;
    public int cfr_renamed_953;
    public int cfr_renamed_133;
    public int cfr_renamed_185;
    public static final sprpya spr\ufe34;
    public static final sprpya cfr_renamed_82;
    public int cfr_renamed_126;
    public int cfr_renamed_88;
    public int cfr_renamed_31;
    public int cfr_renamed_272;
    public boolean cfr_renamed_145;
    public sprlc cfr_renamed_114;
    public static final sprpya cfr_renamed_96;
    public int cfr_renamed_105;
    public int cfr_renamed_137;
    public int cfr_renamed_79;
    public int cfr_renamed_107;
    public int cfr_renamed_132;
    public int cfr_renamed_102;
    public static final sprpya cfr_renamed_93;
    public int cfr_renamed_86;
    public int cfr_renamed_152;
    public int cfr_renamed_112;
    public int cfr_renamed_119;
    public int cfr_renamed_91;
    public static final sprpya cfr_renamed_0;
    public static final sprpya cfr_renamed_1;
    public byte[] cfr_renamed_2;
    public static final sprpya cfr_renamed_3;
    public boolean cfr_renamed_4;

    public String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder(new StringBuilder().insert(0, sprquo.cfr_renamed_9("jJLVVT[M@J\u007fE]EBA[A]W\u0007j\u0012")).append(this.cfr_renamed_84).append(sprsph.cfr_renamed_9("h\u0005u")).append(this.cfr_renamed_133).toString());
        if (this.cfr_renamed_132 == 0) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder = stringBuilder3;
            stringBuilder3.append(sprquo.cfr_renamed_9("\u0004_KC]{]_A\u0012wfi\u007fhj\u0004KB\u0012") + this.cfr_renamed_119);
        } else {
            StringBuilder stringBuilder4 = stringBuilder2;
            stringBuilder = stringBuilder4;
            stringBuilder4.append(new StringBuilder().insert(0, sprsph.cfr_renamed_9("T8\u001b$\r\u001c\r8\u0011u$\u001a;\f!\u000b h\u0010.Eu")).append(this.cfr_renamed_723).append(sprquo.cfr_renamed_9("\u000f@I\u0016\u0012")).append(this.cfr_renamed_953).append(sprsph.cfr_renamed_9("h\u0010.Gu")).append(this.cfr_renamed_112).toString());
        }
        stringBuilder.append(new StringBuilder().insert(0, sprquo.cfr_renamed_9("\u000f@B\u0014\u0012")).append(this.cfr_renamed_105).append(sprsph.cfr_renamed_9("T,\u0016u")).append(this.cfr_renamed_88).append(sprquo.cfr_renamed_9("\u000fG\u0012")).append(this.cfr_renamed_272).append(sprsph.cfr_renamed_9("h\u0019!\u001a\u000b\u0015$\u0018;&u")).append(this.cfr_renamed_1226).append(sprquo.cfr_renamed_9("\u0004BMAgNHCWbE\\O\u0012")).append(this.cfr_renamed_102).append(sprsph.cfr_renamed_9("T \u0015;\u001c\u001b\u0011-\u0010u")).append(this.cfr_renamed_287).append(sprquo.cfr_renamed_9("\u000fLNWGeCC\u0012")).append(this.cfr_renamed_114).append(sprsph.cfr_renamed_9("h\u001b!\u0010u")).append(Arrays.toString(this.cfr_renamed_2)).append(sprquo.cfr_renamed_9("\u0004\\TNV\\A\u0012")).append(this.cfr_renamed_145).append(")").toString());
        return stringBuilder2.toString();
    }

    public sprheb cfr_renamed_1346() {
        if (this.cfr_renamed_132 == 0) {
            sprpya sprpya2 = this;
            sprpya sprpya3 = this;
            sprpya sprpya4 = this;
            sprpya sprpya5 = this;
            sprpya sprpya6 = this;
            sprpya sprpya7 = this;
            return new sprheb(sprpya2.cfr_renamed_84, sprpya2.cfr_renamed_133, sprpya3.cfr_renamed_119, sprpya3.cfr_renamed_105, sprpya4.cfr_renamed_88, sprpya4.cfr_renamed_272, sprpya5.cfr_renamed_1226, sprpya5.cfr_renamed_102, sprpya6.cfr_renamed_287, sprpya6.cfr_renamed_2, sprpya7.cfr_renamed_145, sprpya7.cfr_renamed_4, this.cfr_renamed_114);
        }
        sprpya sprpya8 = this;
        sprpya sprpya9 = this;
        sprpya sprpya10 = this;
        sprpya sprpya11 = this;
        sprpya sprpya12 = this;
        sprpya sprpya13 = this;
        sprpya sprpya14 = this;
        return new sprheb(sprpya8.cfr_renamed_84, sprpya8.cfr_renamed_133, sprpya9.cfr_renamed_723, sprpya9.cfr_renamed_953, sprpya10.cfr_renamed_112, sprpya10.cfr_renamed_105, sprpya11.cfr_renamed_88, sprpya11.cfr_renamed_272, sprpya12.cfr_renamed_1226, sprpya12.cfr_renamed_102, sprpya13.cfr_renamed_287, sprpya13.cfr_renamed_2, sprpya14.cfr_renamed_145, sprpya14.cfr_renamed_4, this.cfr_renamed_114);
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = dataOutputStream = new DataOutputStream(arg0);
        sprpya sprpya2 = this;
        DataOutputStream dataOutputStream3 = dataOutputStream;
        sprpya sprpya3 = this;
        DataOutputStream dataOutputStream4 = dataOutputStream;
        sprpya sprpya4 = this;
        DataOutputStream dataOutputStream5 = dataOutputStream;
        sprpya sprpya5 = this;
        DataOutputStream dataOutputStream6 = dataOutputStream;
        sprpya sprpya6 = this;
        DataOutputStream dataOutputStream7 = dataOutputStream;
        dataOutputStream7.writeInt(this.cfr_renamed_84);
        dataOutputStream7.writeInt(this.cfr_renamed_133);
        dataOutputStream.writeInt(sprpya6.cfr_renamed_119);
        dataOutputStream6.writeInt(sprpya6.cfr_renamed_723);
        dataOutputStream6.writeInt(this.cfr_renamed_953);
        dataOutputStream.writeInt(sprpya5.cfr_renamed_112);
        dataOutputStream5.writeInt(sprpya5.cfr_renamed_88);
        dataOutputStream5.writeInt(this.cfr_renamed_105);
        dataOutputStream.writeInt(sprpya4.cfr_renamed_272);
        dataOutputStream4.writeInt(sprpya4.cfr_renamed_1226);
        dataOutputStream4.writeInt(this.cfr_renamed_102);
        dataOutputStream.writeBoolean(sprpya3.cfr_renamed_287);
        dataOutputStream3.write(sprpya3.cfr_renamed_2);
        dataOutputStream3.writeBoolean(this.cfr_renamed_145);
        dataOutputStream.writeBoolean(sprpya2.cfr_renamed_4);
        dataOutputStream2.write(sprpya2.cfr_renamed_132);
        dataOutputStream2.writeUTF(this.cfr_renamed_114.cfr_renamed_1315());
    }

    private /* synthetic */ void cfr_renamed_1314() {
        sprpya sprpya2 = this;
        sprpya sprpya3 = this;
        sprpya3.cfr_renamed_31 = sprpya3.cfr_renamed_119;
        sprpya3.cfr_renamed_107 = sprpya3.cfr_renamed_723;
        sprpya3.cfr_renamed_79 = sprpya3.cfr_renamed_953;
        sprpya3.cfr_renamed_185 = sprpya3.cfr_renamed_112;
        this.cfr_renamed_724 = this.cfr_renamed_84 / 3;
        this.cfr_renamed_137 = 1;
        this.cfr_renamed_152 = sprpya2.cfr_renamed_84 * 3 / 2 / 8 - this.cfr_renamed_137 - this.cfr_renamed_88 / 8 - 1;
        sprpya2.cfr_renamed_91 = (sprpya2.cfr_renamed_84 * 3 / 2 + 7) / 8 * 8 + 1;
        sprpya2.cfr_renamed_126 = sprpya2.cfr_renamed_84 - 1;
        sprpya2.cfr_renamed_86 = sprpya2.cfr_renamed_88;
    }

    /*
     * WARNING - void declaration
     */
    public sprpya(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, boolean bl, byte[] byArray, boolean bl2, boolean bl3, sprlc sprlc2) {
        void arg13;
        void arg12;
        void arg11;
        void arg10;
        void arg9;
        void arg8;
        void arg7;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void arg6;
        sprpya sprpya2 = this;
        sprpya sprpya3 = this;
        sprpya sprpya4 = this;
        sprpya sprpya5 = this;
        sprpya sprpya6 = this;
        sprpya sprpya7 = this;
        sprpya sprpya8 = this;
        super(new SecureRandom(), (int)arg6);
        sprpya8.cfr_renamed_84 = arg0;
        sprpya8.cfr_renamed_133 = arg1;
        sprpya7.cfr_renamed_723 = arg2;
        sprpya7.cfr_renamed_953 = arg3;
        sprpya6.cfr_renamed_112 = arg4;
        sprpya6.cfr_renamed_88 = arg6;
        sprpya5.cfr_renamed_105 = arg5;
        sprpya5.cfr_renamed_272 = arg7;
        sprpya4.cfr_renamed_1226 = arg8;
        sprpya4.cfr_renamed_102 = arg9;
        sprpya3.cfr_renamed_287 = arg10;
        sprpya3.cfr_renamed_2 = arg11;
        sprpya2.cfr_renamed_145 = arg12;
        sprpya2.cfr_renamed_4 = arg13;
        this.cfr_renamed_132 = 1;
        this.cfr_renamed_114 = sprlc2;
        this.cfr_renamed_1314();
    }

    public int cfr_renamed_1345() {
        return this.cfr_renamed_152;
    }

    public sprpya cfr_renamed_1316() {
        if (this.cfr_renamed_132 == 0) {
            sprpya sprpya2 = this;
            sprpya sprpya3 = this;
            sprpya sprpya4 = this;
            sprpya sprpya5 = this;
            sprpya sprpya6 = this;
            sprpya sprpya7 = this;
            return new sprpya(sprpya2.cfr_renamed_84, sprpya2.cfr_renamed_133, sprpya3.cfr_renamed_119, sprpya3.cfr_renamed_105, sprpya4.cfr_renamed_88, sprpya4.cfr_renamed_272, sprpya5.cfr_renamed_1226, sprpya5.cfr_renamed_102, sprpya6.cfr_renamed_287, sprpya6.cfr_renamed_2, sprpya7.cfr_renamed_145, sprpya7.cfr_renamed_4, this.cfr_renamed_114);
        }
        sprpya sprpya8 = this;
        sprpya sprpya9 = this;
        sprpya sprpya10 = this;
        sprpya sprpya11 = this;
        sprpya sprpya12 = this;
        sprpya sprpya13 = this;
        sprpya sprpya14 = this;
        return new sprpya(sprpya8.cfr_renamed_84, sprpya8.cfr_renamed_133, sprpya9.cfr_renamed_723, sprpya9.cfr_renamed_953, sprpya10.cfr_renamed_112, sprpya10.cfr_renamed_105, sprpya11.cfr_renamed_88, sprpya11.cfr_renamed_272, sprpya12.cfr_renamed_1226, sprpya12.cfr_renamed_102, sprpya13.cfr_renamed_287, sprpya13.cfr_renamed_2, sprpya14.cfr_renamed_145, sprpya14.cfr_renamed_4, this.cfr_renamed_114);
    }

    public sprpya(InputStream arg0) throws IOException {
        sprpya sprpya2;
        sprpya sprpya3 = this;
        super(new SecureRandom(), -1);
        DataInputStream dataInputStream = new DataInputStream(arg0);
        sprpya3.cfr_renamed_84 = dataInputStream.readInt();
        this.cfr_renamed_133 = dataInputStream.readInt();
        this.cfr_renamed_119 = dataInputStream.readInt();
        this.cfr_renamed_723 = dataInputStream.readInt();
        this.cfr_renamed_953 = dataInputStream.readInt();
        this.cfr_renamed_112 = dataInputStream.readInt();
        this.cfr_renamed_88 = dataInputStream.readInt();
        this.cfr_renamed_105 = dataInputStream.readInt();
        this.cfr_renamed_272 = dataInputStream.readInt();
        this.cfr_renamed_1226 = dataInputStream.readInt();
        this.cfr_renamed_102 = dataInputStream.readInt();
        this.cfr_renamed_287 = dataInputStream.readBoolean();
        this.cfr_renamed_2 = new byte[3];
        dataInputStream.read(this.cfr_renamed_2);
        DataInputStream dataInputStream2 = dataInputStream;
        sprpya sprpya4 = this;
        sprpya4.cfr_renamed_145 = dataInputStream.readBoolean();
        sprpya4.cfr_renamed_4 = dataInputStream.readBoolean();
        this.cfr_renamed_132 = dataInputStream2.read();
        String string = dataInputStream2.readUTF();
        if ("SHA-512".equals(string)) {
            sprpya2 = this;
            this.cfr_renamed_114 = new sprvhd();
        } else {
            if ("SHA-256".equals(string)) {
                this.cfr_renamed_114 = new sprtfd();
            }
            sprpya2 = this;
        }
        sprpya2.cfr_renamed_1314();
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
        sprpya sprpya2 = (sprpya)arg0;
        if (this.cfr_renamed_84 != sprpya2.cfr_renamed_84) {
            return false;
        }
        if (this.cfr_renamed_91 != sprpya2.cfr_renamed_91) {
            return false;
        }
        if (this.cfr_renamed_126 != sprpya2.cfr_renamed_126) {
            return false;
        }
        if (this.cfr_renamed_272 != sprpya2.cfr_renamed_272) {
            return false;
        }
        if (this.cfr_renamed_88 != sprpya2.cfr_renamed_88) {
            return false;
        }
        if (this.cfr_renamed_119 != sprpya2.cfr_renamed_119) {
            return false;
        }
        if (this.cfr_renamed_723 != sprpya2.cfr_renamed_723) {
            return false;
        }
        if (this.cfr_renamed_953 != sprpya2.cfr_renamed_953) {
            return false;
        }
        if (this.cfr_renamed_112 != sprpya2.cfr_renamed_112) {
            return false;
        }
        if (this.cfr_renamed_724 != sprpya2.cfr_renamed_724) {
            return false;
        }
        if (this.cfr_renamed_105 != sprpya2.cfr_renamed_105) {
            return false;
        }
        if (this.cfr_renamed_31 != sprpya2.cfr_renamed_31) {
            return false;
        }
        if (this.cfr_renamed_107 != sprpya2.cfr_renamed_107) {
            return false;
        }
        if (this.cfr_renamed_79 != sprpya2.cfr_renamed_79) {
            return false;
        }
        if (this.cfr_renamed_185 != sprpya2.cfr_renamed_185) {
            return false;
        }
        if (this.cfr_renamed_4 != sprpya2.cfr_renamed_4) {
            return false;
        }
        if (this.cfr_renamed_114 == null ? sprpya2.cfr_renamed_114 != null : !this.cfr_renamed_114.cfr_renamed_1315().equals(sprpya2.cfr_renamed_114.cfr_renamed_1315())) {
            return false;
        }
        if (this.cfr_renamed_287 != sprpya2.cfr_renamed_287) {
            return false;
        }
        if (this.cfr_renamed_137 != sprpya2.cfr_renamed_137) {
            return false;
        }
        if (this.cfr_renamed_152 != sprpya2.cfr_renamed_152) {
            return false;
        }
        if (this.cfr_renamed_102 != sprpya2.cfr_renamed_102) {
            return false;
        }
        if (this.cfr_renamed_1226 != sprpya2.cfr_renamed_1226) {
            return false;
        }
        if (!Arrays.equals(this.cfr_renamed_2, sprpya2.cfr_renamed_2)) {
            return false;
        }
        if (this.cfr_renamed_86 != sprpya2.cfr_renamed_86) {
            return false;
        }
        if (this.cfr_renamed_132 != sprpya2.cfr_renamed_132) {
            return false;
        }
        if (this.cfr_renamed_133 != sprpya2.cfr_renamed_133) {
            return false;
        }
        return this.cfr_renamed_145 == sprpya2.cfr_renamed_145;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.cfr_renamed_84;
        n = 31 * n + this.cfr_renamed_91;
        n = 31 * n + this.cfr_renamed_126;
        n = 31 * n + this.cfr_renamed_272;
        n = 31 * n + this.cfr_renamed_88;
        n = 31 * n + this.cfr_renamed_119;
        n = 31 * n + this.cfr_renamed_723;
        n = 31 * n + this.cfr_renamed_953;
        n = 31 * n + this.cfr_renamed_112;
        n = 31 * n + this.cfr_renamed_724;
        n = 31 * n + this.cfr_renamed_105;
        n = 31 * n + this.cfr_renamed_31;
        n = 31 * n + this.cfr_renamed_107;
        n = 31 * n + this.cfr_renamed_79;
        n = 31 * n + this.cfr_renamed_185;
        n = 31 * n + (this.cfr_renamed_4 ? 1231 : 1237);
        n = 31 * n + (this.cfr_renamed_114 == null ? 0 : this.cfr_renamed_114.cfr_renamed_1315().hashCode());
        n = 31 * n + (this.cfr_renamed_287 ? 1231 : 1237);
        n = 31 * n + this.cfr_renamed_137;
        n = 31 * n + this.cfr_renamed_152;
        n = 31 * n + this.cfr_renamed_102;
        n = 31 * n + this.cfr_renamed_1226;
        n = 31 * n + Arrays.hashCode(this.cfr_renamed_2);
        n = 31 * n + this.cfr_renamed_86;
        n = 31 * n + this.cfr_renamed_132;
        n = 31 * n + this.cfr_renamed_133;
        n = 31 * n + (this.cfr_renamed_145 ? 1231 : 1237);
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprpya(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl, byte[] byArray, boolean bl2, boolean bl3, sprlc sprlc2) {
        void arg11;
        void arg10;
        void arg9;
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void arg4;
        sprpya sprpya2 = this;
        sprpya sprpya3 = this;
        sprpya sprpya4 = this;
        sprpya sprpya5 = this;
        sprpya sprpya6 = this;
        sprpya sprpya7 = this;
        super(new SecureRandom(), (int)arg4);
        sprpya7.cfr_renamed_84 = arg0;
        sprpya7.cfr_renamed_133 = arg1;
        sprpya6.cfr_renamed_119 = arg2;
        sprpya6.cfr_renamed_88 = arg4;
        sprpya5.cfr_renamed_105 = arg3;
        sprpya5.cfr_renamed_272 = arg5;
        sprpya4.cfr_renamed_1226 = arg6;
        sprpya4.cfr_renamed_102 = arg7;
        sprpya3.cfr_renamed_287 = arg8;
        sprpya3.cfr_renamed_2 = arg9;
        sprpya2.cfr_renamed_145 = arg10;
        sprpya2.cfr_renamed_4 = arg11;
        this.cfr_renamed_132 = 0;
        this.cfr_renamed_114 = sprlc2;
        this.cfr_renamed_1314();
    }

    static {
        byte[] byArray = new byte[3];
        byArray[0] = 0;
        byArray[true] = 6;
        byArray[2] = 3;
        cfr_renamed_1 = new sprpya(1087, 2048, 120, 120, 256, 13, 25, 14, true, byArray, true, false, new sprvhd());
        byte[] byArray2 = new byte[3];
        byArray2[0] = 0;
        byArray2[true] = 6;
        byArray2[2] = 4;
        cfr_renamed_96 = new sprpya(1171, 2048, 106, 106, 256, 13, 20, 15, true, byArray2, true, false, new sprvhd());
        byte[] byArray3 = new byte[3];
        byArray3[0] = 0;
        byArray3[true] = 6;
        byArray3[2] = 5;
        cfr_renamed_3 = new sprpya(1499, 2048, 79, 79, 256, 13, 17, 19, true, byArray3, true, false, new sprvhd());
        byte[] byArray4 = new byte[3];
        byArray4[0] = 0;
        byArray4[true] = 7;
        byArray4[2] = 101;
        cfr_renamed_93 = new sprpya(439, 2048, 146, 130, 128, 9, 32, 9, true, byArray4, true, false, new sprtfd());
        byte[] byArray5 = new byte[3];
        byArray5[0] = 0;
        byArray5[true] = 7;
        byArray5[2] = 101;
        spr\ufe34 = new sprpya(439, 2048, 9, 8, 5, 130, 128, 9, 32, 9, true, byArray5, true, true, new sprtfd());
        byte[] byArray6 = new byte[3];
        byArray6[0] = 0;
        byArray6[true] = 7;
        byArray6[2] = 105;
        cfr_renamed_82 = new sprpya(743, 2048, 248, 220, 256, 10, 27, 14, true, byArray6, false, false, new sprvhd());
        byte[] byArray7 = new byte[3];
        byArray7[0] = 0;
        byArray7[true] = 7;
        byArray7[2] = 105;
        cfr_renamed_0 = new sprpya(743, 2048, 11, 11, 15, 220, 256, 10, 27, 14, true, byArray7, false, true, new sprvhd());
    }
}

