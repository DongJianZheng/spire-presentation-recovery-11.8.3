/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkyca;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmbea;
import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprvhd;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class sprheb
implements Cloneable {
    public int cfr_renamed_185;
    public int spr\ufe34;
    public int cfr_renamed_82;
    public boolean cfr_renamed_126;
    public boolean cfr_renamed_88;
    public int cfr_renamed_31;
    public int cfr_renamed_272;
    public sprlc cfr_renamed_145;
    public int cfr_renamed_114;
    public byte[] cfr_renamed_96;
    public int cfr_renamed_105;
    public int cfr_renamed_137;
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
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    public int cfr_renamed_2;
    public boolean cfr_renamed_3;
    public int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1314() {
        sprheb sprheb2 = this;
        sprheb sprheb3 = this;
        sprheb3.cfr_renamed_102 = sprheb3.cfr_renamed_4;
        sprheb3.cfr_renamed_2 = sprheb3.cfr_renamed_137;
        sprheb3.cfr_renamed_185 = sprheb3.cfr_renamed_132;
        sprheb3.cfr_renamed_93 = sprheb3.cfr_renamed_0;
        this.cfr_renamed_114 = this.cfr_renamed_119 / 3;
        this.cfr_renamed_82 = 1;
        this.cfr_renamed_91 = sprheb2.cfr_renamed_119 * 3 / 2 / 8 - this.cfr_renamed_82 - this.cfr_renamed_31 / 8 - 1;
        sprheb2.cfr_renamed_152 = (sprheb2.cfr_renamed_119 * 3 / 2 + 7) / 8 * 8 + 1;
        sprheb2.cfr_renamed_105 = sprheb2.cfr_renamed_119 - 1;
        sprheb2.cfr_renamed_79 = sprheb2.cfr_renamed_31;
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = dataOutputStream = new DataOutputStream(arg0);
        sprheb sprheb2 = this;
        DataOutputStream dataOutputStream3 = dataOutputStream;
        sprheb sprheb3 = this;
        DataOutputStream dataOutputStream4 = dataOutputStream;
        sprheb sprheb4 = this;
        DataOutputStream dataOutputStream5 = dataOutputStream;
        sprheb sprheb5 = this;
        DataOutputStream dataOutputStream6 = dataOutputStream;
        sprheb sprheb6 = this;
        DataOutputStream dataOutputStream7 = dataOutputStream;
        dataOutputStream7.writeInt(this.cfr_renamed_119);
        dataOutputStream7.writeInt(this.cfr_renamed_272);
        dataOutputStream.writeInt(sprheb6.cfr_renamed_4);
        dataOutputStream6.writeInt(sprheb6.cfr_renamed_137);
        dataOutputStream6.writeInt(this.cfr_renamed_132);
        dataOutputStream.writeInt(sprheb5.cfr_renamed_0);
        dataOutputStream5.writeInt(sprheb5.cfr_renamed_31);
        dataOutputStream5.writeInt(this.cfr_renamed_107);
        dataOutputStream.writeInt(sprheb4.cfr_renamed_86);
        dataOutputStream4.writeInt(sprheb4.cfr_renamed_112);
        dataOutputStream4.writeInt(this.spr\ufe34);
        dataOutputStream.writeBoolean(sprheb3.cfr_renamed_88);
        dataOutputStream3.write(sprheb3.cfr_renamed_96);
        dataOutputStream3.writeBoolean(this.cfr_renamed_126);
        dataOutputStream.writeBoolean(sprheb2.cfr_renamed_3);
        dataOutputStream2.write(sprheb2.cfr_renamed_1);
        dataOutputStream2.writeUTF(this.cfr_renamed_145.cfr_renamed_1315());
    }

    /*
     * WARNING - void declaration
     */
    public sprheb(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl, byte[] byArray, boolean bl2, boolean bl3, sprlc sprlc2) {
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
        sprheb sprheb2 = this;
        sprheb sprheb3 = this;
        sprheb sprheb4 = this;
        sprheb sprheb5 = this;
        sprheb sprheb6 = this;
        sprheb sprheb7 = this;
        sprheb7.cfr_renamed_119 = arg0;
        sprheb7.cfr_renamed_272 = arg1;
        sprheb6.cfr_renamed_4 = arg2;
        sprheb6.cfr_renamed_31 = arg4;
        sprheb5.cfr_renamed_107 = arg3;
        sprheb5.cfr_renamed_86 = arg5;
        sprheb4.cfr_renamed_112 = arg6;
        sprheb4.spr\ufe34 = arg7;
        sprheb3.cfr_renamed_88 = arg8;
        sprheb3.cfr_renamed_96 = arg9;
        sprheb2.cfr_renamed_126 = arg10;
        sprheb2.cfr_renamed_3 = arg11;
        this.cfr_renamed_1 = 0;
        this.cfr_renamed_145 = sprlc2;
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
        sprheb sprheb2 = (sprheb)arg0;
        if (this.cfr_renamed_119 != sprheb2.cfr_renamed_119) {
            return false;
        }
        if (this.cfr_renamed_152 != sprheb2.cfr_renamed_152) {
            return false;
        }
        if (this.cfr_renamed_105 != sprheb2.cfr_renamed_105) {
            return false;
        }
        if (this.cfr_renamed_86 != sprheb2.cfr_renamed_86) {
            return false;
        }
        if (this.cfr_renamed_31 != sprheb2.cfr_renamed_31) {
            return false;
        }
        if (this.cfr_renamed_4 != sprheb2.cfr_renamed_4) {
            return false;
        }
        if (this.cfr_renamed_137 != sprheb2.cfr_renamed_137) {
            return false;
        }
        if (this.cfr_renamed_132 != sprheb2.cfr_renamed_132) {
            return false;
        }
        if (this.cfr_renamed_0 != sprheb2.cfr_renamed_0) {
            return false;
        }
        if (this.cfr_renamed_114 != sprheb2.cfr_renamed_114) {
            return false;
        }
        if (this.cfr_renamed_107 != sprheb2.cfr_renamed_107) {
            return false;
        }
        if (this.cfr_renamed_102 != sprheb2.cfr_renamed_102) {
            return false;
        }
        if (this.cfr_renamed_2 != sprheb2.cfr_renamed_2) {
            return false;
        }
        if (this.cfr_renamed_185 != sprheb2.cfr_renamed_185) {
            return false;
        }
        if (this.cfr_renamed_93 != sprheb2.cfr_renamed_93) {
            return false;
        }
        if (this.cfr_renamed_3 != sprheb2.cfr_renamed_3) {
            return false;
        }
        if (this.cfr_renamed_145 == null ? sprheb2.cfr_renamed_145 != null : !this.cfr_renamed_145.cfr_renamed_1315().equals(sprheb2.cfr_renamed_145.cfr_renamed_1315())) {
            return false;
        }
        if (this.cfr_renamed_88 != sprheb2.cfr_renamed_88) {
            return false;
        }
        if (this.cfr_renamed_82 != sprheb2.cfr_renamed_82) {
            return false;
        }
        if (this.cfr_renamed_91 != sprheb2.cfr_renamed_91) {
            return false;
        }
        if (this.spr\ufe34 != sprheb2.spr\ufe34) {
            return false;
        }
        if (this.cfr_renamed_112 != sprheb2.cfr_renamed_112) {
            return false;
        }
        if (!Arrays.equals(this.cfr_renamed_96, sprheb2.cfr_renamed_96)) {
            return false;
        }
        if (this.cfr_renamed_79 != sprheb2.cfr_renamed_79) {
            return false;
        }
        if (this.cfr_renamed_1 != sprheb2.cfr_renamed_1) {
            return false;
        }
        if (this.cfr_renamed_272 != sprheb2.cfr_renamed_272) {
            return false;
        }
        return this.cfr_renamed_126 == sprheb2.cfr_renamed_126;
    }

    public sprheb cfr_renamed_1316() {
        if (this.cfr_renamed_1 == 0) {
            sprheb sprheb2 = this;
            sprheb sprheb3 = this;
            sprheb sprheb4 = this;
            sprheb sprheb5 = this;
            sprheb sprheb6 = this;
            sprheb sprheb7 = this;
            return new sprheb(sprheb2.cfr_renamed_119, sprheb2.cfr_renamed_272, sprheb3.cfr_renamed_4, sprheb3.cfr_renamed_107, sprheb4.cfr_renamed_31, sprheb4.cfr_renamed_86, sprheb5.cfr_renamed_112, sprheb5.spr\ufe34, sprheb6.cfr_renamed_88, sprheb6.cfr_renamed_96, sprheb7.cfr_renamed_126, sprheb7.cfr_renamed_3, this.cfr_renamed_145);
        }
        sprheb sprheb8 = this;
        sprheb sprheb9 = this;
        sprheb sprheb10 = this;
        sprheb sprheb11 = this;
        sprheb sprheb12 = this;
        sprheb sprheb13 = this;
        sprheb sprheb14 = this;
        return new sprheb(sprheb8.cfr_renamed_119, sprheb8.cfr_renamed_272, sprheb9.cfr_renamed_137, sprheb9.cfr_renamed_132, sprheb10.cfr_renamed_0, sprheb10.cfr_renamed_107, sprheb11.cfr_renamed_31, sprheb11.cfr_renamed_86, sprheb12.cfr_renamed_112, sprheb12.spr\ufe34, sprheb13.cfr_renamed_88, sprheb13.cfr_renamed_96, sprheb14.cfr_renamed_126, sprheb14.cfr_renamed_3, this.cfr_renamed_145);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 4 << 4 ^ 5 << 1;
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

    public String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder(new StringBuilder().insert(0, sprkyca.cfr_renamed_9("{c]\u007fG}JdQcnlLlShJhL~\u0016C\u0003")).append(this.cfr_renamed_119).append(sprmbea.cfr_renamed_9("\u000bR\u0016")).append(this.cfr_renamed_272).toString());
        if (this.cfr_renamed_1 == 0) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder = stringBuilder3;
            stringBuilder3.append(sprkyca.cfr_renamed_9("-NbRtjtNh\u0003^w@nA{-Zk\u0003") + this.cfr_renamed_4);
        } else {
            StringBuilder stringBuilder4 = stringBuilder2;
            stringBuilder = stringBuilder4;
            stringBuilder4.append(new StringBuilder().insert(0, sprmbea.cfr_renamed_9("\u0003[LGZ\u007fZ[F\u0016sylovhw\u000bGM\u0012\u0016")).append(this.cfr_renamed_137).append(sprkyca.cfr_renamed_9("\u001eiX?\u0003")).append(this.cfr_renamed_132).append(sprmbea.cfr_renamed_9("\u000bGM\u0010\u0016")).append(this.cfr_renamed_0).toString());
        }
        stringBuilder.append(new StringBuilder().insert(0, sprkyca.cfr_renamed_9("\u001eiS=\u0003")).append(this.cfr_renamed_107).append(sprmbea.cfr_renamed_9("\u0003OA\u0016")).append(this.cfr_renamed_31).append(sprkyca.cfr_renamed_9("\u001en\u0003")).append(this.cfr_renamed_86).append(sprmbea.cfr_renamed_9("\u000bNBMhBGOXq\u0016")).append(this.cfr_renamed_112).append(sprkyca.cfr_renamed_9("-SdPN_aR~slMf\u0003")).append(this.spr\ufe34).append(sprmbea.cfr_renamed_9("\u0003CBXKxFNG\u0016")).append(this.cfr_renamed_88).append(sprkyca.cfr_renamed_9("\u001ee_~VLRj\u0003")).append(this.cfr_renamed_145).append(sprmbea.cfr_renamed_9("\u000bLBG\u0016")).append(Arrays.toString(this.cfr_renamed_96)).append(sprkyca.cfr_renamed_9("-M}_\u007fMh\u0003")).append(this.cfr_renamed_126).append(")").toString());
        return stringBuilder2.toString();
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.cfr_renamed_119;
        n = 31 * n + this.cfr_renamed_152;
        n = 31 * n + this.cfr_renamed_105;
        n = 31 * n + this.cfr_renamed_86;
        n = 31 * n + this.cfr_renamed_31;
        n = 31 * n + this.cfr_renamed_4;
        n = 31 * n + this.cfr_renamed_137;
        n = 31 * n + this.cfr_renamed_132;
        n = 31 * n + this.cfr_renamed_0;
        n = 31 * n + this.cfr_renamed_114;
        n = 31 * n + this.cfr_renamed_107;
        n = 31 * n + this.cfr_renamed_102;
        n = 31 * n + this.cfr_renamed_2;
        n = 31 * n + this.cfr_renamed_185;
        n = 31 * n + this.cfr_renamed_93;
        n = 31 * n + (this.cfr_renamed_3 ? 1231 : 1237);
        n = 31 * n + (this.cfr_renamed_145 == null ? 0 : this.cfr_renamed_145.cfr_renamed_1315().hashCode());
        n = 31 * n + (this.cfr_renamed_88 ? 1231 : 1237);
        n = 31 * n + this.cfr_renamed_82;
        n = 31 * n + this.cfr_renamed_91;
        n = 31 * n + this.spr\ufe34;
        n = 31 * n + this.cfr_renamed_112;
        n = 31 * n + Arrays.hashCode(this.cfr_renamed_96);
        n = 31 * n + this.cfr_renamed_79;
        n = 31 * n + this.cfr_renamed_1;
        n = 31 * n + this.cfr_renamed_272;
        n = 31 * n + (this.cfr_renamed_126 ? 1231 : 1237);
        return n;
    }

    public int cfr_renamed_1345() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprheb(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, boolean bl, byte[] byArray, boolean bl2, boolean bl3, sprlc sprlc2) {
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
        sprheb sprheb2 = this;
        sprheb sprheb3 = this;
        sprheb sprheb4 = this;
        sprheb sprheb5 = this;
        sprheb sprheb6 = this;
        sprheb sprheb7 = this;
        sprheb sprheb8 = this;
        sprheb8.cfr_renamed_119 = arg0;
        sprheb8.cfr_renamed_272 = arg1;
        sprheb7.cfr_renamed_137 = arg2;
        sprheb7.cfr_renamed_132 = arg3;
        sprheb6.cfr_renamed_0 = arg4;
        sprheb6.cfr_renamed_31 = arg6;
        sprheb5.cfr_renamed_107 = arg5;
        sprheb5.cfr_renamed_86 = arg7;
        sprheb4.cfr_renamed_112 = arg8;
        sprheb4.spr\ufe34 = arg9;
        sprheb3.cfr_renamed_88 = arg10;
        sprheb3.cfr_renamed_96 = arg11;
        sprheb2.cfr_renamed_126 = arg12;
        sprheb2.cfr_renamed_3 = arg13;
        this.cfr_renamed_1 = 1;
        this.cfr_renamed_145 = sprlc2;
        this.cfr_renamed_1314();
    }

    public sprheb(InputStream arg0) throws IOException {
        sprheb sprheb2;
        DataInputStream dataInputStream = new DataInputStream(arg0);
        this.cfr_renamed_119 = dataInputStream.readInt();
        this.cfr_renamed_272 = dataInputStream.readInt();
        this.cfr_renamed_4 = dataInputStream.readInt();
        this.cfr_renamed_137 = dataInputStream.readInt();
        this.cfr_renamed_132 = dataInputStream.readInt();
        this.cfr_renamed_0 = dataInputStream.readInt();
        this.cfr_renamed_31 = dataInputStream.readInt();
        this.cfr_renamed_107 = dataInputStream.readInt();
        this.cfr_renamed_86 = dataInputStream.readInt();
        this.cfr_renamed_112 = dataInputStream.readInt();
        this.spr\ufe34 = dataInputStream.readInt();
        this.cfr_renamed_88 = dataInputStream.readBoolean();
        this.cfr_renamed_96 = new byte[3];
        dataInputStream.read(this.cfr_renamed_96);
        DataInputStream dataInputStream2 = dataInputStream;
        sprheb sprheb3 = this;
        sprheb3.cfr_renamed_126 = dataInputStream.readBoolean();
        sprheb3.cfr_renamed_3 = dataInputStream.readBoolean();
        this.cfr_renamed_1 = dataInputStream2.read();
        String string = dataInputStream2.readUTF();
        if ("SHA-512".equals(string)) {
            sprheb2 = this;
            this.cfr_renamed_145 = new sprvhd();
        } else {
            if ("SHA-256".equals(string)) {
                this.cfr_renamed_145 = new sprtfd();
            }
            sprheb2 = this;
        }
        sprheb2.cfr_renamed_1314();
    }
}

