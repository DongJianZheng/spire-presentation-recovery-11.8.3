/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrf;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprnl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqog;
import com.spire.presentation.packages.sprqsf;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprtof;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.sprunf;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprzyo;
import java.io.IOException;

public final class spremf
extends sprtof
implements sprnl,
sprjn {
    private final sprlpf cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private final byte[] cfr_renamed_1;
    private volatile sprqsf cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public sprlpf cfr_renamed_284() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public spremf cfr_renamed_5785() {
        spremf spremf2 = this;
        // MONITORENTER : spremf2
        // MONITOREXIT : spremf2
        return this.cfr_renamed_3249(1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public byte[] cfr_renamed_91() throws IOException {
        spremf spremf2 = this;
        // MONITORENTER : spremf2
        // MONITOREXIT : spremf2
        return this.cfr_renamed_954();
    }

    public byte[] cfr_renamed_5769() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spremf cfr_renamed_5781() {
        spremf spremf2 = this;
        synchronized (spremf2) {
            spremf spremf3;
            if (this.cfr_renamed_2.cfr_renamed_320() < this.cfr_renamed_2.cfr_renamed_5797()) {
                spremf spremf4 = this;
                this.cfr_renamed_2 = spremf4.cfr_renamed_2.cfr_renamed_5798(spremf4.cfr_renamed_0, this.cfr_renamed_4, (sprrqf)new sprtsf().cfr_renamed_1451());
                spremf3 = this;
            } else {
                spremf3 = this;
                this.cfr_renamed_2 = new sprqsf(this.cfr_renamed_91, this.cfr_renamed_2.cfr_renamed_5797(), this.cfr_renamed_2.cfr_renamed_5797() + 1);
            }
            return spremf3;
        }
    }

    public /* synthetic */ spremf(sprunf arg0, sprbrf arg1) {
        this(arg0);
    }

    public byte[] cfr_renamed_1411() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_1);
    }

    public byte[] cfr_renamed_5768() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_4);
    }

    public int cfr_renamed_320() {
        return this.cfr_renamed_2.cfr_renamed_320();
    }

    public sprqsf cfr_renamed_5771() {
        return this.cfr_renamed_2;
    }

    public spremf cfr_renamed_3249(int arg0) {
        if (arg0 < 1) {
            throw new IllegalArgumentException(sprzyo.cfr_renamed_9("M.@!A;\u000e.]$\u000e)A=\u000e.\u000e<F.\\+\u000e8G;Fo\u001eoE*W<"));
        }
        spremf spremf2 = this;
        synchronized (spremf2) {
            if ((long)arg0 <= this.cfr_renamed_5649()) {
                spremf spremf3;
                spremf spremf4 = this;
                spremf spremf5 = new sprunf(this.cfr_renamed_91).cfr_renamed_5799(this.cfr_renamed_4).cfr_renamed_5800(this.cfr_renamed_3).cfr_renamed_5801(this.cfr_renamed_0).cfr_renamed_5802(this.cfr_renamed_1).cfr_renamed_5777(this.cfr_renamed_320()).cfr_renamed_5803(spremf4.cfr_renamed_2.cfr_renamed_5804(spremf4.cfr_renamed_2.cfr_renamed_320() + arg0 - 1, this.cfr_renamed_91.cfr_renamed_5651())).cfr_renamed_1451();
                if ((long)arg0 == this.cfr_renamed_5649()) {
                    spremf3 = spremf5;
                    spremf spremf6 = this;
                    this.cfr_renamed_2 = new sprqsf(this.cfr_renamed_91, this.cfr_renamed_2.cfr_renamed_5797(), this.cfr_renamed_320() + arg0);
                } else {
                    int n;
                    sprrqf sprrqf2 = (sprrqf)new sprtsf().cfr_renamed_1451();
                    int n2 = n = 0;
                    while (n2 != arg0) {
                        spremf spremf7 = this;
                        this.cfr_renamed_2 = spremf7.cfr_renamed_2.cfr_renamed_5798(spremf7.cfr_renamed_0, this.cfr_renamed_4, sprrqf2);
                        n2 = ++n;
                    }
                    spremf3 = spremf5;
                }
                return spremf3;
            }
            throw new IllegalArgumentException(sprqog.cfr_renamed_9("e>q*u\u000e\u007f8~90(h.u(t>08c,w(cmb(},y#y#w"));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public long cfr_renamed_5649() {
        spremf spremf2 = this;
        // MONITORENTER : spremf2
        // MONITOREXIT : spremf2
        return this.cfr_renamed_2.cfr_renamed_5797() - this.cfr_renamed_320() + 1;
    }

    public byte[] cfr_renamed_5774() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ spremf(sprunf sprunf2) {
        void v7;
        void v6;
        void v5;
        void v4;
        void v3;
        void arg0;
        spremf spremf2 = this;
        super(true, sprunf.cfr_renamed_5805((sprunf)arg0).cfr_renamed_3234());
        spremf2.cfr_renamed_91 = sprunf.cfr_renamed_5805(sprunf2);
        if (spremf2.cfr_renamed_91 == null) {
            throw new NullPointerException(sprzyo.cfr_renamed_9("^.\\.C<\u000er\u0013o@:B#"));
        }
        int n = this.cfr_renamed_91.cfr_renamed_5732();
        byte[] byArray = sprunf.cfr_renamed_5806((sprunf)arg0);
        if (byArray != null) {
            int n2 = this.cfr_renamed_91.cfr_renamed_1452();
            int n3 = 4;
            int n4 = n;
            int n5 = n;
            int n6 = n;
            int n7 = n;
            int n8 = 0;
            int n9 = sprpxe.cfr_renamed_446(byArray, 0);
            if (!sprvof.cfr_renamed_5764(n2, n9)) {
                throw new IllegalArgumentException(sprqog.cfr_renamed_9("y#t(hm\u007f8dm\u007f+0/\u007f8~)c"));
            }
            spremf spremf3 = this;
            spremf spremf4 = this;
            spremf4.cfr_renamed_4 = sprvof.cfr_renamed_5759(byArray, n8 += n3, n4);
            spremf4.cfr_renamed_3 = sprvof.cfr_renamed_5759(byArray, n8 += n4, n5);
            spremf3.cfr_renamed_0 = sprvof.cfr_renamed_5759(byArray, n8 += n5, n6);
            spremf3.cfr_renamed_1 = sprvof.cfr_renamed_5759(byArray, n8 += n6, n7);
            byte[] byArray2 = sprvof.cfr_renamed_5759(byArray, n8 += n7, byArray.length - n8);
            try {
                sprqsf sprqsf2 = (sprqsf)sprvof.cfr_renamed_5758(byArray2, sprqsf.class);
                if (sprqsf2.cfr_renamed_320() != n9) {
                    throw new IllegalStateException(sprzyo.cfr_renamed_9("]*\\&O#G5K+\u000e\rj\u001c\u000e'O<\u000e8\\ @(\u000e&@+K7"));
                }
                this.cfr_renamed_2 = sprqsf2.cfr_renamed_5807(sprunf.cfr_renamed_5805((sprunf)arg0).cfr_renamed_5651());
                return;
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(iOException.getMessage(), iOException);
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalArgumentException(classNotFoundException.getMessage(), classNotFoundException);
            }
        }
        byte[] byArray3 = sprunf.cfr_renamed_5808((sprunf)arg0);
        if (byArray3 != null) {
            if (byArray3.length != n) {
                throw new IllegalArgumentException(sprqog.cfr_renamed_9(">y7um\u007f+0>u.b(d\u0006u4C(u)0#u(t>09\u007fmr(0(a8q!0>y7um\u007f+0)y*u>d"));
            }
            this.cfr_renamed_4 = byArray3;
            v3 = arg0;
        } else {
            this.cfr_renamed_4 = new byte[n];
            v3 = arg0;
        }
        byte[] byArray4 = sprunf.cfr_renamed_5809((sprunf)v3);
        if (byArray4 != null) {
            if (byArray4.length != n) {
                throw new IllegalArgumentException(sprzyo.cfr_renamed_9("<G5KoA)\u000e<K,\\*Z\u0004K6~\u001dho@*K+]oZ \u000e-KoK>[.Bo]&T*\u000e HoJ&I*];"));
            }
            this.cfr_renamed_3 = byArray4;
            v4 = arg0;
        } else {
            this.cfr_renamed_3 = new byte[n];
            v4 = arg0;
        }
        byte[] byArray5 = sprunf.cfr_renamed_5810((sprunf)v4);
        if (byArray5 != null) {
            if (byArray5.length != n) {
                throw new IllegalArgumentException(sprqog.cfr_renamed_9("c$j(0\"vm`8r!y.C(u)0#u(t>09\u007fmr(0(a8q!0>y7um\u007f+0)y*u>d"));
            }
            this.cfr_renamed_0 = byArray5;
            v5 = arg0;
        } else {
            this.cfr_renamed_0 = new byte[n];
            v5 = arg0;
        }
        byte[] byArray6 = sprunf.cfr_renamed_5811((sprunf)v5);
        if (byArray6 != null) {
            if (byArray6.length != n) {
                throw new IllegalArgumentException(sprzyo.cfr_renamed_9("<G5KoA)\u000e=A Zo@*K+]oZ \u000e-KoK>[.Bo]&T*\u000e HoJ&I*];"));
            }
            this.cfr_renamed_1 = byArray6;
            v6 = arg0;
        } else {
            this.cfr_renamed_1 = new byte[n];
            v6 = arg0;
        }
        sprqsf sprqsf3 = sprunf.cfr_renamed_5812((sprunf)v6);
        if (sprqsf3 != null) {
            v7 = arg0;
            this.cfr_renamed_2 = sprqsf3;
        } else if (sprunf.cfr_renamed_5813((sprunf)arg0) < (1 << this.cfr_renamed_91.cfr_renamed_1452()) - 2 && byArray5 != null && byArray3 != null) {
            spremf spremf5 = this;
            this.cfr_renamed_2 = new sprqsf(this.cfr_renamed_91, byArray5, byArray3, (sprrqf)new sprtsf().cfr_renamed_1451(), sprunf.cfr_renamed_5813((sprunf)arg0));
            v7 = arg0;
        } else {
            this.cfr_renamed_2 = new sprqsf(this.cfr_renamed_91, (1 << this.cfr_renamed_91.cfr_renamed_1452()) - 1, sprunf.cfr_renamed_5813((sprunf)arg0));
            v7 = arg0;
        }
        if (sprunf.cfr_renamed_5814((sprunf)v7) >= 0 && sprunf.cfr_renamed_5814((sprunf)arg0) != this.cfr_renamed_2.cfr_renamed_5797()) {
            throw new IllegalArgumentException(sprqog.cfr_renamed_9("},h\u0004~)u50>u90/e90#\u007f90?u+|(s9u)0$~mc9q9u"));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_954() {
        spremf spremf2 = this;
        synchronized (spremf2) {
            spremf spremf3 = this;
            int n = spremf3.cfr_renamed_91.cfr_renamed_5732();
            int n2 = 4;
            int n3 = n;
            int n4 = n;
            int n5 = n;
            int n6 = n;
            byte[] byArray = new byte[n2 + n3 + n4 + n5 + n6];
            int n7 = 0;
            sprpxe.cfr_renamed_442(spremf3.cfr_renamed_2.cfr_renamed_320(), byArray, n7);
            spremf spremf4 = this;
            int n8 = n7 += n2;
            sprvof.cfr_renamed_5754(byArray, this.cfr_renamed_4, n8);
            n7 = n8 + n3;
            sprvof.cfr_renamed_5754(byArray, spremf4.cfr_renamed_3, n7);
            sprvof.cfr_renamed_5754(byArray, spremf4.cfr_renamed_0, n7 += n4);
            sprvof.cfr_renamed_5754(byArray, this.cfr_renamed_1, n7 += n5);
            byte[] byArray2 = null;
            try {
                byArray2 = sprvof.cfr_renamed_5749(this.cfr_renamed_2);
            }
            catch (IOException iOException) {
                throw new RuntimeException(new StringBuilder().insert(0, sprzyo.cfr_renamed_9("*\\=A=\u000e<K=G.B&T&@(\u000e-J<\u000e<Z.Z*\u0014o")).append(iOException.getMessage()).toString());
            }
            return sproze.cfr_renamed_543(byArray, byArray2);
        }
    }
}

