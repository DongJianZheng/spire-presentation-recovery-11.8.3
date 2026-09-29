/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakn;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprehn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprgs;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprjuaa;
import com.spire.presentation.packages.sprmnp;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.sprytp;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprthn
extends sprvjn
implements sprgs {
    private sprwbp cfr_renamed_82;
    private boolean cfr_renamed_126;
    public boolean cfr_renamed_88;
    private boolean cfr_renamed_31;
    private String cfr_renamed_272;
    private sprwbp cfr_renamed_145;
    public int cfr_renamed_114;
    private sprehn cfr_renamed_96;
    private String cfr_renamed_105;
    private sprxln cfr_renamed_137;
    private sprqgp cfr_renamed_79;
    private boolean cfr_renamed_107;
    private sprpon[] cfr_renamed_132;
    private String cfr_renamed_102;
    private sprphja cfr_renamed_93;
    public boolean cfr_renamed_86;
    public float cfr_renamed_152;
    public float cfr_renamed_112;
    private sprhhp cfr_renamed_119;
    private sprakn cfr_renamed_91;
    private boolean cfr_renamed_0;
    private sprsuja cfr_renamed_1;
    private float cfr_renamed_2;
    public float cfr_renamed_3;
    private String cfr_renamed_4;

    public void cfr_renamed_13728(String arg0) {
        this.cfr_renamed_102 = arg0;
    }

    public sprphja cfr_renamed_2773() {
        if (this.cfr_renamed_93.cfr_renamed_29() && sprznp.cfr_renamed_12328(this.cfr_renamed_105)) {
            this.cfr_renamed_93 = this.cfr_renamed_13257().cfr_renamed_13729(this.cfr_renamed_105);
        }
        return this.cfr_renamed_93;
    }

    public boolean cfr_renamed_13459() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_13730() {
        return this.cfr_renamed_31;
    }

    @Override
    public sprqgp cfr_renamed_13094() {
        return this.cfr_renamed_79;
    }

    public sprthn(sprhhp arg0, sprwbp arg1, sprwbp arg2, sprsuja arg3, String arg4, sprphja arg5, float arg6, boolean arg7) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, null);
    }

    private /* synthetic */ sprtbp cfr_renamed_13731(float[] arg0, sprhhp arg1, sprthn arg2) {
        arg0[0] = arg1.cfr_renamed_13265() / 20.0f;
        return new sprtbp(arg2.cfr_renamed_12553(), arg0[0]);
    }

    public sprqgp cfr_renamed_13467() {
        sprqgp sprqgp2;
        sprqgp sprqgp3 = sprqgp2 = new sprqgp();
        sprqgp2.cfr_renamed_12629(this.cfr_renamed_13110().cfr_renamed_1980(), this.cfr_renamed_13110().spr\u3181());
        sprqgp sprqgp4 = sprqgp2;
        sprqgp3.cfr_renamed_12593(new sprqgp(1.0f, 0.0f, -0.34906584f, 1.0f, 0.0f, 0.0f));
        sprqgp3.cfr_renamed_12629(-this.cfr_renamed_13110().cfr_renamed_1980(), -this.cfr_renamed_13110().spr\u3181());
        return sprqgp3;
    }

    @sprtea
    public sprakn cfr_renamed_12567() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_13732(String arg0) {
        this.cfr_renamed_272 = arg0;
    }

    public sprthn(sprhhp arg0, sprpln arg1, sprsuja arg2, String arg3, float arg4) {
        this(arg0, arg1 instanceof sprghp ? ((sprghp)arg1).cfr_renamed_12553() : sprwbp.cfr_renamed_1513, sprwbp.cfr_renamed_1447, arg2, arg3, arg4);
    }

    public void cfr_renamed_13733(sprwbp arg0) {
        this.cfr_renamed_82 = arg0;
    }

    public String cfr_renamed_13030() {
        if (!sprznp.cfr_renamed_12328(this.cfr_renamed_4) && sprznp.cfr_renamed_12328(this.cfr_renamed_105)) {
            this.cfr_renamed_4 = this.cfr_renamed_13257().cfr_renamed_13261().cfr_renamed_13734(this.cfr_renamed_105);
        }
        return this.cfr_renamed_4;
    }

    public String cfr_renamed_13462() {
        sprthn sprthn2 = this;
        String string = sprthn2.cfr_renamed_13030();
        if (sprthn2.cfr_renamed_0 && string.length() > 0 && sprytp.cfr_renamed_13735(string.charAt(0))) {
            int n;
            Object object;
            boolean bl = false;
            sprtvp sprtvp2 = new sprtvp();
            Object object2 = object = new sprcop(string).iterator();
            while (object2.hasNext()) {
                n = (Integer)object.next();
                sprtvp2.cfr_renamed_12819(n);
                bl |= sprytp.cfr_renamed_13736(n) && sprmnp.cfr_renamed_13737((char)n) == 17;
                object2 = object;
            }
            sprtvp2.cfr_renamed_9979();
            object = new StringBuilder();
            int n2 = n = 0;
            while (n2 < sprtvp2.cfr_renamed_11861()) {
                sprghha.cfr_renamed_12279((StringBuilder)object, sprxsp.cfr_renamed_12396(sprtvp2.cfr_renamed_576(n++)));
                n2 = n;
            }
            String string2 = ((StringBuilder)object).toString();
            return string2;
        }
        return string;
    }

    @sprtea
    public float cfr_renamed_13738() {
        float f = 0.0f;
        if (this.cfr_renamed_13739()) {
            f = this.cfr_renamed_13257().cfr_renamed_13265() * 0.1f;
            return f;
        }
        if (this.cfr_renamed_13730()) {
            f = -1.0f * this.cfr_renamed_13257().cfr_renamed_13265() * 0.6f;
        }
        return f;
    }

    public sprthn(sprhhp arg0, sprwbp arg1, sprwbp arg2, sprsuja arg3, String arg4, float arg5) {
        float f;
        sprphja sprphja2;
        if (arg0 != null) {
            sprphja2 = arg0.cfr_renamed_13729(arg4);
            f = arg5;
        } else {
            sprphja2 = sprphja.cfr_renamed_4;
            f = arg5;
        }
        this(arg0, arg1, arg2, arg3, arg4, sprphja2, f);
    }

    public sprgeja cfr_renamed_8505() {
        return new sprgeja(this.cfr_renamed_13430(), this.cfr_renamed_13342(), this.cfr_renamed_2773().cfr_renamed_1942(), this.cfr_renamed_2773().cfr_renamed_1452());
    }

    public void cfr_renamed_12554(sprwbp arg0) {
        this.cfr_renamed_145 = arg0;
    }

    public String cfr_renamed_13740() {
        return this.cfr_renamed_102;
    }

    public void cfr_renamed_13741(sprhhp arg0) {
        this.cfr_renamed_119 = arg0;
    }

    @sprtea
    public void cfr_renamed_12566(sprakn arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public boolean cfr_renamed_13739() {
        return this.cfr_renamed_126;
    }

    public void cfr_renamed_13699(sprehn arg0) {
        this.cfr_renamed_96 = arg0;
    }

    public sprthn(sprhhp arg0, sprwbp arg1, sprwbp arg2, sprsuja arg3, String arg4, sprphja arg5, float arg6, boolean arg7, sprpon[] arg8) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, false);
    }

    public boolean cfr_renamed_13742() {
        return this.cfr_renamed_107;
    }

    public sprpon[] cfr_renamed_13256() {
        return this.cfr_renamed_132;
    }

    @Override
    public sprxln cfr_renamed_12590() {
        return this.cfr_renamed_137;
    }

    public sprhhp cfr_renamed_13257() {
        return this.cfr_renamed_119;
    }

    public sprsuja cfr_renamed_9494() {
        return new sprsuja(this.cfr_renamed_13430(), this.cfr_renamed_13342());
    }

    public void cfr_renamed_13743(boolean arg0) {
        this.cfr_renamed_31 = arg0;
    }

    public sprwbp cfr_renamed_13268() {
        return this.cfr_renamed_82;
    }

    public float cfr_renamed_13429() {
        return this.cfr_renamed_1.spr\u3181() + this.cfr_renamed_119.cfr_renamed_13744();
    }

    public void cfr_renamed_13745() {
        sprthn sprthn2 = this;
        float f = sprthn2.cfr_renamed_119.cfr_renamed_13746();
        float f2 = sprthn2.cfr_renamed_119.cfr_renamed_13744() / 2.0f;
        if (sprthn2.cfr_renamed_79 == null) {
            sprthn sprthn3 = this;
            sprthn3.cfr_renamed_79 = new sprqgp();
        }
        sprthn sprthn4 = this;
        sprthn4.cfr_renamed_79.cfr_renamed_12629(f, f2);
        sprthn4.cfr_renamed_79.cfr_renamed_13747(270.0f, this.cfr_renamed_13110());
    }

    public String cfr_renamed_13748() {
        return this.cfr_renamed_272;
    }

    @Override
    public sprvjn cfr_renamed_13616() {
        sprthn sprthn2 = (sprthn)super.cfr_renamed_13616();
        if (this.cfr_renamed_13094() != null) {
            sprthn2.cfr_renamed_12511(this.cfr_renamed_13094().cfr_renamed_12099());
        }
        if (this.cfr_renamed_12590() != null) {
            sprthn2.cfr_renamed_12545((sprxln)this.cfr_renamed_12590().cfr_renamed_13616());
        }
        if (this.cfr_renamed_119 != null) {
            sprthn sprthn3 = sprthn2;
            sprthn3.cfr_renamed_119 = new sprhhp(this.cfr_renamed_119.cfr_renamed_13265(), this.cfr_renamed_119.cfr_renamed_13461(), this.cfr_renamed_119.cfr_renamed_13261());
        }
        return sprthn2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cfr_renamed_13121(sprsmn arg0) {
        block22: {
            v0 = this;
            arg0.cfr_renamed_13108(v0);
            if (v0.cfr_renamed_114 <= 0 && !this.cfr_renamed_88 && (this.cfr_renamed_13257().cfr_renamed_13303() & 8) == 0) break block22;
            var2_2 = this.cfr_renamed_86 == false ? this.cfr_renamed_13257() : new sprhhp((float)sprrgga.cfr_renamed_13358(this.cfr_renamed_13257().cfr_renamed_13265() / 0.8f, 1), this.cfr_renamed_13257().cfr_renamed_13303(), this.cfr_renamed_13257().cfr_renamed_13261());
            v1 = this;
            var3_3 = this.cfr_renamed_1.spr\u3181() + this.cfr_renamed_13257().cfr_renamed_13261().cfr_renamed_13749(v1.cfr_renamed_13257().cfr_renamed_13261().cfr_renamed_13491(), this.cfr_renamed_13257().cfr_renamed_13265());
            var4_4 = v1.cfr_renamed_152 != 1.0f ? (float)sprrgga.cfr_renamed_13358(this.cfr_renamed_2773().cfr_renamed_1942() / this.cfr_renamed_152, 2) : this.cfr_renamed_2773().cfr_renamed_1942();
            var5_5 = 0.0f;
            v2 = new float[1];
            v2[0] = var5_5;
            var6_6 = v2;
            v3 = this;
            var7_7 = v3.cfr_renamed_13731(v2, var2_2, v3);
            var5_5 = var6_6[0];
            var8_8 = null;
            if (v3.cfr_renamed_114 == 0) ** GOTO lbl-1000
            switch (this.cfr_renamed_114) {
                case 1: 
                case 3: 
                case 99: {
                    v4 = var2_2;
                    while (false) {
                    }
                    var9_9 = v4.cfr_renamed_13265() / 25.4f;
                    if (v4.cfr_renamed_13750()) {
                        var9_9 *= 1.65f;
                    }
                    if (!var2_2.cfr_renamed_13261().cfr_renamed_13751()) {
                        v5 = var5_5 * 1.5f;
                        v6 = this;
                    } else {
                        v5 = var3_3 + var5_5 * 0.5f;
                        v6 = this;
                    }
                    var10_10 = v5 + v6.cfr_renamed_13110().spr\u3181();
                    var8_8 = sprxln.cfr_renamed_13120(new sprsuja(this.cfr_renamed_13430(), var10_10), new sprsuja(this.cfr_renamed_13430() + var4_4, var10_10));
                    v7 = this;
                    v8 = var8_8;
                    var8_8.cfr_renamed_12511(this.cfr_renamed_13094());
                    v8.cfr_renamed_12505(var7_7);
                    v8.cfr_renamed_13121(arg0);
                    break;
                }
                case 2: 
                case 4: {
                    v9 = var2_2;
                    var9_9 = v9.cfr_renamed_13265() / 10.0f;
                    if (v9.cfr_renamed_13750()) {
                        var9_9 *= 1.65f;
                    }
                    if (!var2_2.cfr_renamed_13261().cfr_renamed_13751()) {
                        v10 = var5_5 * 1.0f;
                        v11 = this;
                    } else {
                        v10 = var3_3;
                        v11 = this;
                    }
                    var10_10 = v10 + v11.cfr_renamed_13110().spr\u3181();
                    v12 = var8_8 = sprxln.cfr_renamed_13120(new sprsuja(this.cfr_renamed_13430(), var10_10), new sprsuja(this.cfr_renamed_13430() + var4_4, var10_10));
                    var8_8.cfr_renamed_12505(var7_7);
                    v12.cfr_renamed_12511(this.cfr_renamed_13094());
                    v12.cfr_renamed_13121(arg0);
                    if (!var2_2.cfr_renamed_13261().cfr_renamed_13751()) {
                        v13 = var5_5 * 2.0f;
                        v14 = this;
                    } else {
                        v13 = var3_3 + var5_5 * 1.0f;
                        v14 = this;
                    }
                    var10_10 = v13 + v14.cfr_renamed_13110().spr\u3181() + 1.0f;
                    v15 = var8_8 = sprxln.cfr_renamed_13120(new sprsuja(this.cfr_renamed_13430(), var10_10), new sprsuja(this.cfr_renamed_13430() + var4_4, var10_10));
                    var8_8.cfr_renamed_12511(this.cfr_renamed_13094());
                    v15.cfr_renamed_12505(var7_7);
                    v15.cfr_renamed_13121(arg0);
                }
                default: lbl-1000:
                // 2 sources

                {
                    v7 = this;
                }
            }
            if (v7.cfr_renamed_88 || (this.cfr_renamed_13257().cfr_renamed_13303() & 8) != 0) {
                if (this.cfr_renamed_88) {
                    v16 = var2_2;
                    if (!var2_2.cfr_renamed_13261().cfr_renamed_13751()) {
                        v17 = v16.cfr_renamed_13752() - var5_5 * 0.5f;
                        v18 = this;
                    } else {
                        v17 = v16.cfr_renamed_13752() - var5_5 * 1.5f;
                        v18 = this;
                    }
                    var9_9 = v17 - v18.cfr_renamed_13110().spr\u3181();
                    v19 = var10_11 = sprxln.cfr_renamed_13120(new sprsuja(this.cfr_renamed_13430(), -var9_9), new sprsuja(this.cfr_renamed_13430() + var4_4, -var9_9));
                    var10_11.cfr_renamed_12511(this.cfr_renamed_13094());
                    v19.cfr_renamed_12505(var7_7);
                    v19.cfr_renamed_13121(arg0);
                    var10_11 = null;
                    v20 = var2_2;
                    if (!var2_2.cfr_renamed_13261().cfr_renamed_13751()) {
                        v21 = v20.cfr_renamed_13752() + var5_5 * 2.0f;
                        v22 = this;
                    } else {
                        v21 = v20.cfr_renamed_13752() + var5_5 * 2.0f;
                        v22 = this;
                    }
                    var9_9 = v21 - v22.cfr_renamed_13110().spr\u3181();
                    v23 = var10_11 = sprxln.cfr_renamed_13120(new sprsuja(this.cfr_renamed_13430(), -var9_9), new sprsuja(this.cfr_renamed_13430() + var4_4, -var9_9));
                    var10_11.cfr_renamed_12511(this.cfr_renamed_13094());
                    v23.cfr_renamed_12505(var7_7);
                    v23.cfr_renamed_13121(arg0);
                    var10_11 = null;
                } else {
                    v24 = var2_2;
                    if (!var2_2.cfr_renamed_13261().cfr_renamed_13751()) {
                        v25 = v24.cfr_renamed_13752() - var5_5 * 0.5f;
                        v26 = this;
                    } else {
                        v25 = v24.cfr_renamed_13752() - var5_5 * 1.5f;
                        v26 = this;
                    }
                    var9_9 = v25 - v26.cfr_renamed_13110().spr\u3181();
                    v27 = var10_12 = sprxln.cfr_renamed_13120(new sprsuja(this.cfr_renamed_13430(), -var9_9), new sprsuja(this.cfr_renamed_13430() + var4_4, -var9_9));
                    var10_12.cfr_renamed_12511(this.cfr_renamed_13094());
                    v27.cfr_renamed_12505(var7_7);
                    v27.cfr_renamed_13121(arg0);
                    var10_12 = null;
                }
            }
            var7_7 = null;
        }
    }

    public float cfr_renamed_13342() {
        return this.cfr_renamed_1.spr\u3181() - this.cfr_renamed_119.cfr_renamed_13746();
    }

    public void cfr_renamed_13598(sprphja arg0) {
        this.cfr_renamed_93 = arg0;
    }

    public sprthn(sprhhp arg0, sprwbp arg1, sprsuja arg2, String arg3) {
        this(arg0, arg1, sprwbp.cfr_renamed_1447, arg2, arg3, 0.0f);
    }

    public sprehn cfr_renamed_13252() {
        return this.cfr_renamed_96;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_13753(String string, float f) {
        void arg1;
        void arg0;
        sprthn sprthn2 = this;
        sprthn2.cfr_renamed_4 = this.cfr_renamed_13030() + (String)arg0;
        sprthn2.cfr_renamed_93 = new sprphja(this.cfr_renamed_93.cfr_renamed_1942() + arg1, this.cfr_renamed_93.cfr_renamed_1452());
    }

    public void cfr_renamed_12511(sprqgp arg0) {
        this.cfr_renamed_79 = arg0;
    }

    public sprwbp cfr_renamed_12553() {
        return this.cfr_renamed_145;
    }

    public sprsuja cfr_renamed_13110() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprthn(sprhhp sprhhp2, sprwbp sprwbp2, sprwbp sprwbp3, sprsuja sprsuja2, String string, sprphja sprphja2, float f, boolean bl, sprpon[] sprponArray, boolean bl2) {
        void arg9;
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        sprthn sprthn2;
        void arg3;
        void arg1;
        void arg0;
        void arg4;
        void arg2;
        sprthn sprthn3 = this;
        sprthn sprthn4 = this;
        sprthn sprthn5 = this;
        sprthn sprthn6 = this;
        sprthn6.cfr_renamed_114 = 0;
        sprthn6.cfr_renamed_88 = false;
        sprthn5.cfr_renamed_86 = false;
        sprthn5.cfr_renamed_152 = 1.0f;
        sprthn4.cfr_renamed_1 = sprsuja.cfr_renamed_13377();
        sprthn4.cfr_renamed_93 = sprphja.cfr_renamed_4;
        sprthn4.cfr_renamed_4 = "";
        sprthn3.cfr_renamed_112 = 0.0f;
        sprthn3.cfr_renamed_3 = 0.0f;
        if (sprwbp2 == null) {
            throw new NullPointerException("color");
        }
        if (arg2 == null) {
            throw new NullPointerException(sprjuaa.cfr_renamed_9("\u001c7\u0007.\u001a,\u0016\u0001\u001c.\u001c0"));
        }
        if (arg4 == null) {
            throw new NullPointerException("text");
        }
        sprthn sprthn7 = this;
        this.cfr_renamed_119 = arg0;
        sprthn7.cfr_renamed_145 = arg1;
        sprthn7.cfr_renamed_82 = arg2;
        this.cfr_renamed_1 = arg3;
        if (arg0 == null) {
            sprthn2 = this;
            this.cfr_renamed_105 = arg4;
        } else {
            sprthn2 = this;
            this.cfr_renamed_4 = arg0.cfr_renamed_13261().cfr_renamed_13734((String)arg4);
        }
        sprthn2.cfr_renamed_93 = arg5;
        sprthn sprthn8 = this;
        sprthn sprthn9 = this;
        sprthn9.cfr_renamed_2 = arg6;
        sprthn9.cfr_renamed_0 = arg7;
        sprthn8.cfr_renamed_132 = arg8;
        sprthn8.cfr_renamed_107 = arg9;
    }

    public sprthn(sprhhp arg0, sprwbp arg1, sprwbp arg2, sprsuja arg3, String arg4, sprphja arg5, float arg6) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    public void cfr_renamed_13754(boolean arg0) {
        this.cfr_renamed_126 = arg0;
    }

    public void cfr_renamed_13755() {
        sprthn sprthn2 = this;
        sprthn2.cfr_renamed_4 = "";
        sprthn2.cfr_renamed_105 = "";
        sprthn2.cfr_renamed_93 = sprphja.cfr_renamed_4;
    }

    public float cfr_renamed_13259() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_13109(sprsuja arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_12545(sprxln arg0) {
        this.cfr_renamed_137 = arg0;
    }

    public float cfr_renamed_13430() {
        return this.cfr_renamed_1.cfr_renamed_1980();
    }
}

