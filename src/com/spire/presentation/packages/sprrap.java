/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprhsp;
import com.spire.presentation.packages.sprhyo;
import com.spire.presentation.packages.sprivo;
import com.spire.presentation.packages.sprjzo;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprxto;
import java.util.Iterator;

@sprtea
public class sprrap
extends sprvqo {
    public sprrap(sprfzo arg0) {
        sprrap sprrap2 = this;
        super(arg0);
        sprrap2.cfr_renamed_18606();
        sprrap2.cfr_renamed_18608();
    }

    @Override
    public void cfr_renamed_14127(spreen arg0) {
        throw new UnsupportedOperationException(spreyl.cfr_renamed_9("ijH}\u001dLDhX8NqPhQ}\u001dkHzN}I8Tk\u001dvRl\u001dkHhMwOlX|\u001dqS8mwNln{OqMl\u001dmN}\u001dLOmX8iaM}\u001d[RuMy^l\u001dkHzN}I8TvNlXyY6"));
    }

    private /* synthetic */ void cfr_renamed_18608() {
        Object object;
        Object object2 = object = this.cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_18330().cfr_renamed_205().iterator();
        while (object2.hasNext()) {
            sprivo sprivo2 = (sprivo)object.next();
            object2 = object;
            this.cfr_renamed_13325(sprivo2.cfr_renamed_13076());
        }
        Object object3 = object = this.cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_18334().cfr_renamed_12162();
        while (((sprhsp)object3).cfr_renamed_15064()) {
            super.cfr_renamed_13326(((sprhsp)object).cfr_renamed_15065(), ((sprivo)((sprhsp)object).cfr_renamed_15066()).cfr_renamed_13076());
            object3 = object;
        }
    }

    @Override
    public sprrpp cfr_renamed_13482(sprqt arg0) {
        this.cfr_renamed_18607(arg0, 0, sprlfg.cfr_renamed_9("R\u0013p\u0001k\u001ceRe\u001e{\u0002jRf\u0013v\u0013\"\u001ddRd\u0007n\u001e\"\u0014m\u001cvRk\u0001\"\u001cm\u0006\"\u0001w\u0002r\u001dp\u0006g\u0016,"));
        return new sprrpp();
    }

    @Override
    public boolean cfr_renamed_14867() {
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_13227(spreen arg0) {
        if (this.cfr_renamed_13261().cfr_renamed_15069()) {
            sprjzo sprjzo2 = new sprjzo();
            sprjzo2.cfr_renamed_15070(this.cfr_renamed_13261(), arg0);
            return;
        }
        spreen spreen2 = this.cfr_renamed_13261().cfr_renamed_2609().cfr_renamed_15071();
        try {
            sprmvo.cfr_renamed_12186(spreen2, arg0);
            if (spreen2 == null) return;
            spreen2.cfr_renamed_2637();
            return;
        }
        catch (Throwable throwable) {
            if (spreen2 == null) throw throwable;
            spreen2.cfr_renamed_2637();
            throw throwable;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_16893(spreen arg0) {
        if (this.cfr_renamed_13261().cfr_renamed_15069()) {
            sprpdja sprpdja2 = new sprpdja();
            try {
                new sprjzo().cfr_renamed_15070(this.cfr_renamed_13261(), sprpdja2);
                sprpdja sprpdja3 = sprpdja2;
                sprpdja3.cfr_renamed_11548(0L);
                sprrap.cfr_renamed_18609(sprpdja3, arg0);
                if (sprpdja2 == null) return;
            }
            catch (Throwable throwable) {
                if (sprpdja2 == null) throw throwable;
                sprpdja2.cfr_renamed_2637();
                throw throwable;
            }
            sprpdja2.cfr_renamed_2637();
            return;
        }
        spreen spreen2 = this.cfr_renamed_13261().cfr_renamed_2609().cfr_renamed_15071();
        try {
            sprrap.cfr_renamed_18609(spreen2, arg0);
            if (spreen2 == null) return;
            spreen2.cfr_renamed_2637();
            return;
        }
        catch (Throwable throwable) {
            if (spreen2 == null) throw throwable;
            spreen2.cfr_renamed_2637();
            throw throwable;
        }
    }

    @Override
    public int cfr_renamed_18605(int arg0) {
        return arg0;
    }

    private static /* synthetic */ void cfr_renamed_18609(spreen arg0, spreen arg1) {
        Iterator iterator;
        sprhyo sprhyo2 = new sprhyo(arg0);
        sprhyo2.cfr_renamed_16585();
        sprhyo sprhyo3 = sprhyo2;
        sprxto sprxto2 = new sprxto(sprhyo3.cfr_renamed_15093().cfr_renamed_2);
        Iterator iterator2 = iterator = sprhyo3.cfr_renamed_15086().iterator();
        while (iterator2.hasNext()) {
            String string = (String)((sprnyja)iterator.next()).getKey();
            iterator2 = iterator;
            String string2 = string;
            sprxto2.cfr_renamed_15094(string2, sprhyo2.cfr_renamed_15095(string2));
        }
        sprxto2.cfr_renamed_18084(arg1);
    }
}

