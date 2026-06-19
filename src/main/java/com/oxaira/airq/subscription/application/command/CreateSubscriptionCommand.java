package com.oxaira.airq.subscription.application.command;

public record CreateSubscriptionCommand(

        String organizationName,

        String planName

) {
}