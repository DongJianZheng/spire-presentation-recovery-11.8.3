/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprhln;
import com.spire.presentation.packages.sprjqn;
import com.spire.presentation.packages.sprmmn;
import com.spire.presentation.packages.sprmqn;
import com.spire.presentation.packages.sprnjn;
import com.spire.presentation.packages.sprorn;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprrhn;
import com.spire.presentation.packages.sprskn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruin;
import com.spire.presentation.packages.sprunn;
import com.spire.presentation.packages.sprvnd;
import com.spire.presentation.packages.sprxy;

@sprtea
public class sprfrn
implements sprxy {
    private sprhln cfr_renamed_3;
    private boolean cfr_renamed_4;

    public void cfr_renamed_11665() {
        this.cfr_renamed_11540(true);
    }

    @sprtea
    public sprrhn cfr_renamed_13058(sprorn arg0) {
        return this.cfr_renamed_13059(arg0, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ sprjqn cfr_renamed_13060(int arg0) {
        switch (arg0) {
            case 1098015074: {
                return sprjqn.cfr_renamed_185;
            }
            case 1132032620: {
                return sprjqn.cfr_renamed_114;
            }
            case 1214603890: {
                return sprjqn.cfr_renamed_2409;
            }
            case 1415671148: {
                return sprjqn.cfr_renamed_1453;
            }
        }
        return sprjqn.cfr_renamed_3033;
    }

    /*
     * WARNING - void declaration
     */
    public sprfrn(byte[] byArray, int n) {
        void arg1;
        this.cfr_renamed_3 = sprhln.cfr_renamed_13053(byArray, (int)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprfrn(String string, int n) {
        void arg1;
        this.cfr_renamed_3 = sprhln.cfr_renamed_13052(string, (int)arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public sprrhn cfr_renamed_13059(sprorn arg0, boolean arg1) {
        sprnjn sprnjn2 = sprfrn.cfr_renamed_13061(arg0);
        try {
            sprskn[] sprsknArray = sprunn.cfr_renamed_13062(arg0.cfr_renamed_13037(), arg0.cfr_renamed_13041(), arg1, sprnjn2.cfr_renamed_13015());
            sprfrn sprfrn2 = this;
            sprfrn2.cfr_renamed_3.cfr_renamed_12990(sprnjn2, sprsknArray);
            sprrhn sprrhn2 = sprfrn2.cfr_renamed_13063(sprnjn2.cfr_renamed_13008(), sprnjn2.cfr_renamed_13007(), arg0.cfr_renamed_12994());
            return sprrhn2;
        }
        finally {
            if (sprnjn2 != null) {
                sprnjn2.dispose();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int cfr_renamed_13064(int arg0) {
        switch (arg0) {
            case 0: {
                return 4;
            }
            case 1: {
                return 5;
            }
            case 2: {
                return 6;
            }
            case 3: {
                return 7;
            }
        }
        return 4;
    }

    public void cfr_renamed_11540(boolean arg0) {
        if (this.cfr_renamed_4) {
            return;
        }
        if (arg0 && this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.cfr_renamed_11665();
        }
        this.cfr_renamed_4 = true;
    }

    @sprtea
    public sprrhn cfr_renamed_13065(sprorn arg0) {
        return this.cfr_renamed_13059(arg0, true);
    }

    private /* synthetic */ sprrhn cfr_renamed_13063(sprmqn[] arg0, sprmmn[] arg1, int arg2) {
        int n;
        if (arg0.length != arg1.length) {
            throw new IllegalArgumentException(sprvnd.cfr_renamed_9(">U\u000f\u001d\u0004H\u0007_\u000fOJR\f\u001d\rQ\u0013M\u0002NJP\u001fN\u001e\u001d\bXJX\u001bH\u000bQJI\u0005\u001d\u001eU\u000f\u001d\u0004H\u0007_\u000fOJR\f\u001d\tU\u000bO\u000b^\u001eX\u0018\u001d\u0003S\u000eT\tX\u0019\u0013"));
        }
        int n2 = arg0.length;
        int[] nArray = new int[n2];
        int[] nArray2 = new int[n2];
        short[] sArray = new short[n2];
        short[] sArray2 = new short[n2];
        short[] sArray3 = new short[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n;
            nArray[n4] = arg0[n4].getCodepoint();
            int n5 = n;
            nArray2[n5] = arg0[n5].getCluster();
            if (arg2 == 2) {
                int n6 = arg1[n].getXOffset();
                int n7 = arg1[n].getYOffset();
                int[] nArray3 = new int[1];
                nArray3[0] = n6;
                int[] nArray4 = nArray3;
                int[] nArray5 = new int[1];
                nArray5[0] = n7;
                int[] nArray6 = nArray5;
                this.cfr_renamed_3.cfr_renamed_13055(arg0[n].getCodepoint(), sprfrn.cfr_renamed_13064(arg2), nArray4, nArray6);
                n6 = nArray4[0];
                n7 = nArray6[0];
                int n8 = n;
                sArray[n8] = -((short)arg1[n8].getYAdvance());
                sArray2[n] = -((short)n7);
                sArray3[n] = -((short)n6);
                arg1[n].setXOffset(n6);
                arg1[n].setYOffset(n7);
            } else {
                int n9 = n;
                sArray[n9] = (short)arg1[n9].getXAdvance();
                int n10 = n;
                sArray2[n10] = (short)arg1[n10].getXOffset();
                int n11 = n;
                sArray3[n11] = (short)arg1[n11].getYOffset();
            }
            n3 = ++n;
        }
        return new sprrhn(nArray, sArray, nArray2, sArray2, sArray3);
    }

    @Override
    public sprpon[][] cfr_renamed_12968(String[] arg0, int arg1, int arg2, int ... arg3) {
        int n;
        if (arg0 == null) {
            throw new NullPointerException(sprahe.cfr_renamed_9(".:\"+)"));
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object object = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            String string = object[n];
            if (string != null) {
                stringBuilder.append(string);
            }
            n3 = ++n;
        }
        object = sprorn.cfr_renamed_13032(stringBuilder.toString(), arg1, arg2, arg3);
        return spruin.cfr_renamed_13048(this.cfr_renamed_13065((sprorn)object), arg0, arg1 == 1);
    }

    private static /* synthetic */ sprnjn cfr_renamed_13061(sprorn arg0) {
        sprnjn sprnjn2 = new sprnjn();
        sprorn sprorn2 = arg0;
        sprnjn sprnjn3 = sprnjn2;
        sprnjn2.cfr_renamed_13005(1);
        sprnjn3.cfr_renamed_13016(sprfrn.cfr_renamed_13064(arg0.cfr_renamed_12994()));
        sprnjn3.cfr_renamed_13017(sprfrn.cfr_renamed_13060(arg0.cfr_renamed_13033()));
        sprnjn2.cfr_renamed_13012(sprorn2.cfr_renamed_13030());
        int n = 0;
        if (sprorn2.cfr_renamed_13042()) {
            n |= 1;
        }
        if (arg0.cfr_renamed_13034()) {
            n |= 2;
        }
        sprnjn sprnjn4 = sprnjn2;
        sprnjn4.cfr_renamed_13019(n);
        sprnjn4.cfr_renamed_13018();
        return sprnjn4;
    }
}

