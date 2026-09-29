/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjuj;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprmq;
import com.spire.presentation.packages.sprose;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.spryhk;
import com.spire.presentation.packages.sprzlg;
import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

public class sprnvj
implements sprmq {
    private final sprrr cfr_renamed_152;
    private final spryhk cfr_renamed_112;
    private final byte[] cfr_renamed_119;
    private final String cfr_renamed_91;
    private final sprlem cfr_renamed_0;
    private final ECPrivateKey cfr_renamed_1;
    private final sprddm cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final sprjj cfr_renamed_4;

    @Override
    public boolean cfr_renamed_9516() {
        return this.cfr_renamed_3 == null;
    }

    @Override
    public spryhk cfr_renamed_614() {
        return this.cfr_renamed_112;
    }

    @Override
    public byte[] cfr_renamed_9517() {
        return sproze.cfr_renamed_158(this.cfr_renamed_119);
    }

    @Override
    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_4.cfr_renamed_470();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnvj(ECPrivateKey eCPrivateKey, spryhk spryhk2, sprrr sprrr2) {
        sprlj sprlj2;
        Object object;
        void arg2;
        void arg1;
        void arg0;
        sprnvj sprnvj2 = this;
        sprnvj2.cfr_renamed_1 = arg0;
        sprnvj2.cfr_renamed_112 = arg1;
        this.cfr_renamed_152 = arg2;
        this.cfr_renamed_0 = sprlem.cfr_renamed_23(sprcom.cfr_renamed_23(eCPrivateKey.getEncoded()).cfr_renamed_1254().cfr_renamed_284());
        if (this.cfr_renamed_0.cfr_renamed_5078(sprhr.cfr_renamed_1)) {
            sprnvj sprnvj3 = this;
            sprnvj sprnvj4 = this;
            sprnvj3.cfr_renamed_2 = new sprddm(sprwr.cfr_renamed_1226);
            sprnvj3.cfr_renamed_91 = "SHA256withECDSA";
        } else if (this.cfr_renamed_0.cfr_renamed_5078(spris.cfr_renamed_96)) {
            sprnvj sprnvj5 = this;
            sprnvj5.cfr_renamed_2 = new sprddm(sprwr.cfr_renamed_1226);
            sprnvj5.cfr_renamed_91 = "SHA256withECDSA";
        } else if (this.cfr_renamed_0.cfr_renamed_5078(spris.cfr_renamed_93)) {
            sprnvj sprnvj6 = this;
            sprnvj6.cfr_renamed_2 = new sprddm(sprwr.cfr_renamed_112);
            sprnvj6.cfr_renamed_91 = "SHA384withECDSA";
        } else {
            throw new IllegalArgumentException(sprose.cfr_renamed_9("|#b#f:gmb(pm}4y("));
        }
        try {
            object = new sprzlg().cfr_renamed_7401((sprrr)arg2);
            sprlj2 = ((sprzlg)object).cfr_renamed_1451();
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage(), exception);
        }
        {
            this.cfr_renamed_4 = sprlj2.cfr_renamed_5279(this.cfr_renamed_2);
        }
        if (arg1 != null) {
            try {
                this.cfr_renamed_3 = arg1.cfr_renamed_91();
                object = this.cfr_renamed_4.cfr_renamed_470();
                ((OutputStream)object).write(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
                ((OutputStream)object).close();
                this.cfr_renamed_119 = this.cfr_renamed_4.cfr_renamed_580();
                return;
            }
            catch (IOException iOException) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprose.cfr_renamed_9("z$n#l?).l?}$o$j,}()(g.f)`#nmo,`!l)3m")).append(iOException.getMessage()).toString());
            }
        }
        this.cfr_renamed_3 = null;
        this.cfr_renamed_119 = this.cfr_renamed_4.cfr_renamed_580();
    }

    @Override
    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_2;
    }

    public /* synthetic */ sprnvj(ECPrivateKey arg0, spryhk arg1, sprrr arg2, sprjuj arg3) {
        this(arg0, arg1, arg2);
    }

    @Override
    public sprlem cfr_renamed_9515() {
        return this.cfr_renamed_0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_79() {
        byte[] byArray = this.cfr_renamed_4.cfr_renamed_580();
        try {
            Signature signature;
            sprnvj sprnvj2 = this;
            Signature signature2 = signature = sprnvj2.cfr_renamed_152.cfr_renamed_1539(sprnvj2.cfr_renamed_91);
            signature2.initSign(this.cfr_renamed_1);
            signature2.update(byArray, 0, byArray.length);
            signature.update(this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
            return signature.sign();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }
}

