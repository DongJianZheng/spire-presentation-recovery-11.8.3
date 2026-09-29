/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprown;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

@sprtea
public class sprzzn
extends sprqqe {
    private sproug cfr_renamed_119;
    private sprown cfr_renamed_91;
    private sprgbf cfr_renamed_0;
    private sprgbf cfr_renamed_1;
    private sprupm cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprlem cfr_renamed_4;

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public sprzzn cfr_renamed_15393(sproug arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }

    @sprtea
    public void cfr_renamed_15429(sproen arg0) {
    }

    public sprupm cfr_renamed_15380() {
        return this.cfr_renamed_2;
    }

    public sprzzn(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        iterator.hasNext();
        Iterator<sprco> iterator2 = iterator;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(iterator2.next());
        iterator2.hasNext();
        Iterator<sprco> iterator3 = iterator;
        this.cfr_renamed_91 = sprown.cfr_renamed_23(iterator3.next());
        iterator3.hasNext();
        Iterator<sprco> iterator4 = iterator;
        this.cfr_renamed_1 = sprgbf.cfr_renamed_23(iterator4.next());
        iterator4.hasNext();
        Iterator<sprco> iterator5 = iterator;
        this.cfr_renamed_0 = sprgbf.cfr_renamed_23(iterator5.next());
        iterator5.hasNext();
        Iterator<sprco> iterator6 = iterator;
        this.cfr_renamed_2 = sprupm.cfr_renamed_23(iterator6.next());
        iterator6.hasNext();
        Iterator<sprco> iterator7 = iterator;
        this.cfr_renamed_119 = sproug.cfr_renamed_23(iterator7.next());
        iterator7.hasNext();
        this.cfr_renamed_4 = sprlem.cfr_renamed_23(iterator.next());
    }

    public sproug cfr_renamed_8455() {
        return this.cfr_renamed_119;
    }

    public sprzzn cfr_renamed_15434(sprlem arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public static sprzzn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzzn) {
            return (sprzzn)arg0;
        }
        if (arg0 != null) {
            return new sprzzn(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprzzn cfr_renamed_15381(sprgbf arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sprzzn cfr_renamed_15435(sprown arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprzzn(sprktm sprktm2, sprown sprown2, sprgbf sprgbf2, sprgbf sprgbf3, sprupm sprupm2, sproug sproug2, sprlem sprlem2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprzzn sprzzn2 = this;
        sprzzn sprzzn3 = this;
        sprzzn sprzzn4 = this;
        this.cfr_renamed_3 = arg0;
        sprzzn4.cfr_renamed_91 = arg1;
        sprzzn4.cfr_renamed_1 = arg2;
        sprzzn3.cfr_renamed_0 = arg3;
        sprzzn3.cfr_renamed_2 = arg4;
        sprzzn2.cfr_renamed_119 = arg5;
        sprzzn2.cfr_renamed_4 = sprlem2;
    }

    public sprzzn cfr_renamed_15387(sprktm arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprzzn() {
    }

    public sprzzn cfr_renamed_15379(sprupm arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprzzn cfr_renamed_15436(sprgbf arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprgbf cfr_renamed_15377() {
        return this.cfr_renamed_1;
    }

    public sprlem cfr_renamed_89() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    public sprown cfr_renamed_15382() {
        return this.cfr_renamed_91;
    }

    public sprgbf cfr_renamed_15390() {
        return this.cfr_renamed_0;
    }
}

