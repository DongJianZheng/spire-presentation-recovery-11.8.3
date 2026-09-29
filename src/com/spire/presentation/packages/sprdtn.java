/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdao;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsdo;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprdtn
extends sprqqe {
    private sprupm cfr_renamed_91;
    private sprdao cfr_renamed_0;
    private sprgbf cfr_renamed_1;
    private sprjfn cfr_renamed_2;
    private sprsdo cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public sprjfn cfr_renamed_15377() {
        return this.cfr_renamed_2;
    }

    public sprdtn cfr_renamed_15378(sprjfn arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprdtn(sprszm sprszm2) {
        sprco sprco2;
        Iterator<sprco> iterator = sprszm2.iterator();
        boolean bl = iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(iterator2.next());
        Iterator<sprco> iterator3 = iterator;
        iterator2.hasNext();
        this.cfr_renamed_3 = sprsdo.cfr_renamed_23(iterator.next());
        iterator3.hasNext();
        Iterator<sprco> iterator4 = iterator;
        this.cfr_renamed_2 = sprjfn.cfr_renamed_23(iterator4.next());
        iterator4.hasNext();
        Iterator<sprco> iterator5 = iterator;
        this.cfr_renamed_1 = sprgbf.cfr_renamed_23(iterator5.next());
        iterator5.hasNext();
        Iterator<sprco> iterator6 = iterator;
        this.cfr_renamed_91 = sprupm.cfr_renamed_23(iterator6.next());
        iterator6.hasNext();
        if (iterator3.hasNext() && (sprco2 = iterator.next()) instanceof sprnvm) {
            this.cfr_renamed_0 = sprdao.cfr_renamed_23(spresca.cfr_renamed_11777(sprco2, sprnvm.class).cfr_renamed_8122());
        }
    }

    public sprdtn cfr_renamed_15379(sprupm arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public sprupm cfr_renamed_15380() {
        return this.cfr_renamed_91;
    }

    public sprdtn cfr_renamed_15381(sprgbf arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public static sprdtn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdtn) {
            return (sprdtn)arg0;
        }
        if (arg0 != null) {
            return new sprdtn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprsdo cfr_renamed_15382() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprdtn cfr_renamed_15384(byte[] byArray) {
        void arg0;
        this.cfr_renamed_1 = new sprdye((byte[])arg0);
        return this;
    }

    public sprdtn cfr_renamed_15385(sprsdo arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprdao cfr_renamed_15386() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    public sprdtn() {
    }

    public sprdtn cfr_renamed_15387(sprktm arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprdtn cfr_renamed_15389(String string) {
        void arg0;
        this.cfr_renamed_91 = new sprnrm((String)arg0);
        return this;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    public sprgbf cfr_renamed_15390() {
        return this.cfr_renamed_1;
    }

    public sprdtn cfr_renamed_15391(sprdao arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprdtn(sprktm sprktm2, sprsdo sprsdo2, sprjfn sprjfn2, sprgbf sprgbf2, sprupm sprupm2, sprdao sprdao2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprdtn sprdtn2 = this;
        sprdtn sprdtn3 = this;
        sprdtn sprdtn4 = this;
        sprdtn4.cfr_renamed_4 = arg0;
        sprdtn4.cfr_renamed_3 = arg1;
        sprdtn3.cfr_renamed_2 = arg2;
        sprdtn3.cfr_renamed_1 = arg3;
        sprdtn2.cfr_renamed_91 = arg4;
        sprdtn2.cfr_renamed_0 = sprdao2;
    }
}

