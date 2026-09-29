/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprkth;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmuaa;
import com.spire.presentation.packages.sprnoh;
import com.spire.presentation.packages.sprooz;
import com.spire.presentation.packages.sproth;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.sprweh;
import java.math.BigInteger;

public class spraph
extends sprqsh {
    public sprkth cfr_renamed_91;
    private static final int cfr_renamed_0 = 6;
    private static final sprlsh[] cfr_renamed_4;

    public static /* synthetic */ sprlsh[] cfr_renamed_2413() {
        return cfr_renamed_4;
    }

    @Override
    public sprlsh cfr_renamed_1652(BigInteger arg0) {
        return new sprnoh(arg0);
    }

    @Override
    public spreuh cfr_renamed_8923(sprlsh arg0, sprlsh arg1) {
        return new sprkth(this, arg0, arg1);
    }

    @Override
    public spreuh cfr_renamed_8917(sprlsh arg0, sprlsh arg1, sprlsh[] arg2) {
        return new sprkth(this, arg0, arg1, arg2);
    }

    public int cfr_renamed_2117() {
        return 0;
    }

    public boolean cfr_renamed_1024() {
        return true;
    }

    @Override
    public boolean cfr_renamed_1841() {
        return false;
    }

    @Override
    public spreuh cfr_renamed_1770() {
        return this.cfr_renamed_91;
    }

    public spraph() {
        spraph spraph2 = this;
        super(409, 87, 0, 0);
        spraph spraph3 = this;
        this.cfr_renamed_91 = new sprkth(this, null, null);
        this.cfr_renamed_79 = this.cfr_renamed_1652(BigInteger.valueOf(1L));
        this.cfr_renamed_93 = this.cfr_renamed_1652(new BigInteger(1, sprfqe.cfr_renamed_5217(sprooz.cfr_renamed_9("WhUi&m$j$`\"\u001d^\u001e\"\u001aR\u001bS\u001a^\u0019PmT\u001aP\u001aSoQ\u001aP\u001e#nSjU\u001d!i!k#\u001cQoSoQi!\u0019^a#n&\u001bUo$`&a&i^o%jPj_jU\u001eQ\u001b#mP\u0019Rm&\u0019S\u001eRh&\u001dTiP\u001aVkRlR\u001e"))));
        this.cfr_renamed_4 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprmuaa.cfr_renamed_9("\u000eI\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eH\u000eI{J\u007f9zN\u007fN\u000fJxK\rK\u000eO|=\u000b>\u007fL\t;\r;\u0007=\u000eM\f>\u0006K\u0006I\bL}<\rOzA\u007fJ\u000fI\tK")));
        spraph2.cfr_renamed_107 = BigInteger.valueOf(2L);
        spraph2.cfr_renamed_152 = 6;
    }

    @Override
    public int cfr_renamed_1938() {
        return 409;
    }

    public int cfr_renamed_1186() {
        return 409;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_1875(int arg0) {
        switch (arg0) {
            case 6: {
                return true;
            }
        }
        return false;
    }

    public int cfr_renamed_2116() {
        return 0;
    }

    static {
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = new sprnoh(sprck.cfr_renamed_4);
        cfr_renamed_4 = sprlshArray;
    }

    @Override
    public sprgxh cfr_renamed_2001() {
        return new spraph();
    }

    @Override
    public sprfk cfr_renamed_8945(spreuh[] arg0, int arg1, int arg2) {
        int n;
        long[] lArray = new long[arg2 * 7 * 2];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            spreuh spreuh2 = arg0[arg1 + n];
            sprweh.cfr_renamed_8537(((sprnoh)spreuh2.cfr_renamed_1953()).cfr_renamed_4, 0, lArray, n2);
            sprweh.cfr_renamed_8537(((sprnoh)spreuh2.cfr_renamed_1954()).cfr_renamed_4, 0, lArray, n2 += 7);
            n3 = ++n;
            n2 += 7;
        }
        return new sproth(this, arg2, lArray);
    }

    public int cfr_renamed_2115() {
        return 87;
    }
}

