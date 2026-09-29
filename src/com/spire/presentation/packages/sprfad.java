/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvca;
import com.spire.presentation.packages.sprgc;
import com.spire.presentation.packages.spryad;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class sprfad
implements sprgc {
    public static final int cfr_renamed_91 = 20;
    public final int cfr_renamed_0;
    public static final int cfr_renamed_1 = 8;
    public final DatagramSocket cfr_renamed_2;
    public final int cfr_renamed_3;
    public static final int cfr_renamed_4 = 84;

    @Override
    public int cfr_renamed_2633(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        sprfad sprfad2 = this;
        sprfad2.cfr_renamed_2.setSoTimeout(arg3);
        DatagramPacket datagramPacket = new DatagramPacket(arg0, arg1, arg2);
        sprfad2.cfr_renamed_2.receive(datagramPacket);
        return datagramPacket.getLength();
    }

    @Override
    public int cfr_renamed_2634() {
        return this.cfr_renamed_0;
    }

    @Override
    public void cfr_renamed_2635(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 > this.cfr_renamed_2636()) {
            throw new spryad(80);
        }
        DatagramPacket datagramPacket = new DatagramPacket(arg0, arg1, arg2);
        this.cfr_renamed_2.send(datagramPacket);
    }

    /*
     * WARNING - void declaration
     */
    public sprfad(DatagramSocket datagramSocket, int n) throws IOException {
        void arg1;
        void arg0;
        if (!datagramSocket.isBound() || !arg0.isConnected()) {
            throw new IllegalArgumentException(sprfvca.cfr_renamed_9("u^=N9H&\nr@'^&\r0HrO=X<IrL<IrN=C<H1Y7I"));
        }
        sprfad sprfad2 = this;
        void v1 = arg1;
        this.cfr_renamed_2 = arg0;
        sprfad2.cfr_renamed_0 = v1 - 20 - 8;
        sprfad2.cfr_renamed_3 = v1 - 84 - 8;
    }

    @Override
    public int cfr_renamed_2636() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_2637() throws IOException {
        this.cfr_renamed_2.close();
    }
}

