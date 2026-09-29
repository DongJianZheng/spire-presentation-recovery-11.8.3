/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreq;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbz;
import com.spire.presentation.packages.sprxam;
import java.io.EOFException;
import java.io.IOException;

public class sproam
extends sprxam
implements spreq {
    public static final int cfr_renamed_119 = 2;
    public int cfr_renamed_91;
    public byte[] cfr_renamed_0;
    public int cfr_renamed_1;
    public static final int cfr_renamed_2 = 1;
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    public byte[] cfr_renamed_7954() {
        return sproam.cfr_renamed_7863(this.cfr_renamed_3(), this.cfr_renamed_7783(), this.cfr_renamed_7855(), this.cfr_renamed_7864());
    }

    public int cfr_renamed_7864() {
        return this.cfr_renamed_3;
    }

    public sproam() {
        super(null);
        this.cfr_renamed_1 = 1;
    }

    public static sproam cfr_renamed_11043() {
        return new sproam();
    }

    @Override
    public int cfr_renamed_324() {
        return 18;
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        sproam sproam2 = this;
        arg0.write(sproam2.cfr_renamed_3());
        if (sproam2.cfr_renamed_1 == 2) {
            sprjah sprjah2 = arg0;
            sproam sproam3 = this;
            arg0.write(this.cfr_renamed_4);
            arg0.write(sproam3.cfr_renamed_91);
            sprjah2.write(sproam3.cfr_renamed_3);
            sprjah2.write(this.cfr_renamed_0);
        }
    }

    public static sproam cfr_renamed_7867(int arg0, int arg1, int arg2, byte[] arg3) {
        return new sproam(2, arg0, arg1, arg2, arg3);
    }

    public static byte[] cfr_renamed_7863(int arg0, int arg1, int arg2, int arg3) {
        byte[] byArray = new byte[5];
        byArray[0] = -46;
        byArray[1] = (byte)(arg0 & 0xFF);
        byArray[2] = (byte)(arg1 & 0xFF);
        byArray[3] = (byte)(arg2 & 0xFF);
        byArray[4] = (byte)(arg3 & 0xFF);
        return byArray;
    }

    public byte[] cfr_renamed_1477() {
        sproam sproam2 = this;
        return sproze.cfr_renamed_523(sproam2.cfr_renamed_0, sproam2.cfr_renamed_0.length);
    }

    /*
     * WARNING - void declaration
     */
    public sproam(sprmam sprmam2) throws IOException {
        void arg0;
        sproam sproam2 = this;
        super((sprmam)arg0);
        sproam2.cfr_renamed_1 = sprmam2.read();
        if (sproam2.cfr_renamed_1 == 2) {
            void v1 = arg0;
            this.cfr_renamed_4 = arg0.read();
            this.cfr_renamed_91 = v1.read();
            this.cfr_renamed_3 = v1.read();
            this.cfr_renamed_0 = new byte[32];
            if (arg0.read(this.cfr_renamed_0) != this.cfr_renamed_0.length) {
                throw new EOFException(sprqbz.cfr_renamed_9("%\u0012\u0010\r\u0014\u0014\u0000\u0012\u0010@\u0010\u000e\u0011@\u001a\u0006U\u0013\u0001\u0012\u0010\u0001\u0018N"));
            }
        }
    }

    public int cfr_renamed_7855() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_7783() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sproam(int n, int n2, int n3, int n4, byte[] byArray) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sproam sproam2 = this;
        sproam sproam3 = this;
        super(null);
        this.cfr_renamed_1 = arg0;
        sproam3.cfr_renamed_4 = arg1;
        sproam3.cfr_renamed_91 = arg2;
        sproam2.cfr_renamed_3 = arg3;
        sproam2.cfr_renamed_0 = sproze.cfr_renamed_158(byArray);
    }
}

