/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdaf;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprhm;
import com.spire.presentation.packages.spridb;
import com.spire.presentation.packages.sprngf;
import com.spire.presentation.packages.sprqbb;
import com.spire.presentation.packages.sprywe;
import com.spire.presentation.packages.sprzcf;
import java.nio.ByteBuffer;

public class sprabf {
    private sprngf cfr_renamed_1;
    private sprywe cfr_renamed_2;
    private sprgf cfr_renamed_3;
    private sprdaf cfr_renamed_4;

    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_3 == null || this.cfr_renamed_1 == null) {
            throw new IllegalStateException(spridb.cfr_renamed_9("]FrK>NpNjq{UwAg\u0007xNlTj\u0006"));
        }
        sprabf sprabf2 = this;
        byte[] byArray = new byte[sprabf2.cfr_renamed_3.cfr_renamed_1218()];
        sprabf2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        return sprabf2.cfr_renamed_5610(byArray, arg0, this.cfr_renamed_1);
    }

    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprabf sprabf2;
        if (arg0) {
            this.cfr_renamed_4 = (sprdaf)arg1;
            sprabf2 = this;
        } else {
            this.cfr_renamed_1 = (sprngf)arg1;
            sprabf2 = this;
        }
        sprabf2.cfr_renamed_3 = this.cfr_renamed_2.cfr_renamed_102;
        this.cfr_renamed_3.cfr_renamed_41();
    }

    public void cfr_renamed_1221(byte arg0) {
        if (this.cfr_renamed_3 == null) {
            throw new IllegalStateException(sprqbb.cfr_renamed_9("N\ta\u0004-\u0001c\u0001y;d\u000fcHb\u001a-\u0001c\u0001y>h\u001ad\u000etHk\u0001\u007f\u001byI"));
        }
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    private /* synthetic */ byte[] cfr_renamed_5611(byte[] arg0, sprdaf arg1) {
        ByteBuffer byteBuffer;
        sprhgf sprhgf2;
        sprhgf sprhgf3;
        sprabf sprabf2;
        int n = 0;
        sprngf sprngf2 = arg1.cfr_renamed_1157();
        do {
            if (++n > this.cfr_renamed_2.cfr_renamed_0) {
                throw new IllegalStateException(new StringBuilder().insert(0, spridb.cfr_renamed_9("MNyIwIy\u0007xFwK{C$\u0007jHq\u0007sFp^>U{SlN{T>\u000fsFf\u001a")).append(this.cfr_renamed_2.cfr_renamed_0).append(")").toString());
            }
            sprabf2 = this;
        } while (!sprabf2.cfr_renamed_5612(sprhgf3 = sprabf2.cfr_renamed_1325(arg0, n), sprhgf2 = sprabf2.cfr_renamed_5613(sprhgf3, arg1), sprngf2.cfr_renamed_4));
        byte[] byArray = sprhgf2.cfr_renamed_783(this.cfr_renamed_2.cfr_renamed_119);
        ByteBuffer byteBuffer2 = byteBuffer = ByteBuffer.allocate(byArray.length + 4);
        byteBuffer.put(byArray);
        byteBuffer2.putInt(n);
        return byteBuffer2.array();
    }

    private /* synthetic */ boolean cfr_renamed_5610(byte[] arg0, byte[] arg1, sprngf arg2) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(arg1);
        byte[] byArray = new byte[arg1.length - 4];
        byteBuffer.get(byArray);
        sprhgf sprhgf2 = sprhgf.cfr_renamed_768(byArray, this.cfr_renamed_2.cfr_renamed_93, this.cfr_renamed_2.cfr_renamed_119);
        int n = byteBuffer.getInt();
        sprabf sprabf2 = this;
        return sprabf2.cfr_renamed_5612(sprabf2.cfr_renamed_1325(arg0, n), sprhgf2, arg2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean cfr_renamed_5612(sprhgf sprhgf2, sprhgf sprhgf3, sprhgf sprhgf4) {
        void arg0;
        void arg1;
        sprabf sprabf2 = this;
        int n = sprabf2.cfr_renamed_2.cfr_renamed_119;
        double d = sprabf2.cfr_renamed_2.cfr_renamed_112;
        double d2 = sprabf2.cfr_renamed_2.cfr_renamed_132;
        sprhgf sprhgf5 = sprhgf4.cfr_renamed_3238((sprhgf)arg1, n);
        sprhgf5.cfr_renamed_5456((sprhgf)arg0);
        return (double)((long)((double)arg1.cfr_renamed_760(n) + d2 * (double)sprhgf5.cfr_renamed_760(n))) <= d;
    }

    public sprhgf cfr_renamed_1325(byte[] arg0, int arg1) {
        sprabf sprabf2 = this;
        int n = sprabf2.cfr_renamed_2.cfr_renamed_93;
        int n2 = sprabf2.cfr_renamed_2.cfr_renamed_119;
        int n3 = 31 - Integer.numberOfLeadingZeros(n2);
        int n4 = (n3 + 7) / 8;
        sprhgf sprhgf2 = new sprhgf(n);
        ByteBuffer byteBuffer = ByteBuffer.allocate(arg0.length + 4);
        byteBuffer.put(arg0);
        byteBuffer.putInt(arg1);
        sprzcf sprzcf2 = new sprzcf(byteBuffer.array(), this.cfr_renamed_2.cfr_renamed_102);
        int n5 = 0;
        int n6 = n5;
        while (n6 < n) {
            byte[] byArray = sprzcf2.cfr_renamed_1322(n4);
            int n7 = byArray[byArray.length - 1];
            n7 >>= 8 * n4 - n3;
            byArray[byArray.length - 1] = (byte)(n7 <<= 8 * n4 - n3);
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(4);
            byteBuffer2.put(byArray);
            byteBuffer2.rewind();
            sprhgf2.cfr_renamed_3[n5++] = Integer.reverseBytes(byteBuffer2.getInt());
            n6 = n5;
        }
        return sprhgf2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhgf cfr_renamed_5613(sprhgf sprhgf2, sprdaf sprdaf2) {
        sprhgf sprhgf3;
        sprhgf sprhgf4;
        sprhgf arg0;
        sprhm sprhm2;
        sprhm sprhm3;
        int n;
        void arg1;
        sprabf sprabf2 = this;
        int n2 = sprabf2.cfr_renamed_2.cfr_renamed_93;
        int n3 = sprabf2.cfr_renamed_2.cfr_renamed_119;
        int n4 = sprabf2.cfr_renamed_2.cfr_renamed_4;
        void var6_6 = arg1;
        sprngf sprngf2 = sprdaf2.cfr_renamed_1157();
        sprhgf sprhgf5 = new sprhgf(n2);
        int n5 = n = n4;
        while (n5 >= 1) {
            sprhgf sprhgf6;
            sprhgf sprhgf7;
            void v2 = var6_6;
            sprhm3 = v2.cfr_renamed_1313((int)n).cfr_renamed_4;
            sprhm2 = v2.cfr_renamed_1313((int)n).cfr_renamed_3;
            sprhm sprhm4 = sprhm3;
            sprhgf4 = sprhm4.cfr_renamed_5442(arg0);
            sprhm sprhm5 = sprhm2;
            sprhgf4.cfr_renamed_746(n3);
            sprhgf4 = sprhm5.cfr_renamed_5442(sprhgf4);
            sprhgf3 = sprhm5.cfr_renamed_5442(arg0);
            sprhgf3.cfr_renamed_746(n3);
            sprhgf3 = sprhm4.cfr_renamed_5442(sprhgf3);
            sprhgf sprhgf8 = sprhgf7 = sprhgf4;
            sprhgf8.cfr_renamed_5456(sprhgf3);
            sprhgf5.cfr_renamed_5444(sprhgf8);
            sprhgf sprhgf9 = (sprhgf)v2.cfr_renamed_1313((int)n).cfr_renamed_1.clone();
            if (n > 1) {
                sprhgf6 = sprhgf7;
                sprhgf9.cfr_renamed_5456(var6_6.cfr_renamed_1313((int)(n - 1)).cfr_renamed_1);
            } else {
                sprhgf9.cfr_renamed_5456(sprngf2.cfr_renamed_4);
                sprhgf6 = sprhgf7;
            }
            arg0 = sprhgf6.cfr_renamed_3238(sprhgf9, n3);
            n5 = --n;
        }
        void v7 = var6_6;
        sprhm3 = v7.cfr_renamed_1313((int)0).cfr_renamed_4;
        sprhm2 = v7.cfr_renamed_1313((int)0).cfr_renamed_3;
        sprhm sprhm6 = sprhm3;
        sprhgf4 = sprhm6.cfr_renamed_5442(arg0);
        sprhm sprhm7 = sprhm2;
        sprhgf4.cfr_renamed_746(n3);
        sprhgf4 = sprhm7.cfr_renamed_5442(sprhgf4);
        sprhgf3 = sprhm7.cfr_renamed_5442(arg0);
        sprhgf3.cfr_renamed_746(n3);
        sprhgf3 = sprhm6.cfr_renamed_5442(sprhgf3);
        sprhgf4.cfr_renamed_5456(sprhgf3);
        sprhgf sprhgf10 = sprhgf5;
        sprhgf10.cfr_renamed_5444(sprhgf4);
        sprhgf10.cfr_renamed_762(n3);
        return sprhgf10;
    }

    public byte[] cfr_renamed_1329() {
        if (this.cfr_renamed_3 == null || this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprqbb.cfr_renamed_9("N\ta\u0004-\u0001c\u0001y;d\u000fcHk\u0001\u007f\u001byI"));
        }
        sprabf sprabf2 = this;
        byte[] byArray = new byte[sprabf2.cfr_renamed_3.cfr_renamed_1218()];
        sprabf2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        return sprabf2.cfr_renamed_5611(byArray, this.cfr_renamed_4);
    }

    public sprabf(sprywe sprywe2) {
        this.cfr_renamed_2 = sprywe2;
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_3 == null) {
            throw new IllegalStateException(spridb.cfr_renamed_9("]FrK>NpNjtw@p\u0007qU>NpNjq{UwAg\u0007xNlTj\u0006"));
        }
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }
}

