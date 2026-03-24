<?php

use PHPUnit\Framework\TestCase;
use App\Math;

final class MathTest extends TestCase
{
    public function testAdd(): void
    {
        $m = new Math();
        $this->assertEquals(5, $m->add(2, 3));
    }

    public function testSubstract(): void
    {
        $m = new Math();
        $this->assertEquals(1, $m->substract(3, 2));
    }

    public function testMuliply(): void
    {
        $m = new Math();
        $this->assertEquals(6, $m->multiply(2, 3));
    }

    public function testDivide(): void
    {
        $m = new Math();
        $this->assertEquals(2, $m->divide(6, 3));
    }

    public function testDivideByZero(): void
    {
        $this->expectException(\InvalidArgumentException::class);
        $m = new Math();
        $m->divide(1, 0);
    }
}
