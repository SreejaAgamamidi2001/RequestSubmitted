package com.enhisecure.dynamicApprover.dto;

public class Submitted
{
    private boolean approved;
    private String comment;
    private String approver;

    public Submitted(boolean approved, String comment,String approver)
    {
        this.approved=approved;
        this.comment=comment;
        this.approver=approver;
    }
    public boolean getApproved()
    {
        return approved;
    }
    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    public void setComment(String comment)
    {
        this.comment = comment;
    }
    public String getComment()
    {
        return comment;
    }
    public void setApprover(String approver)
    {
        this.approver = approver;
    }
    public String getApprover()
    {
        return approver;
    }

}