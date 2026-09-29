/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprhjn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprlui;
import com.spire.presentation.packages.sprmro;
import com.spire.presentation.packages.sprru;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtx;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprvp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.spryvm;

@sprtea
public class sprswm
implements sprru {
    private sprlsn cfr_renamed_2;
    private sprxln cfr_renamed_3;
    private sprsuja cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprswm(float f, float f2) {
        this();
        void arg1;
        void arg0;
        sprswm sprswm2 = this;
        sprswm2.cfr_renamed_4 = new sprsuja((float)arg0, (float)arg1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_12607(float f, float f2, float f3, float f4) {
        void arg3;
        void arg1;
        void arg2;
        void arg0;
        sprswm sprswm2 = this;
        void v1 = arg0;
        this.cfr_renamed_12608((float)(v1 + arg2), (float)arg1);
        sprswm2.cfr_renamed_12608((float)(v1 + arg2), (float)(arg1 + arg3));
        sprswm2.cfr_renamed_12608(f, (float)(arg1 + arg3));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_12609() {
        switch (this.cfr_renamed_3.cfr_renamed_12609()) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void cfr_renamed_12610(float arg0, float arg1, float arg2, float arg3) {
        float f = arg2;
        this.cfr_renamed_12611(arg0, arg1, f, arg3, f, arg3);
    }

    private static /* synthetic */ void cfr_renamed_12486(String arg0) {
    }

    @Override
    public void cfr_renamed_12611(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        sprhjn sprhjn2;
        sprswm.cfr_renamed_12486(sprlui.cfr_renamed_9("\u0004-/\u001c:\u0002;/*\u000e6\u000f\u001d\t%\u0005:\u001e\u001c\u0019-\u001a:DqBqE\u0002"));
        sprhjn sprhjn3 = sprhjn2 = new sprhjn();
        sprhjn sprhjn4 = sprhjn2;
        sprhjn4.cfr_renamed_12612(0, new sprsuja(arg0, arg1));
        sprhjn4.cfr_renamed_12613(0, new sprsuja(arg2, arg3));
        sprhjn3.cfr_renamed_12614(0, new sprsuja(arg4, arg5));
        sprhjn3.cfr_renamed_12615(0, this.cfr_renamed_4);
        sprxnn sprxnn2 = new sprxnn(sprhjn2, 0);
        sprswm sprswm2 = this;
        sprswm2.cfr_renamed_12616(sprxnn2);
        sprswm2.cfr_renamed_4.cfr_renamed_12617(arg4);
        sprswm2.cfr_renamed_4.cfr_renamed_12618(arg5);
    }

    @Override
    public void cfr_renamed_12608(float arg0, float arg1) {
        sprswm.cfr_renamed_12486(new StringBuilder().insert(0, sprmro.cfr_renamed_9("'x\u0015Z\u0019`\u0013\u001c\\")).append(arg0).append(sprlui.cfr_renamed_9("@\u007f")).append(arg1).append(sprmro.cfr_renamed_9("\u001d!")).toString());
        float[] fArray = new float[4];
        fArray[0] = this.cfr_renamed_12619();
        fArray[1] = this.cfr_renamed_12620();
        fArray[2] = arg0;
        fArray[3] = arg1;
        sprfqn sprfqn2 = new sprfqn(fArray);
        sprswm sprswm2 = this;
        sprswm2.cfr_renamed_12616(sprfqn2);
        sprswm2.cfr_renamed_4.cfr_renamed_12617(arg0);
        sprswm2.cfr_renamed_4.cfr_renamed_12618(arg1);
    }

    private /* synthetic */ void cfr_renamed_12616(sprvjn arg0) {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = new sprlsn();
            this.cfr_renamed_3.cfr_renamed_12507(this.cfr_renamed_2);
        }
        this.cfr_renamed_2.cfr_renamed_12507(arg0);
    }

    @Override
    public void cfr_renamed_12621(sprru arg0) {
        int n;
        sprxln sprxln2 = (sprxln)arg0.cfr_renamed_12496();
        int n2 = n = 0;
        while (n2 < sprxln2.cfr_renamed_11861()) {
            this.cfr_renamed_3.cfr_renamed_12507(sprxln2.cfr_renamed_576(n++));
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_12622(float arg0, float arg1) {
        sprswm sprswm2 = this;
        sprswm2.cfr_renamed_4.cfr_renamed_12617(arg0);
        sprswm2.cfr_renamed_4.cfr_renamed_12618(arg1);
    }

    public sprswm() {
        sprswm sprswm2 = this;
        this.cfr_renamed_4 = new sprsuja(0.0f, 0.0f);
        sprswm2.cfr_renamed_3 = new sprxln();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_12623(float f, float f2, float f3, float f4) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprswm sprswm2 = this;
        sprswm2.cfr_renamed_12611(this.cfr_renamed_12619(), sprswm2.cfr_renamed_12620(), (float)arg0, (float)arg1, (float)arg2, (float)arg3);
    }

    @Override
    public void cfr_renamed_12587(sprvp arg0) {
        if (arg0 == null) {
            return;
        }
        this.cfr_renamed_3.cfr_renamed_12624(spryvm.cfr_renamed_12604(arg0));
    }

    @Override
    public float cfr_renamed_12620() {
        return this.cfr_renamed_4.spr\u3181();
    }

    @Override
    public void cfr_renamed_2637() {
        sprswm.cfr_renamed_12486(sprlui.cfr_renamed_9("\u0004/3\u0003,\twE\u0002"));
        if (!true) {
            return;
        }
        if (this.cfr_renamed_2 != null) {
            this.cfr_renamed_2.cfr_renamed_12625(true);
            this.cfr_renamed_2 = null;
        }
    }

    @Override
    public float cfr_renamed_12619() {
        return this.cfr_renamed_4.cfr_renamed_1980();
    }

    @Override
    public sprru cfr_renamed_12099() {
        return new sprswm(this.cfr_renamed_3.cfr_renamed_12099(), this.cfr_renamed_12619(), this.cfr_renamed_12620());
    }

    @Override
    public boolean cfr_renamed_12626() {
        return false;
    }

    @Override
    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3.cfr_renamed_11861() == 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_12591(int arg0) {
        switch (arg0) {
            case 1: {
                this.cfr_renamed_3.cfr_renamed_12591(1);
                return;
            }
            case 0: {
                this.cfr_renamed_3.cfr_renamed_12591(0);
                return;
            }
        }
        throw new IllegalArgumentException(sprmro.cfr_renamed_9(",U\u000eU\u0011Q\bQ\u000e\u0014\u0012U\u0011QF\u0014\nU\u0010A\u0019"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprswm(sprxln sprxln2, float f, float f2) {
        void arg2;
        void arg1;
        sprswm sprswm2 = this;
        sprswm sprswm3 = this;
        sprswm2.cfr_renamed_4 = new sprsuja(0.0f, 0.0f);
        sprswm2.cfr_renamed_3 = sprxln2;
        sprswm2.cfr_renamed_4 = new sprsuja((float)arg1, (float)arg2);
    }

    @Override
    public boolean cfr_renamed_12627(float arg0, float arg1) {
        throw new UnsupportedOperationException();
    }

    public void cfr_renamed_12497(Object arg0) {
        this.cfr_renamed_3 = spresca.cfr_renamed_11777(arg0, sprxln.class);
    }

    @Override
    public Object cfr_renamed_12496() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprtx cfr_renamed_8505() {
        throw new UnsupportedOperationException();
    }
}

