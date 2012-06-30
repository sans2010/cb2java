/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ANullsLiteral extends PLiteral
{
    private TNulls _nulls_;

    public ANullsLiteral ()
    {
    }

    public ANullsLiteral (TNulls _nulls_)
    {
        setNulls (_nulls_);
    }

    public Object clone ()
    {
        return new ANullsLiteral((TNulls) cloneNode (_nulls_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseANullsLiteral (this);
    }

    public TNulls getNulls ()
    {
        return _nulls_;
    }

    public void setNulls (TNulls node)
    {
        if (_nulls_ != null)
        {
            _nulls_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _nulls_ = node;
    }

    public String toString ()
    {
        return "" + toString (_nulls_);
    }

    void removeChild (Node child)
    {
        if (_nulls_ == child)
        {
            _nulls_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_nulls_ == oldChild)
        {
            setNulls ((TNulls) newChild);

            return;
        }
    }
}