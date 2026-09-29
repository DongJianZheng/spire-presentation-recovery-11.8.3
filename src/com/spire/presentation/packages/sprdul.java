/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajg;
import com.spire.presentation.packages.spraol;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdql;
import com.spire.presentation.packages.sprfkm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjlg;
import com.spire.presentation.packages.sprjvo;
import com.spire.presentation.packages.sprknl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlgg;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmz;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprni;
import com.spire.presentation.packages.sprnng;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpsl;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprtlg;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.spryqp;
import com.spire.presentation.packages.spryrm;
import com.spire.presentation.packages.sprzz;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprdul {
    private static final Map cfr_renamed_152;
    private static final short[] cfr_renamed_112;
    public static final Map cfr_renamed_119;
    public static final sprni cfr_renamed_91;
    private static final short[] cfr_renamed_0;
    private sprmz cfr_renamed_1;
    public static final Map cfr_renamed_2;
    public static final Map cfr_renamed_3;
    private static final Set cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_10708(sprddm arg0, Key arg1) throws sprlyl {
        int n = cfr_renamed_91.cfr_renamed_7385(arg0);
        if (n > 0) {
            byte[] byArray;
            byte[] byArray2 = null;
            try {
                byArray = byArray2 = arg1.getEncoded();
            }
            catch (Exception exception) {
                byArray = byArray2;
            }
            if (byArray != null && byArray2.length * 8 != n) {
                throw new sprlyl(spryqp.cfr_renamed_9("[\u0000n\u001d}\f{\u001c>\u0013{\u0001>\u000bw\u0002{Xx\u0017lX\u007f\u0014y\u0017l\u0011j\u0010sXQ1ZXp\u0017jXx\u0017k\u0016zXw\u0016>\n{\u001bw\bw\u001dp\f0"));
            }
        }
    }

    /*
     * Exception decompiling
     */
    public Mac cfr_renamed_10743(sprlem arg0) throws sprlyl {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Mac cfr_renamed_10702(Key arg0, sprddm arg1) throws sprlyl {
        return (Mac)sprdul.cfr_renamed_10744(new sprknl(this, arg1, arg0));
    }

    public sprddm cfr_renamed_7473(sprlem arg0, AlgorithmParameterSpec arg1) {
        if (arg1 instanceof IvParameterSpec) {
            return new sprddm(arg0, new sprfvg(((IvParameterSpec)arg1).getIV()));
        }
        if (arg1 instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec)arg1;
            int n = ((RC2ParameterSpec)arg1).getEffectiveKeyBits();
            if (n != -1) {
                int n2 = n < 256 ? cfr_renamed_112[n] : n;
                return new sprddm(arg0, new sprfkm(n2, rC2ParameterSpec.getIV()));
            }
            return new sprddm(arg0, new sprfkm(rC2ParameterSpec.getIV()));
        }
        throw new IllegalStateException(new StringBuilder().insert(0, spryqp.cfr_renamed_9("\rp\u0013p\u0017i\u0016>\b\u007f\n\u007f\u0015{\f{\n>\u000bn\u001d}B>")).append(arg1).toString());
    }

    /*
     * Exception decompiling
     */
    public KeyGenerator cfr_renamed_10745(sprlem arg0) throws sprlyl {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean cfr_renamed_10730(sprlem arg0) {
        return cfr_renamed_4.contains(arg0);
    }

    /*
     * Exception decompiling
     */
    public KeyFactory cfr_renamed_10710(sprlem arg0) throws sprlyl {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Cipher cfr_renamed_10698(sprlem arg0) throws sprlyl {
        String string = (String)cfr_renamed_3.get(arg0);
        if (string == null) {
            throw new sprlyl(new StringBuilder().insert(0, sprjvo.cfr_renamed_9("#\u0007m\u0006,\u0005(H+\u0007?H")).append(arg0).toString());
        }
        string = new StringBuilder().insert(0, string).append(spryqp.cfr_renamed_9("L>]K,I//l\u0019n")).toString();
        try {
            return this.cfr_renamed_1.cfr_renamed_1496(string);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprlyl(new StringBuilder().insert(0, sprjvo.cfr_renamed_9(".\t#\u0006\"\u001cm\u000b?\r,\u001c(H.\u0001=\u0000(\u001awH")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    static {
        cfr_renamed_91 = sprlgg.cfr_renamed_3;
        cfr_renamed_4 = new HashSet();
        cfr_renamed_3 = new HashMap();
        cfr_renamed_2 = new HashMap();
        cfr_renamed_119 = new HashMap();
        cfr_renamed_152 = new HashMap();
        cfr_renamed_3.put(sprpsl.cfr_renamed_1442, "DES");
        cfr_renamed_3.put(sprpsl.cfr_renamed_1222, spryqp.cfr_renamed_9("<[+[<["));
        cfr_renamed_3.put(sprpsl.cfr_renamed_272, sprjvo.cfr_renamed_9(")\b;"));
        cfr_renamed_3.put(sprpsl.cfr_renamed_723, spryqp.cfr_renamed_9("_=M"));
        cfr_renamed_3.put(sprpsl.cfr_renamed_102, sprjvo.cfr_renamed_9(")\b;"));
        cfr_renamed_3.put(sprpsl.cfr_renamed_3, "RC2");
        cfr_renamed_3.put(sprpsl.cfr_renamed_1329, spryqp.cfr_renamed_9("]9M,+"));
        cfr_renamed_3.put(sprpsl.cfr_renamed_1221, sprjvo.cfr_renamed_9("\u000e\t \r!\u0004$\t"));
        cfr_renamed_3.put(sprpsl.cfr_renamed_1217, spryqp.cfr_renamed_9(";\u007f\u0015{\u0014r\u0011\u007f"));
        cfr_renamed_3.put(sprpsl.cfr_renamed_499, sprjvo.cfr_renamed_9("\u000e\t \r!\u0004$\t"));
        cfr_renamed_3.put(sprpsl.cfr_renamed_953, spryqp.cfr_renamed_9("+[=Z"));
        cfr_renamed_3.put(sprdl.cfr_renamed_1221, sprjvo.cfr_renamed_9(":\u000e\\"));
        cfr_renamed_3.put(sprqo.cfr_renamed_132, spryqp.cfr_renamed_9("Y7M,,@/L)"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_1442, sprjvo.cfr_renamed_9("\t-\u001eG\u000e*\u000eG\u001d#\u000e;x8,\f)\u0001#\u000f"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_3, spryqp.cfr_renamed_9("*]J1;\\;1(U;MMN\u0019z\u001cw\u0016y"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_1222, sprjvo.cfr_renamed_9(",\b;\b,\bG\u000e*\u000eG\u001d#\u000e;x8,\f)\u0001#\u000f"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_272, spryqp.cfr_renamed_9("9[+1;\\;1(U;MMN\u0019z\u001cw\u0016y"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_723, sprjvo.cfr_renamed_9("\f-\u001eG\u000e*\u000eG\u001d#\u000e;x8,\f)\u0001#\u000f"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_102, spryqp.cfr_renamed_9("9[+1;\\;1(U;MMN\u0019z\u001cw\u0016y"));
        cfr_renamed_2.put(sprdl.cfr_renamed_1205, sprjvo.cfr_renamed_9("\u001f;\fG\b+\u000fG\u001d#\u000e;|8,\f)\u0001#\u000f"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_1329, spryqp.cfr_renamed_9(";_+JM1;\\;1(U;MMN\u0019z\u001cw\u0016y"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_1221, sprjvo.cfr_renamed_9("+,\u0005(\u0004!\u0001,G\u000e*\u000eG\u001d#\u000e;x8,\f)\u0001#\u000f"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_1217, spryqp.cfr_renamed_9("]\u0019s\u001dr\u0014w\u00191;\\;1(U;MMN\u0019z\u001cw\u0016y"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_499, sprjvo.cfr_renamed_9("+,\u0005(\u0004!\u0001,G\u000e*\u000eG\u001d#\u000e;x8,\f)\u0001#\u000f"));
        cfr_renamed_2.put(sprpsl.cfr_renamed_953, spryqp.cfr_renamed_9("M=[<1;\\;1(U;MMN\u0019z\u001cw\u0016y"));
        cfr_renamed_2.put(sprdl.cfr_renamed_1221, sprjvo.cfr_renamed_9(":\u000e\\"));
        cfr_renamed_119.put(sprpsl.cfr_renamed_1222, spryqp.cfr_renamed_9("Z=M=Z=S\u0019}"));
        cfr_renamed_119.put(sprpsl.cfr_renamed_272, sprjvo.cfr_renamed_9("\f-\u001e%,\u000b"));
        cfr_renamed_119.put(sprpsl.cfr_renamed_723, spryqp.cfr_renamed_9("9[+S\u0019}"));
        cfr_renamed_119.put(sprpsl.cfr_renamed_102, sprjvo.cfr_renamed_9("\f-\u001e%,\u000b"));
        cfr_renamed_119.put(sprpsl.cfr_renamed_3, spryqp.cfr_renamed_9("*]JS\u0019}"));
        cfr_renamed_152.put(spraol.cfr_renamed_0.cfr_renamed_10746(), sprjvo.cfr_renamed_9("\u001d*\u0006,\u000bZ\u001a!\u0019 \u0005%\f+\u001e \fY"));
        cfr_renamed_152.put(spraol.cfr_renamed_4.cfr_renamed_10746(), spryqp.cfr_renamed_9("(\\3Z>,/W,V0S9]+V9,J*"));
        cfr_renamed_152.put(spraol.cfr_renamed_3.cfr_renamed_10746(), sprjvo.cfr_renamed_9("\u001d*\u0006,\u000bZ\u001a!\u0019 \u0005%\f+\u001e \fZx^"));
        cfr_renamed_152.put(spraol.cfr_renamed_91.cfr_renamed_10746(), spryqp.cfr_renamed_9("(\\3Z>,/W,V0S9]+V9-@*"));
        cfr_renamed_152.put(spraol.cfr_renamed_2.cfr_renamed_10746(), sprjvo.cfr_renamed_9("\u001d*\u0006,\u000bZ\u001a!\u0019 \u0005%\f+\u001e \f]|Z"));
        cfr_renamed_4.add(sprwr.cfr_renamed_134);
        cfr_renamed_4.add(sprwr.cfr_renamed_133);
        cfr_renamed_4.add(sprwr.cfr_renamed_805);
        cfr_renamed_4.add(sprwr.cfr_renamed_951);
        cfr_renamed_4.add(sprwr.cfr_renamed_107);
        cfr_renamed_4.add(sprwr.cfr_renamed_1228);
        short[] sArray = new short[256];
        sArray[0] = 189;
        sArray[1] = 86;
        sArray[2] = 234;
        sArray[3] = 242;
        sArray[4] = 162;
        sArray[5] = 241;
        sArray[6] = 172;
        sArray[7] = 42;
        sArray[8] = 176;
        sArray[9] = 147;
        sArray[10] = 209;
        sArray[11] = 156;
        sArray[12] = 27;
        sArray[13] = 51;
        sArray[14] = 253;
        sArray[15] = 208;
        sArray[16] = 48;
        sArray[17] = 4;
        sArray[18] = 182;
        sArray[19] = 220;
        sArray[20] = 125;
        sArray[21] = 223;
        sArray[22] = 50;
        sArray[23] = 75;
        sArray[24] = 247;
        sArray[25] = 203;
        sArray[26] = 69;
        sArray[27] = 155;
        sArray[28] = 49;
        sArray[29] = 187;
        sArray[30] = 33;
        sArray[31] = 90;
        sArray[32] = 65;
        sArray[33] = 159;
        sArray[34] = 225;
        sArray[35] = 217;
        sArray[36] = 74;
        sArray[37] = 77;
        sArray[38] = 158;
        sArray[39] = 218;
        sArray[40] = 160;
        sArray[41] = 104;
        sArray[42] = 44;
        sArray[43] = 195;
        sArray[44] = 39;
        sArray[45] = 95;
        sArray[46] = 128;
        sArray[47] = 54;
        sArray[48] = 62;
        sArray[49] = 238;
        sArray[50] = 251;
        sArray[51] = 149;
        sArray[52] = 26;
        sArray[53] = 254;
        sArray[54] = 206;
        sArray[55] = 168;
        sArray[56] = 52;
        sArray[57] = 169;
        sArray[58] = 19;
        sArray[59] = 240;
        sArray[60] = 166;
        sArray[61] = 63;
        sArray[62] = 216;
        sArray[63] = 12;
        sArray[64] = 120;
        sArray[65] = 36;
        sArray[66] = 175;
        sArray[67] = 35;
        sArray[68] = 82;
        sArray[69] = 193;
        sArray[70] = 103;
        sArray[71] = 23;
        sArray[72] = 245;
        sArray[73] = 102;
        sArray[74] = 144;
        sArray[75] = 231;
        sArray[76] = 232;
        sArray[77] = 7;
        sArray[78] = 184;
        sArray[79] = 96;
        sArray[80] = 72;
        sArray[81] = 230;
        sArray[82] = 30;
        sArray[83] = 83;
        sArray[84] = 243;
        sArray[85] = 146;
        sArray[86] = 164;
        sArray[87] = 114;
        sArray[88] = 140;
        sArray[89] = 8;
        sArray[90] = 21;
        sArray[91] = 110;
        sArray[92] = 134;
        sArray[93] = 0;
        sArray[94] = 132;
        sArray[95] = 250;
        sArray[96] = 244;
        sArray[97] = 127;
        sArray[98] = 138;
        sArray[99] = 66;
        sArray[100] = 25;
        sArray[101] = 246;
        sArray[102] = 219;
        sArray[103] = 205;
        sArray[104] = 20;
        sArray[105] = 141;
        sArray[106] = 80;
        sArray[107] = 18;
        sArray[108] = 186;
        sArray[109] = 60;
        sArray[110] = 6;
        sArray[111] = 78;
        sArray[112] = 236;
        sArray[113] = 179;
        sArray[114] = 53;
        sArray[115] = 17;
        sArray[116] = 161;
        sArray[117] = 136;
        sArray[118] = 142;
        sArray[119] = 43;
        sArray[120] = 148;
        sArray[121] = 153;
        sArray[122] = 183;
        sArray[123] = 113;
        sArray[124] = 116;
        sArray[125] = 211;
        sArray[126] = 228;
        sArray[127] = 191;
        sArray[128] = 58;
        sArray[129] = 222;
        sArray[130] = 150;
        sArray[131] = 14;
        sArray[132] = 188;
        sArray[133] = 10;
        sArray[134] = 237;
        sArray[135] = 119;
        sArray[136] = 252;
        sArray[137] = 55;
        sArray[138] = 107;
        sArray[139] = 3;
        sArray[140] = 121;
        sArray[141] = 137;
        sArray[142] = 98;
        sArray[143] = 198;
        sArray[144] = 215;
        sArray[145] = 192;
        sArray[146] = 210;
        sArray[147] = 124;
        sArray[148] = 106;
        sArray[149] = 139;
        sArray[150] = 34;
        sArray[151] = 163;
        sArray[152] = 91;
        sArray[153] = 5;
        sArray[154] = 93;
        sArray[155] = 2;
        sArray[156] = 117;
        sArray[157] = 213;
        sArray[158] = 97;
        sArray[159] = 227;
        sArray[160] = 24;
        sArray[161] = 143;
        sArray[162] = 85;
        sArray[163] = 81;
        sArray[164] = 173;
        sArray[165] = 31;
        sArray[166] = 11;
        sArray[167] = 94;
        sArray[168] = 133;
        sArray[169] = 229;
        sArray[170] = 194;
        sArray[171] = 87;
        sArray[172] = 99;
        sArray[173] = 202;
        sArray[174] = 61;
        sArray[175] = 108;
        sArray[176] = 180;
        sArray[177] = 197;
        sArray[178] = 204;
        sArray[179] = 112;
        sArray[180] = 178;
        sArray[181] = 145;
        sArray[182] = 89;
        sArray[183] = 13;
        sArray[184] = 71;
        sArray[185] = 32;
        sArray[186] = 200;
        sArray[187] = 79;
        sArray[188] = 88;
        sArray[189] = 224;
        sArray[190] = 1;
        sArray[191] = 226;
        sArray[192] = 22;
        sArray[193] = 56;
        sArray[194] = 196;
        sArray[195] = 111;
        sArray[196] = 59;
        sArray[197] = 15;
        sArray[198] = 101;
        sArray[199] = 70;
        sArray[200] = 190;
        sArray[201] = 126;
        sArray[202] = 45;
        sArray[203] = 123;
        sArray[204] = 130;
        sArray[205] = 249;
        sArray[206] = 64;
        sArray[207] = 181;
        sArray[208] = 29;
        sArray[209] = 115;
        sArray[210] = 248;
        sArray[211] = 235;
        sArray[212] = 38;
        sArray[213] = 199;
        sArray[214] = 135;
        sArray[215] = 151;
        sArray[216] = 37;
        sArray[217] = 84;
        sArray[218] = 177;
        sArray[219] = 40;
        sArray[220] = 170;
        sArray[221] = 152;
        sArray[222] = 157;
        sArray[223] = 165;
        sArray[224] = 100;
        sArray[225] = 109;
        sArray[226] = 122;
        sArray[227] = 212;
        sArray[228] = 16;
        sArray[229] = 129;
        sArray[230] = 68;
        sArray[231] = 239;
        sArray[232] = 73;
        sArray[233] = 214;
        sArray[234] = 174;
        sArray[235] = 46;
        sArray[236] = 221;
        sArray[237] = 118;
        sArray[238] = 92;
        sArray[239] = 47;
        sArray[240] = 167;
        sArray[241] = 28;
        sArray[242] = 201;
        sArray[243] = 9;
        sArray[244] = 105;
        sArray[245] = 154;
        sArray[246] = 131;
        sArray[247] = 207;
        sArray[248] = 41;
        sArray[249] = 57;
        sArray[250] = 185;
        sArray[251] = 233;
        sArray[252] = 76;
        sArray[253] = 255;
        sArray[254] = 67;
        sArray[255] = 171;
        cfr_renamed_112 = sArray;
        short[] sArray2 = new short[256];
        sArray2[0] = 93;
        sArray2[1] = 190;
        sArray2[2] = 155;
        sArray2[3] = 139;
        sArray2[4] = 17;
        sArray2[5] = 153;
        sArray2[6] = 110;
        sArray2[7] = 77;
        sArray2[8] = 89;
        sArray2[9] = 243;
        sArray2[10] = 133;
        sArray2[11] = 166;
        sArray2[12] = 63;
        sArray2[13] = 183;
        sArray2[14] = 131;
        sArray2[15] = 197;
        sArray2[16] = 228;
        sArray2[17] = 115;
        sArray2[18] = 107;
        sArray2[19] = 58;
        sArray2[20] = 104;
        sArray2[21] = 90;
        sArray2[22] = 192;
        sArray2[23] = 71;
        sArray2[24] = 160;
        sArray2[25] = 100;
        sArray2[26] = 52;
        sArray2[27] = 12;
        sArray2[28] = 241;
        sArray2[29] = 208;
        sArray2[30] = 82;
        sArray2[31] = 165;
        sArray2[32] = 185;
        sArray2[33] = 30;
        sArray2[34] = 150;
        sArray2[35] = 67;
        sArray2[36] = 65;
        sArray2[37] = 216;
        sArray2[38] = 212;
        sArray2[39] = 44;
        sArray2[40] = 219;
        sArray2[41] = 248;
        sArray2[42] = 7;
        sArray2[43] = 119;
        sArray2[44] = 42;
        sArray2[45] = 202;
        sArray2[46] = 235;
        sArray2[47] = 239;
        sArray2[48] = 16;
        sArray2[49] = 28;
        sArray2[50] = 22;
        sArray2[51] = 13;
        sArray2[52] = 56;
        sArray2[53] = 114;
        sArray2[54] = 47;
        sArray2[55] = 137;
        sArray2[56] = 193;
        sArray2[57] = 249;
        sArray2[58] = 128;
        sArray2[59] = 196;
        sArray2[60] = 109;
        sArray2[61] = 174;
        sArray2[62] = 48;
        sArray2[63] = 61;
        sArray2[64] = 206;
        sArray2[65] = 32;
        sArray2[66] = 99;
        sArray2[67] = 254;
        sArray2[68] = 230;
        sArray2[69] = 26;
        sArray2[70] = 199;
        sArray2[71] = 184;
        sArray2[72] = 80;
        sArray2[73] = 232;
        sArray2[74] = 36;
        sArray2[75] = 23;
        sArray2[76] = 252;
        sArray2[77] = 37;
        sArray2[78] = 111;
        sArray2[79] = 187;
        sArray2[80] = 106;
        sArray2[81] = 163;
        sArray2[82] = 68;
        sArray2[83] = 83;
        sArray2[84] = 217;
        sArray2[85] = 162;
        sArray2[86] = 1;
        sArray2[87] = 171;
        sArray2[88] = 188;
        sArray2[89] = 182;
        sArray2[90] = 31;
        sArray2[91] = 152;
        sArray2[92] = 238;
        sArray2[93] = 154;
        sArray2[94] = 167;
        sArray2[95] = 45;
        sArray2[96] = 79;
        sArray2[97] = 158;
        sArray2[98] = 142;
        sArray2[99] = 172;
        sArray2[100] = 224;
        sArray2[101] = 198;
        sArray2[102] = 73;
        sArray2[103] = 70;
        sArray2[104] = 41;
        sArray2[105] = 244;
        sArray2[106] = 148;
        sArray2[107] = 138;
        sArray2[108] = 175;
        sArray2[109] = 225;
        sArray2[110] = 91;
        sArray2[111] = 195;
        sArray2[112] = 179;
        sArray2[113] = 123;
        sArray2[114] = 87;
        sArray2[115] = 209;
        sArray2[116] = 124;
        sArray2[117] = 156;
        sArray2[118] = 237;
        sArray2[119] = 135;
        sArray2[120] = 64;
        sArray2[121] = 140;
        sArray2[122] = 226;
        sArray2[123] = 203;
        sArray2[124] = 147;
        sArray2[125] = 20;
        sArray2[126] = 201;
        sArray2[127] = 97;
        sArray2[128] = 46;
        sArray2[129] = 229;
        sArray2[130] = 204;
        sArray2[131] = 246;
        sArray2[132] = 94;
        sArray2[133] = 168;
        sArray2[134] = 92;
        sArray2[135] = 214;
        sArray2[136] = 117;
        sArray2[137] = 141;
        sArray2[138] = 98;
        sArray2[139] = 149;
        sArray2[140] = 88;
        sArray2[141] = 105;
        sArray2[142] = 118;
        sArray2[143] = 161;
        sArray2[144] = 74;
        sArray2[145] = 181;
        sArray2[146] = 85;
        sArray2[147] = 9;
        sArray2[148] = 120;
        sArray2[149] = 51;
        sArray2[150] = 130;
        sArray2[151] = 215;
        sArray2[152] = 221;
        sArray2[153] = 121;
        sArray2[154] = 245;
        sArray2[155] = 27;
        sArray2[156] = 11;
        sArray2[157] = 222;
        sArray2[158] = 38;
        sArray2[159] = 33;
        sArray2[160] = 40;
        sArray2[161] = 116;
        sArray2[162] = 4;
        sArray2[163] = 151;
        sArray2[164] = 86;
        sArray2[165] = 223;
        sArray2[166] = 60;
        sArray2[167] = 240;
        sArray2[168] = 55;
        sArray2[169] = 57;
        sArray2[170] = 220;
        sArray2[171] = 255;
        sArray2[172] = 6;
        sArray2[173] = 164;
        sArray2[174] = 234;
        sArray2[175] = 66;
        sArray2[176] = 8;
        sArray2[177] = 218;
        sArray2[178] = 180;
        sArray2[179] = 113;
        sArray2[180] = 176;
        sArray2[181] = 207;
        sArray2[182] = 18;
        sArray2[183] = 122;
        sArray2[184] = 78;
        sArray2[185] = 250;
        sArray2[186] = 108;
        sArray2[187] = 29;
        sArray2[188] = 132;
        sArray2[189] = 0;
        sArray2[190] = 200;
        sArray2[191] = 127;
        sArray2[192] = 145;
        sArray2[193] = 69;
        sArray2[194] = 170;
        sArray2[195] = 43;
        sArray2[196] = 194;
        sArray2[197] = 177;
        sArray2[198] = 143;
        sArray2[199] = 213;
        sArray2[200] = 186;
        sArray2[201] = 242;
        sArray2[202] = 173;
        sArray2[203] = 25;
        sArray2[204] = 178;
        sArray2[205] = 103;
        sArray2[206] = 54;
        sArray2[207] = 247;
        sArray2[208] = 15;
        sArray2[209] = 10;
        sArray2[210] = 146;
        sArray2[211] = 125;
        sArray2[212] = 227;
        sArray2[213] = 157;
        sArray2[214] = 233;
        sArray2[215] = 144;
        sArray2[216] = 62;
        sArray2[217] = 35;
        sArray2[218] = 39;
        sArray2[219] = 102;
        sArray2[220] = 19;
        sArray2[221] = 236;
        sArray2[222] = 129;
        sArray2[223] = 21;
        sArray2[224] = 189;
        sArray2[225] = 34;
        sArray2[226] = 191;
        sArray2[227] = 159;
        sArray2[228] = 126;
        sArray2[229] = 169;
        sArray2[230] = 81;
        sArray2[231] = 75;
        sArray2[232] = 76;
        sArray2[233] = 251;
        sArray2[234] = 2;
        sArray2[235] = 211;
        sArray2[236] = 112;
        sArray2[237] = 134;
        sArray2[238] = 49;
        sArray2[239] = 231;
        sArray2[240] = 59;
        sArray2[241] = 5;
        sArray2[242] = 3;
        sArray2[243] = 84;
        sArray2[244] = 96;
        sArray2[245] = 72;
        sArray2[246] = 101;
        sArray2[247] = 24;
        sArray2[248] = 210;
        sArray2[249] = 205;
        sArray2[250] = 95;
        sArray2[251] = 50;
        sArray2[252] = 136;
        sArray2[253] = 14;
        sArray2[254] = 53;
        sArray2[255] = 253;
        cfr_renamed_0 = sArray2;
    }

    public sprnng cfr_renamed_10693(sprddm arg0, PrivateKey arg1) {
        arg1 = sproul.cfr_renamed_10695(arg1);
        return this.cfr_renamed_1.cfr_renamed_10693(arg0, arg1);
    }

    public Cipher cfr_renamed_10701(Key arg0, sprddm arg1) throws sprlyl {
        return (Cipher)sprdul.cfr_renamed_10744(new sprdql(this, arg1, arg0));
    }

    public sprddm cfr_renamed_7474(sprlem arg0, AlgorithmParameters arg1) throws sprlyl {
        sprco sprco2 = arg1 != null ? sproul.cfr_renamed_2383(arg1) : sprpen.cfr_renamed_4;
        return new sprddm(arg0, sprco2);
    }

    public sprdul(sprmz sprmz2) {
        this.cfr_renamed_1 = sprmz2;
    }

    public SecretKeyFactory cfr_renamed_1495(String arg0) throws NoSuchProviderException, NoSuchAlgorithmException {
        return this.cfr_renamed_1.cfr_renamed_1495(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object cfr_renamed_10744(sprzz arg0) throws sprlyl {
        try {
            return arg0.cfr_renamed_4091();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprlyl(spryqp.cfr_renamed_9("}\u0019p_jXx\u0011p\u001c>\u0019r\u001fq\nw\fv\u00150"), noSuchAlgorithmException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprlyl(sprjvo.cfr_renamed_9("\u0003(\u0011m\u0001#\u001e,\u0004$\fm\u0001#H \r>\u001b,\u000f(F"), invalidKeyException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprlyl(spryqp.cfr_renamed_9("\u001b\u007f\u00169\f>\u001ew\u0016zXn\nq\u000ew\u001c{\n0"), noSuchProviderException);
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            throw new sprlyl(sprjvo.cfr_renamed_9("\u001a(\u00198\u0001?\r)H=\t)\f$\u0006*H#\u00079H>\u001d=\u0018\"\u001a9\r)F"), noSuchPaddingException);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new sprlyl(spryqp.cfr_renamed_9("\u007f\u0014y\u0017l\u0011j\u0010sXn\u0019l\u0019s\u001dj\u001dl\u000b>\u0011p\u000e\u007f\u0014w\u001c0"), invalidAlgorithmParameterException);
        }
        catch (InvalidParameterSpecException invalidParameterSpecException) {
            throw new sprlyl(sprjvo.cfr_renamed_9("%\f+m\t!\u000f\"\u001a$\u001c%\u0005m\u0018,\u001a,\u0005(\u001c(\u001am\u001b=\r.H$\u0006;\t!\u0001)F"), invalidParameterSpecException);
        }
    }

    /*
     * Exception decompiling
     */
    public KeyAgreement cfr_renamed_7439(sprlem arg0) throws sprlyl {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_10719(sprlem arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        String string = (String)cfr_renamed_3.get(arg0);
        if (string != null) {
            try {
                return this.cfr_renamed_1.cfr_renamed_1540(string);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
            }
        }
        return this.cfr_renamed_1.cfr_renamed_1540(arg0.cfr_renamed_19());
    }

    /*
     * Exception decompiling
     */
    public Cipher cfr_renamed_7430(sprlem arg0) throws sprlyl {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_10747(sprlem arg0, SecretKey arg1, SecureRandom arg2) throws sprlyl {
        try {
            AlgorithmParameterGenerator algorithmParameterGenerator;
            AlgorithmParameterGenerator algorithmParameterGenerator2 = this.cfr_renamed_10748(arg0);
            if (!arg0.cfr_renamed_5078(sprpsl.cfr_renamed_3)) {
                algorithmParameterGenerator = algorithmParameterGenerator2;
                return algorithmParameterGenerator.generateParameters();
            }
            byte[] byArray = new byte[8];
            arg2.nextBytes(byArray);
            try {
                algorithmParameterGenerator2.init(new RC2ParameterSpec(arg1.getEncoded().length * 8, byArray), arg2);
                algorithmParameterGenerator = algorithmParameterGenerator2;
                return algorithmParameterGenerator.generateParameters();
            }
            catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
                throw new sprlyl(new StringBuilder().insert(0, spryqp.cfr_renamed_9("n\u0019l\u0019s\u001dj\u001dl\u000b>\u001f{\u0016{\n\u007f\fw\u0017pX{\nl\u0017lB>")).append(invalidAlgorithmParameterException).toString(), invalidAlgorithmParameterException);
            }
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprlyl(new StringBuilder().insert(0, sprjvo.cfr_renamed_9("(\u0010.\r=\u001c$\u0007#H.\u001a(\t9\u0001#\u000fm\t!\u000f\"\u001a$\u001c%\u0005m\u0018,\u001a,\u0005(\u001c(\u001am\u000f(\u0006(\u001a,\u001c\"\u001awH")).append(generalSecurityException).toString(), generalSecurityException);
        }
    }

    public sprjlg cfr_renamed_10696(sprddm arg0, SecretKey arg1) {
        return this.cfr_renamed_1.cfr_renamed_10696(arg0, arg1);
    }

    public sprajg cfr_renamed_10694(sprddm arg0, PrivateKey arg1) {
        arg1 = sproul.cfr_renamed_10695(arg1);
        return this.cfr_renamed_1.cfr_renamed_10694(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_10699(int arg0, char[] arg1, sprddm arg2, int arg3) throws sprlyl {
        spryrm spryrm2 = spryrm.cfr_renamed_23(arg2.cfr_renamed_284());
        try {
            SecretKeyFactory secretKeyFactory;
            SecretKeyFactory secretKeyFactory2;
            if (arg0 == 0) {
                SecretKeyFactory secretKeyFactory3;
                secretKeyFactory2 = secretKeyFactory3 = this.cfr_renamed_1.cfr_renamed_1495(spryqp.cfr_renamed_9("(\\3Z>,\u000fw\fv@\\1J"));
                return secretKeyFactory2.generateSecret(new PBEKeySpec(arg1, spryrm2.cfr_renamed_1477(), spryrm2.cfr_renamed_1478().intValue(), arg3)).getEncoded();
            }
            secretKeyFactory2 = secretKeyFactory = this.cfr_renamed_1.cfr_renamed_1495((String)cfr_renamed_152.get(spryrm2.cfr_renamed_2386()));
            return secretKeyFactory2.generateSecret(new PBEKeySpec(arg1, spryrm2.cfr_renamed_1477(), spryrm2.cfr_renamed_1478().intValue(), arg3)).getEncoded();
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprlyl(new StringBuilder().insert(0, sprjvo.cfr_renamed_9("=#\t/\u0004(H9\u0007m\u000b,\u0004.\u001d!\t9\rm\f(\u001a$\u001e(\fm\u0003(\u0011m\u000e?\u0007 H=\t>\u001b:\u0007?\fwH")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public sprtlg cfr_renamed_10697(sprddm arg0, PrivateKey arg1, byte[] arg2, byte[] arg3) {
        arg1 = sproul.cfr_renamed_10695(arg1);
        return this.cfr_renamed_1.cfr_renamed_10697(arg0, arg1, arg2, arg3);
    }

    public Key cfr_renamed_10707(sprlem arg0, sprnfg arg1) {
        if (arg1.cfr_renamed_1536() instanceof Key) {
            return (Key)arg1.cfr_renamed_1536();
        }
        if (arg1.cfr_renamed_1536() instanceof byte[]) {
            return new SecretKeySpec((byte[])arg1.cfr_renamed_1536(), this.cfr_renamed_10713(arg0));
        }
        throw new IllegalArgumentException(spryqp.cfr_renamed_9("\rp\u0013p\u0017i\u0016>\u001f{\u0016{\nw\u001b>\u0013{\u0001>\fg\b{"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameterGenerator cfr_renamed_10748(sprlem arg0) throws GeneralSecurityException {
        String string = (String)cfr_renamed_3.get(arg0);
        if (string != null) {
            try {
                return this.cfr_renamed_1.cfr_renamed_107(string);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
            }
        }
        return this.cfr_renamed_1.cfr_renamed_107(arg0.cfr_renamed_19());
    }

    public String cfr_renamed_10713(sprlem arg0) {
        String string = (String)cfr_renamed_3.get(arg0);
        if (string == null) {
            return arg0.cfr_renamed_19();
        }
        return string;
    }

    /*
     * Exception decompiling
     */
    public KeyPairGenerator cfr_renamed_7440(sprlem arg0) throws sprlyl {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Key cfr_renamed_7426(sprnfg arg0) {
        if (arg0.cfr_renamed_1536() instanceof Key) {
            return (Key)arg0.cfr_renamed_1536();
        }
        if (arg0.cfr_renamed_1536() instanceof byte[]) {
            return new SecretKeySpec((byte[])arg0.cfr_renamed_1536(), spryqp.cfr_renamed_9("[6]"));
        }
        throw new IllegalArgumentException(sprjvo.cfr_renamed_9("8\u0006&\u0006\"\u001f#H*\r#\r?\u0001.H&\r4H9\u0011=\r"));
    }
}

