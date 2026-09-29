/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraho;
import com.spire.presentation.packages.sprbgo;
import com.spire.presentation.packages.sprbio;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprdmo;
import com.spire.presentation.packages.sprffo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprijo;
import com.spire.presentation.packages.sprjln;
import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprphn;
import com.spire.presentation.packages.sprpio;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqed;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqoo;
import com.spire.presentation.packages.sprqqo;
import com.spire.presentation.packages.sprqwo;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprumo;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwlo;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxrc;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprtio {
    private sprggo cfr_renamed_3;
    public static final int cfr_renamed_4 = Integer.MAX_VALUE;

    public sprxln cfr_renamed_16566(sprgeja arg0, float arg1, float arg2, int arg3, sprumo arg4) {
        sprxln sprxln2 = sprqoo.cfr_renamed_16384(arg0, arg1, arg2);
        return this.cfr_renamed_16729(sprxln2, arg3, arg4);
    }

    public sprmrn cfr_renamed_16623(String arg0, sprgeja arg1, int arg2, sprumo arg3, int arg4) {
        sprpio sprpio2 = (sprpio)this.cfr_renamed_16558().cfr_renamed_576(arg4);
        if (sprpio2 == null) {
            return null;
        }
        sprhhp sprhhp2 = sprpio2.cfr_renamed_16630(this.cfr_renamed_3);
        sprdmo sprdmo2 = (sprdmo)this.cfr_renamed_16558().cfr_renamed_576(arg2);
        if (sprdmo2 == null) {
            sprdmo2 = new sprdmo();
        }
        sprpln sprpln2 = arg3.cfr_renamed_16724();
        String string = sprwlo.cfr_renamed_16339(16412);
        if (sprdmo2.cfr_renamed_16551()) {
            this.cfr_renamed_3.cfr_renamed_16557(sprxrc.cfr_renamed_9("m]X\\K\u0014K[\u001fXZRK\u0014[]MQ\\@V[Q\u0014Y[M\u0014\u0018O\u000fI\u0018\u0014MQ\\[MP\u001f]L\u0014Q[K\u0014LAODPFKQ[\u001a"), string);
        }
        spraho spraho2 = new spraho(arg0, sprdmo2, sprpln2, sprhhp2, sprpio2.cfr_renamed_16709());
        float f = sprdmo2.cfr_renamed_16541() || arg1.cfr_renamed_1942() == 0.0f ? Float.MAX_VALUE : arg1.cfr_renamed_1942();
        float f2 = sprdmo2.cfr_renamed_16541() || arg1.cfr_renamed_1452() == 0.0f ? Float.MAX_VALUE : arg1.cfr_renamed_1452();
        sprphja sprphja2 = new sprphja(f, f2);
        sprgeja sprgeja2 = arg1;
        if (sprdmo2.cfr_renamed_16556()) {
            sprphja2 = new sprphja(sprphja2.cfr_renamed_1452(), sprphja2.cfr_renamed_1942());
            sprgeja2 = new sprgeja(sprgeja2.cfr_renamed_9494(), new sprphja(sprgeja2.cfr_renamed_1452(), sprgeja2.cfr_renamed_1942()));
        }
        sprqqo sprqqo2 = new sprqqo();
        sprqqo2.cfr_renamed_16730(spraho2, new sprffo(sprphja2, sprgeja2, sprdmo2, this.cfr_renamed_3.cfr_renamed_13400()));
        sprmrn sprmrn2 = sprqqo2.cfr_renamed_16731();
        if (sprdmo2.cfr_renamed_16556()) {
            if (sprmrn2.cfr_renamed_13094() == null) {
                sprmrn2.cfr_renamed_12511(new sprqgp());
            }
            sprmrn sprmrn3 = sprmrn2;
            sprmrn3.cfr_renamed_13094().cfr_renamed_13747(90.0f, arg1.cfr_renamed_9494());
            sprmrn3.cfr_renamed_13094().cfr_renamed_13466(arg1.cfr_renamed_1942(), 0.0f, 1);
        }
        if (!sprdmo2.cfr_renamed_16537() && !arg1.cfr_renamed_29()) {
            sprmrn sprmrn4;
            sprmrn sprmrn5 = sprmrn4 = new sprmrn();
            sprmrn5.cfr_renamed_12545(sprxln.cfr_renamed_13253(arg1));
            sprmrn5.cfr_renamed_12507(sprmrn2);
            sprmrn2 = sprmrn4;
        }
        return sprmrn2;
    }

    public sprxln cfr_renamed_16622(sprsuja[] arg0, float arg1, int arg2, sprumo arg3) {
        sprxln sprxln2 = sprqoo.cfr_renamed_16386(arg0, arg1);
        return this.cfr_renamed_16729(sprxln2, arg2, arg3);
    }

    public sprbio cfr_renamed_16558() {
        return this.cfr_renamed_3.cfr_renamed_16558();
    }

    private static /* synthetic */ void cfr_renamed_16732(sprxln arg0, sprumo arg1) {
        if (arg1 == null) {
            arg0.cfr_renamed_12550(null);
            return;
        }
        arg0.cfr_renamed_12550(arg1.cfr_renamed_16724());
    }

    public sprxln cfr_renamed_16579(sprgeja arg0, float arg1, float arg2, int arg3, sprumo arg4) {
        sprxln sprxln2 = sprqoo.cfr_renamed_16381(arg0, arg1, arg2);
        return this.cfr_renamed_16729(sprxln2, arg3, arg4);
    }

    public sprvjn cfr_renamed_16583(sprsuja[] arg0, boolean arg1, int arg2, sprumo arg3) {
        sprxln sprxln2 = sprqoo.cfr_renamed_16388(arg0, arg1);
        return this.cfr_renamed_16733(sprxln2, arg2, arg3);
    }

    public sprvjn cfr_renamed_16617(int arg0, int arg1, sprumo arg2) {
        sprxln sprxln2 = (sprxln)this.cfr_renamed_16558().cfr_renamed_576(arg0);
        if (sprxln2 == null) {
            return null;
        }
        sprxln2 = sprxln2.cfr_renamed_12099();
        return this.cfr_renamed_16733(sprxln2, arg1, arg2);
    }

    public static sprmrn cfr_renamed_16632(String arg0, sprhhp arg1, sprsuja[] arg2, sprumo arg3, int arg4, sprqgp arg5) {
        Iterator iterator;
        int n;
        Iterator iterator2;
        Object object;
        if (arg5.cfr_renamed_15005() == 0.0) {
            return null;
        }
        if (!sprznp.cfr_renamed_12328(arg0)) {
            return null;
        }
        sprpln sprpln2 = arg3.cfr_renamed_16724();
        if ((arg4 & 2) != 0) {
            arg5.cfr_renamed_16587(90.0f);
            new sprqgp(1.0f, 0.0f, 0.0f, 1.0f, -arg1.cfr_renamed_13744(), 0.0f).cfr_renamed_13184(arg2);
        }
        arg5.cfr_renamed_14487().cfr_renamed_13184(arg2);
        sprktp sprktp2 = new sprktp();
        if ((arg4 & 4) != 0) {
            object = arg2[0];
            iterator2 = new sprcop(arg0).iterator();
            Iterator iterator3 = iterator2;
            while (iterator3.hasNext()) {
                n = (Integer)iterator2.next();
                sprktp2.cfr_renamed_13516((sprsuja)object);
                float f = arg1.cfr_renamed_14982(n);
                object = new sprsuja(((sprsuja)object).cfr_renamed_1980() + f, ((sprsuja)object).spr\u3181());
                iterator3 = iterator2;
            }
        } else {
            int n2 = 0;
            Iterator iterator4 = iterator2 = new sprcop(arg0).iterator();
            while (iterator4.hasNext()) {
                n = (Integer)iterator2.next();
                int n3 = n2;
                sprktp2.cfr_renamed_13516(arg2[n3]);
                n2 = n3 + (sprxsp.cfr_renamed_13307(n) ? 2 : 1);
                iterator4 = iterator2;
            }
        }
        object = new sprmrn();
        ((sprmrn)object).cfr_renamed_12511(arg5);
        int n4 = 0;
        Iterator iterator5 = iterator = new sprcop(arg0).iterator();
        while (iterator5.hasNext()) {
            int n5 = (Integer)iterator.next();
            sprsuja sprsuja2 = sprktp2.cfr_renamed_576(n4);
            ++n4;
            sprthn sprthn2 = new sprthn(arg1, sprpln2, sprsuja2, sprxsp.cfr_renamed_12396(n5), 0.0f);
            iterator5 = iterator;
            ((sprkmn)object).cfr_renamed_12507(sprthn2);
        }
        return object;
    }

    public sprxln cfr_renamed_16577(sprgeja[] arg0, int arg1, sprumo arg2) {
        int n;
        sprxln sprxln2 = new sprxln();
        sprgeja[] sprgejaArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprgeja sprgeja2 = sprgejaArray[n];
            sprxln2.cfr_renamed_12507(sprlsn.cfr_renamed_13253(sprgeja2));
            n3 = ++n;
        }
        return this.cfr_renamed_16729(sprxln2, arg1, arg2);
    }

    public sprmrn cfr_renamed_16620(sprijo arg0, sprgeja arg1, int arg2, sprsuja[] arg3) {
        sprmrn sprmrn2;
        arg1 = this.cfr_renamed_3.cfr_renamed_16559().cfr_renamed_16527(arg1, arg2);
        sprmrn sprmrn3 = sprmrn2 = new sprmrn();
        sprmrn2.cfr_renamed_12507(arg0.cfr_renamed_16708());
        sprgeja sprgeja2 = arg1;
        sprmrn2.cfr_renamed_12511(sprqgp.cfr_renamed_16734(sprgeja2, arg3));
        sprmrn3.cfr_renamed_12545(sprxln.cfr_renamed_13253(sprgeja2));
        return sprmrn3;
    }

    public sprtio(sprggo sprggo2) {
        this.cfr_renamed_3 = sprggo2;
    }

    private /* synthetic */ sprxln cfr_renamed_16729(sprxln arg0, int arg1, sprumo arg2) {
        return (sprxln)this.cfr_renamed_16576(arg0, arg1, arg2, false);
    }

    public sprvjn cfr_renamed_16635(sprsuja[] arg0, int arg1, int arg2, float arg3, int arg4) {
        sprxln sprxln2 = sprqoo.cfr_renamed_16387(arg0, arg1, arg2, arg3);
        return this.cfr_renamed_16733(sprxln2, arg4, null);
    }

    private /* synthetic */ sprvjn cfr_renamed_16733(sprxln arg0, int arg1, sprumo arg2) {
        return this.cfr_renamed_16576(arg0, arg1, arg2, true);
    }

    public sprvjn cfr_renamed_16625(sprsuja[] arg0, int arg1, sprumo arg2) {
        sprxln sprxln2 = sprqoo.cfr_renamed_16389(arg0);
        return this.cfr_renamed_16733(sprxln2, arg1, arg2);
    }

    private /* synthetic */ sprvjn cfr_renamed_16576(sprxln arg0, int arg1, sprumo arg2, boolean arg3) {
        if (arg0 == null) {
            return null;
        }
        sprtio.cfr_renamed_16732(arg0, arg2);
        this.cfr_renamed_16735(arg0, arg1);
        if (!arg3) {
            return arg0;
        }
        return this.cfr_renamed_16736(arg0);
    }

    public sprmrn cfr_renamed_16636(sprijo arg0, sprgeja arg1, int arg2, sprgeja arg3) {
        sprmrn sprmrn2;
        arg1 = this.cfr_renamed_3.cfr_renamed_16559().cfr_renamed_16527(arg1, arg2);
        sprmrn sprmrn3 = sprmrn2 = new sprmrn();
        sprmrn2.cfr_renamed_12507(arg0.cfr_renamed_16708());
        sprgeja sprgeja2 = arg1;
        sprmrn2.cfr_renamed_12511(sprqgp.cfr_renamed_16234(sprgeja2, arg3));
        sprmrn3.cfr_renamed_12545(sprxln.cfr_renamed_13253(sprgeja2));
        return sprmrn3;
    }

    private /* synthetic */ sprvjn cfr_renamed_16736(sprxln arg0) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.cfr_renamed_12571() == null) {
            return arg0;
        }
        sprwvn sprwvn2 = new sprwvn();
        sprxln sprxln2 = arg0;
        sprphn.cfr_renamed_13956(sprwvn2, sprxln2, sprxln2.cfr_renamed_12571().cfr_renamed_16686());
        if (sprwvn2.size() == 0) {
            return arg0;
        }
        sprxln sprxln3 = arg0;
        arg0 = sprjln.cfr_renamed_14044(sprxln3, sprxln3.cfr_renamed_12571().cfr_renamed_16686());
        sprmrn sprmrn2 = new sprmrn();
        sprmrn2.cfr_renamed_12507(arg0);
        Iterator iterator = sprwvn2.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            sprxln sprxln4 = (sprxln)iterator.next();
            iterator2 = iterator;
            sprmrn2.cfr_renamed_12507(sprxln4);
        }
        return sprmrn2;
    }

    public sprxln cfr_renamed_16629(int arg0, sprumo arg1) {
        sprhbja sprhbja2 = (sprhbja)this.cfr_renamed_16558().cfr_renamed_576(arg0);
        if (sprhbja2 == null) {
            return null;
        }
        sprxln sprxln2 = sprqwo.cfr_renamed_16444(sprhbja2);
        sprtio.cfr_renamed_16732(sprxln2, arg1);
        return sprxln2;
    }

    private /* synthetic */ void cfr_renamed_16735(sprxln arg0, int arg1) {
        sprbgo sprbgo2;
        if (arg1 == Integer.MAX_VALUE) {
            arg0.cfr_renamed_12505(null);
            return;
        }
        sprbgo sprbgo3 = sprbgo2 = (sprbgo)this.cfr_renamed_16558().cfr_renamed_576(arg1);
        arg0.cfr_renamed_12505(sprbgo3.cfr_renamed_16644());
        if (sprbgo3.cfr_renamed_16642() && !sprbgo2.cfr_renamed_16645()) {
            this.cfr_renamed_3.cfr_renamed_16561(sprqed.cfr_renamed_9("/B\f\u007f\u0006Z\u0019\u007f\u000fAJ@\bE\u000fL\u001e\u000f\u001f\\\u000f\\JZ\u0004\\\u001f_\u001a@\u0018[\u000fKJI\u000fN\u001eZ\u0018J\u0019\u0001"));
            sprbgo2.cfr_renamed_16643(true);
        }
    }

    public sprxln cfr_renamed_16618(sprgeja arg0, int arg1, sprumo arg2) {
        sprxln sprxln2 = sprqoo.cfr_renamed_16380(arg0);
        return this.cfr_renamed_16729(sprxln2, arg1, arg2);
    }
}

