/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruun;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class spreyn
extends sprqqe {
    private sprkgn cfr_renamed_152;
    private sprktm cfr_renamed_112;
    private sprjfn cfr_renamed_119;
    private sprktm cfr_renamed_91;
    private sprjfn cfr_renamed_0;
    public static sprktm cfr_renamed_1;
    private sprjfn cfr_renamed_2;
    public static sprktm cfr_renamed_3;
    private spruun cfr_renamed_4;

    public sprktm cfr_renamed_15408() {
        return this.cfr_renamed_112;
    }

    public spreyn cfr_renamed_15409(sprkgn arg0) {
        this.cfr_renamed_152 = arg0;
        return this;
    }

    public sprjfn cfr_renamed_15410() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public spreyn cfr_renamed_15411(sprjfn arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    public sprktm cfr_renamed_324() {
        return this.cfr_renamed_91;
    }

    public spreyn cfr_renamed_15412(sprktm arg0) {
        this.cfr_renamed_112 = arg0;
        return this;
    }

    public spreyn cfr_renamed_15413(spruun arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprjfn cfr_renamed_15414() {
        return this.cfr_renamed_119;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public static spreyn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spreyn) {
            return (spreyn)arg0;
        }
        if (arg0 != null) {
            return new spreyn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprkgn cfr_renamed_313() {
        return this.cfr_renamed_152;
    }

    public spreyn cfr_renamed_15415(sprjfn arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public spruun cfr_renamed_15416() {
        return this.cfr_renamed_4;
    }

    public spreyn cfr_renamed_15417(sprjfn arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public spreyn cfr_renamed_15418(sprktm arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public sprjfn cfr_renamed_15419() {
        return this.cfr_renamed_2;
    }

    public spreyn() {
    }

    /*
     * WARNING - void declaration
     */
    public spreyn(sprktm sprktm2, sprkgn sprkgn2, sprktm sprktm3, spruun spruun2, sprjfn sprjfn2, sprjfn sprjfn3, sprjfn sprjfn4) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spreyn spreyn2 = this;
        spreyn spreyn3 = this;
        spreyn spreyn4 = this;
        this.cfr_renamed_91 = arg0;
        spreyn4.cfr_renamed_152 = arg1;
        spreyn4.cfr_renamed_112 = arg2;
        spreyn3.cfr_renamed_4 = arg3;
        spreyn3.cfr_renamed_119 = arg4;
        spreyn2.cfr_renamed_0 = arg5;
        spreyn2.cfr_renamed_2 = sprjfn4;
    }

    public spreyn(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_91 = sprktm.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        Iterator<sprco> iterator3 = iterator;
        this.cfr_renamed_152 = sprkgn.cfr_renamed_23(iterator3.next());
        iterator3.hasNext();
        Iterator<sprco> iterator4 = iterator;
        this.cfr_renamed_112 = sprktm.cfr_renamed_23(iterator4.next());
        iterator4.hasNext();
        Iterator<sprco> iterator5 = iterator;
        this.cfr_renamed_4 = spruun.cfr_renamed_15420(this.cfr_renamed_112, iterator5.next());
        iterator5.hasNext();
        Iterator<sprco> iterator6 = iterator;
        this.cfr_renamed_119 = sprjfn.cfr_renamed_23(iterator6.next());
        iterator6.hasNext();
        Iterator<sprco> iterator7 = iterator;
        this.cfr_renamed_0 = sprjfn.cfr_renamed_23(iterator7.next());
        iterator7.hasNext();
        this.cfr_renamed_2 = sprjfn.cfr_renamed_23(iterator.next());
    }

    static {
        cfr_renamed_3 = new sprktm(1L);
        cfr_renamed_1 = new sprktm(2L);
    }
}

