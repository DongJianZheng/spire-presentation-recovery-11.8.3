/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreah;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprspq;
import com.spire.presentation.packages.sprugf;
import com.spire.presentation.packages.sprybl;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;

public class spredf
extends sprgye
implements Cloneable {
    public int cfr_renamed_84;
    public int cfr_renamed_723;
    public int cfr_renamed_1226;
    public static final spredf cfr_renamed_287;
    public int cfr_renamed_724;
    public int cfr_renamed_953;
    public boolean cfr_renamed_133;
    public int cfr_renamed_185;
    public static final spredf spr\ufe34;
    public static final spredf cfr_renamed_82;
    public byte[] cfr_renamed_126;
    public int cfr_renamed_88;
    public int cfr_renamed_31;
    public int cfr_renamed_272;
    public boolean cfr_renamed_145;
    public int cfr_renamed_114;
    public int cfr_renamed_96;
    public int cfr_renamed_105;
    public int cfr_renamed_137;
    public int cfr_renamed_79;
    public int cfr_renamed_107;
    public static final spredf cfr_renamed_132;
    public int cfr_renamed_102;
    public int cfr_renamed_93;
    public static final spredf cfr_renamed_86;
    public sprgf cfr_renamed_152;
    public static final spredf cfr_renamed_112;
    public int cfr_renamed_119;
    public int cfr_renamed_91;
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    public boolean cfr_renamed_2;
    public int cfr_renamed_3;
    public static final spredf cfr_renamed_4;

    static {
        byte[] byArray = new byte[3];
        byArray[0] = 0;
        byArray[true] = 6;
        byArray[2] = 3;
        cfr_renamed_86 = new spredf(1087, 2048, 120, 120, 256, 13, 25, 14, true, byArray, true, false, new sprocl());
        byte[] byArray2 = new byte[3];
        byArray2[0] = 0;
        byArray2[true] = 6;
        byArray2[2] = 4;
        cfr_renamed_132 = new spredf(1171, 2048, 106, 106, 256, 13, 20, 15, true, byArray2, true, false, new sprocl());
        byte[] byArray3 = new byte[3];
        byArray3[0] = 0;
        byArray3[true] = 6;
        byArray3[2] = 5;
        cfr_renamed_4 = new spredf(1499, 2048, 79, 79, 256, 13, 17, 19, true, byArray3, true, false, new sprocl());
        byte[] byArray4 = new byte[3];
        byArray4[0] = 0;
        byArray4[true] = 7;
        byArray4[2] = 101;
        cfr_renamed_82 = new spredf(439, 2048, 146, 130, 128, 9, 32, 9, true, byArray4, true, false, new sprohl());
        byte[] byArray5 = new byte[3];
        byArray5[0] = 0;
        byArray5[true] = 7;
        byArray5[2] = 101;
        cfr_renamed_112 = new spredf(439, 2048, 9, 8, 5, 130, 128, 9, 32, 9, true, byArray5, true, true, new sprohl());
        byte[] byArray6 = new byte[3];
        byArray6[0] = 0;
        byArray6[true] = 7;
        byArray6[2] = 105;
        cfr_renamed_287 = new spredf(743, 2048, 248, 220, 256, 10, 27, 14, true, byArray6, false, false, new sprocl());
        byte[] byArray7 = new byte[3];
        byArray7[0] = 0;
        byArray7[true] = 7;
        byArray7[2] = 105;
        spr\ufe34 = new spredf(743, 2048, 11, 11, 15, 220, 256, 10, 27, 14, true, byArray7, false, true, new sprocl());
    }

    private /* synthetic */ void cfr_renamed_1314() {
        spredf spredf2 = this;
        spredf spredf3 = this;
        spredf3.cfr_renamed_119 = spredf3.cfr_renamed_3;
        spredf3.cfr_renamed_724 = spredf3.cfr_renamed_93;
        spredf3.cfr_renamed_91 = spredf3.cfr_renamed_114;
        spredf3.cfr_renamed_953 = spredf3.cfr_renamed_96;
        this.cfr_renamed_31 = this.cfr_renamed_107 / 3;
        this.cfr_renamed_84 = 1;
        this.cfr_renamed_1226 = spredf2.cfr_renamed_107 * 3 / 2 / 8 - this.cfr_renamed_84 - this.cfr_renamed_105 / 8 - 1;
        spredf2.cfr_renamed_88 = (spredf2.cfr_renamed_107 * 3 / 2 + 7) / 8 * 8 + 1;
        spredf2.cfr_renamed_723 = spredf2.cfr_renamed_107 - 1;
        spredf2.cfr_renamed_272 = spredf2.cfr_renamed_105;
    }

    public spredf cfr_renamed_1316() {
        if (this.cfr_renamed_79 == 0) {
            spredf spredf2 = this;
            spredf spredf3 = this;
            spredf spredf4 = this;
            spredf spredf5 = this;
            spredf spredf6 = this;
            spredf spredf7 = this;
            return new spredf(spredf2.cfr_renamed_107, spredf2.cfr_renamed_1, spredf3.cfr_renamed_3, spredf3.cfr_renamed_0, spredf4.cfr_renamed_105, spredf4.cfr_renamed_102, spredf5.cfr_renamed_185, spredf5.cfr_renamed_137, spredf6.cfr_renamed_133, spredf6.cfr_renamed_126, spredf7.cfr_renamed_145, spredf7.cfr_renamed_2, sprkkk.cfr_renamed_5622(this.cfr_renamed_152));
        }
        spredf spredf8 = this;
        spredf spredf9 = this;
        spredf spredf10 = this;
        spredf spredf11 = this;
        spredf spredf12 = this;
        spredf spredf13 = this;
        spredf spredf14 = this;
        return new spredf(spredf8.cfr_renamed_107, spredf8.cfr_renamed_1, spredf9.cfr_renamed_93, spredf9.cfr_renamed_114, spredf10.cfr_renamed_96, spredf10.cfr_renamed_0, spredf11.cfr_renamed_105, spredf11.cfr_renamed_102, spredf12.cfr_renamed_185, spredf12.cfr_renamed_137, spredf13.cfr_renamed_133, spredf13.cfr_renamed_126, spredf14.cfr_renamed_145, spredf14.cfr_renamed_2, sprkkk.cfr_renamed_5622(this.cfr_renamed_152));
    }

    public spredf(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte[] arg11, boolean arg12, boolean arg13, sprgf arg14) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, null);
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = dataOutputStream = new DataOutputStream(arg0);
        spredf spredf2 = this;
        DataOutputStream dataOutputStream3 = dataOutputStream;
        spredf spredf3 = this;
        DataOutputStream dataOutputStream4 = dataOutputStream;
        spredf spredf4 = this;
        DataOutputStream dataOutputStream5 = dataOutputStream;
        spredf spredf5 = this;
        DataOutputStream dataOutputStream6 = dataOutputStream;
        spredf spredf6 = this;
        DataOutputStream dataOutputStream7 = dataOutputStream;
        dataOutputStream7.writeInt(this.cfr_renamed_107);
        dataOutputStream7.writeInt(this.cfr_renamed_1);
        dataOutputStream.writeInt(spredf6.cfr_renamed_3);
        dataOutputStream6.writeInt(spredf6.cfr_renamed_93);
        dataOutputStream6.writeInt(this.cfr_renamed_114);
        dataOutputStream.writeInt(spredf5.cfr_renamed_96);
        dataOutputStream5.writeInt(spredf5.cfr_renamed_105);
        dataOutputStream5.writeInt(this.cfr_renamed_0);
        dataOutputStream.writeInt(spredf4.cfr_renamed_102);
        dataOutputStream4.writeInt(spredf4.cfr_renamed_185);
        dataOutputStream4.writeInt(this.cfr_renamed_137);
        dataOutputStream.writeBoolean(spredf3.cfr_renamed_133);
        dataOutputStream3.write(spredf3.cfr_renamed_126);
        dataOutputStream3.writeBoolean(this.cfr_renamed_145);
        dataOutputStream.writeBoolean(spredf2.cfr_renamed_2);
        dataOutputStream2.write(spredf2.cfr_renamed_79);
        dataOutputStream2.writeUTF(this.cfr_renamed_152.cfr_renamed_1315());
    }

    public sprugf cfr_renamed_1346() {
        if (this.cfr_renamed_79 == 0) {
            spredf spredf2 = this;
            spredf spredf3 = this;
            spredf spredf4 = this;
            spredf spredf5 = this;
            spredf spredf6 = this;
            spredf spredf7 = this;
            return new sprugf(spredf2.cfr_renamed_107, spredf2.cfr_renamed_1, spredf3.cfr_renamed_3, spredf3.cfr_renamed_0, spredf4.cfr_renamed_105, spredf4.cfr_renamed_102, spredf5.cfr_renamed_185, spredf5.cfr_renamed_137, spredf6.cfr_renamed_133, spredf6.cfr_renamed_126, spredf7.cfr_renamed_145, spredf7.cfr_renamed_2, sprkkk.cfr_renamed_5622(this.cfr_renamed_152));
        }
        spredf spredf8 = this;
        spredf spredf9 = this;
        spredf spredf10 = this;
        spredf spredf11 = this;
        spredf spredf12 = this;
        spredf spredf13 = this;
        spredf spredf14 = this;
        return new sprugf(spredf8.cfr_renamed_107, spredf8.cfr_renamed_1, spredf9.cfr_renamed_93, spredf9.cfr_renamed_114, spredf10.cfr_renamed_96, spredf10.cfr_renamed_0, spredf11.cfr_renamed_105, spredf11.cfr_renamed_102, spredf12.cfr_renamed_185, spredf12.cfr_renamed_137, spredf13.cfr_renamed_133, spredf13.cfr_renamed_126, spredf14.cfr_renamed_145, spredf14.cfr_renamed_2, sprkkk.cfr_renamed_5622(this.cfr_renamed_152));
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
        spredf spredf2 = (spredf)arg0;
        if (this.cfr_renamed_107 != spredf2.cfr_renamed_107) {
            return false;
        }
        if (this.cfr_renamed_88 != spredf2.cfr_renamed_88) {
            return false;
        }
        if (this.cfr_renamed_723 != spredf2.cfr_renamed_723) {
            return false;
        }
        if (this.cfr_renamed_102 != spredf2.cfr_renamed_102) {
            return false;
        }
        if (this.cfr_renamed_105 != spredf2.cfr_renamed_105) {
            return false;
        }
        if (this.cfr_renamed_3 != spredf2.cfr_renamed_3) {
            return false;
        }
        if (this.cfr_renamed_93 != spredf2.cfr_renamed_93) {
            return false;
        }
        if (this.cfr_renamed_114 != spredf2.cfr_renamed_114) {
            return false;
        }
        if (this.cfr_renamed_96 != spredf2.cfr_renamed_96) {
            return false;
        }
        if (this.cfr_renamed_31 != spredf2.cfr_renamed_31) {
            return false;
        }
        if (this.cfr_renamed_0 != spredf2.cfr_renamed_0) {
            return false;
        }
        if (this.cfr_renamed_119 != spredf2.cfr_renamed_119) {
            return false;
        }
        if (this.cfr_renamed_724 != spredf2.cfr_renamed_724) {
            return false;
        }
        if (this.cfr_renamed_91 != spredf2.cfr_renamed_91) {
            return false;
        }
        if (this.cfr_renamed_953 != spredf2.cfr_renamed_953) {
            return false;
        }
        if (this.cfr_renamed_2 != spredf2.cfr_renamed_2) {
            return false;
        }
        if (this.cfr_renamed_152 == null ? spredf2.cfr_renamed_152 != null : !this.cfr_renamed_152.cfr_renamed_1315().equals(spredf2.cfr_renamed_152.cfr_renamed_1315())) {
            return false;
        }
        if (this.cfr_renamed_133 != spredf2.cfr_renamed_133) {
            return false;
        }
        if (this.cfr_renamed_84 != spredf2.cfr_renamed_84) {
            return false;
        }
        if (this.cfr_renamed_1226 != spredf2.cfr_renamed_1226) {
            return false;
        }
        if (this.cfr_renamed_137 != spredf2.cfr_renamed_137) {
            return false;
        }
        if (this.cfr_renamed_185 != spredf2.cfr_renamed_185) {
            return false;
        }
        if (!Arrays.equals(this.cfr_renamed_126, spredf2.cfr_renamed_126)) {
            return false;
        }
        if (this.cfr_renamed_272 != spredf2.cfr_renamed_272) {
            return false;
        }
        if (this.cfr_renamed_79 != spredf2.cfr_renamed_79) {
            return false;
        }
        if (this.cfr_renamed_1 != spredf2.cfr_renamed_1) {
            return false;
        }
        return this.cfr_renamed_145 == spredf2.cfr_renamed_145;
    }

    public spredf(InputStream arg0) throws IOException {
        super(sprybl.cfr_renamed_2794(), -1);
        spredf spredf2;
        DataInputStream dataInputStream = new DataInputStream(arg0);
        this.cfr_renamed_107 = dataInputStream.readInt();
        this.cfr_renamed_1 = dataInputStream.readInt();
        this.cfr_renamed_3 = dataInputStream.readInt();
        this.cfr_renamed_93 = dataInputStream.readInt();
        this.cfr_renamed_114 = dataInputStream.readInt();
        this.cfr_renamed_96 = dataInputStream.readInt();
        this.cfr_renamed_105 = dataInputStream.readInt();
        this.cfr_renamed_0 = dataInputStream.readInt();
        this.cfr_renamed_102 = dataInputStream.readInt();
        this.cfr_renamed_185 = dataInputStream.readInt();
        this.cfr_renamed_137 = dataInputStream.readInt();
        this.cfr_renamed_133 = dataInputStream.readBoolean();
        this.cfr_renamed_126 = new byte[3];
        DataInputStream dataInputStream2 = dataInputStream;
        dataInputStream2.readFully(this.cfr_renamed_126);
        this.cfr_renamed_145 = dataInputStream2.readBoolean();
        this.cfr_renamed_2 = dataInputStream.readBoolean();
        this.cfr_renamed_79 = dataInputStream.read();
        String string = dataInputStream.readUTF();
        if ("SHA-512".equals(string)) {
            spredf2 = this;
            this.cfr_renamed_152 = new sprocl();
        } else {
            if ("SHA-256".equals(string)) {
                this.cfr_renamed_152 = new sprohl();
            }
            spredf2 = this;
        }
        spredf2.cfr_renamed_1314();
    }

    public spredf(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte[] arg11, boolean arg12, boolean arg13, sprgf arg14, SecureRandom arg15) {
        int n;
        SecureRandom secureRandom;
        if (null != arg15) {
            secureRandom = arg15;
            n = arg6;
        } else {
            secureRandom = sprybl.cfr_renamed_2794();
            n = arg6;
        }
        super(secureRandom, n);
        spredf spredf2 = this;
        spredf spredf3 = this;
        spredf spredf4 = this;
        spredf spredf5 = this;
        spredf spredf6 = this;
        spredf spredf7 = this;
        spredf spredf8 = this;
        spredf8.cfr_renamed_107 = arg0;
        spredf8.cfr_renamed_1 = arg1;
        spredf7.cfr_renamed_93 = arg2;
        spredf7.cfr_renamed_114 = arg3;
        spredf6.cfr_renamed_96 = arg4;
        spredf6.cfr_renamed_105 = arg6;
        spredf5.cfr_renamed_0 = arg5;
        spredf5.cfr_renamed_102 = arg7;
        spredf4.cfr_renamed_185 = arg8;
        spredf4.cfr_renamed_137 = arg9;
        spredf3.cfr_renamed_133 = arg10;
        spredf3.cfr_renamed_126 = arg11;
        spredf2.cfr_renamed_145 = arg12;
        spredf2.cfr_renamed_2 = arg13;
        this.cfr_renamed_79 = 1;
        this.cfr_renamed_152 = arg14;
        this.cfr_renamed_1314();
    }

    public int cfr_renamed_1345() {
        return this.cfr_renamed_1226;
    }

    public spredf(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte[] arg9, boolean arg10, boolean arg11, sprgf arg12, SecureRandom arg13) {
        int n;
        SecureRandom secureRandom;
        if (null != arg13) {
            secureRandom = arg13;
            n = arg4;
        } else {
            secureRandom = sprybl.cfr_renamed_2794();
            n = arg4;
        }
        super(secureRandom, n);
        spredf spredf2 = this;
        spredf spredf3 = this;
        spredf spredf4 = this;
        spredf spredf5 = this;
        spredf spredf6 = this;
        spredf spredf7 = this;
        spredf7.cfr_renamed_107 = arg0;
        spredf7.cfr_renamed_1 = arg1;
        spredf6.cfr_renamed_3 = arg2;
        spredf6.cfr_renamed_105 = arg4;
        spredf5.cfr_renamed_0 = arg3;
        spredf5.cfr_renamed_102 = arg5;
        spredf4.cfr_renamed_185 = arg6;
        spredf4.cfr_renamed_137 = arg7;
        spredf3.cfr_renamed_133 = arg8;
        spredf3.cfr_renamed_126 = arg9;
        spredf2.cfr_renamed_145 = arg10;
        spredf2.cfr_renamed_2 = arg11;
        this.cfr_renamed_79 = 0;
        this.cfr_renamed_152 = arg12;
        this.cfr_renamed_1314();
    }

    public spredf(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte[] arg9, boolean arg10, boolean arg11, sprgf arg12) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null);
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.cfr_renamed_107;
        n = 31 * n + this.cfr_renamed_88;
        n = 31 * n + this.cfr_renamed_723;
        n = 31 * n + this.cfr_renamed_102;
        n = 31 * n + this.cfr_renamed_105;
        n = 31 * n + this.cfr_renamed_3;
        n = 31 * n + this.cfr_renamed_93;
        n = 31 * n + this.cfr_renamed_114;
        n = 31 * n + this.cfr_renamed_96;
        n = 31 * n + this.cfr_renamed_31;
        n = 31 * n + this.cfr_renamed_0;
        n = 31 * n + this.cfr_renamed_119;
        n = 31 * n + this.cfr_renamed_724;
        n = 31 * n + this.cfr_renamed_91;
        n = 31 * n + this.cfr_renamed_953;
        n = 31 * n + (this.cfr_renamed_2 ? 1231 : 1237);
        n = 31 * n + (this.cfr_renamed_152 == null ? 0 : this.cfr_renamed_152.cfr_renamed_1315().hashCode());
        n = 31 * n + (this.cfr_renamed_133 ? 1231 : 1237);
        n = 31 * n + this.cfr_renamed_84;
        n = 31 * n + this.cfr_renamed_1226;
        n = 31 * n + this.cfr_renamed_137;
        n = 31 * n + this.cfr_renamed_185;
        n = 31 * n + Arrays.hashCode(this.cfr_renamed_126);
        n = 31 * n + this.cfr_renamed_272;
        n = 31 * n + this.cfr_renamed_79;
        n = 31 * n + this.cfr_renamed_1;
        n = 31 * n + (this.cfr_renamed_145 ? 1231 : 1237);
        return n;
    }

    public String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder(new StringBuilder().insert(0, spreah.cfr_renamed_9("\u0019\u0019?\u0005%\u0007(\u001e3\u0019\f\u0016.\u00161\u0012(\u0012.\u0004t9a")).append(this.cfr_renamed_107).append(sprspq.cfr_renamed_9("\u000f\n\u0012")).append(this.cfr_renamed_1).toString());
        if (this.cfr_renamed_79 == 0) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder = stringBuilder3;
            stringBuilder3.append(spreah.cfr_renamed_9("W,\u00180\u000e\b\u000e,\u0012a$\u0015:\f;\u0019W8\u0011a") + this.cfr_renamed_3);
        } else {
            StringBuilder stringBuilder4 = stringBuilder2;
            stringBuilder = stringBuilder4;
            stringBuilder4.append(new StringBuilder().insert(0, sprspq.cfr_renamed_9("[_\u0014C\u0002{\u0002_\u001e\u0012+}4k.l/\u000f\u001fIJ\u0012")).append(this.cfr_renamed_93).append(spreah.cfr_renamed_9("|\u0013:Ea")).append(this.cfr_renamed_114).append(sprspq.cfr_renamed_9("\u000f\u001fIH\u0012")).append(this.cfr_renamed_96).toString());
        }
        stringBuilder.append(new StringBuilder().insert(0, spreah.cfr_renamed_9("|\u00131Ga")).append(this.cfr_renamed_0).append(sprspq.cfr_renamed_9("[K\u0019\u0012")).append(this.cfr_renamed_105).append(spreah.cfr_renamed_9("|\u0014a")).append(this.cfr_renamed_102).append(sprspq.cfr_renamed_9("\u000f\u0016F\u0015l\u001aC\u0017\\)\u0012")).append(this.cfr_renamed_185).append(spreah.cfr_renamed_9("W1\u001e24=\u001b0\u0004\u0011\u0016/\u001ca")).append(this.cfr_renamed_137).append(sprspq.cfr_renamed_9("[G\u001a\\\u0013|\u001eJ\u001f\u0012")).append(this.cfr_renamed_133).append(spreah.cfr_renamed_9("|\u001f=\u0004460\u0010a")).append(this.cfr_renamed_152).append(sprspq.cfr_renamed_9("\u000f\u0014F\u001f\u0012")).append(Arrays.toString(this.cfr_renamed_126)).append(spreah.cfr_renamed_9("W/\u0007=\u0005/\u0012a")).append(this.cfr_renamed_145).append(")").toString());
        return stringBuilder2.toString();
    }
}

