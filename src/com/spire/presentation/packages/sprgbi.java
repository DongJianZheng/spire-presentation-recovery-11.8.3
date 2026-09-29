/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcgp;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprngk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpk;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;

public class sprgbi
implements PBEKey,
Destroyable {
    public int cfr_renamed_102;
    private final int cfr_renamed_93;
    public int cfr_renamed_86;
    public int cfr_renamed_152;
    public int cfr_renamed_112;
    public String cfr_renamed_119;
    public sprlem cfr_renamed_91;
    private final sprbj cfr_renamed_0;
    public boolean cfr_renamed_1;
    private final char[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final AtomicBoolean cfr_renamed_4;

    public int cfr_renamed_324() {
        sprgbi sprgbi2 = this;
        int n = sprgbi2.cfr_renamed_102;
        sprgbi.cfr_renamed_9246(sprgbi2);
        return n;
    }

    @Override
    public String getAlgorithm() {
        sprgbi sprgbi2 = this;
        String string = sprgbi2.cfr_renamed_119;
        sprgbi.cfr_renamed_9246(sprgbi2);
        return string;
    }

    @Override
    public byte[] getSalt() {
        sprgbi sprgbi2 = this;
        byte[] byArray = sproze.cfr_renamed_158(sprgbi2.cfr_renamed_3);
        sprgbi.cfr_renamed_9246(sprgbi2);
        return byArray;
    }

    @Override
    public byte[] getEncoded() {
        sprgbi sprgbi2;
        byte[] byArray;
        if (this.cfr_renamed_0 != null) {
            sprtpk sprtpk2;
            sprtpk sprtpk3;
            byArray = (this.cfr_renamed_0 instanceof sprkpk ? (sprtpk3 = (sprtpk)((sprkpk)this.cfr_renamed_0).cfr_renamed_284()) : (sprtpk2 = (sprtpk)this.cfr_renamed_0)).cfr_renamed_1521();
            sprgbi2 = this;
        } else if (this.cfr_renamed_102 == 2) {
            sprgbi sprgbi3 = this;
            sprgbi2 = sprgbi3;
            byArray = sprkuh.cfr_renamed_1516(sprgbi3.cfr_renamed_2);
        } else if (this.cfr_renamed_102 == 5) {
            sprgbi sprgbi4 = this;
            sprgbi2 = sprgbi4;
            byArray = sprkuh.cfr_renamed_2400(sprgbi4.cfr_renamed_2);
        } else {
            sprgbi sprgbi5 = this;
            sprgbi2 = sprgbi5;
            byArray = sprkuh.cfr_renamed_1606(sprgbi5.cfr_renamed_2);
        }
        sprgbi.cfr_renamed_9246(sprgbi2);
        return byArray;
    }

    @Override
    public String getFormat() {
        sprgbi.cfr_renamed_9246(this);
        return sprngk.cfr_renamed_9("#c&");
    }

    public int cfr_renamed_580() {
        sprgbi sprgbi2 = this;
        int n = sprgbi2.cfr_renamed_86;
        sprgbi.cfr_renamed_9246(sprgbi2);
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprgbi(String string, sprbj sprbj2) {
        void arg1;
        void arg0;
        sprgbi sprgbi2 = this;
        sprgbi sprgbi3 = this;
        sprgbi sprgbi4 = this;
        sprgbi sprgbi5 = this;
        sprgbi5.cfr_renamed_4 = new AtomicBoolean(false);
        sprgbi4.cfr_renamed_1 = false;
        sprgbi4.cfr_renamed_119 = arg0;
        sprgbi3.cfr_renamed_0 = arg1;
        sprgbi3.cfr_renamed_2 = null;
        sprgbi2.cfr_renamed_93 = -1;
        sprgbi2.cfr_renamed_3 = null;
    }

    public static void cfr_renamed_9246(Destroyable arg0) {
        if (arg0.isDestroyed()) {
            throw new IllegalStateException(sprcgp.cfr_renamed_9("4.&k7*,k=.:%\u007f/:8+902:/"));
        }
    }

    public int cfr_renamed_2398() {
        sprgbi sprgbi2 = this;
        int n = sprgbi2.cfr_renamed_112;
        sprgbi.cfr_renamed_9246(sprgbi2);
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprgbi(String string, sprlem sprlem2, int n, int n2, int n3, int n4, PBEKeySpec pBEKeySpec, sprbj sprbj2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void arg6;
        sprgbi sprgbi2 = this;
        void v1 = arg6;
        sprgbi sprgbi3 = this;
        sprgbi sprgbi4 = this;
        sprgbi sprgbi5 = this;
        sprgbi sprgbi6 = this;
        sprgbi sprgbi7 = this;
        sprgbi7.cfr_renamed_4 = new AtomicBoolean(false);
        sprgbi6.cfr_renamed_1 = false;
        sprgbi6.cfr_renamed_119 = arg0;
        sprgbi5.cfr_renamed_91 = arg1;
        sprgbi5.cfr_renamed_102 = arg2;
        sprgbi4.cfr_renamed_86 = arg3;
        sprgbi4.cfr_renamed_112 = arg4;
        sprgbi3.cfr_renamed_152 = arg5;
        sprgbi3.cfr_renamed_2 = arg6.getPassword();
        this.cfr_renamed_93 = v1.getIterationCount();
        sprgbi2.cfr_renamed_3 = v1.getSalt();
        sprgbi2.cfr_renamed_0 = sprbj2;
    }

    @Override
    public void destroy() {
        if (!this.cfr_renamed_4.getAndSet(true)) {
            if (this.cfr_renamed_2 != null) {
                sproze.cfr_renamed_529(this.cfr_renamed_2, '\u0000');
            }
            if (this.cfr_renamed_3 != null) {
                sproze.cfr_renamed_492(this.cfr_renamed_3, (byte)0);
            }
        }
    }

    public sprlem cfr_renamed_113() {
        sprgbi sprgbi2 = this;
        sprlem sprlem2 = sprgbi2.cfr_renamed_91;
        sprgbi.cfr_renamed_9246(sprgbi2);
        return sprlem2;
    }

    @Override
    public int getIterationCount() {
        sprgbi sprgbi2 = this;
        int n = sprgbi2.cfr_renamed_93;
        sprgbi.cfr_renamed_9246(sprgbi2);
        return n;
    }

    @Override
    public char[] getPassword() {
        sprgbi sprgbi2 = this;
        char[] cArray = sproze.cfr_renamed_1106(sprgbi2.cfr_renamed_2);
        sprgbi.cfr_renamed_9246(sprgbi2);
        if (cArray == null) {
            throw new IllegalStateException(sprngk.cfr_renamed_9("\u001fMQR\u0010Q\u0002U\u001eP\u0015\u0002\u0010T\u0010K\u001dC\u0013N\u0014"));
        }
        return cArray;
    }

    public boolean cfr_renamed_2399() {
        return this.cfr_renamed_1;
    }

    @Override
    public boolean isDestroyed() {
        return this.cfr_renamed_4.get();
    }

    public void cfr_renamed_1502(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public sprbj cfr_renamed_2292() {
        sprgbi sprgbi2 = this;
        sprbj sprbj2 = sprgbi2.cfr_renamed_0;
        sprgbi.cfr_renamed_9246(sprgbi2);
        return sprbj2;
    }

    public int cfr_renamed_2294() {
        sprgbi sprgbi2 = this;
        int n = sprgbi2.cfr_renamed_152;
        sprgbi.cfr_renamed_9246(sprgbi2);
        return n;
    }
}

