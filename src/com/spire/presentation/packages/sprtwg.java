/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprycn;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sprtwg {
    private sprszm cfr_renamed_2;
    private String cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 3 << 1;
        int cfr_ignored_0 = 4 << 3 ^ 2;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4;
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

    public String cfr_renamed_2458() {
        return this.cfr_renamed_3;
    }

    public sprtwg(String arg0, Set<sprlem> arg1) {
        this(arg0, arg1, null);
    }

    private /* synthetic */ Set<sprlem> cfr_renamed_7522(sprszm arg0) {
        if (arg0 != null) {
            Enumeration enumeration;
            HashSet<sprlem> hashSet = new HashSet<sprlem>(arg0.cfr_renamed_84());
            Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
            while (enumeration2.hasMoreElements()) {
                Enumeration enumeration3 = enumeration;
                enumeration2 = enumeration3;
                hashSet.add(sprlem.cfr_renamed_23(enumeration3.nextElement()));
            }
            return hashSet;
        }
        return Collections.EMPTY_SET;
    }

    private /* synthetic */ sprszm cfr_renamed_7523(Set<sprlem> arg0) {
        Iterator<sprlem> iterator;
        if (arg0 == null || arg0.isEmpty()) {
            return null;
        }
        sprrvm sprrvm2 = new sprrvm();
        Iterator<sprlem> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            sprrvm2.cfr_renamed_5004(iterator.next());
            iterator2 = iterator;
        }
        return new sprcen(sprrvm2);
    }

    public sprtwg(Set<sprlem> arg0) {
        this(null, arg0, null);
    }

    public Set<sprlem> cfr_renamed_7524() {
        sprtwg sprtwg2 = this;
        return sprtwg2.cfr_renamed_7522(sprtwg2.cfr_renamed_2);
    }

    public Set<sprlem> cfr_renamed_7525() {
        sprtwg sprtwg2 = this;
        return sprtwg2.cfr_renamed_7522(sprtwg2.cfr_renamed_4);
    }

    public sprszm cfr_renamed_7494() {
        sprrvm sprrvm2 = new sprrvm();
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new spraen(this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtwg(String string, Set<sprlem> set, Set<sprlem> set2) {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_2 = this.cfr_renamed_7523((Set<sprlem>)arg1);
        this.cfr_renamed_4 = this.cfr_renamed_7523(set2);
    }

    public sprtwg(byte[] byArray) {
        Enumeration enumeration = sprszm.cfr_renamed_23(byArray).cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            sprco sprco2 = (sprco)enumeration.nextElement();
            if (sprco2 instanceof sprszm) {
                this.cfr_renamed_2 = sprszm.cfr_renamed_23(sprco2);
                continue;
            }
            if (sprco2 instanceof sprnvm) {
                this.cfr_renamed_4 = sprszm.cfr_renamed_5085((sprnvm)sprco2, false);
                continue;
            }
            if (!(sprco2 instanceof sprkgn)) continue;
            this.cfr_renamed_3 = sprkgn.cfr_renamed_23(sprco2).cfr_renamed_314();
        }
    }
}

