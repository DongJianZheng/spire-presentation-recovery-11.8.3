/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcu;
import com.spire.presentation.packages.spreq;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsgm;
import com.spire.presentation.packages.sprxam;
import com.spire.presentation.packages.sprzsd;
import java.io.IOException;

public class sprojm
extends sprxam
implements sprcu,
spreq {
    private final byte cfr_renamed_91;
    private final byte cfr_renamed_0;
    public static final int cfr_renamed_1 = 1;
    private final byte[] cfr_renamed_2;
    private final byte cfr_renamed_3;
    private final byte cfr_renamed_4;

    public byte[] cfr_renamed_7954() {
        return sprojm.cfr_renamed_7863(this.cfr_renamed_3(), this.cfr_renamed_593(), this.cfr_renamed_7866(), this.cfr_renamed_7864());
    }

    /*
     * WARNING - void declaration
     */
    public sprojm(sprmam sprmam2) throws IOException {
        void arg0;
        sprojm sprojm2 = this;
        super((sprmam)arg0);
        sprojm2.cfr_renamed_4 = (byte)sprmam2.read();
        if (sprojm2.cfr_renamed_4 != 1) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprzsd.cfr_renamed_9("\u000bJ\u0013V\u001b\u0018=}=|\\H\u001d[\u0017]\b\u0018\n]\u000eK\u0015W\u0012\u0002\\")).append(this.cfr_renamed_4).toString());
        }
        sprojm sprojm3 = this;
        void v2 = arg0;
        this.cfr_renamed_91 = (byte)v2.read();
        this.cfr_renamed_0 = (byte)v2.read();
        sprojm3.cfr_renamed_3 = (byte)arg0.read();
        sprojm3.cfr_renamed_2 = new byte[sprsgm.cfr_renamed_7910(this.cfr_renamed_0)];
        arg0.cfr_renamed_4932(this.cfr_renamed_2);
    }

    public static byte[] cfr_renamed_7863(int arg0, int arg1, int arg2, int arg3) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[5];
        byArray[0] = -44;
        byArray[1] = (byte)(arg0 & 0xFF);
        byArray[2] = (byte)(arg1 & 0xFF);
        byArray2[3] = (byte)(arg2 & 0xFF);
        byArray[4] = (byte)(arg3 & 0xFF);
        return byArray2;
    }

    public byte cfr_renamed_593() {
        return this.cfr_renamed_91;
    }

    @Override
    public int cfr_renamed_324() {
        return 20;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11038(sprjah sprjah2) throws IOException {
        void arg0;
        void v0 = arg0;
        sprojm sprojm2 = this;
        void v2 = arg0;
        v2.write(1);
        v2.write(this.cfr_renamed_593());
        arg0.write(sprojm2.cfr_renamed_7866());
        v0.write(sprojm2.cfr_renamed_7864());
        v0.write(this.cfr_renamed_2);
    }

    public int cfr_renamed_7864() {
        return this.cfr_renamed_3;
    }

    public byte cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprojm(int n, int n2, int n3, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        sprojm sprojm2 = this;
        sprojm sprojm3 = this;
        super(null);
        this.cfr_renamed_4 = 1;
        sprojm3.cfr_renamed_91 = (byte)arg0;
        sprojm3.cfr_renamed_0 = (byte)arg1;
        sprojm2.cfr_renamed_3 = (byte)arg2;
        sprojm2.cfr_renamed_2 = sproze.cfr_renamed_158(byArray);
    }

    public byte cfr_renamed_7866() {
        return this.cfr_renamed_0;
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_2;
    }

    public static int cfr_renamed_11111(byte arg0) {
        return sprsgm.cfr_renamed_7910(arg0);
    }
}

