/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraof;
import com.spire.presentation.packages.sprdjf;
import com.spire.presentation.packages.sprhnf;
import com.spire.presentation.packages.sprhxa;
import com.spire.presentation.packages.sprjqf;
import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprsez;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.sprvkf;
import com.spire.presentation.packages.sprxjf;
import java.io.Serializable;
import java.util.Stack;

public class sprrof
implements Serializable,
Cloneable {
    private int cfr_renamed_119;
    private sprknf cfr_renamed_91;
    private final int cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private static final long cfr_renamed_3 = 1L;
    private boolean cfr_renamed_4;

    public void cfr_renamed_5893(Stack<sprknf> arg0, spraof arg1, byte[] arg2, byte[] arg3, sprrqf arg4) {
        sprrof sprrof2;
        if (arg4 == null) {
            throw new NullPointerException(sprhxa.cfr_renamed_9("X\u000eD2V\t_;S\u001eE\u001fD\t\u0017G\nZY\u000f[\u0016"));
        }
        if (this.cfr_renamed_2 || !this.cfr_renamed_4) {
            throw new IllegalStateException(sprsez.cfr_renamed_9("\u0000\u0005\b\u0005\u0015\u0004\u0003\bF\u0003\u0014L\b\u0003\u0012L\u000f\u0002\u000f\u0018\u000f\r\n\u0005\u001c\t\u0002"));
        }
        arg4 = (sprrqf)((sprtsf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(arg4.cfr_renamed_5734())).cfr_renamed_5735(arg4.cfr_renamed_5736())).cfr_renamed_5776(this.cfr_renamed_119).cfr_renamed_5873(arg4.cfr_renamed_5877()).cfr_renamed_5874(arg4.cfr_renamed_5875()).cfr_renamed_5745(arg4.cfr_renamed_5746())).cfr_renamed_1451();
        sprdjf sprdjf2 = (sprdjf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(arg4.cfr_renamed_5734())).cfr_renamed_5735(arg4.cfr_renamed_5736())).cfr_renamed_5737(this.cfr_renamed_119).cfr_renamed_1451();
        sprjqf sprjqf2 = (sprjqf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(arg4.cfr_renamed_5734())).cfr_renamed_5735(arg4.cfr_renamed_5736())).cfr_renamed_5739(this.cfr_renamed_119).cfr_renamed_1451();
        spraof spraof2 = arg1;
        spraof2.cfr_renamed_5766(arg1.cfr_renamed_5767(arg3, arg4), arg2);
        sprknf sprknf2 = sprvkf.cfr_renamed_5742(spraof2, spraof2.cfr_renamed_5880(arg4), sprdjf2);
        Stack<sprknf> stack = arg0;
        while (!stack.isEmpty() && arg0.peek().cfr_renamed_1452() == sprknf2.cfr_renamed_1452() && arg0.peek().cfr_renamed_1452() != this.cfr_renamed_0) {
            sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(sprjqf2.cfr_renamed_5747()).cfr_renamed_5739((sprjqf2.cfr_renamed_5744() - 1) / 2).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
            sprknf2 = sprvkf.cfr_renamed_5748(arg1, arg0.pop(), sprknf2, sprjqf2);
            sprknf2 = new sprknf(sprknf2.cfr_renamed_1452() + 1, sprknf2.cfr_renamed_97());
            sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(sprjqf2.cfr_renamed_5747() + 1).cfr_renamed_5739(sprjqf2.cfr_renamed_5744()).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
            stack = arg0;
        }
        if (this.cfr_renamed_91 == null) {
            sprrof2 = this;
            this.cfr_renamed_91 = sprknf2;
        } else if (this.cfr_renamed_91.cfr_renamed_1452() == sprknf2.cfr_renamed_1452()) {
            sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(sprjqf2.cfr_renamed_5747()).cfr_renamed_5739((sprjqf2.cfr_renamed_5744() - 1) / 2).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
            sprknf2 = sprvkf.cfr_renamed_5748(arg1, this.cfr_renamed_91, sprknf2, sprjqf2);
            this.cfr_renamed_91 = sprknf2 = new sprknf(this.cfr_renamed_91.cfr_renamed_1452() + 1, sprknf2.cfr_renamed_97());
            sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(sprjqf2.cfr_renamed_5747() + 1).cfr_renamed_5739(sprjqf2.cfr_renamed_5744()).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
            sprrof2 = this;
        } else {
            arg0.push(sprknf2);
            sprrof2 = this;
        }
        if (sprrof2.cfr_renamed_91.cfr_renamed_1452() == this.cfr_renamed_0) {
            this.cfr_renamed_2 = true;
            return;
        }
        this.cfr_renamed_1 = sprknf2.cfr_renamed_1452();
        ++this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_5894(int n) {
        void arg0;
        sprrof sprrof2 = this;
        this.cfr_renamed_91 = null;
        this.cfr_renamed_1 = this.cfr_renamed_0;
        this.cfr_renamed_119 = arg0;
        sprrof2.cfr_renamed_4 = true;
        sprrof2.cfr_renamed_2 = false;
    }

    public int cfr_renamed_1452() {
        if (!this.cfr_renamed_4 || this.cfr_renamed_2) {
            return Integer.MAX_VALUE;
        }
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_5895() {
        return this.cfr_renamed_119;
    }

    public sprrof cfr_renamed_1316() {
        sprrof sprrof2 = new sprrof(this.cfr_renamed_0);
        sprrof sprrof3 = this;
        sprrof sprrof4 = sprrof2;
        sprrof4.cfr_renamed_91 = this.cfr_renamed_91;
        sprrof4.cfr_renamed_1 = this.cfr_renamed_1;
        sprrof2.cfr_renamed_119 = sprrof3.cfr_renamed_119;
        sprrof2.cfr_renamed_4 = sprrof3.cfr_renamed_4;
        sprrof2.cfr_renamed_2 = this.cfr_renamed_2;
        return sprrof2;
    }

    public boolean cfr_renamed_5896() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprrof(int n) {
        void arg0;
        sprrof sprrof2 = this;
        this.cfr_renamed_0 = arg0;
        sprrof2.cfr_renamed_4 = false;
        sprrof2.cfr_renamed_2 = false;
    }

    public sprknf cfr_renamed_5897() {
        return this.cfr_renamed_91;
    }

    public boolean cfr_renamed_5898() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_5899(sprknf sprknf2) {
        void arg0;
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_1 = sprknf2.cfr_renamed_1452();
        if (this.cfr_renamed_1 == this.cfr_renamed_0) {
            this.cfr_renamed_2 = true;
        }
    }
}

