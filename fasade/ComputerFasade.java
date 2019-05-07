/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasade;

/**
 *
 * @author vadimzubchenko
 */
public class ComputerFasade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFasade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(5, hardDrive.read(1729172917291729L, 8));
        cpu.jump(5);
        cpu.execute();
    }
}
