/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwxo;
import com.spire.presentation.packages.sprwzq;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.io.IOException;

public class sprkhe
extends sprkra
implements sprkj {
    private sprcge cfr_renamed_91;
    private byte[] cfr_renamed_0;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = -1;
    private byte[] cfr_renamed_4;

    public static sprkhe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprkhe) {
            return (sprkhe)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprkhe(sprcge.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof spryte) {
            return new sprkhe((spryte)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwzq.cfr_renamed_9("7\t2\u00009\u00042E1\u00074\u0000=\u0011~\f0E9\u0000*,0\u0016*\u00040\u0006;_~")).append(arg0.getClass().getName()).toString());
    }

    public int cfr_renamed_324() {
        if (this.cfr_renamed_91 != null) {
            return -1;
        }
        if (this.cfr_renamed_0 != null) {
            return 0;
        }
        return 1;
    }

    public sprkhe(sprcge sprcge2) {
        this.cfr_renamed_91 = sprcge2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkhe(spryte spryte2) {
        void arg0;
        if (spryte2.cfr_renamed_312() == 0) {
            this.cfr_renamed_0 = sprxue.cfr_renamed_341((spryte)arg0, true).cfr_renamed_186();
            return;
        }
        if (arg0.cfr_renamed_312() == 1) {
            this.cfr_renamed_4 = sprxue.cfr_renamed_341((spryte)arg0, true).cfr_renamed_186();
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwxo.cfr_renamed_9("\fi\u0012i\u0016p\u0017'\rf\u001e'\u0017r\u0014e\u001cuC'")).append(arg0.cfr_renamed_312()).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4636() {
        if (this.cfr_renamed_91 != null) {
            try {
                return this.cfr_renamed_91.cfr_renamed_91();
            }
            catch (IOException iOException) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprwzq.cfr_renamed_9("\u0006?\u000by\u0011~\u0001;\u00061\u0001;E=\u0000,\u00117\u00037\u0006?\u0011;_~")).append(iOException).toString());
            }
        }
        if (this.cfr_renamed_0 != null) {
            return this.cfr_renamed_0;
        }
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprkhe(int n, byte[] byArray) {
        this(new sprhse((int)arg0, new sprlqe((byte[])arg1)));
        void arg1;
        void arg0;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_0 != null) {
            return new sprhse(0, new sprlqe(this.cfr_renamed_0));
        }
        if (this.cfr_renamed_4 != null) {
            return new sprhse(1, new sprlqe(this.cfr_renamed_4));
        }
        return this.cfr_renamed_91.cfr_renamed_119();
    }

    public static sprkhe cfr_renamed_341(spryte arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprwxo.cfr_renamed_9("d\u0011h\u0010d\u001c'\u0010s\u001cjYj\ft\r'\u001bbYb\u0001w\u0015n\u001an\rk\u0000'\rf\u001e`\u001cc"));
        }
        return sprkhe.cfr_renamed_23(arg0.cfr_renamed_2456());
    }
}

