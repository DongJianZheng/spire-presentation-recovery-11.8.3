/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrgk;
import com.spire.presentation.packages.sprumk;
import java.security.SecureRandom;

public class sprxik
extends SecureRandom {
    private final boolean cfr_renamed_2;
    private final sprrgk cfr_renamed_3;
    private final SecureRandom cfr_renamed_4;

    @Override
    public byte[] generateSeed(int arg0) {
        return sprumk.cfr_renamed_9951(this.cfr_renamed_3.cfr_renamed_9952(), arg0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void nextBytes(byte[] arg0) {
        sprxik sprxik2 = this;
        synchronized (sprxik2) {
            if (this.cfr_renamed_3.cfr_renamed_9953(arg0, this.cfr_renamed_2) < 0) {
                sprxik sprxik3 = this;
                sprxik3.cfr_renamed_3.cfr_renamed_9954();
                sprxik3.cfr_renamed_3.cfr_renamed_9953(arg0, this.cfr_renamed_2);
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprxik(SecureRandom secureRandom, sprrgk sprrgk2, boolean bl) {
        void arg1;
        void arg0;
        sprxik sprxik2 = this;
        this.cfr_renamed_4 = arg0;
        sprxik2.cfr_renamed_3 = arg1;
        sprxik2.cfr_renamed_2 = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setSeed(byte[] arg0) {
        sprxik sprxik2 = this;
        synchronized (sprxik2) {
            if (this.cfr_renamed_4 != null) {
                this.cfr_renamed_4.setSeed(arg0);
            }
            return;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (2 ^ 5) << 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setSeed(long arg0) {
        sprxik sprxik2 = this;
        synchronized (sprxik2) {
            if (this.cfr_renamed_4 != null) {
                this.cfr_renamed_4.setSeed(arg0);
            }
            return;
        }
    }
}

