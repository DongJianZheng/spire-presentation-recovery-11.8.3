/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spres;
import com.spire.presentation.packages.sprgx;
import com.spire.presentation.packages.sprhp;
import com.spire.presentation.packages.sprhym;
import com.spire.presentation.packages.sprls;
import com.spire.presentation.packages.sprppc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public class spryok
implements sprhp<SSLSession>,
sprls,
sprgx {
    private final spres cfr_renamed_2;
    public final SSLSocket cfr_renamed_3;
    private final Long cfr_renamed_4;

    @Override
    public void cfr_renamed_2637() throws IOException {
        this.cfr_renamed_3.close();
    }

    @Override
    public InputStream cfr_renamed_2920() throws IOException {
        return this.cfr_renamed_3.getInputStream();
    }

    @Override
    public boolean cfr_renamed_9700() {
        spryok spryok2 = this;
        return spryok2.cfr_renamed_2.cfr_renamed_9711(spryok2.cfr_renamed_3);
    }

    @Override
    public SSLSession cfr_renamed_9701() {
        return this.cfr_renamed_3.getSession();
    }

    @Override
    public Long cfr_renamed_9702() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spryok(SSLSocket sSLSocket, spres spres2, Long l) {
        void arg1;
        void arg0;
        spryok spryok2 = this;
        this.cfr_renamed_3 = arg0;
        spryok2.cfr_renamed_2 = arg1;
        spryok2.cfr_renamed_4 = l;
    }

    @Override
    public byte[] cfr_renamed_9699() {
        if (this.cfr_renamed_9700()) {
            spryok spryok2 = this;
            return spryok2.cfr_renamed_2.cfr_renamed_9712(spryok2.cfr_renamed_3, sprhym.cfr_renamed_9("\u001c5\u001bt\u001d7\u0001(\u001d<"));
        }
        throw new IllegalStateException(sprppc.cfr_renamed_9("t+\u001a&S*^-T#\u001a4H+L-^!Hj"));
    }

    @Override
    public OutputStream cfr_renamed_470() throws IOException {
        return this.cfr_renamed_3.getOutputStream();
    }
}

