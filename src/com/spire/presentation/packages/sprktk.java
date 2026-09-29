/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbdl;
import com.spire.presentation.packages.sprdcl;
import com.spire.presentation.packages.sprdin;
import com.spire.presentation.packages.sprehl;
import com.spire.presentation.packages.sprijl;
import com.spire.presentation.packages.spriq;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprnbl;
import com.spire.presentation.packages.sprnhl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprzto;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprktk {
    private static /* synthetic */ BigInteger cfr_renamed_10268(BigInteger arg0) {
        spriq spriq2 = sprohl.cfr_renamed_7529();
        byte[] byArray = arg0.toByteArray();
        spriq spriq3 = spriq2;
        byte[] byArray2 = new byte[spriq3.cfr_renamed_1218()];
        spriq3.cfr_renamed_1197(byArray, 0, byArray.length);
        spriq2.cfr_renamed_1219(byArray2, 0);
        return new BigInteger(byArray2);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 3;
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 4;
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

    public static void main(String[] arg0) throws sprmml {
        sprnhl sprnhl2 = sprijl.cfr_renamed_3;
        BigInteger bigInteger = sprnhl2.cfr_renamed_1155();
        BigInteger bigInteger2 = sprnhl2.cfr_renamed_1604();
        BigInteger bigInteger3 = sprnhl2.cfr_renamed_1145();
        String string = "password";
        String string2 = "password";
        System.out.println(sprzto.cfr_renamed_9("\r{\r{\r{\r{\rqn?N%N0K8]0S8H?\u0007{\r{\r{\r{\r{\r"));
        System.out.println(sprdin.cfr_renamed_9("\fA>X5W|D=F=Y9@9F/\u0014:[.\u0014(\\9\u0014?M?X5W|S.[)Df"));
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("Wq\u000f")).append(bigInteger.bitLength()).append(sprdin.cfr_renamed_9("\u0014>](Gu\u000e|")).append(bigInteger.toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("Vq\u000f")).append(bigInteger2.bitLength()).append(sprdin.cfr_renamed_9("\u0014>](Gu\u000e|")).append(bigInteger2.toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("@q\u000f")).append(bigInteger.bitLength()).append(sprdin.cfr_renamed_9("\u0014>](Gu\u000e|")).append(bigInteger3.toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("!\u0007<H5\u0007 \u0007l\u0007")).append(bigInteger.mod(bigInteger2).toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprdin.cfr_renamed_9("S\u0002O-I|Y3P|D|\t|")).append(bigInteger3.modPow(bigInteger2, bigInteger).toString(16)).toString());
        System.out.println("");
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("yt4D#B%\u0007!F\"T&H#C\"\u0007$T4CqE(\u0007\u0010K8D4\u00070I5\u0007\u0013H3\u001dq\u0005")).append(string).append(sprdin.cfr_renamed_9("~\u0014=Z8\u0014~")).append(string2).append(sprzto.cfr_renamed_9("\u0005x-")).toString());
        spriq spriq2 = sprohl.cfr_renamed_7529();
        SecureRandom secureRandom = new SecureRandom();
        sprbdl sprbdl2 = new sprbdl(sprdin.cfr_renamed_9("=X5W9"), string.toCharArray(), sprnhl2, spriq2, secureRandom);
        sprbdl sprbdl3 = new sprbdl(sprzto.cfr_renamed_9("E>E"), string2.toCharArray(), sprnhl2, spriq2, secureRandom);
        sprbdl sprbdl4 = sprbdl2;
        sprehl sprehl2 = sprbdl4.cfr_renamed_3945();
        sprehl sprehl3 = sprbdl3.cfr_renamed_3945();
        System.out.println(sprdin.cfr_renamed_9("v\u001ev\u001ev\u001ev\u001ev\u001ev\u001e|f3A2P|\u0005|\u001ev\u001ev\u001ev\u001ev\u001ev\u001ev\u001ev"));
        System.out.println(sprzto.cfr_renamed_9("\u0010K8D4\u0007\"B?C\"\u0007%Hqe>Ek\u0007"));
        System.out.println(new StringBuilder().insert(0, sprdin.cfr_renamed_9(";j'LmIa")).append(sprehl2.cfr_renamed_3935().toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("@\u000f\\)\u0015,\u001a")).append(sprehl2.cfr_renamed_3934().toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprdin.cfr_renamed_9("\u007f\fO$\u0005!\t'")).append(sprehl2.cfr_renamed_3936()[0].toString(16)).append(sprzto.cfr_renamed_9("Zj\\")).append(sprehl2.cfr_renamed_3936()[1].toString(16)).append("}").toString());
        System.out.println(new StringBuilder().insert(0, sprdin.cfr_renamed_9("\u007f\fO$\u0006!\t'")).append(sprehl2.cfr_renamed_3937()[0].toString(16)).append(sprzto.cfr_renamed_9("Zj\\")).append(sprehl2.cfr_renamed_3937()[1].toString(16)).append("}").toString());
        System.out.println("");
        System.out.println(sprdin.cfr_renamed_9("v3V|G9Z8G|@3\u0014\u001dX5W9\u000e|"));
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("@\u000f\\)\u0014,\u001a")).append(sprehl3.cfr_renamed_3935().toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprdin.cfr_renamed_9(";j'LhIa")).append(sprehl3.cfr_renamed_3934().toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("\u001aw*_bZl\\")).append(sprehl3.cfr_renamed_3936()[0].toString(16)).append(sprdin.cfr_renamed_9("!\u000f'")).append(sprehl3.cfr_renamed_3936()[1].toString(16)).append("}").toString());
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("\u001aw*_eZl\\")).append(sprehl3.cfr_renamed_3937()[0].toString(16)).append(sprdin.cfr_renamed_9("!\u000f'")).append(sprehl3.cfr_renamed_3937()[1].toString(16)).append("}").toString());
        System.out.println("");
        sprbdl4.cfr_renamed_10269(sprehl3);
        System.out.println(sprzto.cfr_renamed_9("\u0010K8D4\u00072O4D:Tq@\u000f\\)\u0013,\u0006l\u0016k\u0007\u001el"));
        System.out.println(sprdin.cfr_renamed_9("\u001dX5W9\u0014?\\9W7G|\u007f\fO$\u0007!\u000e|{\u0017"));
        System.out.println(sprzto.cfr_renamed_9("f=N2BqD9B2L\"\u0007\u001aw*_eZk\u0007\u001el"));
        System.out.println("");
        sprbdl3.cfr_renamed_10269(sprehl2);
        System.out.println(sprdin.cfr_renamed_9("v3V|W4Q?_/\u0014;j'LnI}\tm\u000e|{\u0017"));
        System.out.println(sprzto.cfr_renamed_9("\u0013H3\u00072O4D:Tql\u0001\\)\u0016,\u000bk\u0007\u001el"));
        System.out.println(sprdin.cfr_renamed_9("v3V|W4Q?_/\u0014\u0017d'LnIp\u000e|{\u0017"));
        System.out.println("");
        sprnbl sprnbl2 = sprbdl4.cfr_renamed_3943();
        sprnbl sprnbl3 = sprbdl3.cfr_renamed_3943();
        System.out.println(sprzto.cfr_renamed_9("\r{\r{\r{\r{\r{\r{\u0007\u0003H$I5\u0007c\u0007{\r{\r{\r{\r{\r{\r{\r"));
        System.out.println(sprdin.cfr_renamed_9("u0]?Q|G9Z8G|@3\u0014\u001e[>\u000e|"));
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("\u0010\u001a")).append(sprnbl2.cfr_renamed_1778().toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprdin.cfr_renamed_9("\u007f\fO$\u0006vG!\t'")).append(sprnbl2.cfr_renamed_3933()[0].toString(16)).append(sprzto.cfr_renamed_9("Z}\\")).append(sprnbl2.cfr_renamed_3933()[1].toString(16)).append("}").toString());
        System.out.println("");
        System.out.println(sprdin.cfr_renamed_9("v3V|G9Z8G|@3\u0014\u001dX5W9"));
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("\u0013\u001a")).append(sprnbl3.cfr_renamed_1778().toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprdin.cfr_renamed_9("\u007f\fO$\u0000vG!\t'")).append(sprnbl3.cfr_renamed_3933()[0].toString(16)).append(sprzto.cfr_renamed_9("Z}\\")).append(sprnbl3.cfr_renamed_3933()[1].toString(16)).append("}").toString());
        System.out.println("");
        sprbdl4.cfr_renamed_10270(sprnbl3);
        System.out.println(sprdin.cfr_renamed_9("u0]?Q|W4Q?_/\u0014\u0017d'Lh\u001e/If\u0014\u0013\u007fV"));
        sprbdl3.cfr_renamed_10270(sprnbl2);
        System.out.println(sprzto.cfr_renamed_9("\u0013H3\u00072O4D:Tql\u0001\\)\u0015{T,\u001dqh\u001a-"));
        BigInteger bigInteger4 = sprbdl4.cfr_renamed_3938();
        BigInteger bigInteger5 = sprbdl3.cfr_renamed_3938();
        System.out.println(sprdin.cfr_renamed_9("v\u001ev\u001ev\u001ev\u001ev\u0014\u001dR(Q.\u0014.[)Z8\u0014n\u0014v\u001ev\u001ev\u001ev\u001ev\u001ev"));
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("\u0010K8D4\u00072H<W$S4TqL4^qJ0S4U8F=\u0007X\u0007\u001a\u001a")).append(bigInteger4.toString(16)).toString());
        System.out.println(new StringBuilder().insert(0, sprdin.cfr_renamed_9("v3V|W3Y,A(Q/\u00147Q%\u00141U(Q.]=X|=|\u007fa")).append(bigInteger5.toString(16)).toString());
        System.out.println();
        BigInteger bigInteger6 = bigInteger4;
        BigInteger bigInteger7 = sprktk.cfr_renamed_10268(bigInteger6);
        BigInteger bigInteger8 = sprktk.cfr_renamed_10268(bigInteger5);
        sprdcl sprdcl2 = sprbdl4.cfr_renamed_3944(bigInteger6);
        sprdcl sprdcl3 = sprbdl3.cfr_renamed_3944(bigInteger5);
        System.out.println(sprzto.cfr_renamed_9("\r{\r{\r{\r{\r{\r{\u0007\u0003H$I5\u0007b\u0007{\r{\r{\r{\r{\r{\r{\r"));
        System.out.println(sprdin.cfr_renamed_9("u0]?Q|G9Z8G|@3\u0014\u001e[>\u000e|"));
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("j0D\u0005F6\u001a")).append(sprdcl2.cfr_renamed_3931().toString(16)).toString());
        System.out.println("");
        System.out.println(sprdin.cfr_renamed_9("v3V|G9Z8G|@3\u0014\u001dX5W9\u000e|"));
        System.out.println(new StringBuilder().insert(0, sprzto.cfr_renamed_9("j0D\u0005F6\u001a")).append(sprdcl3.cfr_renamed_3931().toString(16)).toString());
        System.out.println("");
        sprbdl4.cfr_renamed_10271(sprdcl3, bigInteger4);
        System.out.println(sprdin.cfr_renamed_9("u0]?Q|W4Q?_/\u0014\u0011U?`=Sf\u0014\u0013\u007fV"));
        sprbdl3.cfr_renamed_10271(sprdcl2, bigInteger5);
        System.out.println(sprzto.cfr_renamed_9("\u0013H3\u00072O4D:Tqj0D\u0005F6\u001dqh\u001a-"));
        System.out.println();
        System.out.println(sprdin.cfr_renamed_9("\u0011U?`=S/\u0014*U0]8U(Q8\u0018|@4Q.Q:[.Q|@4Q|_9M5Z;\u00141U(Q.]=X|Y=@?\\9Gr"));
    }
}

