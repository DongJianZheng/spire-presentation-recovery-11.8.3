/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcof;
import com.spire.presentation.packages.sprdlf;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprjod;
import com.spire.presentation.packages.sprlsf;
import com.spire.presentation.packages.sprnl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrsf;
import com.spire.presentation.packages.sprtaz;
import com.spire.presentation.packages.sprvjf;
import com.spire.presentation.packages.sprvof;
import java.io.IOException;

public final class sprpof
extends sprlsf
implements sprnl,
sprjn {
    private final sprvjf cfr_renamed_112;
    private volatile long cfr_renamed_119;
    private final byte[] cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private final byte[] cfr_renamed_1;
    private volatile boolean cfr_renamed_2;
    private volatile sprrsf cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public long cfr_renamed_5649() {
        sprpof sprpof2 = this;
        // MONITORENTER : sprpof2
        // MONITOREXIT : sprpof2
        return this.cfr_renamed_3.cfr_renamed_5797() - this.cfr_renamed_320() + 1L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprpof cfr_renamed_5781() {
        sprpof sprpof2 = this;
        synchronized (sprpof2) {
            sprpof sprpof3;
            if (this.cfr_renamed_320() < this.cfr_renamed_3.cfr_renamed_5797()) {
                sprpof3 = this;
                sprpof sprpof4 = this;
                sprpof sprpof5 = this;
                sprpof sprpof6 = this;
                sprpof4.cfr_renamed_3.cfr_renamed_5835(sprpof4.cfr_renamed_112, sprpof5.cfr_renamed_119, sprpof6.cfr_renamed_1, sprpof6.cfr_renamed_4);
                this.cfr_renamed_119 = sprpof5.cfr_renamed_119 + 1L;
                this.cfr_renamed_2 = false;
            } else {
                sprpof3 = this;
                sprpof sprpof7 = this;
                sprpof7.cfr_renamed_119 = this.cfr_renamed_3.cfr_renamed_5797() + 1L;
                sprpof sprpof8 = this;
                sprpof7.cfr_renamed_3 = new sprrsf(this.cfr_renamed_3.cfr_renamed_5797());
                sprpof7.cfr_renamed_2 = false;
            }
            return sprpof3;
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
    @Override
    public byte[] cfr_renamed_91() throws IOException {
        sprpof sprpof2 = this;
        // MONITORENTER : sprpof2
        // MONITOREXIT : sprpof2
        return this.cfr_renamed_954();
    }

    public /* synthetic */ sprpof(sprdlf arg0, sprcof arg1) {
        this(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_954() {
        sprpof sprpof2 = this;
        synchronized (sprpof2) {
            sprpof sprpof3 = this;
            int n = sprpof3.cfr_renamed_112.cfr_renamed_5732();
            int n2 = (sprpof3.cfr_renamed_112.cfr_renamed_1452() + 7) / 8;
            int n3 = n;
            int n4 = n;
            int n5 = n;
            int n6 = n;
            byte[] byArray = new byte[n2 + n3 + n4 + n5 + n6];
            int n7 = 0;
            byte[] byArray2 = sprvof.cfr_renamed_5755(sprpof3.cfr_renamed_119, n2);
            sprpof sprpof4 = this;
            sprvof.cfr_renamed_5754(byArray, byArray2, n7);
            sprvof.cfr_renamed_5754(byArray, this.cfr_renamed_4, n7 += n2);
            sprvof.cfr_renamed_5754(byArray, sprpof4.cfr_renamed_0, n7 += n3);
            sprvof.cfr_renamed_5754(byArray, sprpof4.cfr_renamed_1, n7 += n4);
            sprvof.cfr_renamed_5754(byArray, this.cfr_renamed_91, n7 += n5);
            try {
                return sproze.cfr_renamed_543(byArray, sprvof.cfr_renamed_5749(this.cfr_renamed_3));
            }
            catch (IOException iOException) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprtaz.cfr_renamed_9("_xHeH*IoHc[fSpSd]*XnI*I~[~_0\u001a")).append(iOException.getMessage()).toString(), iOException);
            }
        }
    }

    public byte[] cfr_renamed_5769() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_1);
    }

    public sprpof cfr_renamed_3249(int arg0) {
        if (arg0 < 1) {
            throw new IllegalArgumentException(sprjod.cfr_renamed_9("0\u0011=\u001e<\u0004s\u0011 \u001bs\u0016<\u0002s\u0011s\u0003;\u0011!\u0014s\u0007:\u0004;PcP8\u0015*\u0003"));
        }
        sprpof sprpof2 = this;
        synchronized (sprpof2) {
            block6: {
                int n;
                if ((long)arg0 > this.cfr_renamed_5649()) break block6;
                sprpof sprpof3 = new sprdlf(this.cfr_renamed_112).cfr_renamed_5799(this.cfr_renamed_4).cfr_renamed_5800(this.cfr_renamed_0).cfr_renamed_5801(this.cfr_renamed_1).cfr_renamed_5802(this.cfr_renamed_91).cfr_renamed_5823(this.cfr_renamed_320()).cfr_renamed_5836(new sprrsf(this.cfr_renamed_3, this.cfr_renamed_320() + (long)arg0 - 1L)).cfr_renamed_1451();
                int n2 = n = 0;
                while (n2 != arg0) {
                    this.cfr_renamed_5781();
                    n2 = ++n;
                }
                return sprpof3;
            }
            throw new IllegalArgumentException(sprtaz.cfr_renamed_9("Oy[m_IU\u007fT~\u001aoBi_o^y\u001a\u007fIk]oI*HoWkSdSd]"));
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprpof(sprdlf sprdlf2) {
        void v7;
        void v6;
        void v5;
        void v4;
        void v3;
        void arg0;
        sprpof sprpof2 = this;
        super(true, sprdlf.cfr_renamed_5837((sprdlf)arg0).cfr_renamed_3234());
        sprpof2.cfr_renamed_112 = sprdlf.cfr_renamed_5837(sprdlf2);
        if (sprpof2.cfr_renamed_112 == null) {
            throw new NullPointerException(sprjod.cfr_renamed_9("#\u0011!\u0011>\u0003sMnP=\u0005?\u001c"));
        }
        int n = this.cfr_renamed_112.cfr_renamed_5732();
        byte[] byArray = sprdlf.cfr_renamed_5575((sprdlf)arg0);
        if (byArray != null) {
            if (sprdlf.cfr_renamed_5838((sprdlf)arg0) == null) {
                throw new NullPointerException(sprtaz.cfr_renamed_9("rWyI*\u00077\u001adOfV"));
            }
            int n2 = this.cfr_renamed_112.cfr_renamed_1452();
            int n3 = (n2 + 7) / 8;
            int n4 = n;
            int n5 = n;
            int n6 = n;
            int n7 = n;
            int n8 = 0;
            this.cfr_renamed_119 = sprvof.cfr_renamed_5761(byArray, 0, n3);
            if (!sprvof.cfr_renamed_5764(n2, this.cfr_renamed_119)) {
                throw new IllegalArgumentException(sprjod.cfr_renamed_9("\u0019=\u00146\bs\u001f&\u0004s\u001f5P1\u001f&\u001e7\u0003"));
            }
            sprpof sprpof3 = this;
            sprpof sprpof4 = this;
            sprpof4.cfr_renamed_4 = sprvof.cfr_renamed_5759(byArray, n8 += n3, n4);
            sprpof4.cfr_renamed_0 = sprvof.cfr_renamed_5759(byArray, n8 += n4, n5);
            sprpof3.cfr_renamed_1 = sprvof.cfr_renamed_5759(byArray, n8 += n5, n6);
            sprpof3.cfr_renamed_91 = sprvof.cfr_renamed_5759(byArray, n8 += n6, n7);
            byte[] byArray2 = sprvof.cfr_renamed_5759(byArray, n8 += n7, byArray.length - n8);
            try {
                sprrsf sprrsf2 = (sprrsf)sprvof.cfr_renamed_5758(byArray2, sprrsf.class);
                this.cfr_renamed_3 = sprrsf2.cfr_renamed_5807(sprdlf.cfr_renamed_5838((sprdlf)arg0).cfr_renamed_5651());
                return;
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(iOException.getMessage(), iOException);
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalArgumentException(classNotFoundException.getMessage(), classNotFoundException);
            }
        }
        this.cfr_renamed_119 = sprdlf.cfr_renamed_5839((sprdlf)arg0);
        byte[] byArray3 = sprdlf.cfr_renamed_5840((sprdlf)arg0);
        if (byArray3 != null) {
            if (byArray3.length != n) {
                throw new IllegalArgumentException(sprtaz.cfr_renamed_9("ySp_*Ul\u001ay_iHoNA_sio_n\u001ad_o^y\u001a~U*Xo\u001aoK\u007f[f\u001aySp_*Ul\u001anSm_yN"));
            }
            this.cfr_renamed_4 = byArray3;
            v3 = arg0;
        } else {
            this.cfr_renamed_4 = new byte[n];
            v3 = arg0;
        }
        byte[] byArray4 = sprdlf.cfr_renamed_5841((sprdlf)v3);
        if (byArray4 != null) {
            if (byArray4.length != n) {
                throw new IllegalArgumentException(sprjod.cfr_renamed_9("\u0003:\n6P<\u0016s\u00036\u0013!\u0015';6\t\u0003\"\u0015P=\u00156\u0014 P'\u001fs\u00126P6\u0001&\u0011?P \u0019)\u0015s\u001f5P7\u00194\u0015 \u0004"));
            }
            this.cfr_renamed_0 = byArray4;
            v4 = arg0;
        } else {
            this.cfr_renamed_0 = new byte[n];
            v4 = arg0;
        }
        byte[] byArray5 = sprdlf.cfr_renamed_5842((sprdlf)v4);
        if (byArray5 != null) {
            if (byArray5.length != n) {
                throw new IllegalArgumentException(sprtaz.cfr_renamed_9("Ic@o\u001ae\\*J\u007fXfSiio_n\u001ad_o^y\u001a~U*Xo\u001aoK\u007f[f\u001aySp_*Ul\u001anSm_yN"));
            }
            this.cfr_renamed_1 = byArray5;
            v5 = arg0;
        } else {
            this.cfr_renamed_1 = new byte[n];
            v5 = arg0;
        }
        byte[] byArray6 = sprdlf.cfr_renamed_5843((sprdlf)v5);
        if (byArray6 != null) {
            if (byArray6.length != n) {
                throw new IllegalArgumentException(sprjod.cfr_renamed_9("\u0003:\n6P<\u0016s\u0002<\u001f'P=\u00156\u0014 P'\u001fs\u00126P6\u0001&\u0011?P \u0019)\u0015s\u001f5P7\u00194\u0015 \u0004"));
            }
            this.cfr_renamed_91 = byArray6;
            v6 = arg0;
        } else {
            this.cfr_renamed_91 = new byte[n];
            v6 = arg0;
        }
        sprrsf sprrsf3 = sprdlf.cfr_renamed_5844((sprdlf)v6);
        if (sprrsf3 != null) {
            v7 = arg0;
            this.cfr_renamed_3 = sprrsf3;
        } else {
            long l = sprdlf.cfr_renamed_5839((sprdlf)arg0);
            int n9 = this.cfr_renamed_112.cfr_renamed_1452();
            if (sprvof.cfr_renamed_5764(n9, l) && byArray5 != null && byArray3 != null) {
                v7 = arg0;
                sprpof sprpof5 = this;
                this.cfr_renamed_3 = new sprrsf(this.cfr_renamed_112, sprdlf.cfr_renamed_5839((sprdlf)arg0), byArray5, byArray3);
            } else {
                this.cfr_renamed_3 = new sprrsf(sprdlf.cfr_renamed_5845((sprdlf)arg0) + 1L);
                v7 = arg0;
            }
        }
        if (sprdlf.cfr_renamed_5845((sprdlf)v7) >= 0L && sprdlf.cfr_renamed_5845((sprdlf)arg0) != this.cfr_renamed_3.cfr_renamed_5797()) {
            throw new IllegalArgumentException(sprtaz.cfr_renamed_9("WkBCTn_r\u001ay_~\u001ahO~\u001adU~\u001ax_lVoY~_n\u001acT*I~[~_"));
        }
    }

    public byte[] cfr_renamed_5768() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_5774() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_0);
    }

    public byte[] cfr_renamed_1411() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_91);
    }

    public sprrsf cfr_renamed_5771() {
        return this.cfr_renamed_3;
    }

    public long cfr_renamed_320() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public sprpof cfr_renamed_5785() {
        sprpof sprpof2 = this;
        // MONITORENTER : sprpof2
        // MONITOREXIT : sprpof2
        return this.cfr_renamed_3249(1);
    }

    public sprvjf cfr_renamed_284() {
        return this.cfr_renamed_112;
    }
}

