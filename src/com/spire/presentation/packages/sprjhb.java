/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprdcka;
import com.spire.presentation.packages.sprhbb;
import com.spire.presentation.packages.sprk;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnbb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvan;
import com.spire.presentation.packages.sprwab;
import com.spire.presentation.packages.sprzya;
import java.nio.ByteBuffer;

public class sprjhb {
    private sprhbb cfr_renamed_1;
    private sprzya cfr_renamed_2;
    private sprnbb cfr_renamed_3;
    private sprlc cfr_renamed_4;

    private /* synthetic */ boolean cfr_renamed_1323(byte[] arg0, byte[] arg1, sprzya arg2) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(arg1);
        byte[] byArray = new byte[arg1.length - 4];
        byteBuffer.get(byArray);
        sprama sprama2 = sprama.cfr_renamed_768(byArray, this.cfr_renamed_3.cfr_renamed_112, this.cfr_renamed_3.cfr_renamed_107);
        int n = byteBuffer.getInt();
        sprjhb sprjhb2 = this;
        return sprjhb2.cfr_renamed_1324(sprjhb2.cfr_renamed_1325(arg0, n), sprama2, arg2.cfr_renamed_4);
    }

    private /* synthetic */ byte[] cfr_renamed_1326(byte[] arg0, sprhbb arg1) {
        ByteBuffer byteBuffer;
        sprama sprama2;
        sprama sprama3;
        sprjhb sprjhb2;
        int n = 0;
        sprzya sprzya2 = arg1.cfr_renamed_1157();
        do {
            if (++n > this.cfr_renamed_3.cfr_renamed_102) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprdcka.cfr_renamed_9("u A'O'Ai@(O%C-\u001ciR&IiK(H0\u0006;C=T C:\u0006aK(^t")).append(this.cfr_renamed_3.cfr_renamed_102).append(")").toString());
            }
            sprjhb2 = this;
        } while (!sprjhb2.cfr_renamed_1324(sprama3 = sprjhb2.cfr_renamed_1325(arg0, n), sprama2 = sprjhb2.cfr_renamed_1327(sprama3, arg1), sprzya2.cfr_renamed_4));
        byte[] byArray = sprama2.cfr_renamed_783(this.cfr_renamed_3.cfr_renamed_107);
        ByteBuffer byteBuffer2 = byteBuffer = ByteBuffer.allocate(byArray.length + 4);
        byteBuffer.put(byArray);
        byteBuffer2.putInt(n);
        return byteBuffer2.array();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean cfr_renamed_1324(sprama sprama2, sprama sprama3, sprama sprama4) {
        void arg0;
        void arg1;
        sprjhb sprjhb2 = this;
        int n = sprjhb2.cfr_renamed_3.cfr_renamed_107;
        double d = sprjhb2.cfr_renamed_3.cfr_renamed_3;
        double d2 = sprjhb2.cfr_renamed_3.cfr_renamed_119;
        sprama sprama5 = sprama4.cfr_renamed_728((sprama)arg1, n);
        sprama5.cfr_renamed_753((sprama)arg0);
        return (double)((long)((double)arg1.cfr_renamed_760(n) + d2 * (double)sprama5.cfr_renamed_760(n))) <= d;
    }

    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_4 == null || this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprvan.cfr_renamed_9("}`Rm\u001ehPhJW[sWgG!XhLrJ "));
        }
        sprjhb sprjhb2 = this;
        byte[] byArray = new byte[sprjhb2.cfr_renamed_4.cfr_renamed_1218()];
        sprjhb2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return sprjhb2.cfr_renamed_1323(byArray, arg0, this.cfr_renamed_2);
    }

    public sprjhb(sprnbb sprnbb2) {
        this.cfr_renamed_3 = sprnbb2;
    }

    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprdcka.cfr_renamed_9("e(J%\u0006 H R\u001aO.HiI;\u0006 H R\u001fC;O/_i@ T:Rh"));
        }
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ 1;
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

    public sprama cfr_renamed_1325(byte[] arg0, int arg1) {
        sprjhb sprjhb2 = this;
        int n = sprjhb2.cfr_renamed_3.cfr_renamed_112;
        int n2 = sprjhb2.cfr_renamed_3.cfr_renamed_107;
        int n3 = 31 - Integer.numberOfLeadingZeros(n2);
        int n4 = (n3 + 7) / 8;
        sprama sprama2 = new sprama(n);
        ByteBuffer byteBuffer = ByteBuffer.allocate(arg0.length + 4);
        byteBuffer.put(arg0);
        byteBuffer.putInt(arg1);
        sprwab sprwab2 = new sprwab(byteBuffer.array(), this.cfr_renamed_3.cfr_renamed_1);
        int n5 = 0;
        int n6 = n5;
        while (n6 < n) {
            byte[] byArray = sprwab2.cfr_renamed_1322(n4);
            int n7 = byArray[byArray.length - 1];
            n7 >>= 8 * n4 - n3;
            byArray[byArray.length - 1] = (byte)(n7 <<= 8 * n4 - n3);
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(4);
            byteBuffer2.put(byArray);
            byteBuffer2.rewind();
            sprama2.cfr_renamed_1[n5++] = Integer.reverseBytes(byteBuffer2.getInt());
            n6 = n5;
        }
        return sprama2;
    }

    public byte[] cfr_renamed_1329() {
        if (this.cfr_renamed_4 == null || this.cfr_renamed_1 == null) {
            throw new IllegalStateException(sprvan.cfr_renamed_9("}`Rm\u001ehPhJRWfP!XhLrJ "));
        }
        sprjhb sprjhb2 = this;
        byte[] byArray = new byte[sprjhb2.cfr_renamed_4.cfr_renamed_1218()];
        sprjhb2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return sprjhb2.cfr_renamed_1326(byArray, this.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprama cfr_renamed_1327(sprama sprama2, sprhbb sprhbb2) {
        sprama sprama3;
        sprama sprama4;
        sprama arg0;
        sprk sprk2;
        sprk sprk3;
        int n;
        void arg1;
        sprjhb sprjhb2 = this;
        int n2 = sprjhb2.cfr_renamed_3.cfr_renamed_112;
        int n3 = sprjhb2.cfr_renamed_3.cfr_renamed_107;
        int n4 = sprjhb2.cfr_renamed_3.cfr_renamed_152;
        void var6_6 = arg1;
        sprzya sprzya2 = sprhbb2.cfr_renamed_1157();
        sprama sprama5 = new sprama(n2);
        int n5 = n = n4;
        while (n5 >= 1) {
            sprama sprama6;
            sprama sprama7;
            void v2 = var6_6;
            sprk3 = v2.cfr_renamed_1313((int)n).cfr_renamed_3;
            sprk2 = v2.cfr_renamed_1313((int)n).cfr_renamed_4;
            sprk sprk4 = sprk3;
            sprama4 = sprk4.cfr_renamed_723(arg0);
            sprk sprk5 = sprk2;
            sprama4.cfr_renamed_746(n3);
            sprama4 = sprk5.cfr_renamed_723(sprama4);
            sprama3 = sprk5.cfr_renamed_723(arg0);
            sprama3.cfr_renamed_746(n3);
            sprama3 = sprk4.cfr_renamed_723(sprama3);
            sprama sprama8 = sprama7 = sprama4;
            sprama8.cfr_renamed_753(sprama3);
            sprama5.cfr_renamed_730(sprama8);
            sprama sprama9 = (sprama)v2.cfr_renamed_1313((int)n).cfr_renamed_1.clone();
            if (n > 1) {
                sprama6 = sprama7;
                sprama9.cfr_renamed_753(var6_6.cfr_renamed_1313((int)(n - 1)).cfr_renamed_1);
            } else {
                sprama9.cfr_renamed_753(sprzya2.cfr_renamed_4);
                sprama6 = sprama7;
            }
            arg0 = sprama6.cfr_renamed_728(sprama9, n3);
            n5 = --n;
        }
        void v7 = var6_6;
        sprk3 = v7.cfr_renamed_1313((int)0).cfr_renamed_3;
        sprk2 = v7.cfr_renamed_1313((int)0).cfr_renamed_4;
        sprk sprk6 = sprk3;
        sprama4 = sprk6.cfr_renamed_723(arg0);
        sprk sprk7 = sprk2;
        sprama4.cfr_renamed_746(n3);
        sprama4 = sprk7.cfr_renamed_723(sprama4);
        sprama3 = sprk7.cfr_renamed_723(arg0);
        sprama3.cfr_renamed_746(n3);
        sprama3 = sprk6.cfr_renamed_723(sprama3);
        sprama4.cfr_renamed_753(sprama3);
        sprama sprama10 = sprama5;
        sprama10.cfr_renamed_730(sprama4);
        sprama10.cfr_renamed_762(n3);
        return sprama10;
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprdcka.cfr_renamed_9("e(J%\u0006 H R\u001aO.HiI;\u0006 H R\u001fC;O/_i@ T:Rh"));
        }
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprjhb sprjhb2;
        if (arg0) {
            this.cfr_renamed_1 = (sprhbb)arg1;
            sprjhb2 = this;
        } else {
            this.cfr_renamed_2 = (sprzya)arg1;
            sprjhb2 = this;
        }
        sprjhb2.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_1;
        this.cfr_renamed_4.cfr_renamed_41();
    }
}

