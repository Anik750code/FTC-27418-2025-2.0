package org.firstinspires.ftc.teamcode.Libraries.StateForge;

@FunctionalInterface
public interface SubstateTester<R extends  Enum<R>> {
    boolean test(StateMachine<R> machine);
}
