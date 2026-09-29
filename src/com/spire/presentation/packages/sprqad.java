/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbe;
import com.spire.presentation.packages.spref;
import com.spire.presentation.packages.sprxn;
import java.security.SecureRandom;

public class sprqad
extends SecureRandom {
    private final boolean cfr_renamed_0;
    private spref cfr_renamed_1;
    private final sprbe cfr_renamed_2;
    private final SecureRandom cfr_renamed_3;
    private final sprxn cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 ^ 5);
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
    public void nextBytes(byte[] arg0) {
        sprqad sprqad2 = this;
        synchronized (sprqad2) {
            if (this.cfr_renamed_1 == null) {
                this.cfr_renamed_1 = this.cfr_renamed_4.cfr_renamed_2423(this.cfr_renamed_2);
            }
            if (this.cfr_renamed_1.cfr_renamed_3298(arg0, null, this.cfr_renamed_0) < 0) {
                sprqad sprqad3 = this;
                this.cfr_renamed_1.cfr_renamed_3299(sprqad3.cfr_renamed_2.cfr_renamed_3300());
                sprqad3.cfr_renamed_1.cfr_renamed_3298(arg0, null, this.cfr_renamed_0);
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprqad(SecureRandom secureRandom, sprbe sprbe2, sprxn sprxn2, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        sprqad sprqad2 = this;
        sprqad sprqad3 = this;
        sprqad3.cfr_renamed_3 = arg0;
        sprqad3.cfr_renamed_2 = arg1;
        sprqad2.cfr_renamed_4 = arg2;
        sprqad2.cfr_renamed_0 = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setSeed(byte[] arg0) {
        sprqad sprqad2 = this;
        synchronized (sprqad2) {
            if (this.cfr_renamed_3 != null) {
                this.cfr_renamed_3.setSeed(arg0);
            }
            return;
        }
    }

    @Override
    public byte[] generateSeed(int arg0) {
        byte[] byArray = new byte[arg0];
        this.nextBytes(byArray);
        return byArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setSeed(long arg0) {
        sprqad sprqad2 = this;
        synchronized (sprqad2) {
            if (this.cfr_renamed_3 != null) {
                this.cfr_renamed_3.setSeed(arg0);
            }
            return;
        }
    }
}

