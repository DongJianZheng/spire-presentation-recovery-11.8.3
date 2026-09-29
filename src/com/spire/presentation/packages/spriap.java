/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceo;
import com.spire.presentation.packages.sprclja;
import com.spire.presentation.packages.sprdlja;
import com.spire.presentation.packages.sprdrja;
import com.spire.presentation.packages.sprfqja;
import com.spire.presentation.packages.sprfrja;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprgmja;
import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.spricja;
import com.spire.presentation.packages.sprlrn;
import com.spire.presentation.packages.sprlwy;
import com.spire.presentation.packages.sprmqja;
import com.spire.presentation.packages.sprmrja;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprpgja;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrkja;
import com.spire.presentation.packages.sprsro;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtnn;
import com.spire.presentation.packages.sprvdja;
import com.spire.presentation.packages.sprvkja;
import com.spire.presentation.packages.sprvoja;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwgp;
import com.spire.presentation.packages.sprwuja;
import com.spire.presentation.packages.sprxpja;
import com.spire.presentation.packages.sprxt;
import com.spire.presentation.packages.sprylp;
import com.spire.presentation.packages.sprytja;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprzrja;
import com.spire.presentation.packages.sprzuja;
import com.spire.presentation.packages.sprzyo;

@sprtea
public class spriap {
    private static final int cfr_renamed_3 = 100;
    private static final int cfr_renamed_4 = 100;

    private static /* synthetic */ void cfr_renamed_17781(sprpip arg0, sprrkja arg1) {
        int n;
        if (arg0.cfr_renamed_14742() == null) {
            return;
        }
        sprzuja[] sprzujaArray = new sprzuja[arg0.cfr_renamed_14742().length / 2];
        int n2 = n = 0;
        while (n2 < sprzujaArray.length) {
            sprzuja sprzuja2;
            sprzuja sprzuja3 = sprzuja2 = new sprzuja();
            sprpip sprpip2 = arg0;
            sprzuja3.cfr_renamed_17782(sprpip2.cfr_renamed_14742()[n * 2].cfr_renamed_12795());
            int n3 = n++;
            sprzuja3.cfr_renamed_17783(sprpip2.cfr_renamed_14742()[n3 * 2 + 1].cfr_renamed_12795());
            sprzujaArray[n3] = sprzuja2;
            n2 = n;
        }
        arg1.cfr_renamed_17784(sprzujaArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ spricja cfr_renamed_17785(sprgdp arg0) {
        sprwuja sprwuja2;
        sprwuja sprwuja3;
        block6: {
            block5: {
                sprwuja3 = new sprwuja(arg0.cfr_renamed_12644(), arg0.cfr_renamed_12645().cfr_renamed_12795(), arg0.cfr_renamed_12646().cfr_renamed_12795(), 0.0f);
                sprfqja sprfqja2 = sprsro.cfr_renamed_16358(arg0.cfr_renamed_12672());
                try {
                    sprwuja3.cfr_renamed_17786(sprfqja2);
                    if (sprfqja2 == null) break block5;
                    sprwuja2 = sprwuja3;
                    sprfqja2.dispose();
                    break block6;
                }
                catch (Throwable throwable) {
                    if (sprfqja2 != null) {
                        sprfqja2.dispose();
                    }
                    throw throwable;
                }
            }
            sprwuja2 = sprwuja3;
        }
        sprwuja2.cfr_renamed_13862(arg0.cfr_renamed_13337());
        if (arg0.cfr_renamed_14164() != null) {
            sprwuja3.cfr_renamed_17787(spriap.cfr_renamed_17788(arg0));
        }
        if (arg0.cfr_renamed_12779() != null) {
            sprwuja3.cfr_renamed_17789(spriap.cfr_renamed_17790(arg0, false));
        }
        return sprwuja3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprpip cfr_renamed_14589(sprgdp arg0, sprgeja arg1) {
        sprgdp sprgdp2 = arg0;
        sprqgp sprqgp2 = sprgdp2.cfr_renamed_12672();
        sprgdp2.cfr_renamed_12643(null);
        sprwuja sprwuja2 = (sprwuja)spriap.cfr_renamed_16964(sprgdp2);
        try {
            sprgeja sprgeja2 = sprwuja2.cfr_renamed_12644();
            sprpip sprpip2 = spriap.cfr_renamed_17791(sprgeja2, sprwuja2, null);
            sprqgp sprqgp3 = spriap.cfr_renamed_17792(sprgeja2, arg1, sprqgp2);
            sprpip sprpip3 = sprpip2;
            sprpip2.cfr_renamed_12672().cfr_renamed_12634(sprqgp3, 1);
            sprpip3.cfr_renamed_13862(3);
            arg0.cfr_renamed_12643(sprqgp2);
            sprpip sprpip4 = sprpip3;
            return sprpip4;
        }
        finally {
            if (sprwuja2 != null) {
                sprwuja2.dispose();
            }
        }
    }

    private static /* synthetic */ void cfr_renamed_17793(sprpip arg0, sprrkja arg1) {
        if (arg0.cfr_renamed_13509() == -3.4028235E38f) {
            return;
        }
        sprytja sprytja2 = new sprytja();
        if (sprsto.cfr_renamed_13225(arg0.cfr_renamed_12510()) == 9) {
            int n;
            int n2 = n = 0;
            while (n2 < 4) {
                int n3 = n++;
                sprytja2.cfr_renamed_17794(n3, n3, arg0.cfr_renamed_13509());
                n2 = n;
            }
        } else {
            sprytja2.cfr_renamed_17794(3, 3, arg0.cfr_renamed_13509());
        }
        arg1.cfr_renamed_17795(sprytja2, 0, 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ sprvkja cfr_renamed_17796(sprlrn arg0, sprgeja arg1) {
        sprvyo sprvyo2;
        block19: {
            sprvyo sprvyo3;
            block18: {
                sprgeja sprgeja2;
                sprwbp sprwbp2;
                sprvyo3 = new sprvyo(100, 100);
                if (arg0.cfr_renamed_12779() != null && arg0.cfr_renamed_12779().length > 0) {
                    sprwbp2 = arg0.cfr_renamed_12779()[0].cfr_renamed_12553();
                    sprgeja2 = arg1;
                } else if (arg0.cfr_renamed_13868() != null && arg0.cfr_renamed_13868().length > 0) {
                    sprwbp2 = arg0.cfr_renamed_13868()[0];
                    sprgeja2 = arg1;
                } else {
                    sprwbp2 = arg0.cfr_renamed_13867();
                    sprgeja2 = arg1;
                }
                sprqgp sprqgp2 = sprqgp.cfr_renamed_16234(sprgeja2, new sprgeja(0.0f, 0.0f, sprvyo3.cfr_renamed_1942(), sprvyo3.cfr_renamed_1452()));
                if (arg0.cfr_renamed_12672() != null) {
                    sprqgp2.cfr_renamed_12634(arg0.cfr_renamed_12672(), 0);
                }
                sprzyo sprzyo2 = new sprzyo(sprvyo3);
                try {
                    Object object;
                    sprceo sprceo2;
                    sprzyo2.cfr_renamed_13994(sprwbp2, 0.0f, 0.0f, sprvyo3.cfr_renamed_1942(), sprvyo3.cfr_renamed_1452());
                    sprwbp sprwbp3 = sprwbp.cfr_renamed_13681(sprwbp2, sprwbp.cfr_renamed_2786) ? sprwbp.cfr_renamed_1513 : sprwbp.cfr_renamed_2786;
                    sprceo sprceo3 = sprceo2 = new sprceo();
                    arg0.cfr_renamed_6493().cfr_renamed_13121(sprceo3);
                    sprdrja sprdrja2 = sprceo3.cfr_renamed_15204();
                    try {
                        sprfrja sprfrja2;
                        block16: {
                            block15: {
                                object = sprzyo2.cfr_renamed_15026();
                                ((sprfrja)object).cfr_renamed_16975(2);
                                sprfqja sprfqja2 = sprsro.cfr_renamed_16358(sprqgp2);
                                try {
                                    ((sprfrja)object).cfr_renamed_16948(sprfqja2);
                                    if (sprfqja2 == null) break block15;
                                    sprfrja2 = object;
                                    sprfqja2.dispose();
                                    break block16;
                                }
                                catch (Throwable throwable) {
                                    if (sprfqja2 != null) {
                                        sprfqja2.dispose();
                                    }
                                    throw throwable;
                                }
                            }
                            sprfrja2 = object;
                        }
                        sprfrja2.cfr_renamed_16986(new sprpgja(sprwbp3.cfr_renamed_12795()), sprdrja2);
                    }
                    finally {
                        if (sprdrja2 != null) {
                            sprdrja2.dispose();
                        }
                    }
                    Object object2 = object = new sprylp();
                    sprwbp sprwbp4 = sprwbp3;
                    ((sprylp)object2).cfr_renamed_14016(new sprwgp(sprwbp4, sprwbp4));
                    sprvyo3.cfr_renamed_13991((sprylp)object2);
                    if (sprzyo2 == null) break block18;
                    sprvyo2 = sprvyo3;
                    sprzyo2.cfr_renamed_11665();
                    break block19;
                }
                catch (Throwable throwable) {
                    if (sprzyo2 != null) {
                        sprzyo2.cfr_renamed_11665();
                    }
                    throw throwable;
                }
            }
            sprvyo2 = sprvyo3;
        }
        return sprvyo2.cfr_renamed_17658();
    }

    private static /* synthetic */ sprqgp cfr_renamed_17792(sprgeja arg0, sprgeja arg1, sprqgp arg2) {
        double d = 1.0E-4;
        if (spryxp.cfr_renamed_13672(arg0.cfr_renamed_1942(), arg1.cfr_renamed_1942(), d) && spryxp.cfr_renamed_13672(arg0.cfr_renamed_1452(), arg1.cfr_renamed_1452(), d) || spryxp.cfr_renamed_13672(arg0.cfr_renamed_1942(), arg1.cfr_renamed_1452(), d) && spryxp.cfr_renamed_13672(arg0.cfr_renamed_1452(), arg1.cfr_renamed_1942(), d)) {
            return arg2;
        }
        sprqgp sprqgp2 = new sprqgp();
        sprgeja sprgeja2 = arg0;
        float f = sprgeja2.cfr_renamed_1942() / arg1.cfr_renamed_1942();
        float f2 = sprgeja2.cfr_renamed_1452() / arg1.cfr_renamed_1452();
        sprqgp sprqgp3 = sprqgp2;
        sprqgp2.cfr_renamed_13255(f, f2, 1);
        sprqgp3.cfr_renamed_13466(arg0.cfr_renamed_1980(), arg0.spr\u3181(), 1);
        sprqgp3.cfr_renamed_12634(arg2, 1);
        return sprqgp3;
    }

    private static /* synthetic */ void cfr_renamed_17797(sprlrn arg0, sprxpja arg1) {
        int n;
        if (arg0.cfr_renamed_13868() == null) {
            return;
        }
        sprmqja[] sprmqjaArray = new sprmqja[arg0.cfr_renamed_13868().length];
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13868().length) {
            int n3 = n++;
            sprmqjaArray[n3] = arg0.cfr_renamed_13868()[n3].cfr_renamed_12795();
            n2 = n;
        }
        arg1.cfr_renamed_17798(sprmqjaArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprvdja cfr_renamed_17799(sprgmja arg0, sprgeja arg1, sprrkja arg2) {
        sprvkja sprvkja2 = new sprvkja(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452());
        sprvkja2.cfr_renamed_17665(arg0.cfr_renamed_14217(), arg0.cfr_renamed_14218());
        sprfrja sprfrja2 = sprfrja.cfr_renamed_17708(sprvkja2);
        try {
            sprgmja sprgmja2 = arg0;
            sprfrja2.cfr_renamed_17714(sprgmja2, 0, 0, sprgmja2.cfr_renamed_1942(), arg0.cfr_renamed_1452());
            return new sprvdja((sprgmja)sprvkja2, arg1, arg2);
        }
        finally {
            if (sprfrja2 != null) {
                sprfrja2.dispose();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static spricja cfr_renamed_16964(sprpln arg0) {
        switch (arg0.cfr_renamed_13338()) {
            case 0: {
                return spriap.cfr_renamed_17800((sprghp)arg0);
            }
            case 1: {
                return spriap.cfr_renamed_17801((sprhlp)arg0);
            }
            case 2: {
                return spriap.cfr_renamed_17802((sprpip)arg0);
            }
            case 3: {
                return spriap.cfr_renamed_17785((sprgdp)arg0);
            }
            case 4: {
                return spriap.cfr_renamed_17803((sprlrn)arg0);
            }
        }
        throw new IllegalStateException(sprlwy.cfr_renamed_9("0X\u000eX\nA\u000b\u0016\u0007D\u0010E\r\u0016\u0011O\u0015SK"));
    }

    private static /* synthetic */ spricja cfr_renamed_17800(sprghp arg0) {
        return new sprpgja(arg0.cfr_renamed_12553().cfr_renamed_12795());
    }

    private static /* synthetic */ spricja cfr_renamed_17801(sprhlp arg0) {
        return new sprmrja(arg0.cfr_renamed_12678(), arg0.cfr_renamed_12675().cfr_renamed_12795(), arg0.cfr_renamed_12676().cfr_renamed_12795());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprvdja cfr_renamed_17804(sprgmja arg0, sprgeja arg1, sprrkja arg2) {
        try {
            return arg2 == null ? new sprvdja(arg0, arg1) : new sprvdja(arg0, arg1, arg2);
        }
        catch (Exception exception) {
            return spriap.cfr_renamed_17799(arg0, arg1, arg2);
        }
    }

    private static /* synthetic */ sprdlja cfr_renamed_17790(sprtnn arg0, boolean arg1) {
        sprdlja sprdlja2;
        int n;
        sprmqja[] sprmqjaArray = new sprmqja[arg0.cfr_renamed_12779().length];
        float[] fArray = new float[arg0.cfr_renamed_12779().length];
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_12779().length) {
            int n3 = n;
            sprmqjaArray[n3] = arg0.cfr_renamed_12779()[n3].cfr_renamed_12553().cfr_renamed_12795();
            int n4 = n++;
            fArray[n4] = arg0.cfr_renamed_12779()[n4].cfr_renamed_3274();
            n2 = n;
        }
        sprdlja sprdlja3 = sprdlja2 = new sprdlja();
        sprdlja3.cfr_renamed_17805(sprmqjaArray);
        sprdlja3.cfr_renamed_17806(fArray);
        return sprdlja3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ spricja cfr_renamed_17802(sprpip arg0) {
        sprrkja sprrkja2 = new sprrkja();
        try {
            sprvdja sprvdja2;
            sprvdja sprvdja3;
            block14: {
                block13: {
                    sprpip sprpip2;
                    Object object;
                    block12: {
                        block11: {
                            boolean bl = arg0.cfr_renamed_14742() != null;
                            boolean bl2 = arg0.cfr_renamed_13509() >= 0.0f && arg0.cfr_renamed_13509() < 1.0f;
                            spriap.cfr_renamed_17781(arg0, sprrkja2);
                            if (!bl && bl2) {
                                spriap.cfr_renamed_17793(arg0, sprrkja2);
                            }
                            sprgmja sprgmja2 = sprgmja.cfr_renamed_4930(new sprpdja(arg0.cfr_renamed_12510()));
                            try {
                                sprpip sprpip3 = arg0;
                                object = spriap.cfr_renamed_17807(sprpip3, sprgmja2);
                                sprvdja3 = spriap.cfr_renamed_17808(sprpip3, sprgmja2, (sprgeja)object, sprrkja2, bl && bl2);
                                if (sprgmja2 == null) break block11;
                                sprpip2 = arg0;
                                sprgmja2.dispose();
                                break block12;
                            }
                            catch (Throwable throwable) {
                                if (sprgmja2 != null) {
                                    sprgmja2.dispose();
                                }
                                throw throwable;
                            }
                        }
                        sprpip2 = arg0;
                    }
                    object = sprsro.cfr_renamed_16358(sprpip2.cfr_renamed_12672());
                    try {
                        sprvdja3.cfr_renamed_16948((sprfqja)object);
                        if (object == null) break block13;
                        sprvdja2 = sprvdja3;
                        ((sprfqja)object).dispose();
                        break block14;
                    }
                    catch (Throwable throwable) {
                        if (object != null) {
                            ((sprfqja)object).dispose();
                        }
                        throw throwable;
                    }
                }
                sprvdja2 = sprvdja3;
            }
            sprvdja2.cfr_renamed_13862(arg0.cfr_renamed_13337());
            sprvdja sprvdja4 = sprvdja3;
            return sprvdja4;
        }
        finally {
            if (sprrkja2 != null) {
                sprrkja2.dispose();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ spricja cfr_renamed_17803(sprlrn arg0) {
        sprceo sprceo2;
        sprceo sprceo3 = sprceo2 = new sprceo();
        arg0.cfr_renamed_6493().cfr_renamed_13121(sprceo3);
        sprdrja sprdrja2 = sprceo3.cfr_renamed_15204();
        try {
            sprxpja sprxpja2;
            sprxpja sprxpja3;
            block9: {
                block8: {
                    sprxpja3 = new sprxpja(sprdrja2);
                    sprlrn sprlrn2 = arg0;
                    sprxpja3.cfr_renamed_13596(sprlrn2.cfr_renamed_13552());
                    if (sprlrn2.cfr_renamed_13867() != null) {
                        sprxpja3.cfr_renamed_17809(arg0.cfr_renamed_13867().cfr_renamed_12795());
                    }
                    sprfqja sprfqja2 = sprsro.cfr_renamed_16358(arg0.cfr_renamed_12672());
                    try {
                        sprxpja3.cfr_renamed_17786(sprfqja2);
                        if (sprfqja2 == null) break block8;
                        sprxpja2 = sprxpja3;
                        sprfqja2.dispose();
                        break block9;
                    }
                    catch (Throwable throwable) {
                        if (sprfqja2 == null) throw throwable;
                        sprfqja2.dispose();
                        throw throwable;
                    }
                }
                sprxpja2 = sprxpja3;
            }
            sprxpja2.cfr_renamed_13862(arg0.cfr_renamed_13337());
            if (arg0.cfr_renamed_12779() != null) {
                sprxpja3.cfr_renamed_17789(spriap.cfr_renamed_17790(arg0, true));
            }
            spriap.cfr_renamed_17797(arg0, sprxpja3);
            sprxpja sprxpja4 = sprxpja3;
            return sprxpja4;
        }
        finally {
            if (sprdrja2 != null) {
                sprdrja2.dispose();
            }
        }
    }

    private static /* synthetic */ sprgeja cfr_renamed_17807(sprpip arg0, sprgmja arg1) {
        if (sprgeja.cfr_renamed_13775(arg0.cfr_renamed_13533(), sprgeja.cfr_renamed_4)) {
            return new sprgeja(0.0f, 0.0f, arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452());
        }
        return arg0.cfr_renamed_13533();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprpip cfr_renamed_17791(sprgeja arg0, spricja arg1, sprvkja arg2) {
        sprvkja sprvkja2 = arg2 == null ? new sprvkja(100, 100) : arg2;
        try {
            Object object;
            sprvkja sprvkja3 = sprvkja2;
            sprvkja3.cfr_renamed_17665(96.0f, 96.0f);
            sprqgp sprqgp2 = sprqgp.cfr_renamed_16234(arg0, new sprgeja(0.0f, 0.0f, sprvkja2.cfr_renamed_1942(), sprvkja2.cfr_renamed_1452()));
            sprfrja sprfrja2 = sprfrja.cfr_renamed_17708(sprvkja3);
            try {
                sprfrja sprfrja3;
                block15: {
                    block14: {
                        sprfrja2.cfr_renamed_16975(2);
                        object = sprsro.cfr_renamed_16358(sprqgp2);
                        try {
                            sprfrja2.cfr_renamed_16948((sprfqja)object);
                            if (object == null) break block14;
                            sprfrja3 = sprfrja2;
                            ((sprfqja)object).dispose();
                            break block15;
                        }
                        catch (Throwable throwable) {
                            if (object == null) throw throwable;
                            ((sprfqja)object).dispose();
                            throw throwable;
                        }
                    }
                    sprfrja3 = sprfrja2;
                }
                sprfrja3.cfr_renamed_17810(arg1, arg0);
            }
            finally {
                if (sprfrja2 != null) {
                    sprfrja2.dispose();
                }
            }
            sprpdja sprpdja2 = new sprpdja();
            try {
                sprvkja2.cfr_renamed_17811(sprpdja2, sprclja.cfr_renamed_17703());
                object = sprmvo.cfr_renamed_12452(sprpdja2);
            }
            finally {
                if (sprpdja2 != null) {
                    sprpdja2.cfr_renamed_2637();
                }
            }
            sprpip sprpip2 = new sprpip((byte[])object);
            sprpip2.cfr_renamed_12643(sprqgp2.cfr_renamed_14487());
            sprpip sprpip3 = sprpip2;
            return sprpip3;
        }
        finally {
            if (sprvkja2 != null) {
                sprvkja2.dispose();
            }
        }
    }

    private /* synthetic */ spriap() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprvdja cfr_renamed_17808(sprpip arg0, sprgmja arg1, sprgeja arg2, sprrkja arg3, boolean arg4) {
        sprgeja sprgeja2;
        sprgmja sprgmja2;
        sprvkja sprvkja2;
        sprzuja[] sprzujaArray;
        sprxt sprxt2;
        sprvkja sprvkja3;
        block9: {
            block8: {
                sprvkja3 = null;
                if (arg0.cfr_renamed_14742() != null) {
                    sprvkja3 = new sprvkja(arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452());
                    sprsto.cfr_renamed_17812(sprvkja3, arg1.cfr_renamed_14217(), arg1.cfr_renamed_14218());
                    sprxt2 = sprfrja.cfr_renamed_17708(sprvkja3);
                    try {
                        int n;
                        sprzujaArray = new sprzuja[arg0.cfr_renamed_14742().length / 2];
                        int n2 = n = 0;
                        while (n2 < sprzujaArray.length) {
                            sprzuja sprzuja2;
                            sprzuja sprzuja3 = sprzuja2 = new sprzuja();
                            sprpip sprpip2 = arg0;
                            sprzuja3.cfr_renamed_17782(sprpip2.cfr_renamed_14742()[n * 2].cfr_renamed_12795());
                            int n3 = n++;
                            sprzuja3.cfr_renamed_17783(sprpip2.cfr_renamed_14742()[n3 * 2 + 1].cfr_renamed_12795());
                            sprzujaArray[n3] = sprzuja2;
                            n2 = n;
                        }
                        sprxt sprxt3 = sprxt2;
                        ((sprfrja)sprxt3).cfr_renamed_12496().setComposite(new sprzrja(sprzujaArray));
                        ((sprfrja)sprxt3).cfr_renamed_17813(arg1, new sprpeja(0, 0, arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452()), 0.0f, 0.0f, arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452(), 2, arg3);
                        if (sprxt2 == null) break block8;
                        sprvkja2 = sprvkja3;
                        ((sprfrja)sprxt2).dispose();
                        break block9;
                    }
                    catch (Throwable throwable) {
                        if (sprxt2 != null) {
                            ((sprfrja)sprxt2).dispose();
                        }
                        throw throwable;
                    }
                }
            }
            sprvkja2 = sprvkja3;
        }
        if (sprvkja2 == null) {
            sprgmja2 = arg1;
            sprgeja2 = arg2;
        } else {
            sprgmja2 = sprvkja3;
            sprgeja2 = arg2;
        }
        sprxt2 = spriap.cfr_renamed_17804(sprgmja2, sprgeja2, sprvkja3 == null ? arg3 : null);
        if (!arg4) {
            return sprxt2;
        }
        arg3 = new sprrkja();
        spriap.cfr_renamed_17793(arg0, arg3);
        sprzujaArray = sprxt2;
        sprxt2 = spriap.cfr_renamed_17804(((sprvdja)sprxt2).cfr_renamed_14139(), arg2, arg3);
        sprzujaArray.dispose();
        return sprxt2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprpip cfr_renamed_13340(sprlrn arg0) {
        sprxpja sprxpja2 = (sprxpja)spriap.cfr_renamed_16964(arg0);
        try {
            sprgeja sprgeja2;
            sprgeja sprgeja3 = sprgeja2 = sprxpja2.cfr_renamed_12644();
            sprpip sprpip2 = spriap.cfr_renamed_17791(sprgeja3, sprxpja2, spriap.cfr_renamed_17796(arg0, sprgeja3));
            return sprpip2;
        }
        finally {
            if (sprxpja2 != null) {
                sprxpja2.dispose();
            }
        }
    }

    private static /* synthetic */ sprvoja cfr_renamed_17788(sprtnn arg0) {
        sprvoja sprvoja2;
        sprvoja sprvoja3 = sprvoja2 = new sprvoja();
        sprvoja3.cfr_renamed_17814(arg0.cfr_renamed_14164());
        sprvoja3.cfr_renamed_17806(arg0.cfr_renamed_14163());
        return sprvoja3;
    }
}

