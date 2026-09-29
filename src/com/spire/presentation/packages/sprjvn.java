/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgen;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprjvn
extends sprqqe {
    private sprgen cfr_renamed_112;
    public static sprktm cfr_renamed_119;
    private sprgen cfr_renamed_91;
    private sprszm cfr_renamed_0;
    private sprgen cfr_renamed_1;
    public static sprktm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprkgn cfr_renamed_4;

    public sprjvn cfr_renamed_15446(sprgen arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprjvn(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        Iterator<sprco> iterator3 = iterator;
        this.cfr_renamed_4 = sprkgn.cfr_renamed_23(iterator3.next());
        iterator3.hasNext();
        Iterator<sprco> iterator4 = iterator;
        this.cfr_renamed_0 = sprszm.cfr_renamed_23(iterator4.next());
        iterator4.hasNext();
        Iterator<sprco> iterator5 = iterator;
        this.cfr_renamed_1 = sprgen.cfr_renamed_23(iterator5.next());
        iterator5.hasNext();
        Iterator<sprco> iterator6 = iterator;
        this.cfr_renamed_112 = sprgen.cfr_renamed_23(iterator6.next());
        iterator6.hasNext();
        this.cfr_renamed_91 = sprgen.cfr_renamed_23(iterator.next());
    }

    static {
        cfr_renamed_2 = new sprktm(1L);
        cfr_renamed_119 = new sprktm(1L);
    }

    /*
     * WARNING - void declaration
     */
    public sprjvn cfr_renamed_5986(int n) {
        void arg0;
        this.cfr_renamed_3 = new sprktm((long)arg0);
        return this;
    }

    public sprkgn cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public static sprjvn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjvn) {
            return (sprjvn)arg0;
        }
        if (arg0 != null) {
            return new sprjvn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgen cfr_renamed_15414() {
        return this.cfr_renamed_1;
    }

    public sprjvn cfr_renamed_14968(sprgen arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprjvn(sprktm sprktm2, sprkgn sprkgn2, sprszm sprszm2, sprgen sprgen2, sprgen sprgen3, sprgen sprgen4) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprjvn sprjvn2 = this;
        sprjvn sprjvn3 = this;
        sprjvn sprjvn4 = this;
        sprjvn4.cfr_renamed_3 = arg0;
        sprjvn4.cfr_renamed_4 = arg1;
        sprjvn3.cfr_renamed_0 = arg2;
        sprjvn3.cfr_renamed_1 = arg3;
        sprjvn2.cfr_renamed_112 = arg4;
        sprjvn2.cfr_renamed_91 = sprgen4;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public sprjvn cfr_renamed_15447(sprszm arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sprszm cfr_renamed_15416() {
        return this.cfr_renamed_0;
    }

    public sprjvn cfr_renamed_15448(sprgen arg0) {
        this.cfr_renamed_112 = arg0;
        return this;
    }

    public sprgen cfr_renamed_15419() {
        return this.cfr_renamed_91;
    }

    public sprgen cfr_renamed_15410() {
        return this.cfr_renamed_112;
    }

    public sprjvn cfr_renamed_15418(sprktm arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprjvn cfr_renamed_15449(String string) {
        void arg0;
        this.cfr_renamed_4 = new spraen((String)arg0);
        return this;
    }

    public sprjvn cfr_renamed_15409(sprkgn arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public sprjvn() {
    }

    public sprktm cfr_renamed_324() {
        return this.cfr_renamed_3;
    }
}

