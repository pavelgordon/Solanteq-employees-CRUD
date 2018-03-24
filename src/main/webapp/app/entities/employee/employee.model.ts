import { BaseEntity } from './../../shared';

export class Employee implements BaseEntity {
    constructor(
        public id?: number,
        public surname?: string,
        public name?: string,
        public patronymic?: string,
        public position?: string,
        public birthdate?: any,
    ) {
    }
}
